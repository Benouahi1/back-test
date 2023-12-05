package com.optigove.project.controller;


import com.optigove.project.model.TaxeBoisson;
import com.optigove.project.service.TaxeBoissonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Taxeboisoon")
@CrossOrigin()
public class TaxeBoissonController {

    private final TaxeBoissonService taxeBoissonService;

    public TaxeBoissonController(TaxeBoissonService taxeBoissonService){
        this.taxeBoissonService = taxeBoissonService;
    }


    @PostMapping("/create")
    public TaxeBoisson create(@RequestBody TaxeBoisson taxeBoisson){
        return taxeBoissonService.create(taxeBoisson);
    }

    @GetMapping("/read")
    public List<TaxeBoisson> read(){
        return taxeBoissonService.lire();
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return taxeBoissonService.Supprimer(id);
    }

}
