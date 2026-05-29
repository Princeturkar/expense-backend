package com.expense_tracker.expense_trackerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.expense_tracker.expense_trackerEntity.Group;
import com.expense_tracker.expense_trackerService.GroupService;

@RestController
@RequestMapping("/api/groups")
@CrossOrigin("*")
public class GroupController {

    @Autowired
    private GroupService service;

    @PostMapping
    public Group addGroup(@RequestBody Group group) {
        return service.save(group);
    }

    @GetMapping
    public List<Group> getAllGroups() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Group getGroupById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteGroup(@PathVariable Long id) {
        service.delete(id);
        return "Group Deleted Successfully";
    }
}