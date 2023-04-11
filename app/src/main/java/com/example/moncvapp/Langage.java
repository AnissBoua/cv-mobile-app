package com.example.moncvapp;

public class Langage {

    private String nom;
    private Integer niveau;

    // constructor
    public Langage(String nom, Integer niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    // getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

}
