package com.optigove.project.service;

import com.optigove.project.model.CommerceOccup;

import java.util.List;

public interface CommerceOccupService {
    CommerceOccup create(CommerceOccup commerceOccup);

    List<CommerceOccup> lire();

    String Suppremer(Long id);
}
