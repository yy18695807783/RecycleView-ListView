package com.atguigu.myMediaer.fragmentbase;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 颜银 on 2016/9/28.
 * QQ:443098360
 * 微信：y443098360
 *
 * 基类，用于继承的实例模板
 */
public abstract class BaseFragment extends Fragment {


    /**
     * 上下文
     */
    protected Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();
    }


    /**
     * 要孩子一定实现此方法，并且返回一个View；意思就是说，要孩子实现自己的效果
     * @return
     */
    public abstract View initView();

    /**
     * 当Activity创建成功的时候
     * 得到Fragment的视图，对视图进行数据的设置，联网请求
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();

    }

    /**
     * 当需要给视图绑定数据，或者联网请求数据并且绑定数据的时候就重写该方法
     */
    public  void initData(){

    }

}
