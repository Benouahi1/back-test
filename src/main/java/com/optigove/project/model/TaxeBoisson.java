package com.optigove.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name ="Taxeboisson")
@Getter
@Setter
@NoArgsConstructor

public class TaxeBoisson {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "montant", nullable = false, unique = true, length = 250, updatable = false)
    private Float montant;


    @Column(name = "secteur", nullable = false, unique = true, length = 250, updatable = false)
    private String secteur;
    @Column(name = "article", nullable = false, unique = true, length = 250, updatable = false)
    private String article;
    @Column(name = "liex", nullable = false, unique = true, length = 250, updatable = false)
    private String liex;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Referance referance;

    @OneToMany(mappedBy = "taxeBoisson",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "taxeBoisson")
    private Set<LiquadationBoisoon> liquadationBoisoons= new HashSet<>();




    public Referance getReferance() {
        return referance;
    }

    public void setReferance(Referance referance) {
        this.referance = referance;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getLiex() {
        return liex;
    }

    public void setLiex(String liex) {
        this.liex = liex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }


    public Set<LiquadationBoisoon> getLiquadationBoisoons() {
        return liquadationBoisoons;
    }

    public void setLiquadationBoisoons(Set<LiquadationBoisoon> liquadationBoisoons) {
        this.liquadationBoisoons = liquadationBoisoons;
    }
}
