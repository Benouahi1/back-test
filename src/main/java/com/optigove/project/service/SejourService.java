package com.optigove.project.service;

import com.optigove.project.model.Sejour;

import java.util.List;

public interface SejourService {
    Sejour create(Sejour sejour);

    List<Sejour> lire();

    String Suppremer(Long id);


}
