package com.ead.course.repositories;

import java.util.UUID;

import com.ead.course.models.LessonModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<LessonModel, UUID>{
    
}
