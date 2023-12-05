package com.optigove.project.service;

import com.optigove.project.model.Immeuble;

import java.util.List;

public interface ImmeubleService {
    Immeuble create(Immeuble immeuble);

    List<Immeuble> lire();

    String Suppremer(Long id);
}
