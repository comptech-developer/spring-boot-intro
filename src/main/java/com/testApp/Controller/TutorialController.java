package com.testApp.Controller;

import com.testApp.Entity.Tutorial;
import com.testApp.Service.ITutorialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/tutorial")
public class TutorialController {

    @Resource
    private ITutorialService tutorialService;

    @PostMapping(path = "/add")
    public ResponseEntity<Tutorial> addTutorial(@RequestBody Tutorial tutorial)
    {
        Tutorial t = tutorialService.save(tutorial);
                return ResponseEntity.ok(t);
    }
    @GetMapping(path = "/all")
    public List<Tutorial> getTutorial()
    {
        return  tutorialService.findAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Tutorial>> findTutorial(@PathVariable Long id)
    {
         Optional<Tutorial> t = tutorialService.getById(id);
         return ResponseEntity.ok(t);
    }

    @PutMapping(path = "/edit")
    public ResponseEntity<Tutorial> editTutorial(@RequestBody Tutorial tutorial)
    {
      Tutorial t = tutorialService.save(tutorial);
      return ResponseEntity.ok(t);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Tutorial> deleteTutorial(@PathVariable Long id)
    {
        tutorialService.delete(id);
        return ResponseEntity.ok().build();
    }
}
