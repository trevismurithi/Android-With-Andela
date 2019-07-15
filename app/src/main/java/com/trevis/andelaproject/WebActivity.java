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


            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.getSettings().setAllowContentAccess(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.setHorizontalScrollBarEnabled(false);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setDisplayZoomControls(false);
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setBuiltInZoomControls(true);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                    handler.proceed();
                }

                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    return false;
                }
            });

            webView.loadUrl("https://andela.com/alc");
        }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }

    }

}
