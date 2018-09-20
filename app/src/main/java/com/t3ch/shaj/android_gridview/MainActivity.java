package com.t3ch.shaj.android_gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    int[] animals = {R.drawable.cat,R.drawable.dog,R.drawable.monkey,R.drawable.tiger,R.drawable.horse,R.drawable.elephant,R.drawable.lion,R.drawable.bear,R.drawable.rabbit};

    String[] animalNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.GV_ID);

        animalNames = getResources().getStringArray(R.array.animals);

        CustomAdapter adapter = new CustomAdapter(this,animalNames,animals);

        gridView.setAdapter(adapter);






    }
}
