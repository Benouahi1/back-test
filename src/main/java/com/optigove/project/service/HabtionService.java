package com.optigove.project.service;

import com.optigove.project.model.Habtion;

import java.util.List;

public interface HabtionService {
    Habtion create(Habtion habtion);

    List<Habtion> lire();

    String Suppremer(Long id);
}
