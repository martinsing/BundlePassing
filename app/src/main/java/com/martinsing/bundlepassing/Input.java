package com.martinsing.bundlepassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Input extends AppCompatActivity implements View.OnClickListener {

    EditText first_name;
    EditText last_name;
    Spinner sex;
    EditText dob;
    EditText height;
    EditText weight;

    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        first_name = (EditText) findViewById(R.id.lbl_edit_firstname);
        last_name = (EditText) findViewById(R.id.lbl_edit_lastname);
        sex = (Spinner) findViewById(R.id.lbl_edit_sex);
        dob = (EditText) findViewById(R.id.lbl_edit_dob);
        height = (EditText) findViewById(R.id.lbl_edit_height);
        weight = (EditText) findViewById(R.id.lbl_edit_weight);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);

//For the Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//Add back arrow to toolbar
        if (getSupportActionBar() != null) {
//Specifies whether or not the Home button is shown.
            getSupportActionBar().setDisplayShowHomeEnabled(true);
//Specifies whether or not the Home button has the arrow used for Up Navigation next to it.
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("ufirst_name", first_name.getText().toString());
        bundle.putString("ulast_name", last_name.getText().toString());
        bundle.putString("usex", sex.getSelectedItem().toString());
        bundle.putString("udob", dob.getText().toString());
        bundle.putString("uheight", height.getText().toString());
        bundle.putString("uweight", weight.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}