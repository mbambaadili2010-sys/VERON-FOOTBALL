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

        String html =
        "<html><head><meta name='viewport' content='width=device-width, initial-scale=1'>" +
        "<style>" +
        "body{background:#101820;color:white;font-family:Arial;text-align:center;margin:0;padding:20px}" +
        "h1{color:#ffcc00;font-size:32px}" +
        "button{background:#ffcc00;color:#101820;border:0;padding:16px;margin:9px;width:90%;font-size:18px;font-weight:bold;border-radius:10px}" +
        ".card{background:#1c2933;padding:20px;margin-top:20px;border-radius:12px}" +
        "</style></head><body>" +

        "<h1>VERON FOOTBALL</h1>" +
        "<h2>Welcome to VERON FOOTBALL</h2>" +

        "<button onclick=\"showPage('news')\">Football News</button>" +
        "<button onclick=\"showPage('scores')\">Live Scores</button>" +
        "<button onclick=\"showPage('fixtures')\">Fixtures</button>" +
        "<button onclick=\"showPage('leagues')\">Leagues</button>" +

        "<div class='card' id='content'>" +
        "<h2>Welcome!</h2><p>Your football world starts here.</p>" +
        "</div>" +

        "<script>" +
        "function showPage(page){" +
        "var c=document.getElementById('content');" +
        "if(page=='news'){c.innerHTML='<h2>Football News</h2><p>Football news section is ready.</p>'}" +
        "if(page=='scores'){c.innerHTML='<h2>Live Scores</h2><p>Live scores will appear here after connecting a football data service.</p>'}" +
        "if(page=='fixtures'){c.innerHTML='<h2>Fixtures</h2><p>Match schedules will appear here.</p>'}" +
        "if(page=='leagues'){c.innerHTML='<h2>Leagues</h2><p>Premier League<br>La Liga<br>Serie A<br>Bundesliga<br>UEFA Champions League</p>'}" +
        "}" +
        "</script></body></html>";

        webView.loadDataWithBaseURL(
            null, html, "text/html", "UTF-8", null
        );

        setContentView(webView);
    }
}
