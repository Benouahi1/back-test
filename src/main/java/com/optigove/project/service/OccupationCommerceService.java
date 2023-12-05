package com.optigove.project.service;

import com.optigove.project.model.OccupationCommerce;

import java.util.List;

public interface OccupationCommerceService {

    OccupationCommerce create(OccupationCommerce occupationCommerce);

    List<OccupationCommerce> lire();

    String Suppremer(Long id);
}
