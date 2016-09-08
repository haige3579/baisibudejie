package com.example.cyh.myapplication.mvp.view.impl;

/**
 * Created by CYH on 2016/9/8.
 */
public abstract class MvpBaseLceView<M> implements MvpLceView<M> {
    @Override
    public void showLoading(boolean pullToRefresh) {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void showError(Exception e, boolean pullToRefresh) {

    }

    @Override
    public void showData(M data) {

    }
}
