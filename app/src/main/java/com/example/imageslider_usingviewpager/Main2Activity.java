package com.example.imageslider_usingviewpager;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private slideAdapter ss;
    private slideAdapter2 ss2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        int aa=intent.getExtras().getInt("click");
        int bb=intent.getExtras().getInt("click2");

        if (aa==1) {

            viewPager = (ViewPager) findViewById(R.id.viewpager);
            ss = new slideAdapter(this);
            viewPager.setAdapter(ss);
            viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        }
        if (bb==2) {

            viewPager = (ViewPager) findViewById(R.id.viewpager);

            ss2 = new slideAdapter2(this);
            viewPager.setAdapter(ss2);
            viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        }

    }
}
