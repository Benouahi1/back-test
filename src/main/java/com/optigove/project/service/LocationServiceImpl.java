package com.optigove.project.service;

import com.optigove.project.model.Location;
import com.optigove.project.repository.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LocationServiceImpl implements LocationService{
    private final LocationRepository locationRepository;

    @Override
    public Location create(Location location){
        return locationRepository.save(location);
    }

    @Override
    public List<Location> lire(){
        return locationRepository.findAll();
    }

    @Override
    public String Suppremer(Long id){
        locationRepository.deleteById(id);
        return "Location de bien supremer";
    }
}
