package com.expense_tracker.expense_trackerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense_tracker.expense_trackerEntity.User;
import com.expense_tracker.expense_trackerRepository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public String login(String email, String password) {

        User user = userRepository.findByEmail(email).orElse(null);

        if (user != null && user.getPassword() != null
                && user.getPassword().equals(password)) {

            return "Login Success";
        }

        return "Invalid Email or Password";
    }
}