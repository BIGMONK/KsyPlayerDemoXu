package com.sy.ksyplayerdemoxu.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.ksyun.media.player.KSYTextureView;
import com.sy.ksyplayerdemoxu.R;

/**
 * 创建时间： 2017/11/15 0015.
 * 编写人：Tina
 * 邮箱：1208156801@qq.com
 * 功能描述：
 */

public class CustomPlayView extends RelativeLayout{

    private KSYTextureView ksyTextureView;
    private View view;

    public CustomPlayView(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.custom_layout,null);
//        ksyTextureView =view.findViewById(R.id.texture_view_palyer_custom);
  }

    public CustomPlayView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomPlayView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    public  void setWidthAndHeight(){
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                300, 300);
//        lp.setMargins(200,200,200,200);
        lp.leftMargin=200;
        lp.topMargin=200;
        view.setLayoutParams(lp);//设置布局参数
    }
}
