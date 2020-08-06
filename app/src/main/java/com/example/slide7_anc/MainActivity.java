package com.example.slide7_anc;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgMan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMan = findViewById(R.id.imgMan);

    }

    public void propertyAnimation(View view) {

//        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imgMan,"translationY",imgMan.getWidth(),0f);
//        objectAnimator.setDuration(2000);
//        objectAnimator.setRepeatCount(100);
        // bẩ duoc su kien khi nao dung lai , khi nao bat dau,ko ho tro su kien cua các animation
//        objectAnimator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });

        //Kieu khoi dong lai
//        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        //objectAnimator.start();

        Animator animator = AnimatorInflater.loadAnimator(this,R.animator.animation2);
        animator.setTarget(imgMan);
        animator.start();

    }

    public void viewAnimation(View view) {
        Intent intent=new Intent(this,SubActivity.class);
        startActivity(intent);

        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
    }

    public void drawbleAnimation(View view) {
        imgMan.setImageResource(R.drawable.animation);

        AnimationDrawable animationDrawable= (AnimationDrawable) imgMan.getDrawable();
        animationDrawable.start();
    }
}
