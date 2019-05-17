package com.example.farooq.project1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends Activity {
    RadioButton radioButton;
    RadioGroup radioGroup;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewFlipper viewFlipper= (ViewFlipper) findViewById(R.id.simpleViewFlipper);
        final Button nextBtn = (Button) findViewById(R.id.nextBtn);
        final Button takeSurvey=(Button) findViewById(R.id.takeSurvey);

        final EditText name   = (EditText) findViewById(R.id.name);
        final EditText email  = (EditText) findViewById(R.id.email);
        final EditText phone  = (EditText) findViewById(R.id.phone);
        final EditText city   = (EditText) findViewById(R.id.city);
        final EditText q6Ans  = (EditText) findViewById(R.id.q6Ans);
        final EditText q7Ans  = (EditText) findViewById(R.id.q7Ans);
        final EditText q10Ans = (EditText) findViewById(R.id.q10Ans);
        final EditText q12Ans = (EditText) findViewById(R.id.q12Ans);
        final EditText q16Ans = (EditText) findViewById(R.id.q16Ans);
        final EditText q18Ans = (EditText) findViewById(R.id.q18Ans);
        final LinearLayout layout = (LinearLayout) findViewById(R.id.buttonPanel);
        final ViewGroup.LayoutParams params = layout.getLayoutParams();


        Animation in = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        viewFlipper.setAnimation(in);
        viewFlipper.setAnimation(out);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myref = database.getReferenceFromUrl("https://project1-2931b.firebaseio.com/");

        Calendar c = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String id = sdf.format(c.getTime());

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f=viewFlipper.indexOfChild(viewFlipper.getCurrentView());
                if(f==1){
                    str=addGroupListner(R.id.q1Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_1").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==2){
                    str=addGroupListner(R.id.q2Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_2").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==3){
                    str=addGroupListner(R.id.q3Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_3").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==4){
                    str=addGroupListner(R.id.q4Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_4").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==5){
                    str=addGroupListner(R.id.q5Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_5").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==6){
                    if((q6Ans.getText().toString()).matches("")){
                        Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                    }
                    else{
                        myref.child(id).child("Question_6").setValue(q6Ans.getText().toString());
                        viewFlipper.showNext();
                    }
                }else{
                if(f==7){
                    if((q7Ans.getText().toString()).matches("")){
                        Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                    }
                    else{
                        myref.child(id).child("Question_7").setValue(q7Ans.getText().toString());
                        viewFlipper.showNext();
                    }
                }else{
                if(f==8){
                    str=addGroupListner(R.id.q8Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_8").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==9){
                    str=addGroupListner(R.id.q9Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_9").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==10){
                    if((q10Ans.getText().toString()).matches("")){
                        Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                    }
                    else{
                        myref.child(id).child("Question_10").setValue(q10Ans.getText().toString());
                        viewFlipper.showNext();
                    }
                }else{
                if(f==11){
                    str=addGroupListner(R.id.q11Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_11").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==12){
                    if((q12Ans.getText().toString()).matches("")){
                        Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                    }
                    else{
                        myref.child(id).child("Question_12").setValue(q12Ans.getText().toString());
                        viewFlipper.showNext();
                    }
                }else{
                if(f==13){
                    str=addGroupListner(R.id.q13Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_13").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==14){
                    str=addGroupListner(R.id.q14Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_14").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==15){
                    str=addGroupListner(R.id.q15Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_15").setValue(str);
                        viewFlipper.showNext();
                    }
                }else{
                if(f==16){
                    if((q16Ans.getText().toString()).matches("")){
                        Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                    }
                    else{
                        myref.child(id).child("Question_16").setValue(q16Ans.getText().toString());
                        viewFlipper.showNext();
                    }

                }else{
                if(f==17){
                    str=addGroupListner(R.id.q17Ans);
                    if(str.matches("")){
                        Toast.makeText(MainActivity.this,"Please Checked one", Toast.LENGTH_LONG).show();
                    }else{
                        myref.child(id).child("Question_17").setValue(str);
                        viewFlipper.showNext();
                        nextBtn.setText("Done");
                    }
                }else{
                if(f==18){
                    if((q18Ans.getText().toString()).matches("")){
                        Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                    }
                    else{
                        myref.child(id).child("Question_18").setValue(q18Ans.getText().toString());
                        finish();
                        System.exit(0);
                    }
                }}}}}}}}}}}}}}}}}}
            }
        });
        takeSurvey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((name.getText().toString()).matches("")||(email.getText().toString()).matches("")
                        ||(phone.getText().toString()).matches("")||(city.getText().toString()).matches(""))
                {
                    Toast.makeText(MainActivity.this,"Fill the fields", Toast.LENGTH_LONG).show();
                 }else{
                    myref.child(id).child("Name").setValue(name.getText().toString());
                    myref.child(id).child("Email").setValue(email.getText().toString());
                    myref.child(id).child("Phone").setValue(phone.getText().toString());
                    myref.child(id).child("City/State").setValue(city.getText().toString());
                    params.height = 85;
                    layout.setLayoutParams(params);
                    viewFlipper.showNext();
                }
            }
        });
    }
    public String addGroupListner(int idGroup){
        radioGroup = (RadioGroup) findViewById(idGroup);
        // get selected radio button from radioGroup
        if (radioGroup.getCheckedRadioButtonId() == -1)
        {
            return "";
        }
        else
        {
            // one of the radio buttons is checked
            int selectedId = radioGroup.getCheckedRadioButtonId();
            // find the radio button by returned id
            radioButton = (RadioButton) findViewById(selectedId);
            return radioButton.getText().toString();
        }
    }
}