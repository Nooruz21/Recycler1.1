package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        names= new ArrayList<>();
        names.add("Sancho");
        names.add("Pogba");
        names.add("Fred");
        names.add("Show");
        names.add("Aziz");
        names.add("Bruno");
        names.add("De Gea");
        names.add("Ronaldo");
        names.add("Baily");
        names.add("Varan");
        names.add("Matic");
        NameAdapter adapter=new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}