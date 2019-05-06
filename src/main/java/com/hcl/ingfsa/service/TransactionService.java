package com.hcl.ingfsa.service;

import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.entity.Transaction;

public interface TransactionService {
	
	 Transaction saveTransaction(Account account,Transaction transaction);

}
