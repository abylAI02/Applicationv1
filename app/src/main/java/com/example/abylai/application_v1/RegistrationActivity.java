package com.example.abylai.application_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
    private TextView registrationText;
    private Spinner genderSpinner;
    private TextView ageText;
    private Spinner ageSpinner;
    private TextView genderText;
    private EditText nameEditText;
    private EditText surnameEditText;
    private Spinner regionSpinner;
    private EditText schoolEditText;
    private Spinner gradeSpinner;
    private TextView gradeTextView;
    private Spinner interestSpinner;
    private CheckBox checkBox;
    private TextView checkBoxText;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registrationText = findViewById(R.id.registrationText);
        genderSpinner = findViewById(R.id.genderSpinner);
        ageText= findViewById(R.id.ageText);
        ageSpinner = findViewById(R.id.ageSpinner);
        genderText = findViewById(R.id.genderText);
        nameEditText = findViewById(R.id.nameEditText);
        surnameEditText = findViewById(R.id.surnameEditText);
        regionSpinner = findViewById(R.id.regionSpinner);
        schoolEditText = findViewById(R.id.schoolEditText);
        gradeSpinner = findViewById(R.id.gradeSpinner);
        gradeTextView = findViewById(R.id.gradeTextView);
        interestSpinner = findViewById(R.id.interestSpinner);
        checkBox = findViewById(R.id.checkBox);
        checkBoxText = findViewById(R.id.checkBoxText);
        goButton = findViewById(R.id.goButton);
    }
}
