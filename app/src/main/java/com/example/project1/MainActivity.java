package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDrawable(R.drawable.ic_launcher_background);

        username = findViewById(R.id.username);
        password = findViewById(R.id.editTextTextPassword);

        login = findViewById(R.id.btnLogin);
        signUp = findViewById(R.id.button2);

        final String myName = "Scale";
        final String passW = "1234";


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText();
                password.getText();

                if (myName.equals(username) && passW.equals(password)){
                    Toast.makeText(MainActivity.this, "login successfully", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this,MainPage.class);
                    startActivity(intent);

                }else {
                    Toast.makeText(MainActivity.this, "login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp.getText();
                Toast.makeText(MainActivity.this, "sign up", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent( MainActivity.this,SignUpPage.class);
            }
        });

    }
}