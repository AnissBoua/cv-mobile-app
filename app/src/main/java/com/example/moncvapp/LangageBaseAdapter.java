package com.example.moncvapp;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LangageBaseAdapter extends BaseAdapter {
    private ArrayList<Langage> langages;

    public LangageBaseAdapter(ArrayList<Langage> langages) {
        this.langages = langages;
    }

    @Override

    public int getCount() {
        return langages.size();
    }

    @Override
    public Object getItem(int position) {
        return langages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.language, parent, false);
        }
        TextView textViewNomLangage = convertView.findViewById(R.id.textLangue);
        ProgressBar textViewPourcentage = convertView.findViewById(R.id.niveau);

        textViewNomLangage.setTextColor(Color.parseColor("#39aee4"));

        textViewNomLangage.setText(langages.get(position).getNom());
        textViewPourcentage.setProgress(langages.get(position).getNiveau());

        return convertView;
    }
}
