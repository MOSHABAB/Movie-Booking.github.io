package com.axis.movie.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.axis.movie.entity.Cart;
import com.axis.movie.repository.CartRepository;

import antlr.collections.List;

public class CartServicelmp implements CartService{

	@Autowired
	CartRepository repo;
	
	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return repo.save(cart);
	}

	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void removeFromCart(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
	}

}
