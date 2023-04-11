package com.example.moncvapp;

import java.util.Date;

public class Formation {
    private String debut;
    private String fin;
    private String nomDiplome;
    private String lieu;

    // constructor
    public Formation(String debut, String fin, String nomDiplome, String lieu) {
        this.debut = debut;
        this.fin = fin;
        this.nomDiplome = nomDiplome;
        this.lieu = lieu;
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

    public String getNomDiplome() {
        return nomDiplome;
    }

    public void setNomDiplome(String nomDiplome) {
        this.nomDiplome = nomDiplome;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
