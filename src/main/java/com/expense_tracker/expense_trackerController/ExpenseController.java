package com.expense_tracker.expense_trackerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.expense_tracker.expense_trackerEntity.Expense;
import com.expense_tracker.expense_trackerService.ExpenseService;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin("*")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return service.save(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {
        service.delete(id);
        return "Expense Deleted Successfully";
    }
}