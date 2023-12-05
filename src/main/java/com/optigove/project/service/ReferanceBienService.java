package com.optigove.project.service;

import com.optigove.project.model.ReferanceBien;

import java.util.List;
import java.util.Optional;

public interface ReferanceBienService {

    ReferanceBien create(ReferanceBien referanceBien);

    List<ReferanceBien> lire();

    Optional<ReferanceBien> getReferanceByArticleAndSecteur(String article, String secteur);


    String Suppremer(Long id);


}
