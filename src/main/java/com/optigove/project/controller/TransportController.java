package com.optigove.project.controller;


import com.optigove.project.model.Transport;
import com.optigove.project.service.TransportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Transport")
@CrossOrigin()
public class TransportController {

    private final TransportService transportService;

    public TransportController(TransportService transportService){
        this.transportService = transportService;
    }


    @PostMapping("/create")
    public Transport create(@RequestBody Transport transport) {
        return transportService.create(transport);
    }

    @GetMapping("/read")
    public List<Transport> read(){
        return transportService.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return transportService.suppremer(id);
    }



}
