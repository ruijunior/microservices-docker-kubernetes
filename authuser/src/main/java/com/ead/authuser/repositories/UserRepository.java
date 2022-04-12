package com.ead.authuser.repositories;

import java.util.UUID;

import com.ead.authuser.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<UserModel, UUID>, JpaSpecificationExecutor<UserModel>{

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
    
}