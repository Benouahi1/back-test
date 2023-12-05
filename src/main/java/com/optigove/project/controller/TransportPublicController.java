package com.optigove.project.controller;

import com.optigove.project.model.TransportPublic;
import com.optigove.project.service.TransportPublicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TransportPublic")
@CrossOrigin()

public class TransportPublicController {


    public final TransportPublicService transportPublicService;

    public TransportPublicController(TransportPublicService transportPublicService){
        this.transportPublicService = transportPublicService;
    }

    @PostMapping("/create")
    public TransportPublic create(@RequestBody TransportPublic transportPublic) {
        return transportPublicService.create(transportPublic);
    }

    @GetMapping("/read")
    public List<TransportPublic> read(){
        return transportPublicService.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return transportPublicService.suppremer(id);
    }



}
