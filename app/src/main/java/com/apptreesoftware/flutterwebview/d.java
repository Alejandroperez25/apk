package com.apptreesoftware.flutterwebview;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.apptreesoftware.flutterwebview.a;
import g.c.i;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        g.b.a.c.b(str, "url");
        super.onPageFinished(webView, str);
        a.f4815d.b(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        CharSequence description;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            a.C0057a c0057a = a.f4815d;
            if (webResourceError == null || (description = webResourceError.getDescription()) == null || (string = description.toString()) == null) {
                string = "An error occurred loading this page";
            }
            c0057a.c(string);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        a.C0057a c0057a = a.f4815d;
        if (str == null) {
            str = "An error occurred loading this page";
        }
        c0057a.c(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        g.b.a.c.b(str, "url");
        super.onPageStarted(webView, str, bitmap);
        a.f4815d.a(str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        g.b.a.c.b(webView, "view");
        g.b.a.c.b(webResourceRequest, "request");
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        String string = webResourceRequest.getUrl().toString();
        g.b.a.c.a((Object) string, "request.url.toString()");
        Iterator<c> it = a.f4815d.b().iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c() == b.PREFIX && i.b(string, next.a(), true)) {
                a.f4815d.d(string);
                return next.b();
            }
            if (next.c() == b.SUFFIX && i.c(string, next.a(), true)) {
                a.f4815d.d(string);
                return next.b();
            }
            if (next.c() == b.FULL_URL && i.a(string, next.a(), true)) {
                a.f4815d.d(string);
                return next.b();
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        g.b.a.c.b(str, "url");
        Iterator<c> it = a.f4815d.b().iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c() == b.PREFIX && i.b(str, next.a(), true)) {
                a.f4815d.d(str);
                return next.b();
            }
            if (next.c() == b.SUFFIX && i.c(str, next.a(), true)) {
                a.f4815d.d(str);
                return next.b();
            }
            if (next.c() == b.FULL_URL && i.a(str, next.a(), true)) {
                a.f4815d.d(str);
                return next.b();
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
