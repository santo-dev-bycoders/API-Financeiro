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
	public Finance create(List<Finance> listFinance) {

		for (int i = 0; i < listFinance.size(); i++){
			Finance finance=new Finance();
			finance.setType(listFinance.get(i).getType());
			finance.setDateFinance(listFinance.get(i).getDateFinance());
			finance.setCard(listFinance.get(i).getCard());
			finance.setCpf(listFinance.get(i).getCpf());
			finance.setValue(listFinance.get(i).getValue());
			finance.setHour(listFinance.get(i).getHour());
			finance.setNameStore(listFinance.get(i).getNameStore());
			finance.setOwnerStore(listFinance.get(i).getOwnerStore());
			financeRepository.save(finance);
		}

		return null;
	}

	@Override
	public Finance findById(long id) {
		return financeRepository.findFinanceById(id);
	}

	@Override
	public List<Finance> findAll() {
		return financeRepository.findAll();
	}

	@Override
	public int countValue() {
		return financeRepository.countValue();
	}

	@Override
	public Finance saveFinance(Finance finance) {
		return financeRepository.save(finance);
	}




}
