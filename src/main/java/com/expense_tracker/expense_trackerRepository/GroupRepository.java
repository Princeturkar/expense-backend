package com.expense_tracker.expense_trackerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense_tracker.expense_trackerEntity.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}