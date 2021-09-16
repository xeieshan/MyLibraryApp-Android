package com.example.mylibraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;

    TextView labelOnboard;
    TextView lblFirstName;
    TextView lblLastName;
    TextView lblEmail;
    EditText txtFirstName;
    EditText txtLastName;
    EditText txtEmail;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelOnboard = findViewById(R.id.textView);
        txtFirstName = findViewById(R.id.editTextFirstName);
        txtLastName = findViewById(R.id.editTextLastName);
        txtEmail = findViewById(R.id.editTextEmail);
        lblFirstName = findViewById(R.id.lblFirstName);
        lblLastName = findViewById(R.id.lblLastName);
        lblEmail = findViewById(R.id.lblEmail);
        btnSubmit = findViewById(R.id.buttonSubmit);

        labelOnboard.setText("My Books");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        lblFirstName.setText("First Name: ");
        lblLastName.setText("Last Name: ");
        lblEmail.setText("Email: ");
        btnSubmit.setText("Submit");
    }

    public void onButtonClick(View sender) {
//        ++i;
//        if (i%2 == 0) {
//            labelOnboard.setText(txtFirstName.getText().toString() + " Hello!");
//        } else {
//            labelOnboard.setText("Hello " + txtFirstName.getText().toString());
//        }
        lblFirstName.setText("First Name: " + txtFirstName.getText().toString());
        lblLastName.setText("Last Name: " + txtLastName.getText().toString());
        lblEmail.setText("Email: " + txtEmail.getText().toString());
    }
}