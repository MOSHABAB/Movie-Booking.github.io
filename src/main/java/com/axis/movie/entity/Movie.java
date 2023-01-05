package com.axis.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="movie")
public class Movie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long movieid;
public long movieprice;

@Column(name = "moviename",nullable = false)
	public String moviename;
	@Column(name= "movietype")
	public String movietype;
	@Column(name= "movielanguage")
	public String movielanguage;
	@Column(name= "moviecategory")
	private String moviecategory;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(long movieid, String moviename, long movieprice, String movietype, String movielanguage) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.movieprice = movieprice;
		this.movietype = movietype;
		this.movielanguage = movielanguage;
	}
	public long getMovieid() {
		return movieid;
	}
	public void setMovieid(long movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public long getMovieprice() {
		return movieprice;
	}
	public void setMovieprice(long movieprice) {
		this.movieprice = movieprice;
	}
	public String getMovietype() {
		return movietype;
	}
	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	public String getMovielanguage() {
		return movielanguage;
	}
	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", movieprice=" + movieprice
				+ ", movietype=" + movietype + ", movielanguage=" + movielanguage + "]";
	}
//	public static void updateMovie(Movie existingMovie) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
