package com.ead.course.repositories;

import java.util.List;
import java.util.UUID;

import com.ead.course.models.LessonModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LessonRepository extends JpaRepository<LessonModel, UUID>{

    @Query(value = "select * from TB_LESSON where module_module_id = :moduleId", nativeQuery = true)
    List<LessonModel> findAllLessonsIntoModule(@Param("moduleId") UUID moduleId);
    
}
