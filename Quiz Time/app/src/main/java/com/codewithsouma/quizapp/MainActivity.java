package com.codewithsouma.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    //scroll view and button group declair
    private ScrollView scroll;
    private RadioGroup radioGroupOne;
    private RadioGroup radioGroupTwo;
    private RadioGroup radioGroupThree;
    private RadioGroup radioGroupFour;
    private RadioGroup radioGroupFive;
    private RadioGroup radioGroupSix;
    private RadioGroup radioGroupSeven;
    // total correct answer
    private int correctAnswers=0;
    // wrong answer
    String wrongAnswers = "Check :\n" ;

    //all the correct answer
    private RadioButton sundarPichai;
    private RadioButton newYork;
    private RadioButton tenYearsOld;
    private RadioButton twoThousandAndSeven;
    private String answerOfQuestionFive="C";
    private String answerOfQuestionSix="Java";
    private RadioButton xiaomi;
    private CheckBox founder;
    private CheckBox ceo;
    private CheckBox president;
    private RadioButton iot;
    private RadioButton ai;

    //user response of question 5 and question 6
    private EditText userResponseOfQuestionFive;
    private EditText userResponseOfQuestionSix;

    //wrong answer of question 8
    private CheckBox projectManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //all button group and scroll view map
        scroll = (ScrollView) findViewById(R.id.Scroll);
        radioGroupOne = (RadioGroup) findViewById(R.id.radioGroupOne);
        radioGroupTwo = (RadioGroup) findViewById(R.id.radioGroupTwo);
        radioGroupThree = (RadioGroup) findViewById(R.id.radioGroupThree);
        radioGroupFour = (RadioGroup) findViewById(R.id.radioGroupFour);
        radioGroupFive = (RadioGroup) findViewById(R.id.radioGroupFive);
        radioGroupSix = (RadioGroup) findViewById(R.id.radioGroupSix);
        radioGroupSeven = (RadioGroup) findViewById(R.id.radioGroupSeven);

       //all the correct answer button and text field mapped
        sundarPichai=(RadioButton) findViewById(R.id.rb_sundar_pichai);
        newYork=(RadioButton)findViewById(R.id.rb_new_york);
        tenYearsOld=(RadioButton)findViewById(R.id.rb_ten_years_old);
        twoThousandAndSeven=(RadioButton)findViewById(R.id.rb_ten_years_old);
        xiaomi=(RadioButton)findViewById(R.id.rb_xiaomi);
        founder=(CheckBox)findViewById(R.id.cb1_founder);
        ceo=(CheckBox)findViewById(R.id.cb2_ceo);
        president=(CheckBox)findViewById(R.id.cb3_president);
        iot=(RadioButton)findViewById(R.id.rb_iot);
        ai=(RadioButton)findViewById(R.id.rb_ai);

        //wrong answer of question 8
        projectManager=(CheckBox)findViewById(R.id.cb4_wrong_answer);

        //user response of question 5 and question 6
        userResponseOfQuestionFive=(EditText)findViewById(R.id.user_response_of_question_five);
        userResponseOfQuestionSix=(EditText)findViewById(R.id.user_response_of_question_six);


    }

    /**
     * This method work when you click submit button then this mthode chake how many number of answer is correct and
     * how many number of answer is wrong
     * @param v give a parameter as view
     */

    public void SubmitResponse(View v) {

        if (sundarPichai.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q1\n";
        }
        if (newYork.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q2\n";
        }
        if (tenYearsOld.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q3\n";
        }

        if (twoThousandAndSeven.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q4\n";
        }

        if (answerOfQuestionFive.equalsIgnoreCase(userResponseOfQuestionFive.getText().toString().trim())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q5\n";
        }

        if (answerOfQuestionSix.equalsIgnoreCase(userResponseOfQuestionSix.getText().toString().trim())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q6\n";
        }

        if (xiaomi.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q7\n";
        }

        if (founder.isChecked() && ceo.isChecked() && president.isChecked() && !(projectManager.isChecked())) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q8\n";
        }

        if (iot.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q9\n";
        }

        if (ai.isChecked()) {
            correctAnswers++;
        } else {
            wrongAnswers = wrongAnswers + "Q10\n";
        }

        if (correctAnswers == 10) {
            Toast.makeText(this, "Congrats, All Answers Correct", Toast.LENGTH_LONG).show();
            customToast();
        } else {
            Toast.makeText(this, "Correct Answers: " + correctAnswers + " /10\n" + wrongAnswers, Toast.LENGTH_LONG).show();
            customToast();

        }

        ResetQuiz((View)findViewById(R.id.main_content));

    }

    /**
     * this method helps to reset the quiz
     * @param view
     */
    public void ResetQuiz(View view) {

        correctAnswers = 0;
        wrongAnswers="Check :\n";

        userResponseOfQuestionFive.getText().clear();
        userResponseOfQuestionSix.getText().clear();

        radioGroupOne.clearCheck();
        radioGroupTwo.clearCheck();
        radioGroupThree.clearCheck();
        radioGroupFour.clearCheck();
        radioGroupFive.clearCheck();
        radioGroupSix.clearCheck();
        radioGroupSeven.clearCheck();

        if (founder.isChecked()) {
            founder.toggle();
        }

        if (ceo.isChecked()) {
            ceo.toggle();
        }

        if (president.isChecked()) {
            president.toggle();
        }

        if (projectManager.isChecked()) {
            projectManager.toggle();
        }

        scroll.fullScroll(ScrollView.FOCUS_UP);
    }

    /**
     * This method display a custom toast in you app/screen
     */
    public void customToast() {


        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = (TextView) layout.findViewById(R.id.score);
        text.setText(correctAnswers+"/10");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }

}
