package com.ead.course.repositories;

import java.util.UUID;

import com.ead.course.models.ModuleModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID>{
    
}
