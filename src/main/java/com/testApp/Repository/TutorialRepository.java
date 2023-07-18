package com.testApp.Repository;

import com.testApp.Entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {

    Tutorial findByTutor(String name);

    Tutorial findById(Integer id);
}
