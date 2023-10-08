package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  ItemClickListener {
    RecyclerView rv;
   List<Model> pkms;

   Adapt adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rV);

        pkms = new ArrayList<>();

        Model m1 = new Model("Pikachu" ,
                "Elecric Pokemon" , R.drawable.img);
        Model m2 = new Model("Charizard" ,
                "Fire dragon" , R.drawable.img_3);
         Model m3 = new Model("Blastoise" , "Water turtle" , R.drawable.img_2);

         pkms.add(m1);
         pkms.add(m2);
         pkms.add(m3);
         LinearLayoutManager l = new LinearLayoutManager(this);
         rv.setLayoutManager(l);
         adapt = new Adapt(pkms);
         rv.setAdapter(adapt);

         adapt.setClickListener(this);
    }

    @Override
    public void onCLick(View v, int p) {

        Toast.makeText(this, "You chose "+pkms.get(p).getT1()+" !", Toast.LENGTH_SHORT).show();
    }
}