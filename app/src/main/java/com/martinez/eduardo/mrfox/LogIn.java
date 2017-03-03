package com.martinez.eduardo.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
    EditText editTextUser, editTextpwd;
    Button buttonLogIn;
    TextView tvTitulo, tvSubT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        editTextUser = (EditText)findViewById(R.id.editTextUser);
        editTextpwd = (EditText)findViewById(R.id.editTextpwd);
        buttonLogIn = (Button)findViewById(R.id.buttonLogIn);
        tvTitulo = (TextView)findViewById(R.id.tvTitulo);
        tvSubT = (TextView)findViewById(R.id.tvSubT);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        tvTitulo.setTypeface(myFont);

        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        tvSubT.setTypeface(myFont);
    }

    public void login (View view){
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
}
