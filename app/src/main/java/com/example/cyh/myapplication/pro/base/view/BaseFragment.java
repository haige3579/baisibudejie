package com.example.cyh.myapplication.pro.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cyh.myapplication.mvp.presenter.impl.MvpBasePresenter;
import com.example.cyh.myapplication.mvp.view.impl.MvpFragment;

/**
 * Created by CYH on 2016/9/8.
 */
public abstract class BaseFragment<P extends MvpBasePresenter> extends MvpFragment {
//   fragment 缓存视图
    private View viewContent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (viewContent==null){
            viewContent=inflater.inflate(getContentView(),container,false);
            initContentView(viewContent);
        }
//      判断Fragment对应的Activity是否存在这个视图
        ViewGroup parent= (ViewGroup) viewContent.getParent();
        if (parent!=null){
//            存在，干掉，重写添加，缓存视图
            parent.removeView(viewContent);
        }
        return viewContent;
    }

    public abstract int getContentView();

    public abstract void initContentView(View viewContent);
}
