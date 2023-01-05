package com.axis.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.movie.entity.Movie;
import com.axis.movie.repository.MovieRepository;



@SpringBootApplication
public class MovieTicketBookingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingApplication.class, args);
//		SpringApplication.run(SpringBootEmailVerificationApplication.class, args);
	}

	@Autowired
	private MovieRepository sr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Movie movie1 = new Movie(101, "Pathan", 900, "Hindi", "Fight");
		sr.save(movie1);
		Movie movie2 = new Movie(102, "Big Gun", 400, "English", "Fight");
		sr.save(movie2);
		Movie movie3 = new Movie(103, "RRR", 500, "Hindi", "Fight");
		sr.save(movie3);

	}

}
