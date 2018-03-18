package com.treehouse.giflib;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class categoryRepository {
	private static final List<Category> allCategories = Arrays.asList(
			new Category(1 , "funny"),
			new Category(2 , "movie"),
			new Category(3 , "study")
			);
	
	public List<Category> getAllCategories(){
		return allCategories;
	}
	
	public Category findBtId(int id) {
		for(Category cat: allCategories) {
			if(cat.getId()==id) {
				return cat;
			}
		}
		return null;
	}
}
