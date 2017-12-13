package com.bwei.demo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bwei.demo.R;
import com.bwei.demo.base.BaseFragment;
import com.bwei.demo.base.BasePresenter;
import com.youth.banner.Banner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by ${郭冲冲} on 2017/12/12.
 * <p>
 * 精选
 */

public class RecommendFragment extends BaseFragment {
    @BindView(R.id.recommend_bann)
    Banner banner;
    @BindView(R.id.recommend_list)
    ListView listView;
    @Override
    protected void initView() {



    }

    @Override
    protected void initData() {

    }

    @Override
    public int layout() {
        return R.layout.recommend_layout;
    }

    @Override
    protected BasePresenter getPresenter() {
        return null;
    }



}
