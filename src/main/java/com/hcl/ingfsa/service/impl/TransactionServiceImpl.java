package com.hcl.ingfsa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingfsa.Repository.AccountRepository;
import com.hcl.ingfsa.Repository.TransactionRepository;
import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.entity.Transaction;
import com.hcl.ingfsa.service.AccountService;
import com.hcl.ingfsa.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Transaction saveTransaction(Account account,Transaction transaction) {
		if(transaction.getPaymentType().equals("credit")) {
			account.setAccountBalance(account.getAccountBalance()+transaction.getAmount());
		}
		
		if(transaction.getPaymentType().equals("debit")) {
			account.setAccountBalance(account.getAccountBalance()-transaction.getAmount());
		}
		
		
		transaction.setAccount(account);
		
		return transactionRepository.save(transaction);
	}
	
	

}
