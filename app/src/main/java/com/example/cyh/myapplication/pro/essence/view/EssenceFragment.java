package com.example.cyh.myapplication.pro.essence.view;

import android.view.View;

import com.example.cyh.myapplication.R;
import com.example.cyh.myapplication.mvp.presenter.impl.MvpBasePresenter;
import com.example.cyh.myapplication.pro.base.view.BaseFragment;

/**
 * Created by CYH on 2016/9/11.
 */
public class EssenceFragment extends BaseFragment {
    @Override
    public int getContentView() {
        return R.layout.fragment_essence;
    }

    @Override
    public void initContentView(View viewContent) {

    }

    @Override
    public MvpBasePresenter bindPresenter() {
        return null;
    }
}
