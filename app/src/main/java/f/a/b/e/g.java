package f.a.b.e;

import android.annotation.TargetApi;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
class g extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f5822a;

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    g(i iVar) {
        this.f5822a = iVar;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f5822a.a(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f5822a.b(webView, str);
    }
}
