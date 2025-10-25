package c.b;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* loaded from: classes.dex */
class g extends a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f1301b;

    g(m mVar) {
        this.f1301b = mVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f1301b.l) {
            sslErrorHandler.proceed();
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }
}
