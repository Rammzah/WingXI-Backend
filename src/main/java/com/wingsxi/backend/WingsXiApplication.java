package com.wingsxi.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class WingsXiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WingsXiApplication.class, args);
	}

}
