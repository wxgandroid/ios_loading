package com.wxg.iosloading;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author WangXuguang
 * @date 2018/7/5.
 */

public class IosLoadingDialog extends Dialog {


    private IosLoadingDialog(Context context) {
        this(context, android.R.style.Theme_Holo_Dialog_NoActionBar);
    }

    private IosLoadingDialog(Context context, int themeResId) {
        super(context, themeResId);
    }


    public static class Builder {

        private Context mContext;

        private boolean isCancelOnTouchOutsite;

        private ViewGroup.LayoutParams layoutParams;

        private int mBackgroundResource = R.drawable.ios_loading_bg_shape;

        public Builder(Context context) {
            mContext = context;
        }

        public Builder setCancelOnTouchOutsite(boolean cancelOnTouchOutsite) {
            isCancelOnTouchOutsite = cancelOnTouchOutsite;
            return this;
        }

        public Builder setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            this.layoutParams = layoutParams;
            return this;
        }


        public Builder setBackgroundResource(int resourceId) {
            mBackgroundResource = resourceId;
            return this;
        }


        public IosLoadingDialog build() {
            IosLoadingDialog dialog = new IosLoadingDialog(mContext);
            View view = LayoutInflater.from(mContext).inflate(R.layout.ios_loading_layout, null);
            dialog.setCanceledOnTouchOutside(isCancelOnTouchOutsite);
            if (layoutParams == null) {
                DisplayMetrics dm = new DisplayMetrics();
                ((Activity) mContext).getWindow().getWindowManager().getDefaultDisplay().getMetrics(dm);
                float density = dm.density;
                layoutParams = new ViewGroup.LayoutParams((int) (100 * density), (int) (100 * density));
            }
            view.findViewById(R.id.ll_bg).setBackgroundResource(mBackgroundResource);
            dialog.setContentView(view, layoutParams);
            return dialog;
        }
    }


}
