package com.techyfighters.chero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {

    EditText title_insert, data_insert;
    Button insert_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        title_insert = findViewById(R.id.title_insert);
        data_insert = findViewById(R.id.data_insert);
        insert_button = findViewById(R.id.insert_button);

        insert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(InsertActivity.this);
                myDB.insertTutorial(title_insert.getText().toString().trim(),
                        data_insert.getText().toString().trim());
            }

        });
    }
}