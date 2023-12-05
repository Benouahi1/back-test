package com.optigove.project.controller;


import com.optigove.project.model.LiquadationBoisoon;
import com.optigove.project.service.LiquadationBoissonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liquadationBoisson")
@CrossOrigin()
public class LiquadationBoissonController {

    private final LiquadationBoissonService liquadationBoissonService;

    public LiquadationBoissonController(LiquadationBoissonService liquadationBoissonService) {
        this.liquadationBoissonService = liquadationBoissonService;
    }

    @PostMapping("/create")
    public LiquadationBoisoon create(@RequestBody LiquadationBoisoon liquadationBoisoon){
        return liquadationBoissonService.create(liquadationBoisoon);
    }

    @GetMapping("/read")
    public List<LiquadationBoisoon> read(){
        return liquadationBoissonService.lire();
    }



    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return liquadationBoissonService.Suppremer(id);
    }


}
