package com.example.chero;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button25;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button25 =(Button)findViewById(R.id.button5);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennext();
            }
        });


        button1 =(Button)findViewById(R.id.button15);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel1();
            }
        });
        button2 =(Button)findViewById(R.id.button16);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel2();
            }
        });

        button3 =(Button)findViewById(R.id.button17);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel3();
            }
        });
        button4 =(Button)findViewById(R.id.button21);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel4();
            }
        });
        button5 =(Button)findViewById(R.id.button22);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel5();
            }
        });
        button6 =(Button)findViewById(R.id.button23);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel6();
            }
        });
        button7 =(Button)findViewById(R.id.button24);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel7();
            }
        });
        button8 =(Button)findViewById(R.id.button31);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel8();
            }
        });

        button9 =(Button)findViewById(R.id.button32);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel9();
            }
        });
        button10 =(Button)findViewById(R.id.button33);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel10();
            }
        });
        button11 =(Button)findViewById(R.id.button34);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel11();
            }
        });
        button12 =(Button)findViewById(R.id.button35);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlevel12();
            }
        });

    }

    public void openlevel1(){
        Intent intent = new Intent(this,level_1.class);
        startActivity(intent);

    }

    public void openlevel2(){

        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

       // Intent intent = new Intent(this,level_2.class);
       // startActivity(intent);

    }
    public void openlevel3(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
     //   Intent intent = new Intent(this,level_3.class);
       // startActivity(intent);

    }
    public void openlevel4(){



        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
     //   Intent intent = new Intent(this,level_4.class);
     //   startActivity(intent);

    }
    public void openlevel5(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
      //  Intent intent = new Intent(this,level_5.class);
      //  startActivity(intent);

    }
    public void openlevel6(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
       // Intent intent = new Intent(this,level_6.class);
       // startActivity(intent);

    }
    public void openlevel7(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
      //  Intent intent = new Intent(this,level_7.class);
       // startActivity(intent);

    }
    public void openlevel8(){



        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
      // Intent intent = new Intent(this,level_8.class);
        //startActivity(intent);

    }
    public void openlevel9(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
       // Intent intent = new Intent(this,level_9.class);
       // startActivity(intent);

    }
    public void openlevel10(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
       // Intent intent = new Intent(this,level_10.class);
      //  startActivity(intent);

    }
    public void openlevel11(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
      //  Intent intent = new Intent(this,level_11.class);
      //  startActivity(intent);

    }
    public void openlevel12(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
      //  Intent intent = new Intent(this,level_12.class);
       // startActivity(intent);

    }

    public  void opennext(){


        AlertDialog.Builder builder=new AlertDialog.Builder(HomeActivity.this);

        builder.setMessage("!! LOCKED THIS LEVEL !!")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
       // Intent intent = new Intent(this,home2.class);
       // startActivity(intent);
    }


}