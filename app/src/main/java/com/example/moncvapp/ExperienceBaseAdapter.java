package com.example.moncvapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ExperienceBaseAdapter extends BaseAdapter {

    private ArrayList<Experience> experiences;

    public ExperienceBaseAdapter(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    @Override
    public int getCount() {
        return experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return experiences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_experience, parent, false);
        }
        TextView textViewEntreprise = convertView.findViewById(R.id.textEntrepise);
        TextView textViewDescription = convertView.findViewById(R.id.textDescription);
        TextView textViewDebut = convertView.findViewById(R.id.textDebut);
        TextView textViewFin = convertView.findViewById(R.id.textFin);

        textViewFin.setTextColor(Color.parseColor("#39aee4"));
        textViewDebut.setTextColor(Color.parseColor("#39aee4"));

        textViewEntreprise.setText(experiences.get(position).getEntreprise());
        textViewDescription.setText(experiences.get(position).getDescription());
        textViewDebut.setText(experiences.get(position).getDebut());
        textViewFin.setText(experiences.get(position).getFin());

        return convertView;
    }
}
