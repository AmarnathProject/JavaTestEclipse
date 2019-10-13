package com.file.manu.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.file.manu.Entity.FileStorageProperties;
import com.file.manu.Exception.FileStorageException;
import com.file.manu.Exception.MyFileNotFoundException;

@Service
public class FileStoreService {

	private final Path fileStorageLocation;

	@Autowired
	public FileStoreService(FileStorageProperties fileStorageProperties) {
		this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();
		try {
			Files.createDirectories(this.fileStorageLocation);
		} catch (Exception ex) {

			throw new FileStorageException(
					"Could not create the directories where the uploaded files will be stored" + ex);
		}
	}

	public String storeFile(MultipartFile file) {

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {

			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! file name contains invalid path sequence " + fileName);
			}

			Path targetLocation = this.fileStorageLocation.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

			return fileName;

		} catch (IOException ex) {
			throw new FileStorageException("Could not stored file" + fileName + "Please try again", ex);
		}
	}

	public Resource loadFileResource(String fileName) {

		try {
			Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri());
			if (resource.exists()) {
				return resource;

			} else {
				throw new MyFileNotFoundException("file jot found" + fileName);
			}
		} catch (MalformedURLException ex) {
			throw new MyFileNotFoundException("file not found" + fileName, ex);
		}

	}

}
