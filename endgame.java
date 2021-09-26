package com.example.chero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class endgame extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endgame);


    button=(Button)findViewById(R.id.button10);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeopen();
            }
        });

    }
    public void homeopen(){



        Intent intent = new Intent(this,menuhome.class);
        startActivity(intent);

    }
}