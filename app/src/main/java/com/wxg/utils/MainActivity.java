package com.wxg.utils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.wxg.iosloading.IosLoadingDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test:
                IosLoadingDialog dialog = new IosLoadingDialog.Builder(this)
                        .setCancelOnTouchOutsite(true)
                        .build();
                dialog.show();
                break;
            default:
                break;
        }
    }
}
