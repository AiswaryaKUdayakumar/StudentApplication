package com.UST.StudentApplication.controller;

//import com.UST.StudentApplication.entity.EntityApp;
import com.UST.StudentApplication.entity.EntityApp;
import com.UST.StudentApplication.service.ServiceApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class ControllerApp {
    @Autowired
    private ServiceApp service;
    @PostMapping("/Student1")
    public EntityApp post(@RequestBody EntityApp app){
        return service.postStud(app);
    }
    @GetMapping("/student2")
    public List<EntityApp> get(){
        return service.getAll();
    }
    @GetMapping("/student3/{courses}")
    public Long getByCourses(@PathVariable List<String> courses) {
        return service.getStudentCountForCourses(courses);
    }
    @GetMapping("/student4/{addr}")
    public List<EntityApp> getAddr(@PathVariable String addr){
        return service.getAddr(addr);
    }

}
