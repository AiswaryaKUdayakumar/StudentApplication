package com.UST.StudentApplication.repository;

import com.UST.StudentApplication.entity.EntityApp2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoApp2 extends JpaRepository<EntityApp2,Long> {
}
