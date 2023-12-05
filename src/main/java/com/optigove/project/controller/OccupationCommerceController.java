package com.optigove.project.controller;

import com.optigove.project.model.OccupationCommerce;
import com.optigove.project.service.OccupationCommerceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OccupationCommerce")
@CrossOrigin()
public class OccupationCommerceController {

    private final OccupationCommerceService occupationCommerceService;

    public OccupationCommerceController(OccupationCommerceService occupationCommerceService){
        this.occupationCommerceService = occupationCommerceService;
    }
    @PostMapping("/create")
    public OccupationCommerce create(@RequestBody OccupationCommerce occupationCommerce){
        return occupationCommerceService.create(occupationCommerce);
    }

    @GetMapping("/read")
    public List<OccupationCommerce> read(){
        return occupationCommerceService.lire();
    }



    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return occupationCommerceService.Suppremer(id);
    }



}
