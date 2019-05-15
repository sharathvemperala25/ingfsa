package com.hcl.ingfsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingfsa.Repository.AccountRepository;
import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.entity.Transaction;
import com.hcl.ingfsa.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/addAccount")
	public ResponseEntity insertAccount(@RequestBody Account account) {
		
		Account savedAccount = accountService.saveAccount(account);
		return new ResponseEntity(savedAccount, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/userTransactions")
	public ResponseEntity getAllTransactionsForUser(@RequestParam Long customerId) {
		List<Transaction> listOfTransaction = accountService.getAllTransactionsForUser(customerId);
		if(listOfTransaction.isEmpty()) {
			return new ResponseEntity("no transactions found",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity(listOfTransaction,HttpStatus.OK);
	
	}
	
	


}
