package com.optigove.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "commerceoccup")
@Getter
@Setter
@NoArgsConstructor
public class CommerceOccup {



    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nemuroautorisation", nullable = false, unique = true, length = 250, updatable = false)
    private Long nemuroautorisation;
    @Column(name = "dateautorisation", nullable = false, unique = true, length = 250, updatable = false)
    private String dateautorisation;
    @Column(name = "valeur", nullable = false, unique = true, length = 250, updatable = false)
    private String valeur;
    @Column(name = "taxation", nullable = false, unique = true, length = 250, updatable = false)
    private String taxation;
    @Column(name = "type", nullable = false, unique = true, length = 250, updatable = false)
    private String type;


    @ManyToOne
    private OccupationCommerce occupationCommerce;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNemuroautorisation() {
        return nemuroautorisation;
    }

    public void setNemuroautorisation(Long nemuroautorisation) {
        this.nemuroautorisation = nemuroautorisation;
    }

    public String getDateautorisation() {
        return dateautorisation;
    }

    public void setDateautorisation(String dateautorisation) {
        this.dateautorisation = dateautorisation;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getTaxation() {
        return taxation;
    }

    public void setTaxation(String taxation) {
        this.taxation = taxation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
