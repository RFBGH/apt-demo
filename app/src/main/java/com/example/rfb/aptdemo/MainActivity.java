package com.example.rfb.aptdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.flypig.apt_annotation.BindView;
import com.flypig.apt_library.BindViewTools;

/**
 * Created by Administrator on 2018/11/19 0019.
 */

public class MainActivity extends Activity{

    @BindView(R.id.tv)
    TextView mTextView;
    @BindView(R.id.btn)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mTextView.setText("bind TextView success");
        mButton.setText("bind Button success");
    }
}
