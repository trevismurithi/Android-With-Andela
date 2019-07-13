package com.trevis.andelaproject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    Activity activity ;
        private ProgressDialog progDailog;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.web_page_andela);
        webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://learning-digest.andela.com/");

            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

    }

}
