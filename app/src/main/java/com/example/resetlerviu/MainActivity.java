package com.example.resetlerviu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.resetlerviu.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<music> musics = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeList();

        RecyclerView recyclerView = findViewById(R.id.list);
        musicAdapter adapter = new musicAdapter(this,musics);
        recyclerView.setAdapter(adapter);
    }

    private void initializeList(){
        musics.add(new music("Ангельские ритмы op","TokyoStudo",R.drawable.ic_launcher_background));
    }
}