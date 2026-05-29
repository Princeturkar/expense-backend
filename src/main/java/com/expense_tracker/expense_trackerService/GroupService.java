package com.expense_tracker.expense_trackerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense_tracker.expense_trackerEntity.Group;
import com.expense_tracker.expense_trackerRepository.GroupRepository;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    public Group getById(Long id) {
        return groupRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        groupRepository.deleteById(id);
    }
}