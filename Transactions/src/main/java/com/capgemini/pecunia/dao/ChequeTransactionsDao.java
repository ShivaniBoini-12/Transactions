package com.capgemini.pecunia.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.ChequeTransactions;

@Repository          //indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
public interface ChequeTransactionsDao extends JpaRepository<ChequeTransactions, String> {

	
	
	
}
