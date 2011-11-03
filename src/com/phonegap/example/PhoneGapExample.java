package com.phonegap.example;

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
        super.loadUrl("file:///android_asset/jenkins/index.html");
    }
}

