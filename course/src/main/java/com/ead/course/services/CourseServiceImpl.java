package com.ead.course.services;

import java.util.List;

import javax.transaction.Transactional;

import com.ead.course.models.CourseModel;
import com.ead.course.models.LessonModel;
import com.ead.course.models.ModuleModel;
import com.ead.course.repositories.CourseRepository;
import com.ead.course.repositories.LessonRepository;
import com.ead.course.repositories.ModuleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private LessonRepository lessonRepository;

    @Transactional
    @Override
    public void delete(CourseModel course) {
        List<ModuleModel> modules = moduleRepository.findAllModulesIntoCourse(course.getCourseId());

        if(!modules.isEmpty()){
            for (ModuleModel moduleModel : modules) {
                List<LessonModel> lessons = lessonRepository.findAllLessonsIntoModule(moduleModel.getModuleId());
                if(!lessons.isEmpty()){
                    lessonRepository.deleteAll(lessons);
                }
            }
            moduleRepository.deleteAll(modules);
        }
        courseRepository.delete(course);
    }
    
}
