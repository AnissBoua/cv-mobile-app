package com.example.moncvapp;

import java.util.Date;

public class Experience {
    private String debut;
    private String fin;
    private String entreprise;
    private String description;

    // constructor
    public Experience(String debut, String fin, String entreprise, String description) {
        this.debut = debut;
        this.fin = fin;
        this.entreprise = entreprise;
        this.description = description;
    }

    // getters and setters
    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
