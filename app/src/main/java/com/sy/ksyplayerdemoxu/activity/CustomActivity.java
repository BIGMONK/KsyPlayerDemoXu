package com.sy.ksyplayerdemoxu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.RelativeLayout;

import com.sy.ksyplayerdemoxu.R;
import com.sy.ksyplayerdemoxu.view.CustomPlayView;

/**
 * 创建时间： 2017/11/16 0016.
 * 编写人：Tina
 * 邮箱：1208156801@qq.com
 * 功能描述：
 */

public class CustomActivity extends Activity{
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_custom_layout);
        relativeLayout = (RelativeLayout)findViewById(R.id.ll);
        CustomPlayView view  = new CustomPlayView(this);
        view.setWidthAndHeight();
        Log.d("CustomActivity", "onCreate: ----");


        relativeLayout.addView(view);

    }
}
