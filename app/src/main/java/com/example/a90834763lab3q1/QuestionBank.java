package com.example.a90834763lab3q1;

import java.util.ArrayList;

public class QuestionBank {

    public static ArrayList<Question> getQuestions(String category) {
        ArrayList<Question> questions = new ArrayList<>();

        if (category.equals("Canadian Capitals")) {
            questions.add(new Question(
                    "What is the capital of Ontario?",
                    R.drawable.ontario,
                    new String[]{"Ottawa", "Toronto", "Hamilton", "London"},
                    0
            ));

            questions.add(new Question(
                    "What is the capital of Prince Edward Island?",
                    R.drawable.pei,
                    new String[]{"Halifax", "Charlottetown", "Regina", "Victoria"},
                    1
            ));

            questions.add(new Question(
                    "What is the capital of Newfoundland and Labrador?",
                    R.drawable.newfoundland,
                    new String[]{"St. John's", "Winnipeg", "Fredericton", "Whitehorse"},
                    0
            ));

            questions.add(new Question(
                    "What is the capital of Manitoba?",
                    R.drawable.manitoba,
                    new String[]{"Brandon", "Regina", "Winnipeg", "Saskatoon"},
                    2
            ));
        }

        if (category.equals("About Canada")) {
            questions.add(new Question(
                    "Which leaf is strongly associated with Canada?",
                    R.drawable.mapleleaf,
                    new String[]{"Palm Leaf", "Oak Leaf", "Maple Leaf", "Pine Leaf"},
                    2
            ));

            questions.add(new Question(
                    "Which animal is a symbol of Canada?",
                    R.drawable.beaver,
                    new String[]{"Beaver", "Tiger", "Lion", "Wolf"},
                    0
            ));

            questions.add(new Question(
                    "What colors are on the Canadian flag?",
                    R.drawable.canadaflag,
                    new String[]{"Blue and White", "Red and White", "Green and White", "Red and Blue"},
                    1
            ));

            questions.add(new Question(
                    "Which sport is most associated with Canada?",
                    R.drawable.hockey,
                    new String[]{"Cricket", "Basketball", "Hockey", "Tennis"},
                    2
            ));
        }

        if (category.equals("Canadian Mountains")) {
            questions.add(new Question(
                    "Which mountain range is famous in western Canada?",
                    R.drawable.rockies,
                    new String[]{"Andes", "Alps", "Rocky Mountains", "Himalayas"},
                    2
            ));

            questions.add(new Question(
                    "Which place is famous for skiing in Canada?",
                    R.drawable.whistler,
                    new String[]{"Whistler", "Toronto", "Ottawa", "Montreal"},
                    0
            ));

            questions.add(new Question(
                    "Banff is in which province?",
                    R.drawable.banff,
                    new String[]{"Alberta", "Ontario", "Quebec", "Manitoba"},
                    0
            ));

            questions.add(new Question(
                    "Jasper and Banff are best known for:",
                    R.drawable.jasper,
                    new String[]{"Deserts", "Mountains", "Beaches", "Prairies"},
                    1
            ));
        }

        return questions;
    }
}
