package com.optigove.project.service;

import com.optigove.project.model.Location;

import java.util.List;

public interface LocationService {
    Location create(Location location);

    List<Location> lire();

    String Suppremer(Long id);
}
