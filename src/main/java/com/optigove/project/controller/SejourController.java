package com.optigove.project.controller;


import com.optigove.project.model.Sejour;
import com.optigove.project.service.SejourService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sejour")
@CrossOrigin()
public class SejourController {

    private final SejourService sejourService;

    public SejourController(SejourService sejourService){
        this.sejourService = sejourService;
     }

     @PostMapping("/create")
    public Sejour create(@RequestBody Sejour sejour){
        return sejourService.create(sejour);
     }

     @GetMapping("read")
    public List<Sejour> read(){
        return sejourService.lire();
     }



     @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return sejourService.Suppremer(id);
     }

}
