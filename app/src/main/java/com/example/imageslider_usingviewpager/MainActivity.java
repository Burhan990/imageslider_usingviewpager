package com.example.imageslider_usingviewpager;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button btn,btn2;
   int bt1=1;
    int bt2=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btn=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);


       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(MainActivity.this,Main2Activity.class);
               i.putExtra("click",bt1);
               startActivity(i);
           }
       });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("click2",bt2);
                startActivity(i);
            }
        });
    }
}
