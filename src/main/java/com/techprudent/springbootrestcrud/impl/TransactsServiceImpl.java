package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Transacts;
import com.techprudent.springbootrestcrud.repository.TransactsRepository;
import com.techprudent.springbootrestcrud.service.TransactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactsServiceImpl implements TransactsService {

	@Autowired
	private TransactsRepository transactsRepository;
	
	@Override
	public void delete(long id) {

		Transacts transacts =new Transacts();
		transacts = transactsRepository.findTransactsById(id);
		transactsRepository.save(transacts);
	}

	@Override
	public Transacts create(Transacts transacts) {
		return transactsRepository.save(transacts);
	}

	@Override
	public Transacts findById(long id) {
		return transactsRepository.findTransactsById(id);
	}

	@Override
	public List<Transacts> findAll() {
		return transactsRepository.findAll();
	}



}
