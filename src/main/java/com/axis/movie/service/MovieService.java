package com.axis.movie.service;

import java.util.List;

import com.axis.movie.entity.Movie;


public interface MovieService {
//	List<Movie> getMovie();
    Movie  saveMovie(Movie movie);


	Movie getMovieById(int mid);
	
	Movie updateMovie(Movie student);
	
	void deleteMovieById(Long movieid);
	List<Movie> getAllMovie();

}
