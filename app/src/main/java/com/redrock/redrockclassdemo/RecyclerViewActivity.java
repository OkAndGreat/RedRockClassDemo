package com.redrock.redrockclassdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        //生成假数据
        ArrayList<fruit> data = new ArrayList<>();
        for(int i=0;i<100;i++){
            fruit myFruit = new fruit();
            myFruit.setFruitName("水果"+i);
            myFruit.setFruitPrice((float)i);
            data.add(myFruit);
        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter myAdapter = new adapter(data);
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}