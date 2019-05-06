package com.hcl.ingfsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingfsa.Repository.AccountRepository;
import com.hcl.ingfsa.entity.Account;
import com.hcl.ingfsa.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/addAccount")
	public ResponseEntity insertAccount(@RequestBody Account account) {
		
		Account savedAccount = accountService.saveAccount(account);
		return new ResponseEntity(savedAccount, HttpStatus.CREATED);
		
	}

}
