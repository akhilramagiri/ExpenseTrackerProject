package com.expensetracker.service;

import java.util.List;

import com.expensetracker.model.Expense;

public interface ExpenseService {
List<Expense> findAll();	//method returns list of expenses
Expense save(Expense expense);
Expense findById(Long id);
 void delete(long id);
}
