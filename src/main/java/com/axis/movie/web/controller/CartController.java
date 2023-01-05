package com.axis.movie.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.axis.movie.entity.Cart;
import com.axis.movie.entity.Movie;
import com.axis.movie.service.CartService;
import com.axis.movie.service.MovieService;

import antlr.collections.List;

@RestController
@RequestMapping("/movie/user/cart")
public class CartController {

	@Autowired
	CartService service;
	
	@Autowired
	MovieService movieservice;
	
	@RequestMapping(value = "/add/{mid}", method = RequestMethod.POST)
	public ModelAndView addToCart(@PathVariable("mid") int mid, HttpSession session,
			HttpServletRequest request) {

		String role = (String)session.getAttribute("role");
		System.out.println("role");
		int uid= (int) session.getAttribute("cid");
		System.out.println("uid");

		if (role.equalsIgnoreCase("user")) {

			Movie movie = movieservice.getMovieById(mid); 
			System.out.println(movie);
			
			Cart cart = new Cart();
			
			cart.setUid(uid);
			cart.setMid(movie.getMovieid());
			cart.setMname(movie.getMname());
			cart.setGenre(movie.getGenre());
			cart.setDescription(movie.getDescription());
			cart.setPrice(movie.getPrice());
			cart.setLanguage(movie.getLanguage());
			cart.setQuantity(movie.getQuantity());
			cart.setMimage(movie.getMimage());
			cart.setStatus(movie.getStatus());
			cart.setMovieStartTime(movie.getMovieStartTime());
			cart.setMovieEndTime(movie.getMovieEndTime());
			
			

			service.addToCart(cart);
			
			return new ModelAndView("redirect:/user/cart/getAll");
		}
		return new ModelAndView("redirect:/unauthentication");
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ModelAndView getAllCart(HttpSession session) {

		String role = (String) session.getAttribute("role");

		if (role.equalsIgnoreCase("user")) {

			List<Cart> cartList = service.getAllCart();
			ModelAndView mv = new ModelAndView();
			mv.addObject("CartList", cartList);
			mv.setViewName("UserCartList");
			return mv;
		}
		return new ModelAndView("/movie/user/unauthentication");
	}

	@RequestMapping(value = "/delete/{cid}")
	public ModelAndView removeFromCart(@PathVariable("cid") int cid , HttpSession session) {
		String role = (String) session.getAttribute("role");

		if (role.equalsIgnoreCase("user")) {

			service.removeFromCart(cid);
			return new ModelAndView("redirect:/movie/user/cart/getAll");
		}
		return new ModelAndView("/movie/user/unauthentication");
	}

}
