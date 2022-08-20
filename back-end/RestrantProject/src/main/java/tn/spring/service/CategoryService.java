package tn.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.spring.dao.CategoryDao;
import tn.spring.entity.Category;

@Service
@AllArgsConstructor
public class CategoryService {
	private CategoryDao categoryDao;

	public List<Category> allCategory(){
		return categoryDao.findAll();
	}

	
	

}
