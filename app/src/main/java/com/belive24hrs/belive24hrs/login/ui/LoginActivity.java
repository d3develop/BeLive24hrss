package com.belive24hrs.belive24hrs.login.ui;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.belive24hrs.belive24hrs.R;
import com.belive24hrs.belive24hrs.utils.UtilMethods;

public class LoginActivity extends AppCompatActivity {

    TextView tv_signIn, tv_sign_up;
    View signin_view;
    LinearLayout ll_sign_in, ll_sign_up;
    TextInputEditText user, password, first_name, last_name, et_email, number, role, et_pass;
    RelativeLayout login, signup;
    ScrollView scrollView;
    View view_sign_in, view_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetIds();
    }

    private void GetIds() {
        tv_signIn = (TextView) findViewById(R.id.tv_signIn);
        tv_sign_up = (TextView) findViewById(R.id.tv_sign_up);
        signin_view = (View) findViewById(R.id.signin_view);
        ll_sign_in = (LinearLayout) findViewById(R.id.ll_sign_in);
        ll_sign_up = (LinearLayout) findViewById(R.id.ll_sign_up);
        user = (TextInputEditText) findViewById(R.id.user);
        password = (TextInputEditText) findViewById(R.id.password);

        first_name = (TextInputEditText) findViewById(R.id.first_name);
        last_name = (TextInputEditText) findViewById(R.id.last_name);
        et_email = (TextInputEditText) findViewById(R.id.et_email);
        number = (TextInputEditText) findViewById(R.id.number);
        role = (TextInputEditText) findViewById(R.id.role);
        et_pass = (TextInputEditText) findViewById(R.id.et_pass);

        scrollView = (ScrollView) findViewById(R.id.scrollView) ;
        view_sign_in = (View) findViewById(R.id.signin_view);
        view_sign_up = (View) findViewById(R.id.sign_up_view);



        login = (RelativeLayout) findViewById(R.id.login);
        signup = (RelativeLayout) findViewById(R.id.signup);
        tv_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Login"," Click Login");

                ll_sign_in.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);
                view_sign_up.setVisibility(View.GONE);
                view_sign_in.setVisibility(View.VISIBLE);
            }
        });
        tv_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Login"," Click Signup");
                ll_sign_in.setVisibility(View.GONE);
                scrollView.setVisibility(View.VISIBLE);
                view_sign_in.setVisibility(View.GONE);
                view_sign_up.setVisibility(View.VISIBLE);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilMethods.INSTANCE.Login(getApplicationContext(), user.getText().toString().trim(), password.getText().toString().trim());
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UtilMethods.INSTANCE.SignUp(getApplicationContext(), first_name.getText().toString().trim(), last_name.getText().toString().trim(), et_email.getText().toString().trim(),
                        number.getText().toString().trim(), "Male", password.getText().toString().trim());
            }
        });
    }

    private void setLisetner() {

    }
}
