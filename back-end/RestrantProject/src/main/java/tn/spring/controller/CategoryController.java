package tn.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.spring.entity.Category;
import tn.spring.service.CategoryService;

@RestController
@AllArgsConstructor
public class CategoryController {
	private CategoryService categoryService;
	
	@GetMapping("/api/allCategories")
	public List<Category> getAllCategory(){
		return categoryService.allCategory();
	}

}
