package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Finance;
import com.techprudent.springbootrestcrud.model.Transacts;
import com.techprudent.springbootrestcrud.repository.FinanceRepository;
import com.techprudent.springbootrestcrud.repository.TransactsRepository;
import com.techprudent.springbootrestcrud.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {

	@Autowired
	private FinanceRepository financeRepository;

	@Autowired
	private TransactsRepository transactsRepository;
	
	@Override
	public void delete(long id) {

		Finance finance=new Finance();
		finance= financeRepository.findFinanceById(id);
		financeRepository.save(finance);
	}

	public void createTransatInitial(){
		List<Transacts> list=new ArrayList<>();
		list.add(new Transacts(1,"Débito","Entrada","+"));
		list.add(new Transacts(2,"Boleto","Saída","-"));
		list.add(new Transacts(3,"Financiamento","Saída","-"));
		list.add(new Transacts(4,"Crédito","Entrada","+"));
		list.add(new Transacts(5,"Recebimento Empréstimo","Entrada","+"));
		list.add(new Transacts(6,"Vendas","Entrada","+"));
		list.add(new Transacts(7,"Recebimento TED","Entrada","+"));
		list.add(new Transacts(8,"Recebimento DOC","Entrada","+"));
		list.add(new Transacts(9,"Aluguel","Saída","-"));

		for (int i=0;i<9;i++){
			Transacts transacts=new Transacts();
			transacts.setId(list.get(i).getId());
			transacts.setDescription(list.get(i).getDescription());
			transacts.setNatureze(list.get(i).getNatureze());
			transacts.setSignal(list.get(i).getSignal());
			transactsRepository.save(transacts);
		}
	}


	@Override
	public Finance create(List<Finance> listFinance) {

		createTransatInitial();

		for (int i = 0; i < listFinance.size(); i++){
			Finance finance=new Finance();
			Integer idType=Integer.parseInt(listFinance.get(i).getIdType());
			Transacts transacts=new Transacts();

			transacts.setId(idType);
			finance.setType(transacts);
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
