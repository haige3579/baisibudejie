package com.example.cyh.myapplication.mvp.view.impl;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

import com.example.cyh.myapplication.mvp.presenter.impl.MvpBasePresenter;
import com.example.cyh.myapplication.mvp.view.MvpView;

/**
 * Created by CYH on 2016/9/8.
 */
public abstract class MvpFragment<P extends MvpBasePresenter> extends Fragment implements MvpView{

    protected P presenter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        绑定视图
        presenter=bindPresenter();
        if (presenter!=null){
            presenter.attachView(this);
        }
    }

    public abstract  P bindPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter!=null){
            presenter.detachView();
        }
    }
}
