package com.ead.course.repositories;

import java.util.UUID;

import com.ead.course.models.CourseModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, UUID>{
    
}
