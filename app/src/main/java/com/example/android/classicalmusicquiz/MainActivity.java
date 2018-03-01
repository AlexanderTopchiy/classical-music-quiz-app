package com.example.android.classicalmusicquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Set key for save value then changing orientation.
    static final String NAME = "name_player";
    static final String ANSWER1 = "answer1";
    static final String ANSWER2_1 = "answer2_1";
    static final String ANSWER2_2 = "answer2_2";
    static final String ANSWER2_3 = "answer2_3";
    static final String ANSWER2_4 = "answer2_4";
    static final String ANSWER3_1 = "answer3_1";
    static final String ANSWER3_2 = "answer3_2";
    static final String ANSWER3_3 = "answer3_3";
    static final String ANSWER3_4 = "answer3_4";
    static final String ANSWER4_1 = "answer4_1";
    static final String ANSWER4_2 = "answer4_2";
    static final String ANSWER4_3 = "answer4_3";
    static final String ANSWER4_4 = "answer4_4";
    static final String ANSWER5_1 = "answer5_1";
    static final String ANSWER5_2 = "answer5_2";
    static final String ANSWER5_3 = "answer5_3";
    static final String ANSWER5_4 = "answer5_4";
    static final String ANSWER6_1 = "answer6_1";
    static final String ANSWER6_2 = "answer6_2";
    static final String ANSWER6_3 = "answer6_3";
    static final String ANSWER6_4 = "answer6_4";
    static final String ANSWER7_1 = "answer7_1";
    static final String ANSWER7_2 = "answer7_2";
    static final String ANSWER7_3 = "answer7_3";
    static final String ANSWER7_4 = "answer7_4";
    static final String ANSWER8_1 = "answer8_1";
    static final String ANSWER8_2 = "answer8_2";
    static final String ANSWER8_3 = "answer8_3";
    static final String ANSWER8_4 = "answer8_4";
    static final String ANSWER9_1 = "answer9_1";
    static final String ANSWER9_2 = "answer9_2";
    static final String ANSWER9_3 = "answer9_3";
    static final String ANSWER9_4 = "answer9_4";
    static final String ANSWER10_1 = "answer10_1";
    static final String ANSWER10_2 = "answer10_2";
    static final String ANSWER10_3 = "answer10_3";
    static final String ANSWER10_4 = "answer10_4";


    /**
     * Check right answers and show the result.
     * @param view information.
     */
    public void finishQuiz(View view) {
        // Get player name.
        EditText name  = findViewById(R.id.name_edit_text);
        String namePlayer = name.getText().toString().trim();

        // Get answer for question 1.
        EditText getAnswer1 = findViewById(R.id.answer_1_edit_text);
        String answer1 = getAnswer1.getText().toString().trim();

        // Get status of right answers.
        CheckBox getAnswer2_1 = findViewById(R.id.answer_2_1);
        boolean isAnswer2_1 = getAnswer2_1.isChecked();
        CheckBox getAnswer2_2 = findViewById(R.id.answer_2_2);
        boolean isAnswer2_2 = getAnswer2_2.isChecked();
        CheckBox getAnswer2_3 = findViewById(R.id.answer_2_3);
        boolean isAnswer2_3 = getAnswer2_3.isChecked();
        CheckBox getAnswer2_4 = findViewById(R.id.answer_2_4);
        boolean isAnswer2_4 = getAnswer2_4.isChecked();
        RadioButton getAnswer3_1 = findViewById(R.id.answer_3_1);
        boolean isAnswer3_1 = getAnswer3_1.isChecked();
        RadioButton getAnswer4_2 = findViewById(R.id.answer_4_2);
        boolean isAnswer4_2 = getAnswer4_2.isChecked();
        RadioButton getAnswer5_2 = findViewById(R.id.answer_5_2);
        boolean isAnswer5_2 = getAnswer5_2.isChecked();
        RadioButton getAnswer6_1 = findViewById(R.id.answer_6_1);
        boolean isAnswer6_1 = getAnswer6_1.isChecked();
        RadioButton getAnswer7_2 = findViewById(R.id.answer_7_2);
        boolean isAnswer7_2 = getAnswer7_2.isChecked();
        RadioButton getAnswer8_2 = findViewById(R.id.answer_8_2);
        boolean isAnswer8_2 = getAnswer8_2.isChecked();
        RadioButton getAnswer9_1 = findViewById(R.id.answer_9_1);
        boolean isAnswer9_1 = getAnswer9_1.isChecked();
        RadioButton getAnswer10_4 = findViewById(R.id.answer_10_4);
        boolean isAnswer10_4 = getAnswer10_4.isChecked();

        // Initialize score of right answers.
        int score = 0;

        // Check right answers.
        if (namePlayer.isEmpty()) namePlayer = "player";
        if (answer1.toLowerCase().equals("jupiter")) score += 1;
        if (isAnswer2_2 && isAnswer2_3 && !isAnswer2_1 && !isAnswer2_4) score += 1;
        if (isAnswer3_1) score += 1;
        if (isAnswer4_2) score += 1;
        if (isAnswer5_2) score += 1;
        if (isAnswer6_1) score += 1;
        if (isAnswer7_2) score += 1;
        if (isAnswer8_2) score += 1;
        if (isAnswer9_1) score += 1;
        if (isAnswer10_4) score += 1;

        // Show result message.
        Toast.makeText(this, "Congrats, " + namePlayer +
                "! You correctly answered on " + score + " of 10 questions!", Toast.LENGTH_LONG).show();
    }


    /**
     * Reset name's text field and all answers.
     * @param view information.
     */
    public void resetQuiz (View view) {
        // Clear name's text field.
        EditText name  = findViewById(R.id.name_edit_text);
        name.setText("");

        // Clear answer 1 text field.
        EditText getAnswer1 = findViewById(R.id.answer_1_edit_text);
        getAnswer1.setText("");

        // Clear answers.
        CheckBox getAnswer2_1 = findViewById(R.id.answer_2_1);
        getAnswer2_1.setChecked(false);
        CheckBox getAnswer2_2 = findViewById(R.id.answer_2_2);
        getAnswer2_2.setChecked(false);
        CheckBox getAnswer2_3 = findViewById(R.id.answer_2_3);
        getAnswer2_3.setChecked(false);
        CheckBox getAnswer2_4 = findViewById(R.id.answer_2_4);
        getAnswer2_4.setChecked(false);
        RadioGroup groupAnswer3 = findViewById(R.id.group_question_3);
        groupAnswer3.clearCheck();
        RadioGroup groupAnswer4 = findViewById(R.id.group_question_4);
        groupAnswer4.clearCheck();
        RadioGroup groupAnswer5 = findViewById(R.id.group_question_5);
        groupAnswer5.clearCheck();
        RadioGroup groupAnswer6 = findViewById(R.id.group_question_6);
        groupAnswer6.clearCheck();
        RadioGroup groupAnswer7 = findViewById(R.id.group_question_7);
        groupAnswer7.clearCheck();
        RadioGroup groupAnswer8 = findViewById(R.id.group_question_8);
        groupAnswer8.clearCheck();
        RadioGroup groupAnswer9 = findViewById(R.id.group_question_9);
        groupAnswer9.clearCheck();
        RadioGroup groupAnswer10 = findViewById(R.id.group_question_10);
        groupAnswer10.clearCheck();
    }


    /**
     * Save current status of answers then changing orientation.
     * @param savedInstanceState status of answers.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Get player name.
        EditText name  = findViewById(R.id.name_edit_text);
        String namePlayer = name.getText().toString().trim();

        // Get answer for question 1.
        EditText getAnswer1 = findViewById(R.id.answer_1_edit_text);
        String answer1 = getAnswer1.getText().toString().trim();

        // Get status of right answers.
        CheckBox getAnswer2_2 = findViewById(R.id.answer_2_2);
        boolean isAnswer2_2 = getAnswer2_2.isChecked();
        CheckBox getAnswer2_3 = findViewById(R.id.answer_2_3);
        boolean isAnswer2_3 = getAnswer2_3.isChecked();
        RadioButton getAnswer3_1 = findViewById(R.id.answer_3_1);
        boolean isAnswer3_1 = getAnswer3_1.isChecked();
        RadioButton getAnswer4_2 = findViewById(R.id.answer_4_2);
        boolean isAnswer4_2 = getAnswer4_2.isChecked();
        RadioButton getAnswer5_2 = findViewById(R.id.answer_5_2);
        boolean isAnswer5_2 = getAnswer5_2.isChecked();
        RadioButton getAnswer6_1 = findViewById(R.id.answer_6_1);
        boolean isAnswer6_1 = getAnswer6_1.isChecked();
        RadioButton getAnswer7_2 = findViewById(R.id.answer_7_2);
        boolean isAnswer7_2 = getAnswer7_2.isChecked();
        RadioButton getAnswer8_2 = findViewById(R.id.answer_8_2);
        boolean isAnswer8_2 = getAnswer8_2.isChecked();
        RadioButton getAnswer9_1 = findViewById(R.id.answer_9_1);
        boolean isAnswer9_1 = getAnswer9_1.isChecked();
        RadioButton getAnswer10_4 = findViewById(R.id.answer_10_4);
        boolean isAnswer10_4 = getAnswer10_4.isChecked();

        // Get status of another answers.
        CheckBox getAnswer2_1 = findViewById(R.id.answer_2_1);
        boolean isAnswer2_1 = getAnswer2_1.isChecked();
        CheckBox getAnswer2_4 = findViewById(R.id.answer_2_4);
        boolean isAnswer2_4 = getAnswer2_4.isChecked();
        RadioButton getAnswer3_2 = findViewById(R.id.answer_3_2);
        boolean isAnswer3_2 = getAnswer3_2.isChecked();
        RadioButton getAnswer3_3 = findViewById(R.id.answer_3_3);
        boolean isAnswer3_3 = getAnswer3_3.isChecked();
        RadioButton getAnswer3_4 = findViewById(R.id.answer_3_4);
        boolean isAnswer3_4 = getAnswer3_4.isChecked();
        RadioButton getAnswer4_1 = findViewById(R.id.answer_4_1);
        boolean isAnswer4_1 = getAnswer4_1.isChecked();
        RadioButton getAnswer4_3 = findViewById(R.id.answer_4_3);
        boolean isAnswer4_3 = getAnswer4_3.isChecked();
        RadioButton getAnswer4_4 = findViewById(R.id.answer_4_4);
        boolean isAnswer4_4 = getAnswer4_4.isChecked();
        RadioButton getAnswer5_1 = findViewById(R.id.answer_5_1);
        boolean isAnswer5_1 = getAnswer5_1.isChecked();
        RadioButton getAnswer5_3 = findViewById(R.id.answer_5_3);
        boolean isAnswer5_3 = getAnswer5_3.isChecked();
        RadioButton getAnswer5_4 = findViewById(R.id.answer_5_4);
        boolean isAnswer5_4 = getAnswer5_4.isChecked();
        RadioButton getAnswer6_2 = findViewById(R.id.answer_6_2);
        boolean isAnswer6_2 = getAnswer6_2.isChecked();
        RadioButton getAnswer6_3 = findViewById(R.id.answer_6_3);
        boolean isAnswer6_3 = getAnswer6_3.isChecked();
        RadioButton getAnswer6_4 = findViewById(R.id.answer_6_4);
        boolean isAnswer6_4 = getAnswer6_4.isChecked();
        RadioButton getAnswer7_1 = findViewById(R.id.answer_7_1);
        boolean isAnswer7_1 = getAnswer7_1.isChecked();
        RadioButton getAnswer7_3 = findViewById(R.id.answer_7_3);
        boolean isAnswer7_3 = getAnswer7_3.isChecked();
        RadioButton getAnswer7_4 = findViewById(R.id.answer_7_4);
        boolean isAnswer7_4 = getAnswer7_4.isChecked();
        RadioButton getAnswer8_1 = findViewById(R.id.answer_8_1);
        boolean isAnswer8_1 = getAnswer8_1.isChecked();
        RadioButton getAnswer8_3 = findViewById(R.id.answer_8_3);
        boolean isAnswer8_3 = getAnswer8_3.isChecked();
        RadioButton getAnswer8_4 = findViewById(R.id.answer_8_4);
        boolean isAnswer8_4 = getAnswer8_4.isChecked();
        RadioButton getAnswer9_2 = findViewById(R.id.answer_9_2);
        boolean isAnswer9_2 = getAnswer9_2.isChecked();
        RadioButton getAnswer9_3 = findViewById(R.id.answer_9_3);
        boolean isAnswer9_3 = getAnswer9_3.isChecked();
        RadioButton getAnswer9_4 = findViewById(R.id.answer_9_4);
        boolean isAnswer9_4 = getAnswer9_4.isChecked();
        RadioButton getAnswer10_1 = findViewById(R.id.answer_10_1);
        boolean isAnswer10_1 = getAnswer10_1.isChecked();
        RadioButton getAnswer10_2 = findViewById(R.id.answer_10_2);
        boolean isAnswer10_2 = getAnswer10_2.isChecked();
        RadioButton getAnswer10_3 = findViewById(R.id.answer_10_3);
        boolean isAnswer10_3 = getAnswer10_3.isChecked();

        // Save player name.
        savedInstanceState.putString(NAME, namePlayer);

        // Save answer 1.
        savedInstanceState.putString(ANSWER1, answer1);

        // Save current status of answers.
        savedInstanceState.putBoolean(ANSWER2_1, isAnswer2_1);
        savedInstanceState.putBoolean(ANSWER2_2, isAnswer2_2);
        savedInstanceState.putBoolean(ANSWER2_3, isAnswer2_3);
        savedInstanceState.putBoolean(ANSWER2_4, isAnswer2_4);
        savedInstanceState.putBoolean(ANSWER3_1, isAnswer3_1);
        savedInstanceState.putBoolean(ANSWER3_2, isAnswer3_2);
        savedInstanceState.putBoolean(ANSWER3_3, isAnswer3_3);
        savedInstanceState.putBoolean(ANSWER3_4, isAnswer3_4);
        savedInstanceState.putBoolean(ANSWER4_1, isAnswer4_1);
        savedInstanceState.putBoolean(ANSWER4_2, isAnswer4_2);
        savedInstanceState.putBoolean(ANSWER4_3, isAnswer4_3);
        savedInstanceState.putBoolean(ANSWER4_4, isAnswer4_4);
        savedInstanceState.putBoolean(ANSWER5_1, isAnswer5_1);
        savedInstanceState.putBoolean(ANSWER5_2, isAnswer5_2);
        savedInstanceState.putBoolean(ANSWER5_3, isAnswer5_3);
        savedInstanceState.putBoolean(ANSWER5_4, isAnswer5_4);
        savedInstanceState.putBoolean(ANSWER6_1, isAnswer6_1);
        savedInstanceState.putBoolean(ANSWER6_2, isAnswer6_2);
        savedInstanceState.putBoolean(ANSWER6_3, isAnswer6_3);
        savedInstanceState.putBoolean(ANSWER6_4, isAnswer6_4);
        savedInstanceState.putBoolean(ANSWER7_1, isAnswer7_1);
        savedInstanceState.putBoolean(ANSWER7_2, isAnswer7_2);
        savedInstanceState.putBoolean(ANSWER7_3, isAnswer7_3);
        savedInstanceState.putBoolean(ANSWER7_4, isAnswer7_4);
        savedInstanceState.putBoolean(ANSWER8_1, isAnswer8_1);
        savedInstanceState.putBoolean(ANSWER8_2, isAnswer8_2);
        savedInstanceState.putBoolean(ANSWER8_3, isAnswer8_3);
        savedInstanceState.putBoolean(ANSWER8_4, isAnswer8_4);
        savedInstanceState.putBoolean(ANSWER9_1, isAnswer9_1);
        savedInstanceState.putBoolean(ANSWER9_2, isAnswer9_2);
        savedInstanceState.putBoolean(ANSWER9_3, isAnswer9_3);
        savedInstanceState.putBoolean(ANSWER9_4, isAnswer9_4);
        savedInstanceState.putBoolean(ANSWER10_1, isAnswer10_1);
        savedInstanceState.putBoolean(ANSWER10_2, isAnswer10_2);
        savedInstanceState.putBoolean(ANSWER10_3, isAnswer10_3);
        savedInstanceState.putBoolean(ANSWER10_4, isAnswer10_4);

        // Always call the superclass so it can save the view hierarchy state.
        super.onSaveInstanceState(savedInstanceState);
    }
}