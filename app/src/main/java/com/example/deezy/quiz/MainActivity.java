package com.example.deezy.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    Boolean reverse = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void q1(View view){


//        Reverse is a Boolean that allows the reset button to work. Reverse starts off as true
//                so the first one time the button is clicked it checks the radio buttons and totals
//                the result using the quantity feature. Then at the end of the code it sets "reverse"
//                to false and changes the buttons text to "Retry?". When clicked again it clears all
//                the radio groups, changes the text back, sets "reverse" to true. And sets the textView
//                at the bottom blank.



        if(reverse) {

            RadioButton jonathon = (RadioButton) findViewById(R.id.jonathon);
            Boolean q1B = jonathon.isChecked();

            if (q1B) {
                quantity = quantity + 1;
            }
            RadioButton kars = (RadioButton) findViewById(R.id.kars);
            Boolean q2C = kars.isChecked();

            if (q2C) {
                quantity = quantity + 1;
            }

            RadioButton star = (RadioButton) findViewById(R.id.star);
            Boolean q3A = star.isChecked();

            if (q3A) {
                quantity = quantity + 1;
            }

            RadioButton crazy = (RadioButton) findViewById(R.id.crazy);
            Boolean q4D = crazy.isChecked();
            if (q4D) {
                quantity = quantity + 1;
            }


            RadioButton s1 = (RadioButton) findViewById(R.id.s1);
            Boolean sw1 = s1.isChecked();
            RadioButton s2 = (RadioButton) findViewById(R.id.s2);
            Boolean sw2 = s2.isChecked();
            RadioButton s3 = (RadioButton) findViewById(R.id.s3);
            Boolean sw3 = s3.isChecked();
            RadioButton s4 = (RadioButton) findViewById(R.id.s4);
            Boolean sw4 = s4.isChecked();

            if (sw1) {
                quantity = quantity + 1;
            }

            if (sw2) {
                quantity = quantity + 1;
            }

            if (sw3) {
                quantity = quantity + 1;
            }

            if (sw4) {
                quantity = quantity + 1;
            }

            TextView congrats = (TextView) findViewById(R.id.congratulations);
            congrats.setText("Congratulations!\n You got " + quantity + " out of 5 correct!");

            Button finish = (Button) findViewById(R.id.finish);
            finish.setText("Reset?");

            reverse = false;

        }else{
            TextView congrats = (TextView) findViewById(R.id.congratulations);
            congrats.setText("");

            Button finish = (Button) findViewById(R.id.finish);
            finish.setText("Finished!");

            RadioGroup g1 = (RadioGroup) findViewById(R.id.g1);
            g1.clearCheck();
            RadioGroup g2 = (RadioGroup) findViewById(R.id.g2);
            g2.clearCheck();
            RadioGroup g3 = (RadioGroup) findViewById(R.id.g3);
            g3.clearCheck();
            RadioGroup g4 = (RadioGroup) findViewById(R.id.g4);
            g4.clearCheck();
            RadioGroup g5 = (RadioGroup) findViewById(R.id.g5);
            g5.clearCheck();


            quantity = 0;
            reverse = true;

        }
    }

}
