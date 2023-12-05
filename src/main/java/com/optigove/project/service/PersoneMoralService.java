package com.optigove.project.service;

import com.optigove.project.model.PersoneMoral;

import java.util.List;
import java.util.Optional;

public interface PersoneMoralService {

    PersoneMoral create(PersoneMoral personeMoral);

    List<PersoneMoral> lire();

    Optional<PersoneMoral> getid(Long id);

    PersoneMoral moudifier(Long id, PersoneMoral personeMoral);

    String suppremer(Long id);


}
