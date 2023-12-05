package com.optigove.project.controller;


import com.optigove.project.model.Immeuble;
import com.optigove.project.service.ImmeubleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Immeuble")
@CrossOrigin
public class ImmeubleController {
private final ImmeubleService immeubleService;

public ImmeubleController(ImmeubleService immeubleService){
    this.immeubleService = immeubleService;
}



@PostMapping("/create")
    public Immeuble create(@RequestBody Immeuble immeuble) {
    return immeubleService.create(immeuble);
}

    @GetMapping("/read")
    public List<Immeuble> read() {
        return immeubleService.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return immeubleService.Suppremer(id);
    }






}
