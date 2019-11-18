package com.example.applyforjobs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ImageView imageview1, imageview2;
    TextInputEditText email, password;
    MaterialButton loginbtn;
    TextView sigup;
    ProgressBar progressbar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview1 = findViewById(R.id.imageView1);
        imageview2 = findViewById(R.id.imageView2);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginbtn = findViewById(R.id.login);
        sigup = findViewById(R.id.signup);
        progressbar = findViewById(R.id.progressBar);
        firebaseAuth = firebaseAuth.getInstance();
    }

}


