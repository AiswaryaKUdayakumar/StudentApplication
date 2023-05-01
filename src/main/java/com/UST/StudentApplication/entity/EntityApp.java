package com.UST.StudentApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="STUDENT_APP")
public class EntityApp {
    @Id
    @GeneratedValue

    private Long studId;
    private String name;
    private String email;
    private String phnum;
    private String qualification;
    private String exp;
    @ElementCollection
    private List<String> intedCourses;
    private String addr;
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "institution")
    private EntityApp institution;



}
