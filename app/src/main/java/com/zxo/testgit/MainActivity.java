package com.zxo.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Paint mPaint = new Paint();
//        mPaint.setColor(0xffff0000);
//        mPaint.setStrokeWidth(10);
//        setContentView(new View(this){
//            @Override
//            protected void onDraw(Canvas canvas) {
//                super.onDraw(canvas);
//                canvas.drawLine(0,0,getWidth(), getHeight(), mPaint);
//            }
//        });
//        mWebView = findViewById(R.id.webview);
//        mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
//        mWebView.loadUrl("http://192.168.162.125/");

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
