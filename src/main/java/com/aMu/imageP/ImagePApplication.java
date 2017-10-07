package com.aMu.imageP;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aMu.imageP.dao")
public class ImagePApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagePApplication.class, args);
	}
}
