package com.UST.StudentApplication.repository;

import com.UST.StudentApplication.entity.EntityApp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoApp extends JpaRepository<EntityApp,Long> {
//    Long findByIntedCourses(String intedCourses);
}
