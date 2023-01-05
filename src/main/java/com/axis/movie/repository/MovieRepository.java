package com.axis.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.movie.entity.Movie;

public interface MovieRepository  extends JpaRepository<Movie,Long>{

}
