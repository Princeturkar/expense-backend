package com.expense_tracker.expense_trackerRepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.expense_tracker.expense_trackerEntity.*;

public interface UserRepository extends JpaRepository<User,Long>{
 Optional<User> findByEmail(String email);
}