package com.optigove.project.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personemoral")
@Getter
@Setter
@NoArgsConstructor
public class PersoneMoral {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150)
    private String Nom;
    @Column(length = 150)
    private String Adress;
    @Column(length = 150)
    private Long Telephone;
    @Column(length = 150)
    private String Email;
    @Column(length = 150)
    private Long Telgsm;
    @Column(length = 150)
    private String Identifiant;
    @Column(length = 150)
    private String Patente;
    @Column(length = 150)
    private String Cnss;
    @Column(length = 150)
    private String Activite;
    @Column(length = 150)
    private String Remarque;
    @Column(length = 150)
    private String Rc;
    @Column(length = 150)
    private String Ice;


    @OneToMany(mappedBy = "personeMoral",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "personeMoral")
    private Set<Referance> referances= new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Long getTelephone() {
        return Telephone;
    }

    public void setTelephone(Long telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getTelgsm() {
        return Telgsm;
    }

    public void setTelgsm(Long telgsm) {
        Telgsm = telgsm;
    }

    public String getIdentifiant() {
        return Identifiant;
    }

    public void setIdentifiant(String identifiant) {
        Identifiant = identifiant;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public String getCnss() {
        return Cnss;
    }

    public void setCnss(String cnss) {
        Cnss = cnss;
    }

    public String getActivite() {
        return Activite;
    }

    public void setActivite(String activite) {
        Activite = activite;
    }

    public String getRemarque() {
        return Remarque;
    }

    public void setRemarque(String remarque) {
        Remarque = remarque;
    }

    public String getRc() {
        return Rc;
    }

    public void setRc(String rc) {
        Rc = rc;
    }

    public String getIce() {
        return Ice;
    }

    public void setIce(String ice) {
        Ice = ice;
    }

    public Set<Referance> getReferances() {
        return referances;
    }

    public void setReferances(Set<Referance> referances) {
        this.referances = referances;
    }
}
