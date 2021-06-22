package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Finance;
import com.techprudent.springbootrestcrud.repository.FinanceRepository;
import com.techprudent.springbootrestcrud.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	private FinanceRepository financeRepository;
	
	@Override
	public void delete(long id) {

		Finance finance=new Finance();
		finance= financeRepository.findFinanceById(id);
		financeRepository.save(finance);
	}

	@Override
	public Finance update(Finance finance) {
		return financeRepository.save(finance);
	}

	@Override
	public Finance create(Finance finance) {
		return financeRepository.save(finance);
	}

	@Override
	public Finance findById(long id) {
		return financeRepository.findFinanceById(id);
	}

	@Override
	public List<Finance> findAll() {
		return financeRepository.findAll();
	}



}
