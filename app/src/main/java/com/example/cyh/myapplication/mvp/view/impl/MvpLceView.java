package com.example.cyh.myapplication.mvp.view.impl;

import com.example.cyh.myapplication.mvp.view.MvpView;

/**
 *   请求数据，刷新UI界面监听（标准）---loading页面
 * Created by CYH on 2016/9/8.
 */
public interface MvpLceView<M> extends MvpView {
//    显示加载中的视图（上拉加载/下拉刷新）
    public void showLoading(boolean pullToRefresh);
//    显示ContentView
    public void showContent();
//    加载错误
    public void showError(Exception e,boolean pullToRefresh);
//    绑定数据
    public void showData(M data);
}
