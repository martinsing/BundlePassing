package com.martinsing.bundlepassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView user_name;
    TextView user_sex;
    TextView user_dob;
    TextView user_height;
    TextView user_weight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name = (TextView) findViewById(R.id.lbl_user_name);
        user_sex = (TextView) findViewById(R.id.lbl_user_sex);
        user_dob = (TextView) findViewById(R.id.lbl_user_dob);
        user_height = (TextView) findViewById(R.id.lbl_user_height);
        user_weight = (TextView) findViewById(R.id.lbl_user_weight);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String Firstname = bundle.getString("ufirst_name");
            String Lastname = bundle.getString("ulast_name");
            String sex = bundle.getString("usex");
            String dob = bundle.getString("udob");
            String height = bundle.getString("uheight");
            String weight = bundle.getString("uweight");


            user_name.setText(Lastname + ", " + Firstname);
            user_sex.setText(sex);
            user_dob.setText(dob);
            user_height.setText(height);
            user_weight.setText(weight);


        } else {
            user_name.setText("");
            user_sex.setText("");
            user_dob.setText("");
            user_height.setText("");
            user_weight.setText("");

        }
    }

    //Launch the Input Activity
    public void gotoInput(View view) {
        Intent intent = new Intent(this, Input.class);
        startActivity(intent);
    }
}
