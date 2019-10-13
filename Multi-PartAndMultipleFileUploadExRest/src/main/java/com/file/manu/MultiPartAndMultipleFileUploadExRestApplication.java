package com.file.manu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.file.manu.Entity.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class MultiPartAndMultipleFileUploadExRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiPartAndMultipleFileUploadExRestApplication.class, args);
	}

}
