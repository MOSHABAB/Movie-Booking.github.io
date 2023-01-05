package com.axis.movie.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axis.movie.entity.Movie;

@org.springframework.stereotype.Controller
public class Controller {
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
//	@GetMapping("/login")
//	public String login() {
//		
//		return "login";
//	}
//	
//	
//	
//	@GetMapping("/index")
//	public String index() {
//		
//		return "index";
//	}
//	
//	
//	@GetMapping("/cart")
//	public String cart() {
//		
//		return "shopping";
//	}
//	
////	@GetMapping("/movie")
////	public String movie() {
////		
////		return "movie";
////	}
////	
//	@GetMapping("/edit")
//	public String edit() {
//		
//		return "edit";
//	}
	
	
	
	
	

	
	
	@GetMapping("/main")
	public String main() {
		
		return "main";
	}
	
	
//	@GetMapping("/movie")
//	public String vim() {
//		
//		return "movie";
//	}
//	@PostMapping("/movie")
//	public String saveMovie(@ModelAttribute("movie") Movie movie) {
//		
//		return "redirect:/movie";
//	}
//	@GetMapping("/movie")
//	public String vsdim() {
//		
//		return "addmovie";
//	}
	
	
	
	
	
	
	
	

	

	
}
