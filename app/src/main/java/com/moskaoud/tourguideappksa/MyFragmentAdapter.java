package com.moskaoud.tourguideappksa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyFragmentAdapter extends ArrayAdapter<KSAData> {

    public MyFragmentAdapter(@NonNull Context context, ArrayList<KSAData> ksaData) {
        super(context, 0, ksaData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.ksadata_listview_row, null);
        }
        ImageView imageView = view.findViewById(R.id.imageview);
        TextView textView = view.findViewById(R.id.textview);

        imageView.setImageResource(getItem(position).getImageResource());
        textView.setText(getItem(position).getDescription());

        return view;

    }
}
