package com.optigove.project.controller;


import com.optigove.project.model.ReferanceBien;
import com.optigove.project.service.ReferanceBienService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/referancebien")
@CrossOrigin()

public class ReferanceBienController {
    private final ReferanceBienService referanceBienService;

    public ReferanceBienController(ReferanceBienService referanceBienService){
        this.referanceBienService = referanceBienService;
    }


    @PostMapping("/create")
    public ReferanceBien create (@RequestBody ReferanceBien referanceBien){
        return referanceBienService.create(referanceBien);
    }

    @GetMapping("/read")
    public List<ReferanceBien> read(){
        return referanceBienService.lire();
    }


    @GetMapping("/bien/{article}/{secteur}")
    public Optional<ReferanceBien> getReferanceByArticleAndSecteur(@PathVariable String article,@PathVariable String secteur){
        return referanceBienService.getReferanceByArticleAndSecteur(article,secteur);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return referanceBienService.Suppremer(id);
    }



}
