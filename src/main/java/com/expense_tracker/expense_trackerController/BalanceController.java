package com.expense_tracker.expense_trackerController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.expense_tracker.expense_trackerEntity.Expense;
import com.expense_tracker.expense_trackerService.ExpenseService;

@RestController
@RequestMapping("/api/balance")
@CrossOrigin("*")
public class BalanceController {

    @Autowired
    private ExpenseService service;

    @GetMapping
    public Map<String, Object> getBalance() {

        List<Expense> expenses = service.getAll();

        double totalAmount = 0;

        for (Expense e : expenses) {
            totalAmount += e.getAmount();
        }

        Map<String, Object> response = new HashMap<>();
        response.put("totalExpenses", totalAmount);
        response.put("totalRecords", expenses.size());

        return response;
    }
}