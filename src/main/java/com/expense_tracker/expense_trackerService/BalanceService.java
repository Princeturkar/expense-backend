package com.expense_tracker.expense_trackerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense_tracker.expense_trackerEntity.Expense;
import com.expense_tracker.expense_trackerRepository.ExpenseRepository;

@Service
public class BalanceService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Map<String, Object> getBalanceDetails() {

        List<Expense> expenses = expenseRepository.findAll();

        double totalAmount = 0;

        for (Expense expense : expenses) {
            totalAmount += expense.getAmount();
        }

        Map<String, Object> result = new HashMap<>();
        result.put("totalExpenses", totalAmount);
        result.put("totalRecords", expenses.size());

        return result;
    }
}