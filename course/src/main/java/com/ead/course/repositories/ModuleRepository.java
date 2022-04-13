package com.ead.course.repositories;

import java.util.List;
import java.util.UUID;

import com.ead.course.models.ModuleModel;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID>{

    @EntityGraph(attributePaths = {"course"})
    ModuleModel findByTitle(String title);
    

    @Query(value = "select * from TB_MODULE where course_course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findAllModulesIntoCourse(@Param("courseId") UUID courseId);
}