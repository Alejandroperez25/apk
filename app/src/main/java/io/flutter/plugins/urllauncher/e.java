package io.flutter.plugins.urllauncher;

import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
class e extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebViewActivity f6244a;

    e(WebViewActivity webViewActivity) {
        this.f6244a = webViewActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            webView.loadUrl(str);
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return false;
    }
}
