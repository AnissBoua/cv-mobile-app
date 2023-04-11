package com.example.moncvapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competence);

        TextView textViewCompetences = findViewById(R.id.textViewCompetences);
        TextView textViewProjets = findViewById(R.id.textViewProjets);
        textViewCompetences.setTextColor(Color.parseColor("#39aee4"));
        textViewProjets.setTextColor(Color.parseColor("#39aee4"));


        //  array of 3 langages objects (Langage class)
        ArrayList<Langage> langages = new ArrayList<>();

        langages.add(new Langage("PHP", 85));
        langages.add(new Langage("Javascript", 80));
        langages.add(new Langage("SQL", 75));

        // add langages with LangageBaseAdapter
        LangageBaseAdapter langageBaseAdapter = new LangageBaseAdapter(langages);

        // add langages to listview
        ListView listViewLangages = findViewById(R.id.listLanguages);
        listViewLangages.setAdapter(langageBaseAdapter);


        ArrayList<Projet> projets = new ArrayList<>();

        // name project, description project at least 100 characters, duration project, link github project
        projets.add(new Projet("Novelize Now", "Un projet qui est encore en cours de creation, qui permet a n'importe quelle personne de crée leur propre livre gratuitement et ainsi avoir plus de visibilité et liberté", "2 mois", "https://github.com/AnissBoua/NovelizeNow-back"));
        projets.add(new Projet("Infomedia", "Pendant ce mois et demi j’ai appris à créer des API et j’ai mis en pratique tout ce que j’ai appris pour créer le projet que j’ai présenté à l’examen du BAC +2", "1 mois", "https://github.com/AnissBoua/InfoMedia_back-end"));
        projets.add(new Projet("Reservia", "Réaliser un prototype de site proposant un outil de planification de vacances avec une interface responsive en respectant la maquette pour le site Reservia", "1 mois", "https://anissboua.github.io/AnissBoua_Reservia/"));

        // add projets with ProjetBaseAdapter
        ProjetBaseAdapter projetBaseAdapter = new ProjetBaseAdapter(projets);

        // add projets to listview
        ListView listViewProjets = findViewById(R.id.listProjets);
        listViewProjets.setAdapter(projetBaseAdapter);

    }

}
