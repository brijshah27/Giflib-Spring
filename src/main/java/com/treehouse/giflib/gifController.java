package com.treehouse.giflib;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class gifController {
	@Autowired
	private GifRepository gifRepository;
	
	@RequestMapping("/")
	public String displayGifs(ModelMap modelMap) {
		List<Gif> allGifs = gifRepository.getAllGifs();
		modelMap.put("gifs", allGifs);
		return "home";
	}
	
	@RequestMapping("/gif/{name}")
	public String gifDetails(@PathVariable String name,ModelMap modelMap) {
		Gif gif = gifRepository.findByName(name);
		modelMap.put("gif", gif);
		return "gif-details";
	}
	
	
}
