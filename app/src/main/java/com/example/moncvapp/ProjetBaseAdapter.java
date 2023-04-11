package com.example.moncvapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {

    private ArrayList<Projet> projets;

    public ProjetBaseAdapter(ArrayList<Projet> projets) {
        this.projets = projets;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int position) {
        return projets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_projet, parent, false);
        }
        TextView textViewNomProjet = convertView.findViewById(R.id.textNomProjet);
        TextView textViewDescription = convertView.findViewById(R.id.textDescription);
        TextView textViewDuree = convertView.findViewById(R.id.textDuree);
        TextView textViewLien = convertView.findViewById(R.id.textLien);

        textViewLien.setTextColor(Color.parseColor("#39aee4"));

        textViewNomProjet.setText(projets.get(position).getNom());
        textViewDescription.setText(projets.get(position).getDescription());
        textViewDuree.setText(projets.get(position).getDuree());
        textViewLien.setText(projets.get(position).getLien());


        textViewLien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(projets.get(position).getLien());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                parent.getContext().startActivity(intent);
            }
        });

        return convertView;
    }

}
