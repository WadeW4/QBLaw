package com.wade.qblaw.user.repository;

import com.wade.qblaw.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Petri Kainulainen
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
