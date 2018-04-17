package com.belive24hrs.belive24hrs.login.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.belive24hrs.belive24hrs.R;

import java.util.ArrayList;
import java.util.Arrays;

public class LiveUserActivityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_user_activity);

        ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
        ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.login_logo
                , R.drawable.login_bg, R.drawable.login_logo, R.drawable.login_logo, R.drawable.login_bg, R.drawable.login_logo, R.drawable.login_bg,R.drawable.login_logo, R.drawable.login_bg, R.drawable.login_logo, R.drawable.login_logo, R.drawable.login_logo, R.drawable.login_logo, R.drawable.login_bg));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        LiveUserGridAdapter customAdapter = new LiveUserGridAdapter(LiveUserActivityActivity.this,personNames,personImages);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}
