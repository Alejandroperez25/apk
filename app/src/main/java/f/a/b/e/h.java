package f.a.b.e;

import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;

/* loaded from: classes.dex */
class h extends WebViewClientCompat {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f5823b;

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    h(i iVar) {
        this.f5823b = iVar;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f5823b.a(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f5823b.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f5823b.b(webView, str);
    }
}
