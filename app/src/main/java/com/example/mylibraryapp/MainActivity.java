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
    EditText txtFirstName;
    EditText txtLastName;
    EditText txtEmail;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelOnboard = findViewById(R.id.textView);
        btnSubmit = findViewById(R.id.buttonSubmit);
        txtFirstName = findViewById(R.id.editTextPersonName);

        labelOnboard.setText("My Books");
        txtFirstName.setText("");
        btnSubmit.setText("Submit");
    }

    public void onButtonClick(View sender) {
        ++i;
        if (i%2 == 0) {
            labelOnboard.setText(txtFirstName.getText().toString() + " Hello!");
        } else {
            labelOnboard.setText("Hello " + txtFirstName.getText().toString());
        }
    }
}