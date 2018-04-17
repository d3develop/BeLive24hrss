package com.belive24hrs.belive24hrs.login.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.belive24hrs.belive24hrs.R;

public class GoLiveActivity extends AppCompatActivity {

    RelativeLayout rlViewLive;
    RelativeLayout rlGoLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_live);
        rlViewLive = (RelativeLayout)findViewById(R.id.rl_view_live);
        rlViewLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoLiveActivity.this,LiveUserActivityActivity.class);
                startActivity(intent);
            }
        });

    }
}
