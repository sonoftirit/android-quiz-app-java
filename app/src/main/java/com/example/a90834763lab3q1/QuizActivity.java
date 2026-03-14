package com.example.a90834763lab3q1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    TextView tvQuestionNumber, tvQuestionText;
    ImageView imageQuestion;
    RadioGroup radioGroupOptions;
    RadioButton rbOption1, rbOption2, rbOption3, rbOption4;
    Button btnNext;

    ArrayList<Question> questionList;
    int currentQuestionIndex = 0;
    int totalQuestions;
    int score = 0;

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

        String category = getIntent().getStringExtra("category");
        String questionCountString = getIntent().getStringExtra("questionCount");
        totalQuestions = Integer.parseInt(questionCountString);

        questionList = QuestionBank.getQuestions(category);

        showQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedRadioButtonId = radioGroupOptions.getCheckedRadioButtonId();

                if (selectedRadioButtonId == -1) {
                    Toast.makeText(QuizActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                    return;
                }

                int selectedIndex = -1;

                if (selectedRadioButtonId == R.id.rbOption1) selectedIndex = 0;
                if (selectedRadioButtonId == R.id.rbOption2) selectedIndex = 1;
                if (selectedRadioButtonId == R.id.rbOption3) selectedIndex = 2;
                if (selectedRadioButtonId == R.id.rbOption4) selectedIndex = 3;

                if (selectedIndex == questionList.get(currentQuestionIndex).correctAnswerIndex) {
                    score++;
                }

                currentQuestionIndex++;

                if (currentQuestionIndex < totalQuestions) {
                    showQuestion();
                } else {
                    Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                    intent.putExtra("score", score);
                    intent.putExtra("totalQuestions", totalQuestions);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private void showQuestion() {
        Question currentQuestion = questionList.get(currentQuestionIndex);

        tvQuestionNumber.setText("Question " + (currentQuestionIndex + 1) + " of " + totalQuestions);
        tvQuestionText.setText(currentQuestion.questionText);
        imageQuestion.setImageResource(currentQuestion.imageResId);

        rbOption1.setText(currentQuestion.options[0]);
        rbOption2.setText(currentQuestion.options[1]);
        rbOption3.setText(currentQuestion.options[2]);
        rbOption4.setText(currentQuestion.options[3]);

        radioGroupOptions.clearCheck();

        if (currentQuestionIndex == totalQuestions - 1) {
            btnNext.setText("Finish");
        } else {
            btnNext.setText("Next");
        }
    }
}