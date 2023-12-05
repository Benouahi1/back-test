package com.optigove.project.service;

import com.optigove.project.model.LiquadationBoisoon;

import java.util.List;

public interface LiquadationBoissonService {

    LiquadationBoisoon create(LiquadationBoisoon liquadationBoisoon);

    List<LiquadationBoisoon> lire();

    String Suppremer(Long id);
}
