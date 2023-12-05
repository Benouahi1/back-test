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
@Table(name = "occupationcommerc")
@Getter
@Setter
@NoArgsConstructor
public class OccupationCommerce {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "secteur", nullable = false, unique = true, length = 250, updatable = false)
    private String secteur;
    @Column(name = "article", nullable = false, unique = true, length = 250, updatable = false)
    private String article;
    @Column(name = "lieux", nullable = false, unique = true, length = 250, updatable = false)
    private String lieux;
    @Column(name = "montant", nullable = false, unique = true, length = 250, updatable = false)
    private Float montant;

    @OneToMany(mappedBy = "occupationCommerce",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "occupationCommerce")
    private Set<CommerceOccup> commerceOccups= new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Referance referance;

    public String getLieux() {
        return lieux;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }

    public Set<CommerceOccup> getCommerceOccups() {
        return commerceOccups;
    }

    public void setCommerceOccups(Set<CommerceOccup> commerceOccups) {
        this.commerceOccups = commerceOccups;
    }

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


}
