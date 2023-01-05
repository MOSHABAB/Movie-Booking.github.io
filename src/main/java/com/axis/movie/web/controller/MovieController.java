package com.axis.movie.web.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.movie.entity.Movie;
import com.axis.movie.service.MovieService;



@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

	@Autowired
    private MovieService service;

	public MovieController(MovieService service) {
		super();
		this.service = service;
	}
	

	
//	@GetMapping("/movie")
//	public String movie() {
//		
//		return "movie";
//	}
	
	

	
	
	// handler method to handle list movie and return mode and view
		@GetMapping("/movie")
		public String listMovie(Model model) {
			model.addAttribute("movie", service.getAllMovie());
			return "movie";
		}
		
		@GetMapping("/movie/new")
		public String createMovieForm(Model model) {
			
			// create movie object to hold student form data
			Movie movie = new Movie();
			model.addAttribute("movie", movie);
			return "addmovie";
			
		}
		
		@PostMapping("/movie")
		public String saveMovie(@ModelAttribute("movie") Movie movie) {
			service.saveMovie(movie);
			return "redirect:/movie";
		}
		
		@GetMapping("/movie/edit/{id}")
		public String editStudentForm(@PathVariable Long id, Model model) {
			model.addAttribute("movie", service.getMovieById(id));
			return "edit";
		}
		
//		
//
		@PostMapping("/movie/{id}")
		public String updateMovie(@PathVariable Long movieid,
				@ModelAttribute("movie") Movie movie,
				Model model) {
			
			// get student from database by id
			Movie existingMovie = service.getMovieById(movieid);
			existingMovie.setMovieid(movieid);
			existingMovie.setMoviename(movie.getMoviename());
			existingMovie.setMovietype(movie.getMovietype());
			existingMovie.setMovieprice(movie.getMovieprice());
			existingMovie.setMovielanguage(movie.getMovielanguage());
		
			
			// save updated student object
		service.updateMovie(existingMovie);
			return "redirect:/students";		
		}
		
		// handler method to handle delete student request
		
		@GetMapping("/movie/{id}")
		public String deleteMovie(@PathVariable Long movieid) {
			service.deleteMovieById(movieid);
			return "redirect:/movie";
		}

//	
	
	
	

	
	


}
