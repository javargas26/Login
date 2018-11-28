package com.example.telematica.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void inicioTomaDatos(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }
}
