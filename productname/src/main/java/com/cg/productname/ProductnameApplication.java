package com.cg.productname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.productname")
public class ProductnameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductnameApplication.class, args);
	}

}
