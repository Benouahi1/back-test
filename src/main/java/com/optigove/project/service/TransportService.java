package com.optigove.project.service;

import com.optigove.project.model.Transport;

import java.util.List;

public interface TransportService {
    Transport create(Transport transport);

    List<Transport> lire();

    String suppremer(Long id);
}
