package c.b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private Pattern f1289a;

    public a() {
        this(null);
    }

    public a(String str) {
        this.f1289a = null;
        if (str != null) {
            this.f1289a = Pattern.compile(str);
        }
    }

    public void a(String str) {
        if (str != null) {
            this.f1289a = Pattern.compile(str);
        } else {
            this.f1289a = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("type", "startLoad");
        c.f1291a.a("onState", map);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        HashMap map = new HashMap();
        map.put("url", str);
        c.f1291a.a("onUrlChanged", map);
        map.put("type", "finishLoad");
        c.f1291a.a("onState", map);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        boolean zB = b(string);
        HashMap map = new HashMap();
        map.put("url", string);
        map.put("type", zB ? "abortLoad" : "shouldStart");
        c.f1291a.a("onState", map);
        return zB;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean zB = b(str);
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("type", zB ? "abortLoad" : "shouldStart");
        c.f1291a.a("onState", map);
        return zB;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        HashMap map = new HashMap();
        map.put("url", webResourceRequest.getUrl().toString());
        map.put("code", Integer.toString(webResourceResponse.getStatusCode()));
        c.f1291a.a("onHttpError", map);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        HashMap map = new HashMap();
        map.put("url", str2);
        map.put("code", Integer.toString(i2));
        c.f1291a.a("onHttpError", map);
    }

    private boolean b(String str) {
        if (this.f1289a == null) {
            return false;
        }
        return this.f1289a.matcher(str).lookingAt();
    }
}
