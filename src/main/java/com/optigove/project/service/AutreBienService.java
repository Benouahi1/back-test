package com.optigove.project.service;

import com.optigove.project.model.AutreBien;

import java.util.List;

public interface AutreBienService {
    AutreBien create(AutreBien autreBien);

    List<AutreBien> lire();

    String Suppremer(Long id);
}
