package com.example.cyh.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LaunchActivity extends AppCompatActivity {
    /**
     *  启动页   splash 资源图片   采用属性动画实现   硬件加速
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

//        参数：target 对哪个view绑定动画
//        属性名称：propertyName  缩放动画： scaleX  渐变动画：alpha
//        动画变化范围：  0.0-1.0
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(findViewById(R.id.iv_bg),
                "scaleX", 0.5f, 1.0f);
//        设置执行时间  (一般情况为2-3秒)
        objectAnimator.setDuration(2000);
        objectAnimator.start();
//        启动新界面
//        适配器模式
          objectAnimator.addListener(new AnimatorListenerAdapter() {
              @Override
              public void onAnimationEnd(Animator animation) {
                  super.onAnimationEnd(animation);
                  startActivity(new Intent(LaunchActivity.this,MainActivity.class));
                  finish();
              }
          });
//        objectAnimator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                  startActivity(new Intent(LaunchActivity.this,MainActivity.class));
//                  finish();
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
    }
}
