package com.example.restful;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btnyunus;


       public void init(){

         btn1=(Button) findViewById(R.id.btn1);
            btnyunus=(Button) findViewById(R.id.btnyunus);



       }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

          btn1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent intentlogin= new Intent(MainActivity.this,LoginActivity.class);
                  startActivity(intentlogin);
                  finish();
              }
          });

         btnyunus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intentregister=new Intent(MainActivity.this,RegisterActivity.class);
                 startActivity(intentregister);
                 finish();
             }
         });


    }
}
