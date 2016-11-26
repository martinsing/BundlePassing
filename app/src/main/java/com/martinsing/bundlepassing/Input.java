package com.martinsing.bundlepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.martinsing.bundlepassing.R.id.firstname;
import static com.martinsing.bundlepassing.R.id.lastname;

public class Input extends AppCompatActivity implements View.OnClickListener {

    EditText first_name;
    EditText last_name;

    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        first_name = (EditText) findViewById(R.id.firstname);
        last_name = (EditText) findViewById(R.id.lastname);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("fName", first_name.getText().toString());
        bundle.putString("lName", last_name.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}