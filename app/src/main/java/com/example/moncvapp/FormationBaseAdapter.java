package com.example.moncvapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationBaseAdapter extends BaseAdapter {
    private ArrayList<Formation> formations;

    public FormationBaseAdapter(ArrayList<Formation> formations) {
        this.formations = formations;
    }

    @Override
    public int getCount() {
        return formations.size();
    }

    @Override
    public Object getItem(int position) {
        return formations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_formations, parent, false);
        }
        TextView textViewNomDiplome = convertView.findViewById(R.id.textDiplome);
        TextView textViewLieu = convertView.findViewById(R.id.textLieu);
        TextView textViewDebut = convertView.findViewById(R.id.textDebut);
        TextView textViewFin = convertView.findViewById(R.id.textFin);

        textViewFin.setTextColor(Color.parseColor("#39aee4"));
        textViewDebut.setTextColor(Color.parseColor("#39aee4"));

        textViewNomDiplome.setText(formations.get(position).getNomDiplome());
        textViewLieu.setText(formations.get(position).getLieu());
        textViewDebut.setText(formations.get(position).getDebut().toString());
        textViewFin.setText(formations.get(position).getFin().toString());

        return convertView;
    }
}
