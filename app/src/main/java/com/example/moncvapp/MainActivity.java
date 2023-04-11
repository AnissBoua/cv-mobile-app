package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //style
        TextView textViewExperience = findViewById(R.id.textExperience);
        textViewExperience.setTextColor(Color.parseColor("#39aee4"));
        TextView textViewFormation = findViewById(R.id.textFormation);
        textViewFormation.setTextColor(Color.parseColor("#39aee4"));

        // array of 3 experiences objects (Experience class)
        ArrayList<Experience> experiences = new ArrayList<>();

        // create 3 experiences objects
        experiences.add(new Experience("De Septembre 2023", " à Aout 2023", "Digiplace", "Contrat en alternance pour valider mon BAC +3, ou j'ai mit en pratique mes comptence de developpeur FullStack"));
        experiences.add(new Experience("De Decembre 2018", " à Novembre 2019", "CityOne", "Pour un moment que j'ai travailler a l'aeroport de Paris, j'ai appris a travailler en equipe et a gerer les stress"));
        experiences.add(new Experience("De Novembre 2016", " à Avril 2017", "Souviens pas", "J'ai travailler dans une boulangerie apres mes cours, j'ai appris a gerer les clients"));

        // add experiences with ExperienceBaseAdapter
        ExperienceBaseAdapter experienceBaseAdapter = new ExperienceBaseAdapter(experiences);

        // add experiences to listview
        ListView listViewExperiences = findViewById(R.id.listEntreprise);
        listViewExperiences.setAdapter(experienceBaseAdapter);

        // array of 3 formations objects (Formation class)
        ArrayList<Formation> formations = new ArrayList<>();

        // create 3 formations objects
        formations.add(new Formation( "De Septembre 2022" , " à  Aout 2023", "Bac +3", "CFA Insta a Paris"));
        formations.add(new Formation("De Avril 2020", " à Novembre 2021", "Bac +2", "AFPA de Creteil"));
        formations.add(new Formation("De Novembre 2018", " à Decembre 2019", "Bac", "Camas centre de formation a Tramblay en France"));

        // add formations with FormationBaseAdapter
        FormationBaseAdapter formationBaseAdapter = new FormationBaseAdapter(formations);

        // add formations to listview
        ListView listViewFormations = findViewById(R.id.listFormation);
        listViewFormations.setAdapter(formationBaseAdapter);


        // change activity when buttonCompetence is clicked
        Button buttonCompetence = findViewById(R.id.buttonCompetence);
        buttonCompetence.setOnClickListener(v -> {
            Intent intent = new Intent(this, CompetenceActivity.class);
            startActivity(intent);
        });
    }
}