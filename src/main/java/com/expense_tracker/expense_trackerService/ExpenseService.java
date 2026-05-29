package com.expense_tracker.expense_trackerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense_tracker.expense_trackerEntity.Expense;
import com.expense_tracker.expense_trackerRepository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAll() {
        return expenseRepository.findAll();
    }

    public Expense getById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        expenseRepository.deleteById(id);
    }
}