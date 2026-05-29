package com.expense_tracker.expense_trackerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense_tracker.expense_trackerEntity.Settlement;
import com.expense_tracker.expense_trackerRepository.SettlementRepository;

@Service
public class SettlementService {

    @Autowired
    private SettlementRepository settlementRepository;

    public Settlement save(Settlement settlement) {
        return settlementRepository.save(settlement);
    }

    public List<Settlement> getAll() {
        return settlementRepository.findAll();
    }

    public Settlement getById(Long id) {
        return settlementRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        settlementRepository.deleteById(id);
    }
}