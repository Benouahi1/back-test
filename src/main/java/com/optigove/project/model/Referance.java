package com.optigove.project.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "referencecreance")
@Getter
@Setter
@NoArgsConstructor
public class Referance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "deligataire", nullable = false, unique = true, length = 250, updatable = false)
    private String deligataire;
    @Column(name = "support", nullable = false, unique = true, length = 250, updatable = false)
    private String support;
    @Column(name = "exercice", nullable = false, unique = true, length = 250, updatable = false)
    private String exercice;
    @Column(name = "adress", nullable = false, unique = true, length = 250, updatable = false)
    private String adress;
    @Column(name = "libelle", nullable = false, unique = true, length = 250, updatable = false)
    private String libelle;
    @Column(name = "cin", nullable = false, unique = true, length = 250, updatable = false)
    private String cin;
    @Column(name = "date", nullable = false, unique = true, length = 250, updatable = false)
    private String date;
    @Column(name = "regime", nullable = false, unique = true, length = 250, updatable = false)
    private String regime;
    @Column(name = "trimester", nullable = false, unique = true, length = 250, updatable = false)
    private String trimester;
    @Column(name = "montant", nullable = false, unique = true, length = 250, updatable = false)
    private String montant;

    @JoinColumn(name = "personeMoralId")
    @JsonIgnoreProperties(value = "referances")
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.DETACH)
    private PersoneMoral personeMoral;

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<Sejour> sejours = new HashSet<>();

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<OccupationCommerce> occupationCommerces = new HashSet<>();

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<Transport> transports = new HashSet<>();

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<TaxeBoisson> taxeBoissons = new HashSet<>();

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<AutreBien> autreBiens = new HashSet<>();

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<Immeuble> immeubles = new HashSet<>();

    @OneToMany(mappedBy = "referance", cascade = CascadeType.ALL)
    private Set<TransportPublic> transportPublics = new HashSet<>();

    public Set<OccupationCommerce> getOccupationCommerces() {
        return occupationCommerces;
    }

    public void setOccupationCommerces(Set<OccupationCommerce> occupationCommerces) {
        this.occupationCommerces = occupationCommerces;
    }

    public Set<AutreBien> getAutreBiens() {
        return autreBiens;
    }

    public void setAutreBiens(Set<AutreBien> autreBiens) {
        this.autreBiens = autreBiens;
    }

    public Set<Immeuble> getImmeubles() {
        return immeubles;
    }

    public void setImmeubles(Set<Immeuble> immeubles) {
        this.immeubles = immeubles;
    }

    public Set<TransportPublic> getTransportPublics() {
        return transportPublics;
    }

    public void setTransportPublics(Set<TransportPublic> transportPublics) {
        this.transportPublics = transportPublics;
    }

    public Set<Sejour> getSejours() {
        return sejours;
    }

    public void setSejours(Set<Sejour> sejours) {
        this.sejours = sejours;
    }

    public Set<Transport> getTransports() {
        return transports;
    }

    public void setTransports(Set<Transport> transports) {
        this.transports = transports;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }


    public String getDeligataire() {
        return deligataire;
    }

    public void setDeligataire(String deligataire) {
        this.deligataire = deligataire;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getExercice() {
        return exercice;
    }

    public void setExercice(String exercice) {
        this.exercice = exercice;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public String getTrimester() {
        return trimester;
    }

    public void setTrimester(String trimester) {
        this.trimester = trimester;
    }

    public Set<TaxeBoisson> getTaxeBoissons() {
        return taxeBoissons;
    }

    public void setTaxeBoissons(Set<TaxeBoisson> taxeBoissons) {
        this.taxeBoissons = taxeBoissons;
    }

    public PersoneMoral getPersoneMoral() {
        return personeMoral;
    }

    public void setPersoneMoral(PersoneMoral personeMoral) {
        this.personeMoral = personeMoral;
    }
}
