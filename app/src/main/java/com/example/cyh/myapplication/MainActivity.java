package com.example.cyh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 1  as下载/资源网站：www.androiddevtool.cn
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    代表每一个tab
    class TabItem{
//         正常情况下显示的图片
            private int imageNormal;
//         选中情况下显示的图片
            private int imagePress;
//         tab的名字
            private int title;
}
}
