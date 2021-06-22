package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Transacts;

import java.util.List;

public interface TransactsService {

	public void delete(long id) ;

	public Transacts update(Transacts transacts);

	public Transacts create(Transacts transacts) ;

	public Transacts findById(long id) ;

	public List<Transacts> findAll();



}
