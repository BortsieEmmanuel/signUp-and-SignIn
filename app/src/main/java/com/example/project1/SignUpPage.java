package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

public class SignUpPage extends AppCompatActivity {
    EditText emailId, fullName, password, confirm, phone;
    Button submit, signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        emailId = findViewById(R.id.email_id);
        fullName = findViewById(R.id.name);
        password = findViewById(R.id.password);
        confirm = findViewById(R.id.confirm);
        phone = findViewById(R.id.phone_number);
        submit = findViewById(R.id.btnSubmit);
        signIn = findViewById(R.id.btnSignIn);
    }
}