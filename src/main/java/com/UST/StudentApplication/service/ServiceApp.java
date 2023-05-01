package com.UST.StudentApplication.service;

import com.UST.StudentApplication.entity.EntityApp;
import com.UST.StudentApplication.entity.EntityApp$;
import com.UST.StudentApplication.repository.RepoApp;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service

public class ServiceApp {
    @Autowired
    private RepoApp repo;
    @Autowired
    private JPAStreamer jpaStreamer;

    public EntityApp postStud(EntityApp app) {
        return repo.save(app);
    }


    public List<EntityApp> getAll() {
        return repo.findAll();
    }

//    public Long getByCourses(List<String> intedCourses) {
//        Predicate<EntityApp> courseFilter = app -> intedCourses.contains(app.getIntedCourses());
//        return jpaStreamer.stream(EntityApp.class)
//                .filter(courseFilter)
//                .count();
//    }

    public Long getStudentCountForCourses(List<String> course) {
        return jpaStreamer.stream(EntityApp.class)
                .flatMap(student -> student.getIntedCourses().stream())
                .filter(courses -> course.contains(courses))
                .distinct()
                .count();
    }

    public List<EntityApp> getAddr(String addr) {
        return jpaStreamer.stream(EntityApp.class)
               .filter(EntityApp$.addr.contains(addr))
                .collect(Collectors.toList());

    }
}

