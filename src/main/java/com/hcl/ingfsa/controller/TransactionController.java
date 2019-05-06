package com.hcl.ingfsa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.entity.Transaction;
import com.hcl.ingfsa.service.AccountService;
import com.hcl.ingfsa.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/addTransaction")
	public ResponseEntity insertTransaction(@RequestParam Long customerId,@RequestBody Transaction transaction) {
	
		Optional<Account> optionalAccount = accountService.getAccountByCustomerId(customerId);
		if(optionalAccount.isPresent()) {
			Transaction savedTransaction = transactionService.saveTransaction(optionalAccount.get(),transaction);
			return new ResponseEntity(savedTransaction,HttpStatus.CREATED);
		}
		
		return new ResponseEntity("Transaction failed because"+customerId+" is not there",HttpStatus.BAD_REQUEST);
	}
	

}
