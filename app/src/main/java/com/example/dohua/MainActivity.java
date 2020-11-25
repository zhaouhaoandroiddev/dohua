package com.example.dohua;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView animateImg;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diyiye_activity_main);
        animateImg = findViewById(R.id.img_show);
        //final AnimationDrawable drawable = (AnimationDrawable) animateImg.getDrawable();

        final AnimationDrawable animationDrawable = new AnimationDrawable();
        animateImg.setImageDrawable(animationDrawable);
        Drawable fram = getResources().getDrawable(R.drawable.icon_loading1);
        animationDrawable.addFrame(fram, 80);
        Drawable fram1 = getResources().getDrawable(R.drawable.icon_loading2);
        animationDrawable.addFrame(fram, 80);
        Drawable fram2 = getResources().getDrawable(R.drawable.icon_loading3);
        animationDrawable.addFrame(fram, 80);
        Drawable fram3 = getResources().getDrawable(R.drawable.icon_loading4);
        animationDrawable.addFrame(fram, 80);
        Drawable fram4 = getResources().getDrawable(R.drawable.icon_loading5);
        animationDrawable.addFrame(fram, 80);
        Drawable fram5 = getResources().getDrawable(R.drawable.icon_loading6);
        animationDrawable.addFrame(fram, 80);
        Drawable fram6 = getResources().getDrawable(R.drawable.icon_loading7);
        animationDrawable.addFrame(fram, 80);
        Drawable fram7 = getResources().getDrawable(R.drawable.icon_loading8);
        animationDrawable.addFrame(fram, 80);
        Drawable fram8 = getResources().getDrawable(R.drawable.icon_loading9);
        animationDrawable.addFrame(fram, 80);
        Drawable fram9 = getResources().getDrawable(R.drawable.icon_loading10);
        animationDrawable.addFrame(fram, 80);
        Drawable fram10 = getResources().getDrawable(R.drawable.icon_loading11);
        animationDrawable.addFrame(fram, 80);
        Drawable fram11 = getResources().getDrawable(R.drawable.icon_loading12);
        animationDrawable.addFrame(fram, 80);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.start();
            }
        });
        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.stop();
            }
        });

    }

}
