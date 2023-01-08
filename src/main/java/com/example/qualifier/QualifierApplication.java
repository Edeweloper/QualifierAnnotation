package com.example.qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {

		SpringApplication.run(QualifierApplication.class, args);
	}
	@Bean("Word")
	public  WordFileReader getWordFileReader(){
		return new WordFileReader();
	}
}
