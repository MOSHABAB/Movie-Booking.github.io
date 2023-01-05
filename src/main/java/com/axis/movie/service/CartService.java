package com.axis.movie.service;

import org.springframework.stereotype.Service;

import com.axis.movie.entity.Cart;

import antlr.collections.List;

@Service
public interface CartService {

	public abstract Cart addToCart(Cart cart);
	public abstract List getAllCart();
	public abstract void removeFromCart(int cid);	

}
