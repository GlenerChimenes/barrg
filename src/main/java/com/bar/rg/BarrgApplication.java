 package com.bar.rg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bar.rg.service.S3Service;

@SpringBootApplication
public class BarrgApplication implements CommandLineRunner{

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(BarrgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\glene\\Desktop\\Backup samsung 2020\\DCIM\\Screenshots\\awsTeste.jpg");
	}

}
