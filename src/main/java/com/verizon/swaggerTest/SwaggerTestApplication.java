package com.verizon.swaggerTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.verizon")
@SpringBootApplication
public class SwaggerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerTestApplication.class, args);
	}

}
