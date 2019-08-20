package com.cg.productname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.productname.dto.ProductInfoName;

@RestController
@RequestMapping("/productname")
public class ProductNameController {
	@GetMapping("/name")
	public ProductInfoName getAllProducts(@RequestParam("pid") Integer proId) {
		return new ProductInfoName(proId,"Mobile");
		
	}

}
