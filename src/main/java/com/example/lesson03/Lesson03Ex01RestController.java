package com.example.lesson03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson03Ex01RestController {
	
	@RequestMapping("/lesson03/ex01")
	public Review ex01() {
		return;
	}
	
	

}
