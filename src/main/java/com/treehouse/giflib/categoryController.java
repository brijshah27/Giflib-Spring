package com.treehouse.giflib;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class categoryController {
	@Autowired
	private categoryRepository categoryRepository;
	
	@Autowired
	private GifRepository gifRepo;
	
	@RequestMapping("/categories")
	public String listCategories(ModelMap modelMap) {
		List<Category> categories = categoryRepository.getAllCategories();
		modelMap.put("categories", categories);
		return "categories";
	}
	@RequestMapping("/category/{id}")
	public String category(@PathVariable int id, ModelMap model) {
		Category category = categoryRepository.findBtId(id);
		
		List<Gif> gifs = gifRepo.findByCategoryId(id);
		model.addAttribute("category", category);
        model.addAttribute("gifs",gifs);
		return "category";
	}
}
