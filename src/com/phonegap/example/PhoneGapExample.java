package com.phonegap.example;

//import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.phonegap.*;


public class PhoneGapExample extends DroidGap 
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
//        super.init();
//        setContentView(R.layout.main);
//        WebView myWebView = (WebView) findViewById(R.id.phonegap_container);
//        myWebView.getSettings().setJavaScriptEnabled(true);
//        myWebView.setWebChromeClient(new WebChromeClient());
//        View html = (View)super.appView.getParent();
//        myWebView.addView(html);
        super.loadUrl("file:///android_asset/jenkins/index.html");
    }
}

