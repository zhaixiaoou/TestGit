package com.zxo.testgit;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by xiaoouzhai on 2018/3/20.
 */

public class RecycleViewActivity extends Activity {

    private static final String TAG = "zxo-test";
    private LinearLayout mScrollView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
    }

    @TargetApi(23)
    private void addListener() {

        mScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Log.d(TAG, "onScrollChange: scrollY="+scrollY);
            }
        });
    }


}
