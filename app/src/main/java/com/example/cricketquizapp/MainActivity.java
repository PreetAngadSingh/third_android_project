package com.example.cricketquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctcount=0;
    int flag1=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    int flag5=0;
    int flag6=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //answer for question 1
    public void firstRadioButton(View view){
        boolean checked1=((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.hat_radio:
                if (checked1==true&&flag1==0) {
                    correctcount++;
                    flag1=1;
                    break;
                }
            case R.id.bowl_radio:
                if (checked1)
                    break;
        }
    }
    //answer for question 2
    public void secondRadioButton(View view){
        boolean checked2=((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.hgibbs:
                if (checked2)
                    break;
            case R.id.yuvi:
                if (checked2&&flag2==0) {
                    correctcount++;
                    flag2=1;
                    break;
                }
            case R.id.msdhoni:
                if (checked2)
                    break;
            case R.id.chris:
                if (checked2)
                    break;
        }
    }
    //answer for question 4
    public void thirdRadioButton(View view){
        boolean checked2=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.ricky:
                if(checked2)
                break;
            case R.id.kumar:
                if(checked2)
                break;
            case R.id.sachin:
                if(checked2&&flag3==0){
                correctcount++;
                flag3=1;
                break;
                }
            case R.id.clarke:
                if(checked2)
                break;
        }
    }
    //answer for question 5
    public void fourthRadioButton(View view){
        boolean checked1=((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.yes:
                if (checked1&&flag4==0) {
                    correctcount++;
                    flag4=1;
                    break;
                }
            case R.id.no:
                if (checked1)
                    break;
        }
    }
    // when checkbox is checked
    public void checkFunction(View view) {
        CheckBox indiaCheck=(CheckBox) findViewById(R.id.checkb1);
        boolean checked3=indiaCheck.isChecked();
        CheckBox englandCheck=(CheckBox) findViewById(R.id.checkb2);
        boolean checked4=englandCheck.isChecked();
        CheckBox southCheck=(CheckBox) findViewById(R.id.checkb3);
        boolean checked5=southCheck.isChecked();
        CheckBox australiaCheck=(CheckBox) findViewById(R.id.checkb4);
        boolean checked6=australiaCheck.isChecked();
        calculateAnswer3(checked3,checked4,checked5,checked6);
    }
    //When SUBMIT button is clicked
    public void submitQuiz(View view){
        EditText editText=(EditText) findViewById(R.id.firstEdit);
        String convert=editText.getText().toString();
        if(convert.equals("Test")||convert.equals("test")&&flag5==0){
            correctcount++;
            flag5=1;
        }
        displayAnswer();
    }
    public void calculateAnswer3(boolean checked3,boolean checked4,boolean checked5,boolean checked6){
        if(checked4==true&&checked6==true&&checked3==false&&checked5==false&&flag6==0)
        {
            correctcount++;
            flag6=1;
        }
        else
            return;
    }
    public void displayAnswer(){
        TextView textView1=(TextView) findViewById(R.id.answer1);
        textView1.setText("Hat-Trick is the right answer.");
        TextView textView2=(TextView) findViewById(R.id.answer2);
        textView2.setText("Yuvraj Singh is the right answer.");
        TextView textView3=(TextView) findViewById(R.id.answer3);
        textView3.setText("England and Australia is the right answer.");
        TextView textView4=(TextView) findViewById(R.id.answer4);
        textView4.setText("Sachin Tendulkaris the right answer.");
        TextView textView5=(TextView) findViewById(R.id.answer5);
        textView5.setText("Yes is the right answer.");
        TextView textView6=(TextView) findViewById(R.id.answer6);
        textView6.setText("Test is the right answer.");
        Toast.makeText(this,"You have "+correctcount+"/6 answers correct",Toast.LENGTH_SHORT).show();
        }
    }
