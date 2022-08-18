package tn.spring.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.spring.service.CategoryService;

@RestController
@AllArgsConstructor
public class CategoryController {
	private CategoryService categoryService;

}
