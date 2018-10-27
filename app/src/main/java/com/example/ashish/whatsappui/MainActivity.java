package com.example.ashish.whatsappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Profile> profiles = new ArrayList<>();

        profiles.add(new Profile("Cse Official Group","10:20 pm","hey bro wassup",R.drawable.a));
        profiles.add(new Profile("Devid Bachaku","12:30 am","hi there",R.drawable.b));
        profiles.add(new Profile("Tom Scandel","6:20 pm","what up dawg",R.drawable.c));
        profiles.add(new Profile("Ashish Kashyap","01:10 am","hi",R.drawable.c));
        profiles.add(new Profile("Roma Mam","08:20 pm","Howdy neighbour",R.drawable.d));
        profiles.add(new Profile("Toper GBPEC","10:02 am","What's Up",R.drawable.e));
        profiles.add(new Profile("ASHISH","10:20 pm","hey bro wassup",R.drawable.a));
        profiles.add(new Profile("ASHWANI","12:30 am","hi there",R.drawable.b));
        profiles.add(new Profile("DEATH EATERS GROUP","6:20 pm","what up dawg",R.drawable.c));
        profiles.add(new Profile("Cse Official Group","01:10 am","hi",R.drawable.c));
        profiles.add(new Profile("Tom Riddle","08:20 pm","Howdy neighbour",R.drawable.d));
        profiles.add(new Profile("Toper GBPEC","10:02 am","What's Up",R.drawable.e));
        profiles.add(new Profile("ash","10:20 pm","hey bro wassup",R.drawable.a));
        profiles.add(new Profile("Tom Riddle","12:30 am","hi there",R.drawable.b));
        profiles.add(new Profile("ash","6:20 pm","what up dawg",R.drawable.c));
        profiles.add(new Profile("Toper GBPEC","01:10 am","hi",R.drawable.c));
        profiles.add(new Profile("ash","08:20 pm","Howdy neighbour",R.drawable.d));
        profiles.add(new Profile("Cse Official Group","10:02 am","What's Up",R.drawable.e));
        profiles.add(new Profile("Hermoine Granger","10:20 pm","hey bro wassup",R.drawable.a));
        profiles.add(new Profile("Hermoine Granger","10:20 pm","hey bro wassup",R.drawable.a));
        profiles.add(new Profile("Cse Official Group","12:30 am","hi there",R.drawable.b));
        profiles.add(new Profile("ash","6:20 pm","what up dawg",R.drawable.c));
        profiles.add(new Profile("Tom Riddle","01:10 am","hi",R.drawable.c));
        profiles.add(new Profile("ash","08:20 pm","Howdy neighbour",R.drawable.d));
        profiles.add(new Profile("Toper GBPEC","10:02 am","What's Up",R.drawable.e));


        RecyclerView recyclerView=findViewById(R.id.recyclerViewList);
        RecyclerAdapter adapter =new RecyclerAdapter(this,profiles);

        LinearLayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                manager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_layout, menu);

        return true;
    }
}
