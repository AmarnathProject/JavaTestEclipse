package com.file.manu.Controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.file.manu.Service.FileStoreService;
import com.file.manu.payload.UploadFileResponse;

public class FileController {

	private static final Logger logger = LoggerFactory.getLogger(FileController.class);

	@Autowired
	private FileStoreService fileStorageService;

	// single file upload

	@PostMapping("/uploadFile")
	public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {

		String fileName = fileStorageService.storeFile(file);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile")
				.path(fileName).toUriString();

		return new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());

	}
//multiple file upload

	@PostMapping("/uploadMultipleFile")
	public List<UploadFileResponse> uploadMultipleFile(@RequestParam("file") MultipartFile[] files) {

		return Arrays.asList(files).stream().map(file -> uploadFile(file)).collect(Collectors.toList());

	}

	@GetMapping("/downloadFile/{home/techjini/Documents/File:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {

		// load file as Resource
		Resource resource = fileStorageService.loadFileResource(fileName);

		// Try to determine file's content type
		String contentType = null;

		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException e) {

			logger.info("Could not determine file type");
		}

		// Fallback to the default content type if type could not be determined

		if (contentType == null) {
			contentType = "application/octet-stream";
		}

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION,
						"attachment; /home/techjini/Documents/File=\"" + resource.getFilename() + "\"")
				.body(resource);

	}

}
