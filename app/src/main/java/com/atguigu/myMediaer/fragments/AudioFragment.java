package com.atguigu.myMediaer.fragments;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.myMediaer.fragmentbase.BaseFragment;

import com.atguigu.myMediaer.utils.LogUtil;

/**
 * Created by 颜银 on 2016/10/12.
 * QQ:443098360
 * 微信：y443098360
 * 作用：
 */
public class AudioFragment extends BaseFragment {
    private TextView textView;

    @Override
    public View initView() {
        LogUtil.e("本地音乐UI创建了");
        textView = new TextView(context);
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        LogUtil.e("本地音乐数据绑定了");
        textView.setText("本地音乐");
    }
}
