package com.hcl.ingfsa.service;

import java.util.Optional;

import com.hcl.ingfsa.entity.Account;

public interface AccountService {
	
	Account saveAccount(Account account);
	
	Optional<Account> getAccountByCustomerId(Long customerId);

}
