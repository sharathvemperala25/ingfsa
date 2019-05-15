package co.m.hcl.ingfsa.domain;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class MonthlySpendAnalizer {
	
	private Date date;
	private Double totalIncomings;
	private Double totalOutgoings;
	private Double closingBalance;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getTotalIncomings() {
		return totalIncomings;
	}
	public void setTotalIncomings(Double totalIncomings) {
		this.totalIncomings = totalIncomings;
	}
	public Double getTotalOutgoings() {
		return totalOutgoings;
	}
	public void setTotalOutgoings(Double totalOutgoings) {
		this.totalOutgoings = totalOutgoings;
	}
	public Double getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(Double closingBalance) {
		this.closingBalance = closingBalance;
	}
	
	

}
