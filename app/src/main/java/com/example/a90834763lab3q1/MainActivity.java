package com.example.a90834763lab3q1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerQuestions, spinnerCategory;
    Button btnLoadQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerQuestions = findViewById(R.id.spinnerQuestions);
        spinnerCategory = findViewById(R.id.spinnerCategory);
        btnLoadQuiz = findViewById(R.id.btnLoadQuiz);

        ArrayAdapter<CharSequence> questionAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.question_counts,
                android.R.layout.simple_spinner_item
        );
        questionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerQuestions.setAdapter(questionAdapter);

        ArrayAdapter<CharSequence> categoryAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.quiz_categories,
                android.R.layout.simple_spinner_item
        );
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(categoryAdapter);

        btnLoadQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedQuestionCount = spinnerQuestions.getSelectedItem().toString();
                String selectedCategory = spinnerCategory.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("questionCount", selectedQuestionCount);
                intent.putExtra("category", selectedCategory);
                startActivity(intent);
            }
        });
    }
}