package com.optigove.project.controller;

import com.optigove.project.model.CommerceOccup;
import com.optigove.project.service.CommerceOccupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CommerceOccup")
@CrossOrigin()

public class CommerceOccupController {

    private final CommerceOccupService commerceOccupService;

    public CommerceOccupController(CommerceOccupService commerceOccupService){
        this.commerceOccupService = commerceOccupService;
    }

    @PostMapping("/create")
    public CommerceOccup create(@RequestBody CommerceOccup commerceOccup){
        return commerceOccupService.create(commerceOccup);
    }

    @GetMapping("read")
    public List<CommerceOccup> read(){
        return commerceOccupService.lire();
    }



    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return commerceOccupService.Suppremer(id);
    }




}
