package com.optigove.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "location")

@Getter
@Setter
@NoArgsConstructor

public class Location {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "secteur", nullable = false, unique = true, length = 250, updatable = false)
    private String secteur;
    @Column(name = "article", nullable = false, unique = true, length = 250, updatable = false)
    private String article;
    @Column(name = "montant", nullable = false, unique = true, length = 250, updatable = false)
    private Float montant;
    @Column(name = "vent", nullable = false, unique = true, length = 250, updatable = false)
    private Float vent;
    @Column(name = "nemurocontrat", nullable = false, unique = true, length = 250, updatable = false)
    private String nemurocontrat;
    @Column(name = "nemuro", nullable = false, unique = true, length = 250, updatable = false)
    private String nemuro;
    @Column(name = "datedebut", nullable = false, unique = true, length = 250, updatable = false)
    private String datedebut;
    @Column(name = "datefin", nullable = false, unique = true, length = 250, updatable = false)
    private String datefin;
    @Column(name = "lieux", nullable = false, unique = true, length = 250, updatable = false)
    private String lieux;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Referance referance;

}
