package com.example.cyh.myapplication.mvp.presenter.impl;

import com.example.cyh.myapplication.mvp.presenter.MvpPresenter;
import com.example.cyh.myapplication.mvp.view.MvpView;

/**
 * Created by CYH on 2016/9/8.
 */
public abstract class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V view;

    @Override
    public void attachView(V view) {

    }

    @Override
    public void detachView() {
        if (view!=null)
            view=null;
    }
}
