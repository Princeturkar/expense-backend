package com.expense_tracker.expense_trackerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.expense_tracker.expense_trackerEntity.Settlement;
import com.expense_tracker.expense_trackerService.SettlementService;

@RestController
@RequestMapping("/api/settlements")
@CrossOrigin("*")
public class SettlementController {

    @Autowired
    private SettlementService service;

    @PostMapping
    public Settlement addSettlement(@RequestBody Settlement settlement) {
        return service.save(settlement);
    }

    @GetMapping
    public List<Settlement> getAllSettlements() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Settlement getSettlementById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteSettlement(@PathVariable Long id) {
        service.delete(id);
        return "Settlement Deleted Successfully";
    }
}