package com.example.proiectalex.repository;

import com.example.proiectalex.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
