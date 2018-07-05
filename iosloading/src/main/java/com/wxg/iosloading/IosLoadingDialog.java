package com.wxg.iosloading;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        private BuilderParams mParams;


        public Builder(Context context) {
            mParams = new BuilderParams(context);
        }

        public Builder setCancelOnTouchOutsite(boolean cancelOnTouchOutsite) {
            mParams.setCancelOnTouchOutsite(cancelOnTouchOutsite);
            return this;
        }

        public Builder setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            mParams.setLayoutParams(layoutParams);
            return this;
        }


        public Builder setBackgroundResource(int resourceId) {
            mParams.setmBackgroundResource(resourceId);
            return this;
        }

        public Builder setTextVisible(boolean isTextVisible) {
            mParams.setTextVisible(isTextVisible);
            return this;
        }

        public Builder setText(String text) {
            mParams.setLoadingText(text);
            return this;
        }

        public Builder setTextSize(int size) {
            mParams.setTextSize(size);
            return this;
        }

        public Builder setTextColor(int color) {
            mParams.setTextColor(color);
            return this;
        }


        public IosLoadingDialog build() {
            IosLoadingDialog dialog = new IosLoadingDialog(mParams.getmContext());
            View view = LayoutInflater.from(mParams.getmContext()).inflate(R.layout.ios_loading_layout, null);
            dialog.setCanceledOnTouchOutside(mParams.isCancelOnTouchOutsite());
            if (mParams.getLayoutParams() == null) {
                mParams.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            view.findViewById(R.id.ll_bg).setBackgroundResource(mParams.getmBackgroundResource());
            TextView textView = view.findViewById(R.id.tv_loading_text);
            textView.setVisibility(mParams.isTextVisible() ? View.VISIBLE : View.GONE);
            if (!TextUtils.isEmpty(mParams.getLoadingText())) {
                textView.setText(mParams.getLoadingText());
            }
            if (mParams.getTextSize() != -1) {
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, mParams.getTextSize());
            }
            if (mParams.getTextColor() != -1) {
                textView.setTextColor(mParams.getTextColor());
            }
            dialog.setContentView(view, mParams.getLayoutParams());
            return dialog;
        }
    }


}

