 package com.treehouse.giflib;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GifRepository {
	private static final List<Gif> AllGifs = Arrays.asList(

			new Gif("android", 1,LocalDate.of(2018, 03, 15), "John Doe", false),
			new Gif("ios", 2,LocalDate.of(2018, 03, 17), "John Doe", false),
			new Gif("windows", 3,LocalDate.of(2018, 01, 05), "John Doe", true),
			new Gif("macos", 1, LocalDate.of(2018, 02, 06), "John Doe", false)
			);
	
	public Gif findByName(String name) {
		for(Gif gif: AllGifs) {
			if(gif.getName().equals(name)) {
				return gif;
			}
		}
		return null;
	}
	
	public List<Gif> getAllGifs(){
		return AllGifs;
	}

	public List<Gif> findByCategoryId(int id) {
		List<Gif> gifList = new ArrayList<>();
		for(Gif gif: AllGifs) {
			if(gif.getCategoryId()==id) {
				gifList.add(gif);
			}
		}
		return gifList;
	}
}
