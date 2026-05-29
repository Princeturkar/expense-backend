package com.expense_tracker.expense_trackerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.expense_tracker.expense_trackerEntity.User;
import com.expense_tracker.expense_trackerService.UserService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private UserService userService;

    // REGISTER API
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        // check null
        if(user.getEmail() == null || user.getPassword() == null) {
            return "Invalid Email or Password";
        }

        List<User> users = userService.getAll();

        for(User u : users) {

            if(u.getEmail() != null &&
               u.getPassword() != null &&
               u.getEmail().equals(user.getEmail()) &&
               u.getPassword().equals(user.getPassword())) {

                return "Login Success";
            }
        }

        return "Invalid Email or Password";
    }

    // GET ALL USERS
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }
}