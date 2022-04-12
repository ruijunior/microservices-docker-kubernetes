package com.ead.authuser.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.authuser.models.UserModel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    List<UserModel>findAll();

    Optional<UserModel> findById(UUID userId);

    void delete(UUID userId);

    void save(UserModel userModel);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

	Page<UserModel> findAll(Pageable pageable);
    
}
