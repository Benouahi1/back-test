package com.optigove.project.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "referancebien")

@Getter
@Setter
@NoArgsConstructor
public class ReferanceBien {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "Impossable", nullable = false, unique = true, length = 250, updatable = false)
    private String Impossable;
    @Column(name = "secteur", nullable = false, unique = true, length = 250, updatable = false)
    private String secteur;
    @Column(name = "article", nullable = false, unique = true, length = 250, updatable = false)
    private String article;
    @Column(name = "Percepteur", nullable = false, unique = true, length = 250, updatable = false)
    private String Percepteur;
    @Column(name = "Numerointerne", nullable = false, unique = true, length = 250, updatable = false)
    private String Numerointerne;
    @Column(name = "Lieux", nullable = false, unique = true, length = 250, updatable = false)
    private String Lieux;

}
