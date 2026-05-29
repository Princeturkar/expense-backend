package com.expense_tracker.expense_trackerEntity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="expense_splits")
public class ExpenseSplit {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private Long expenseId;
 private Long userId;
 private Double owedAmount;
}