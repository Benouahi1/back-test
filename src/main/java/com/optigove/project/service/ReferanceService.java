package com.optigove.project.service;

import com.optigove.project.model.Referance;

import java.util.List;

public interface ReferanceService {

    Referance create(Referance referance);

    Referance Ajouter(Referance referance);

    Referance AjouterTransport(Referance referance);

    Referance AjouterOccupation(Referance referance);


    Referance AjouterAutrebien(Referance referance);

    Referance AjouterTransportPublic(Referance referance);

    Referance AjouterImmeuble(Referance referance);



    List<Referance> lire();

    Referance modifier(Long id,Referance referance);

    String supprimer(Long id);
}
