package com.project.fat.Repository;

import com.project.fat.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByemail(String email);


    void deleteById(Long id);
}
