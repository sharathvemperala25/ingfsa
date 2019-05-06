package com.hcl.ingfsa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long costumerId;
	private Double accountBalance;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
	@JsonIgnore
	private List<Transaction> transactions;
	public Long getCostumerId() {
		return costumerId;
	}
	public void setCostumerId(Long costumerId) {
		this.costumerId = costumerId;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	
	

}
