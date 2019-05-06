package com.hcl.ingfsa.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingfsa.Repository.AccountRepository;
import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account saveAccount(Account account) {
		
		return accountRepository.save(account);
	}

	@Override
	public Optional<Account> getAccountByCustomerId(Long customerId) {
		
		return accountRepository.findById(customerId);
	}

	

	



}
