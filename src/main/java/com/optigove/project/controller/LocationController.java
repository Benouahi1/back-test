package com.optigove.project.controller;


import com.optigove.project.model.Location;
import com.optigove.project.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Location")
@CrossOrigin
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService){
        this.locationService = locationService;
    }

    @PostMapping("/create")
    public Location create(@RequestBody Location location){
        return locationService.create(location);
    }


    @GetMapping("/read")
    public List<Location> read(){
        return locationService.lire();
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return locationService.Suppremer(id);
    }

}
