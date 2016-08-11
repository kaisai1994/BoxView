package com.kagura.viewdemo.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.kagura.viewdemo.domain.ViewBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @version $Rev$
 * @auther jhss-0004
 * @time 2016/8/4.14:04
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateData $Author$
 * @updatedes ${TODO}
 */
public class MainContent extends ViewGroup {

    private List<ViewBean> list;
    private ViewBean vb;
    public MainContent(Context context) {
        super(context);
       // FrameLayout fl = ShapeFactory.CreateView(context,1);
       // addView(fl);
        Log.d("MainContent", "MainContent: 1");
    }

    public MainContent(Context context, AttributeSet attrs) {
        super(context, attrs);
        ShapeFactory sf = new ShapeFactory();
        list = new ArrayList<ViewBean>();

        vb = new ViewBean();
        vb.setIndex(1);//索引
        vb.setColumn(1);//跨列
        vb.setRow(1);//跨行
        vb.setLx(0);
        vb.setLy(0);

        list.add(vb);

        addView(sf.CreateView(context,list).get(0).getFrameLayout());

        vb = new ViewBean();
        vb.setIndex(2);//索引
        vb.setColumn(2);//跨列
        vb.setRow(1);//跨行
        vb.setLx(list.get(0).getWidth());
        vb.setLy(0);
        list.add(vb);
        addView(sf.CreateView(context,list).get(1).getFrameLayout());

        vb = new ViewBean();
        vb.setIndex(3);//索引
        vb.setColumn(1);//跨列
        vb.setRow(1);//跨行
        vb.setLx(list.get(0).getWidth()+list.get(1).getWidth());
        vb.setLy(0);
        list.add(vb);
        addView(sf.CreateView(context,list).get(2).getFrameLayout());

        vb = new ViewBean();
        vb.setIndex(4);
        vb.setColumn(1);
        vb.setRow(2);
        vb.setLx(list.get(0).getWidth()+list.get(1).getWidth()+list.get(2).getWidth());
        vb.setLy(0);
        list.add(vb);
        addView(sf.CreateView(context,list).get(2).getFrameLayout());
        // Log.d("MainContent", "MainContent: 2");
    }

    public MainContent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        //设置该ViewGroup的大小
        int specSize_width = MeasureSpec.getSize(widthMeasureSpec);
        int specSize_height = MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(specSize_width, specSize_height);
        /*Log.d("MainContent", "4份每份宽" + specSize_width/4);
        Log.d("MainContent", "2份每份长" + specSize_height/2);*/
       /* for (int i = 0; i < childCount; i++) {
            View childView = getChildAt(i);
            childView.measure(0,0);
            int measureWidth = childView.getLayoutParams().width;
            int measureHeight = childView.getLayoutParams().height;
            Log.d("MainContent", "子宽"+measureWidth+"子长"+measureHeight);
            childView.measure(measureWidth,measureHeight);
        }*/
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int childCount = getChildCount();
        Log.d("MainContent", "子view数"+childCount);
        int top = 0;
        for(int i = 0;i < childCount;i++)
        {
            View child = getChildAt(i);
            child.layout(list.get(i).getLx(),list.get(i).getLy(),list.get(i).getLx()+list.get(i).getWidth(),list.get(i).getLy()+list.get(i).getHeight());
            int measureWidth = child.getMeasuredWidth();
            int measureHeight = child.getMeasuredHeight();
            top += list.get(i).getHeight();
            Log.d("Xxx", vb.getHeight()+":"+vb.getWidth());
        }
    }
}
