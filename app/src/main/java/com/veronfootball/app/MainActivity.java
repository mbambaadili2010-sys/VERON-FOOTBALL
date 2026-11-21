package com.veronfootball.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        String html = "<html><body style='background:#101820;color:white;text-align:center;font-family:sans-serif;padding:30px;'>"
            + "<h1 style='color:gold;'>VERON FOOTBALL</h1>"
            + "<h2>Welcome to VERON FOOTBALL</h2>"
            + "<p>Football News</p>"
            + "<p>Live Scores</p>"
            + "<p>Fixtures</p>"
            + "<p>Leagues</p>"
            + "</body></html>";

        webView.loadDataWithBaseURL(
            null, html, "text/html", "UTF-8", null
        );

        setContentView(webView);
    }
}
