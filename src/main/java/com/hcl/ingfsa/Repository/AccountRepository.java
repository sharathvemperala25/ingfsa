package com.hcl.ingfsa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingfsa.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
	

}
