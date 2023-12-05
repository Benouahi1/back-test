package com.optigove.project.controller;


import com.optigove.project.model.Referance;
import com.optigove.project.service.ReferanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referance")
@CrossOrigin()

public class ReferanceController {
    private final ReferanceService referanceService;

    public ReferanceController(ReferanceService referanceService) {
        this.referanceService = referanceService;
    }

    @PostMapping("/create")
    public Referance create(@RequestBody Referance referance){
        return referanceService.create(referance);
    }

    @PostMapping("/create/sejour")
    public Referance Ajouter(@RequestBody Referance referance){
        return referanceService.Ajouter(referance);
    }

    @PostMapping("/create/transport")
    public Referance AjouterTransport(@RequestBody Referance referance){
        return  referanceService.AjouterTransport(referance);
    }

    @PostMapping("/create/transportPublic")
    public Referance AjouterTransportPublic(@RequestBody Referance referance){
        return  referanceService.AjouterTransportPublic(referance);
    }


    @PostMapping("/create/Occupation")
    public Referance AjouterOccupation(@RequestBody Referance referance){
        return  referanceService.AjouterOccupation(referance);
    }


    @PostMapping("/create/Autrebien")
    public Referance AjouterAutrebien(@RequestBody Referance referance){
        return  referanceService.AjouterAutrebien(referance);
    }
    @PostMapping("/create/mouble")
    public Referance AjouterImmeuble(@RequestBody Referance referance){
        return  referanceService.AjouterImmeuble(referance);
    }

    @GetMapping("/read")
    public List<Referance> read(){
        return referanceService.lire();
    }

   // @GetMapping("/persone/{persone}")
   // public Optional<Referance> getReferanceByPersone(@PathVariable  Long persone){
   // return referanceService.getReferanceByPersone(persone);
   // }

    @PutMapping("/update/{id}")
    public Referance update(@PathVariable Long id,@RequestBody Referance referance){
        return referanceService.modifier(id, referance);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return referanceService.supprimer(id);
    }

}
