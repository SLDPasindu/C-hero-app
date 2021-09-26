package com.example.chero;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home22 extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home22);

        button1 =(Button)findViewById(R.id.button15);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel13();
            }
        });
        button2 =(Button)findViewById(R.id.button16);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel14();
            }
        });

        button3 =(Button)findViewById(R.id.button17);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel15();
            }
        });
        button4 =(Button)findViewById(R.id.button21);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel16();
            }
        });
        button5 =(Button)findViewById(R.id.button22);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel17();
            }
        });
        button6 =(Button)findViewById(R.id.button23);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel18();
            }
        });
        button7 =(Button)findViewById(R.id.button24);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel19();
            }
        });
        button8 =(Button)findViewById(R.id.button31);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel20();
            }
        });
        button9 =(Button)findViewById(R.id.button6);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel21();
            }
        });

    }
    public void openlevel13(){
        Intent intent = new Intent(this,level_13.class);
        startActivity(intent);

    }

    public void openlevel14(){


        Intent intent = new Intent(this,level_14.class);
        startActivity(intent);

    }
    public void openlevel15(){

        AlertDialog.Builder builder=new AlertDialog.Builder(home22.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    public void openlevel16(){

        AlertDialog.Builder builder=new AlertDialog.Builder(home22.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    public void openlevel17(){

        AlertDialog.Builder builder=new AlertDialog.Builder(home22.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    public void openlevel18(){

        AlertDialog.Builder builder=new AlertDialog.Builder(home22.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    public void openlevel19(){

        AlertDialog.Builder builder=new AlertDialog.Builder(home22.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    public void openlevel20(){

        AlertDialog.Builder builder=new AlertDialog.Builder(home22.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    public void openlevel21(){
        Intent intent = new Intent(this,home12.class);
        startActivity(intent);

    }
}