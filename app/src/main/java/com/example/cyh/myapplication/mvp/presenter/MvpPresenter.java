package com.example.cyh.myapplication.mvp.presenter;

import com.example.cyh.myapplication.mvp.view.MvpView;

/**
 * Created by CYH on 2016/9/8.
 */
public interface MvpPresenter<V extends MvpView> {
//    绑定UI
   public void attachView(V view);
//    解除UI
    public void detachView();
}
