package com.example.moncvapp;

public class Projet {
    private String nom;
    private String description;
    private String duree;
    private String lien;

    // default lien github
    public Projet(String nom, String description, String duree, String lien) {
        this.nom = nom;
        this.description = description;
        this.duree = duree;
        this.lien = lien;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }



}
