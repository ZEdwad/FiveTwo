package com.bwei.demo;

import android.graphics.Color;

import com.bwei.demo.base.BaseActivity;
import com.bwei.demo.base.BasePresenter;
import com.bwei.demo.fragment.DiscoverFragment;
import com.bwei.demo.fragment.MineFragment;
import com.bwei.demo.fragment.RecommendFragment;
import com.bwei.demo.fragment.SubjectFragment;
import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.bottom_tab_bar)
    BottomTabBar bottomTabBar;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

        bottomTabBar.init(getSupportFragmentManager())
                .setImgSize(25, 25)
                .setFontSize(18)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("精选", R.mipmap.found_select, R.mipmap.found, RecommendFragment.class)
                .addTabItem("专题", R.mipmap.special_select, R.mipmap.special, SubjectFragment.class)
                .addTabItem("发现", R.mipmap.fancy_select, R.mipmap.fancy, DiscoverFragment.class)
                .addTabItem("我的", R.mipmap.my_select, R.mipmap.my, MineFragment.class)
                .setTabBarBackgroundResource(R.mipmap.bottom_bg)
                .isShowDivider(false);
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
