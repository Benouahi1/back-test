package com.optigove.project.service;

import com.optigove.project.model.TransportPublic;

import java.util.List;

public interface TransportPublicService {
    TransportPublic create(TransportPublic transportPublic);

    List<TransportPublic> lire();

    String suppremer(Long id);
}
