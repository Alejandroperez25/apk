package com.apptreesoftware.flutterwebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class WebViewActivity extends Activity {

    /* renamed from: i, reason: collision with root package name */
    public WebView f4811i;

    /* renamed from: h, reason: collision with root package name */
    public static final a f4810h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private static final String f4803a = "url";

    /* renamed from: b, reason: collision with root package name */
    private static final String f4804b = "actions";

    /* renamed from: c, reason: collision with root package name */
    private static final String f4805c = "headers";

    /* renamed from: d, reason: collision with root package name */
    private static final String f4806d = "barColor";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4807e = "inlineMediaEnabled";

    /* renamed from: f, reason: collision with root package name */
    private static final String f4808f = "javaScriptEnabled";

    /* renamed from: g, reason: collision with root package name */
    private static final String f4809g = "clearCookies";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g.b.a.b bVar) {
            this();
        }

        public final String a() {
            return WebViewActivity.f4803a;
        }

        public final String b() {
            return WebViewActivity.f4804b;
        }

        public final String c() {
            return WebViewActivity.f4805c;
        }

        public final String d() {
            return WebViewActivity.f4807e;
        }

        public final String e() {
            return WebViewActivity.f4808f;
        }

        public final String f() {
            return WebViewActivity.f4809g;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4811i = new WebView(this);
        setTitle("");
        WebView webView = this.f4811i;
        if (webView == null) {
            g.b.a.c.b("webView");
            throw null;
        }
        setContentView(webView);
        WebView webView2 = this.f4811i;
        if (webView2 == null) {
            g.b.a.c.b("webView");
            throw null;
        }
        WebSettings settings = webView2.getSettings();
        g.b.a.c.a((Object) settings, "webView.settings");
        settings.setJavaScriptEnabled(getIntent().getBooleanExtra(f4808f, false));
        if (Build.VERSION.SDK_INT >= 17) {
            WebView webView3 = this.f4811i;
            if (webView3 == null) {
                g.b.a.c.b("webView");
                throw null;
            }
            WebSettings settings2 = webView3.getSettings();
            g.b.a.c.a((Object) settings2, "webView.settings");
            settings2.setMediaPlaybackRequiresUserGesture(getIntent().getBooleanExtra(f4807e, false));
        }
        WebView webView4 = this.f4811i;
        if (webView4 == null) {
            g.b.a.c.b("webView");
            throw null;
        }
        webView4.setWebViewClient(new d());
        if (j()) {
            k();
        }
        WebView webView5 = this.f4811i;
        if (webView5 != null) {
            webView5.loadUrl(g(), h());
        } else {
            g.b.a.c.b("webView");
            throw null;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        com.apptreesoftware.flutterwebview.a.f4815d.a(this);
        super.onResume();
    }

    public final void a(String str, HashMap<String, String> map) {
        g.b.a.c.b(str, "url");
        g.b.a.c.b(map, "headers");
        getIntent().putExtra(f4803a, str);
        getIntent().putExtra(f4805c, map);
        WebView webView = this.f4811i;
        if (webView != null) {
            webView.loadUrl(str, map);
        } else {
            g.b.a.c.b("webView");
            throw null;
        }
    }

    private final void k() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(e.f4824a);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    public final String g() {
        Intent intent = getIntent();
        g.b.a.c.a((Object) intent, "intent");
        String string = intent.getExtras().getString(f4803a);
        g.b.a.c.a((Object) string, "intent.extras.getString(WebViewActivity.EXTRA_URL)");
        return string;
    }

    public final HashMap<String, String> h() {
        Serializable serializableExtra = getIntent().getSerializableExtra(f4805c);
        if (serializableExtra != null) {
            return (HashMap) serializableExtra;
        }
        throw new g.d("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
    }

    public final ArrayList<Map<String, Object>> i() {
        Serializable serializableExtra = getIntent().getSerializableExtra(f4804b);
        if (serializableExtra != null) {
            return (ArrayList) serializableExtra;
        }
        throw new g.d("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.collections.Map<kotlin.String, kotlin.Any>> /* = java.util.ArrayList<kotlin.collections.Map<kotlin.String, kotlin.Any>> */");
    }

    public final boolean j() {
        return getIntent().getBooleanExtra(f4809g, false);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        g.b.a.c.b(menu, "menu");
        Iterator<T> it = i().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("identifier");
            if (obj == null) {
                throw new g.d("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = map.get("title");
            if (obj2 == null) {
                throw new g.d("null cannot be cast to non-null type kotlin.String");
            }
            menu.add(0, iIntValue, i2, (String) obj2);
            i2++;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        g.b.a.c.b(menuItem, "item");
        com.apptreesoftware.flutterwebview.a.f4815d.a(menuItem.getItemId());
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.f4811i;
        if (webView == null) {
            g.b.a.c.b("webView");
            throw null;
        }
        if (webView.canGoBack()) {
            WebView webView2 = this.f4811i;
            if (webView2 != null) {
                webView2.goBack();
                return;
            } else {
                g.b.a.c.b("webView");
                throw null;
            }
        }
        super.onBackPressed();
    }
}
