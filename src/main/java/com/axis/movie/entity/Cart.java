package com.axis.movie.entity;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_cart")
public class Cart {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid ;
	private int mid ;
	private int uid ;
	private String mname;
	private String genre;
	private String description;
	private double price;
	private String language;
	private int quantity;
	private String mimage;
	private String status;
	private Time movieStartTime;
	private Time movieEndTime;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cid, int mid, int uid, String mname, String genre, String description, double price,
			String language, int quantity, String mimage, String status, Time movieStartTime, Time movieEndTime) {
		super();
		this.cid = cid;
		this.mid = mid;
		this.uid = uid;
		this.mname = mname;
		this.genre = genre;
		this.description = description;
		this.price = price;
		this.language = language;
		this.quantity = quantity;
		this.mimage = mimage;
		this.status = status;
		this.movieStartTime = movieStartTime;
		this.movieEndTime = movieEndTime;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMimage() {
		return mimage;
	}
	public void setMimage(String mimage) {
		this.mimage = mimage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Time getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(Time movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public Time getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(Time movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", mid=" + mid + ", uid=" + uid + ", mname=" + mname + ", genre=" + genre
				+ ", description=" + description + ", price=" + price + ", language=" + language + ", quantity="
				+ quantity + ", mimage=" + mimage + ", status=" + status + ", movieStartTime=" + movieStartTime
				+ ", movieEndTime=" + movieEndTime + "]";
	}	

	
}
