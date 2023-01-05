package com.axis.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.axis.movie.entity.Movie;
import com.axis.movie.repository.MovieRepository;


@Service
public class MovieServicelmp implements MovieService {
@Autowired
    private MovieRepository mp;
    
	public MovieServicelmp(MovieRepository mp) {
		super();
		this.mp = mp;
	}


	@Override
	public List<Movie> getAllMovie() {
		return mp.findAll();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		return mp.save(movie);
	}
	
	@Override
	public Movie getMovieById(Long id) {
		return mp.findById(id).get();
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return mp.save(movie);
	}

	@Override
	public void deleteMovieById(Long id) {
		mp.deleteById(id);	
	}



}
