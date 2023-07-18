package com.testApp.Service;

import com.testApp.Entity.Tutorial;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface ITutorialService {

    Tutorial save(Tutorial tutorial);

    List<Tutorial> findAll();

    void delete(Long id);

    Optional<Tutorial> getById(long id);
}
