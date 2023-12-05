package com.optigove.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "transport")
@Getter
@Setter
public class Transport {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "categore", nullable = false, unique = true, length = 250, updatable = false)
    private String categore;
    @Column(name = "matrecule", nullable = false, unique = true, length = 250, updatable = false)
    private String matrecule;
    @Column(name = "numeroautorisation", nullable = false, unique = true, length = 250, updatable = false)
    private String numeroautorisation;
    @Column(name = "dateautorisation", nullable = false, unique = true, length = 250, updatable = false)
    private String dateautorisation;
    @Column(name = "montant", nullable = false, unique = true, length = 250, updatable = false)
    private String montant;

    @ManyToOne(fetch = FetchType.LAZY)
    private Referance referance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategore() {
        return categore;
    }

    public void setCategore(String categore) {
        this.categore = categore;
    }

    public String getMatrecule() {
        return matrecule;
    }

    public void setMatrecule(String matrecule) {
        this.matrecule = matrecule;
    }

    public String getNumeroautorisation() {
        return numeroautorisation;
    }

    public void setNumeroautorisation(String numeroautorisation) {
        this.numeroautorisation = numeroautorisation;
    }

    public String getDateautorisation() {
        return dateautorisation;
    }

    public void setDateautorisation(String dateautorisation) {
        this.dateautorisation = dateautorisation;
    }

    public Referance getReferance() {
        return referance;
    }

    public void setReferance(Referance referance) {
        this.referance = referance;
    }
}
