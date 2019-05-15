package com.hcl.ingfsa.service;

import java.util.List;
import java.util.Optional;

import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.entity.Transaction;

public interface AccountService {
	
	Account saveAccount(Account account);
	
	Optional<Account> getAccountByCustomerId(Long customerId);
	
	List<Transaction> getAllTransactionsForUser(Long customerId);

}
