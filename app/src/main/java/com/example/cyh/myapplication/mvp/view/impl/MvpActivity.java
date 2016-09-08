package com.example.cyh.myapplication.mvp.view.impl;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.cyh.myapplication.mvp.presenter.impl.MvpBasePresenter;
import com.example.cyh.myapplication.mvp.view.MvpView;

/**
 * Created by CYH on 2016/9/8.
 */
public abstract class MvpActivity<P extends MvpBasePresenter> extends AppCompatActivity implements MvpView {
//    MVP架构中P 是动态的
    protected P presenter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        presenter=bindPresenter();
//        关联
        if (presenter!=null){
            presenter.attachView(this);
        }
    }
//    具体实现不明， 抛出去
    public abstract P bindPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Activity销毁的时候---解除绑定
        if (presenter!=null){
            presenter.detachView();
        }
    }
}
