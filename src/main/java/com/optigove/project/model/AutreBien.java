package com.optigove.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "autrbien")

@Getter
@Setter
@NoArgsConstructor
public class AutreBien {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "secteur", nullable = false, unique = true, length = 250, updatable = false)
    private String secteur;
    @Column(name = "article", nullable = false, unique = true, length = 250, updatable = false)
    private String article;
    @Column(name = "montant", nullable = false, unique = true, length = 250, updatable = false)
    private Float montant;

    @Column(name = "nemurocontrat", nullable = false, unique = true, length = 250, updatable = false)
    private String nemurocontrat;
    @Column(name = "datedebut", nullable = false, unique = true, length = 250, updatable = false)
    private String datedebut;
    @Column(name = "datefin", nullable = false, unique = true, length = 250, updatable = false)
    private String datefin;
    @Column(name = "lieux", nullable = false, unique = true, length = 250, updatable = false)
    private String lieux;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Referance referance;


    public Referance getReferance() {
        return referance;
    }

    public void setReferance(Referance referance) {
        this.referance = referance;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }



    public String getNemurocontrat() {
        return nemurocontrat;
    }

    public void setNemurocontrat(String nemurocontrat) {
        this.nemurocontrat = nemurocontrat;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getLieux() {
        return lieux;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }
}
