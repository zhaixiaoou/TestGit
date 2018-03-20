package com.zxo.testgit;

import android.app.Activity;
import android.graphics.Rect;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by xiaoouzhai on 2018/2/9.
 */

public class InputActivity extends Activity {
    private static final String TAG = "zxo-test";
    private TextView mTextView;
    private EditText mEditText;
    private LinearLayout mRootView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        mEditText = findViewById(R.id.edit_text);
        mRootView = findViewById(R.id.root_view);
        mTextView = findViewById(R.id.text_view);
        computeUsableHeight();
        getWindow().getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener(){

            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {

            }
        });


        Log.d(TAG, "onCreate:test commit--reset");
    }

    private void computeUsableHeight(){
        mRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Rect rect = new Rect();
                mRootView.getWindowVisibleDisplayFrame(rect);
                Log.d(TAG, "onGlobalLayout: 可视区域bottom="+rect.bottom+",top="+rect.top);
                Log.d(TAG, "onGlobalLayout: rootView的高度"+mRootView.getRootView().getHeight());
                int[] locationEdit = new int[2];
                mEditText.getLocationInWindow(locationEdit);
                Log.d(TAG, "computeUsableHeight: mEditText.location[0]="+locationEdit[0]+",location[1]="+locationEdit[1]);
                int[] locationText = new int[2];
//                mTextView.getLocationInWindow(locationText);
                mTextView.getLocationOnScreen(locationText);
                Log.d(TAG, "computeUsableHeight: mTextView.location[0]="+locationText[0]+",location[1]="+locationText[1]);

            }
        });

    }



}
