 package com.bar.rg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BarrgApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BarrgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
