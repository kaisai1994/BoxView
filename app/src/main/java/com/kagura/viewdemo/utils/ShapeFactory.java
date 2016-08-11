package com.kagura.viewdemo.utils;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;

import com.kagura.viewdemo.domain.ViewBean;

import java.util.List;

/**
 * @version $Rev$
 * @auther jhss-0004
 * @time 2016/8/3.14:16
 * @des 图形生产工厂
 * @updateAuthor $Author$
 * @updateData $Author$
 * @updatedes ${TODO}
 */
public class ShapeFactory {
    private List<ViewBean> list;
    private ViewBean vb;
    /**
     *
     * @param context
     * @param
     * @return
     */
    public List<ViewBean> CreateView(Context context,List<ViewBean> list) {
           for (int i = 0; i < list.size(); i++) {
               FrameLayout fl_1 = new FrameLayout(context);
               FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(DisplayUtil.dip2px(context,list.get(i).getColumn()*50),DisplayUtil.dip2px(context,list.get(i).getRow()*50));
               list.get(i).setWidth(DisplayUtil.dip2px(context,list.get(i).getColumn()*60));//设置宽
               list.get(i).setHeight(DisplayUtil.dip2px(context,list.get(i).getRow()*60));  //设置高
               fl_1.setBackgroundColor(Color.RED);//设置背景色
               fl_1.setLayoutParams(params);    //设置宽高
               list.get(i).setFrameLayout(fl_1);//设置framelayout
           }
        return list;
    }

}
