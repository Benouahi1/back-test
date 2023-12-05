package com.optigove.project.controller;


import com.optigove.project.model.Habtion;
import com.optigove.project.service.HabtionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Habtion")
@CrossOrigin
public class HabtionController {


    public final HabtionService habtionService;

    public HabtionController(HabtionService habtionService){
        this.habtionService = habtionService;
    }


    @PostMapping("/create")
    public Habtion create(@RequestBody Habtion habtion) {
        return habtionService.create(habtion);
    }

    @GetMapping("/read")
    public List<Habtion> read() {
        return habtionService.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return habtionService.Suppremer(id);
    }

}
