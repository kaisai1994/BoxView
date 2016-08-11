package com.kagura.viewdemo.domain;

import android.widget.FrameLayout;

/**
 * @version $Rev$
 * @auther jhss-0004
 * @time 2016/8/5.9:24
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateData $Author$
 * @updatedes ${TODO}
 */
public class ViewBean {

    private FrameLayout mFrameLayout;//布局
    private int width;//布局的宽
    private int height;//布局的高
    private int index; //布局的索引
    private int row;//跨行
    private int column;//跨列
    private int rx;//布局的右上角x坐标
    private int ry;//布局的右上角y坐标
    private int lx;//布局的左下角x坐标
    private int ly;//布局的左下角y坐标

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public FrameLayout getFrameLayout() {
        return mFrameLayout;
    }

    public void setFrameLayout(FrameLayout frameLayout) {
        mFrameLayout = frameLayout;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getRx() {
        return rx;
    }

    public void setRx(int rx) {
        this.rx = rx;
    }

    public int getRy() {
        return ry;
    }

    public void setRy(int ry) {
        this.ry = ry;
    }

    public int getLx() {
        return lx;
    }

    public void setLx(int lx) {
        this.lx = lx;
    }

    public int getLy() {
        return ly;
    }

    public void setLy(int ly) {
        this.ly = ly;
    }



}
