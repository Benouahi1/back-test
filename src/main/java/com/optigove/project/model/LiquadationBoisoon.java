package com.optigove.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="liquadationboisson")

@Getter
@Setter
@NoArgsConstructor


public class LiquadationBoisoon {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vent", nullable = false, unique = true, length = 250, updatable = false)
    private String vent;
    @Column(name = "toux", nullable = false, unique = true, length = 250, updatable = false)
    private Float toux;
    @Column(name = "chiffre", nullable = false, unique = true, length = 250, updatable = false)
    private Long chiffre;

    @ManyToOne(fetch = FetchType.LAZY)
    private TaxeBoisson taxeBoisson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVent() {
        return vent;
    }

    public void setVent(String vent) {
        this.vent = vent;
    }

    public Float getToux() {
        return toux;
    }

    public void setToux(Float toux) {
        this.toux = toux;
    }

    public Long getChiffre() {
        return chiffre;
    }

    public void setChiffre(Long chiffre) {
        this.chiffre = chiffre;
    }

    public TaxeBoisson getTaxeBoisson() {
        return taxeBoisson;
    }

    public void setTaxeBoisson(TaxeBoisson taxeBoisson) {
        this.taxeBoisson = taxeBoisson;
    }
}







