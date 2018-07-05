package com.wxg.iosloading;

import android.content.Context;
import android.view.ViewGroup;

/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class BuilderParams {

    public Context mContext;

    private boolean isCancelOnTouchOutsite;

    private ViewGroup.LayoutParams layoutParams;

    private int mBackgroundResource = R.drawable.ios_loading_bg_shape;

    private boolean isTextVisible;

    private String loadingText;

    private int textSize = -1;

    private int textColor = -1;

    public BuilderParams(Context context) {
        mContext = context;
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public boolean isCancelOnTouchOutsite() {
        return isCancelOnTouchOutsite;
    }

    public void setCancelOnTouchOutsite(boolean cancelOnTouchOutsite) {
        isCancelOnTouchOutsite = cancelOnTouchOutsite;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return layoutParams;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.layoutParams = layoutParams;
    }

    public int getmBackgroundResource() {
        return mBackgroundResource;
    }

    public void setmBackgroundResource(int mBackgroundResource) {
        this.mBackgroundResource = mBackgroundResource;
    }

    public boolean isTextVisible() {
        return isTextVisible;
    }

    public void setTextVisible(boolean textVisible) {
        isTextVisible = textVisible;
    }

    public String getLoadingText() {
        return loadingText;
    }

    public void setLoadingText(String loadingText) {
        this.loadingText = loadingText;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }
}
