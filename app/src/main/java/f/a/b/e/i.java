package f.a.b.e;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import f.a.a.a.o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final f.a.a.a.o f5824a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5825b;

    i(f.a.a.a.o oVar) {
        this.f5824a = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public boolean a(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.f5825b) {
            return false;
        }
        a(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), webView, webResourceRequest.isForMainFrame());
        return webResourceRequest.isForMainFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        if (!this.f5825b) {
            return false;
        }
        Log.w("FlutterWebViewClient", "Using a navigationDelegate with an old webview implementation, pages with frames or iframes will not work");
        a(str, null, webView, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WebView webView, String str) {
        HashMap map = new HashMap();
        map.put("url", str);
        this.f5824a.a("onPageFinished", map);
    }

    private void a(String str, Map<String, String> map, WebView webView, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("url", str);
        map2.put("isForMainFrame", Boolean.valueOf(z));
        if (z) {
            this.f5824a.a("navigationRequest", map2, new a(str, map, webView, null));
        } else {
            this.f5824a.a("navigationRequest", map2);
        }
    }

    WebViewClient a(boolean z) {
        this.f5825b = z;
        if (!z || Build.VERSION.SDK_INT >= 24) {
            return a();
        }
        return b();
    }

    private WebViewClient a() {
        return new g(this);
    }

    private WebViewClientCompat b() {
        return new h(this);
    }

    private static class a implements o.d {

        /* renamed from: a, reason: collision with root package name */
        private final String f5826a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, String> f5827b;

        /* renamed from: c, reason: collision with root package name */
        private final WebView f5828c;

        /* synthetic */ a(String str, Map map, WebView webView, g gVar) {
            this(str, map, webView);
        }

        private a(String str, Map<String, String> map, WebView webView) {
            this.f5826a = str;
            this.f5827b = map;
            this.f5828c = webView;
        }

        @Override // f.a.a.a.o.d
        public void a(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                b();
            }
        }

        @Override // f.a.a.a.o.d
        public void a(String str, String str2, Object obj) {
            throw new IllegalStateException("navigationRequest calls must succeed");
        }

        @Override // f.a.a.a.o.d
        public void a() {
            throw new IllegalStateException("navigationRequest must be implemented by the webview method channel");
        }

        private void b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f5828c.loadUrl(this.f5826a, this.f5827b);
            } else {
                this.f5828c.loadUrl(this.f5826a);
            }
        }
    }
}
