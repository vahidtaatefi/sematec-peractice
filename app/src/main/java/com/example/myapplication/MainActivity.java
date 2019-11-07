package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycle = findViewById(R.id.recycler);
        ArrayList<String> list = new ArrayList<>();
        list.add("Profile");
        list.add("Caller");
        list.add("Cinema");
        list.add("Camera");
        ImageButton navbar = findViewById(R.id.navbar);
        navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerLayout = findViewById(R.id.draw);
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        recycleadapter adapter = new recycleadapter(list);
        recycle.setAdapter(adapter);
        recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL, false));

        //   Button btnprofile=findViewById(R.id.btnprofile);
        //   Button btncall=findViewById(R.id.btncall);
        //   btnprofile.setOnClickListener(new View.OnClickListener() {
        //       @Override
        //       public void onClick(View view) {
        //           Intent i=new Intent(MainActivity.this,profileset.class);
        //           startActivity(i);

        //   });
    }
}
