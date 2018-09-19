package com.example.administrator.demo1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<String>mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        HomeaAdapter HomeaAdapter = new HomeaAdapter(this,mlist);
         recyclerView.setAdapter(HomeaAdapter);
    }

    @Override
    public void onClick(View view) {

    }

}
