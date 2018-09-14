package com.avi.abhishek.activityjump;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Button btnOther=findViewById(R.id.button);
                btnOther.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

        Intent i= new Intent(MainActivity.this,otherActivity.class);
        i.putExtra("hello","Welcome to another activity" +
                "");
        startActivity(i);
        } //onclick
        });//onclicklistener

     Button btndialog=findViewById(R.id.dialog);
     btndialog.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view){

             new AlertDialog.Builder(MainActivity.this)
                     .setTitle("hey Alert")
                     .setMessage("This is an alert Box")
                     .setCancelable(false)
                     .setIcon(android.R.drawable.ic_dialog_alert)
                     .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {
                             Toast.makeText(MainActivity.this,"Okay Clicked",Toast.LENGTH_SHORT).show();
                         }
                     })
                   .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           Toast.makeText(MainActivity.this,"Cancel Clicked",Toast.LENGTH_SHORT).show();
                       }
                   })
                     .show();



         }


     });




        }
        }
