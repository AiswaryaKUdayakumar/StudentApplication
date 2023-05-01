package com.UST.StudentApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="institution")
public class EntityApp2 {
    @Id
    @GeneratedValue
    private Long instId;
    private String intName;
    private String location;
    @ElementCollection
    private HashMap<Long,String> courses;

    @OneToMany(mappedBy = "institution", cascade = CascadeType.ALL)
    private List<EntityApp> students;

}
