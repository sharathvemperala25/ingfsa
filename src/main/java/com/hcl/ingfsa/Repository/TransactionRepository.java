package com.hcl.ingfsa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.ingfsa.entity.Transaction;

import co.m.hcl.ingfsa.domain.MonthlySpendAnalizer;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	
//	 @Query("select month(t.date) as month, (case when t.paymentType='credit' then sum(t.amount)  else 0 end ) as total_incommings,(case when t.payment_type='debit' then sum(t.amount) else 0 end) as Total_outgoings,(case when max(dayofmonth(t.date)) then closing_balance else 0 end) as closing_balance from Transaction t where t.customer_id=?1 group by month(t.date)order by day(t.date)")
//		 public List<?> viewMonthlySpendAnalizer(Long customerId);
	 
	 @Query(value="select month(t.date) as month, (case when t.payment_type=\"credit\" then sum(t.amount)  else 0 end ) as total_incommings,(case when t.payment_type=\"debit\" then sum(t.amount) else 0 end) as Total_outgoings,(case when max(dayofmonth(t.date)) then closing_balance else 0 end) as closing_balance from transaction t where t.customer_id=1 group by month(t.date) order by day(t.date)", nativeQuery=true)
	 public List<?> viewMonthlySpendAnalizer(Long customerId);
	 	
}
