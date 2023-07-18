package com.testApp.Service.Impl;

import com.testApp.Entity.Tutorial;
import com.testApp.Repository.TutorialRepository;
import com.testApp.Service.ITutorialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import  java.util.List;
import  java.util.Optional;
@Service
@Transactional
public class TutorialService implements ITutorialService {

    @Resource
    public TutorialRepository tutorialRepository;

    @Override
    public Tutorial save(Tutorial tutorial)
    {
        return tutorialRepository.save(tutorial);
    }

    @Override
    public List<Tutorial> findAll()
    {
        return tutorialRepository.findAll();
    }
     @Override
    public void delete(Long id)
    {
        tutorialRepository.deleteById(id);
    }

    @Override
    public Optional<Tutorial> getById(long id)
    {
        return tutorialRepository.findById(id);
    }
}
