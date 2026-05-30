package com.expense_tracker.expense_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.expense_tracker")
@EnableJpaRepositories(basePackages = "com.expense_tracker.expense_trackerRepository")
@EntityScan(basePackages = "com.expense_tracker.expense_trackerEntity")
public class ExpenseBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseBackendApplication.class, args);
    }
}
