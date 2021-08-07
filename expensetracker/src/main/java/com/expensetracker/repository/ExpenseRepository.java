package com.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensetracker.model.Expense;
@Repository

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
/*	JPA REPOSITORY IS A SPECIFIC Extension of repository it contains the basic crud operations 
	and paging and sorting repository*/

}
