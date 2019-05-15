package com.hcl.ingfsa.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.entity.Transaction;

import co.m.hcl.ingfsa.domain.MonthlySpendAnalizer;

public interface TransactionService {
	
	 Transaction saveTransaction(Account account,Transaction transaction);
	 
	List<?> viewMonthlySpendAnalizer(Long customerId);

}
