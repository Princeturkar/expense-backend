package com.expense_tracker.expense_trackerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense_tracker.expense_trackerEntity.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Long> {

}