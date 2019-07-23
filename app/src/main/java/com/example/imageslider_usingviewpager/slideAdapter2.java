package com.example.imageslider_usingviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Burhan Infinity on 11/28/2017.
 */

public class slideAdapter2 extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    public int[] listsimage2={

            R.drawable.black,
            R.drawable.white,
            R.drawable.images,
            R.drawable.book,
            R.drawable.df,
            R.drawable.splash



    };
    public slideAdapter2(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return listsimage2.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view== (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slide,container,false);

        //LinearLayout layoutslide=(LinearLayout)view.findViewById(R.id.linearlayout2);
        ImageView imageView=(ImageView)view.findViewById(R.id.linearlayout2);
        imageView.setBackgroundResource(listsimage2[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
