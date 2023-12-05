package com.optigove.project.controller;


import com.optigove.project.model.AutreBien;
import com.optigove.project.service.AutreBienService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AutreBien")
@CrossOrigin
public class AutreBienController {

    private final AutreBienService autreBienService;

    public AutreBienController(AutreBienService autreBienService){
        this.autreBienService = autreBienService;
    }


    @PostMapping("/create")
    public AutreBien create(@RequestBody AutreBien autreBien){
        return autreBienService.create(autreBien);
    }

    @GetMapping("/read")
    public List<AutreBien> read() {
        return autreBienService.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return autreBienService.Suppremer(id);
    }

}
