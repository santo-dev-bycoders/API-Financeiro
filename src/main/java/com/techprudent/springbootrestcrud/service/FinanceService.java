package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Finance;

import java.util.List;

public interface FinanceService {

	public void delete(long id) ;

	public Finance update(Finance finance);

	public Finance create(List<Finance> listFinance) ;

	public Finance findById(long id) ;

	public List<Finance> findAll();



}
