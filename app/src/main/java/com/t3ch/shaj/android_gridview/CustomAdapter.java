package com.t3ch.shaj.android_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shakil Ahmed Shaj on 9/20/2018
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] animals;
    String[] animalNames;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] animalNames, int[] animals) {
        this.context = context;
        this.animalNames = animalNames;
        this.animals = animals;
    }


    @Override
    public int getCount() {
        return animalNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.base, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.IV_ID);
        TextView textView = convertView.findViewById(R.id.TV_ID);

        imageView.setImageResource(animals[position]);
        textView.setText(animalNames[position]);

        return convertView;
    }
}
