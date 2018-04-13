package com.belive24hrs.belive24hrs.Dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.belive24hrs.belive24hrs.R;

public class Dashboard extends AppCompatActivity {

    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        name = (TextView) findViewById(R.id.name);
        name.setText(getIntent().getExtras().getString("Name"));
    }
}
