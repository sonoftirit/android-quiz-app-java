package com.example.a90834763lab3q1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    TextView tvQuestionNumber, tvQuestionText;
    ImageView imageQuestion;
    RadioGroup radioGroupOptions;
    RadioButton rbOption1, rbOption2, rbOption3, rbOption4;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestionNumber = findViewById(R.id.tvQuestionNumber);
        tvQuestionText = findViewById(R.id.tvQuestionText);
        imageQuestion = findViewById(R.id.imageQuestion);
        radioGroupOptions = findViewById(R.id.radioGroupOptions);
        rbOption1 = findViewById(R.id.rbOption1);
        rbOption2 = findViewById(R.id.rbOption2);
        rbOption3 = findViewById(R.id.rbOption3);
        rbOption4 = findViewById(R.id.rbOption4);
        btnNext = findViewById(R.id.btnNext);

        String questionCount = getIntent().getStringExtra("questionCount");
        String category = getIntent().getStringExtra("category");

        tvQuestionNumber.setText("Question 1 of " + questionCount);
        tvQuestionText.setText("Category selected: " + category);

        rbOption1.setText("Option 1");
        rbOption2.setText("Option 2");
        rbOption3.setText("Option 3");
        rbOption4.setText("Option 4");
    }
}