package com.martinsing.bundlepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.lbl_text_name);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String profile_Firstname = bundle.getString("fName");
            String profile_Lastname = bundle.getString("lName");
            name.setText(profile_Firstname + ", " + profile_Lastname);
        } else {
            name.setText("Username");
        }
    }

    //Launch the Input Activity
    public void gotoInput(View view) {
        Intent intent = new Intent(this, Input.class);
        startActivity(intent);
    }
}
