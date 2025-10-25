package c.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import f.a.a.a.o;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private ValueCallback<Uri> f1309a;

    /* renamed from: b, reason: collision with root package name */
    private ValueCallback<Uri[]> f1310b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f1311c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f1312d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f1313e;

    /* renamed from: g, reason: collision with root package name */
    WebView f1315g;

    /* renamed from: h, reason: collision with root package name */
    Activity f1316h;
    Context k;

    /* renamed from: f, reason: collision with root package name */
    boolean f1314f = false;
    private boolean l = false;
    a j = new a();

    /* renamed from: i, reason: collision with root package name */
    c.b.a f1317i = new g(this);

    /* JADX INFO: Access modifiers changed from: private */
    public long a(Uri uri) {
        Cursor cursorQuery = this.k.getContentResolver().query(uri, null, null, null, null);
        cursorQuery.moveToFirst();
        return cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
    }

    @TargetApi(7)
    class a {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(int r7, int r8, android.content.Intent r9) {
            /*
                r6 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = -1
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 21
                if (r0 < r5) goto L77
                if (r7 != r4) goto L9a
                if (r8 != r1) goto L5f
                c.b.m r7 = c.b.m.this
                android.net.Uri r7 = c.b.m.a(r7)
                r0 = 0
                if (r7 == 0) goto L33
                c.b.m r7 = c.b.m.this
                c.b.m r8 = c.b.m.this
                android.net.Uri r8 = c.b.m.a(r8)
                long r7 = c.b.m.a(r7, r8)
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 <= 0) goto L33
                android.net.Uri[] r7 = new android.net.Uri[r4]
                c.b.m r8 = c.b.m.this
                android.net.Uri r8 = c.b.m.a(r8)
                r7[r2] = r8
                goto L60
            L33:
                c.b.m r7 = c.b.m.this
                android.net.Uri r7 = c.b.m.b(r7)
                if (r7 == 0) goto L56
                c.b.m r7 = c.b.m.this
                c.b.m r8 = c.b.m.this
                android.net.Uri r8 = c.b.m.b(r8)
                long r7 = c.b.m.a(r7, r8)
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 <= 0) goto L56
                android.net.Uri[] r7 = new android.net.Uri[r4]
                c.b.m r8 = c.b.m.this
                android.net.Uri r8 = c.b.m.b(r8)
                r7[r2] = r8
                goto L60
            L56:
                if (r9 == 0) goto L5f
                c.b.m r7 = c.b.m.this
                android.net.Uri[] r7 = c.b.m.a(r7, r9)
                goto L60
            L5f:
                r7 = r3
            L60:
                c.b.m r8 = c.b.m.this
                android.webkit.ValueCallback r8 = c.b.m.c(r8)
                if (r8 == 0) goto L9b
                c.b.m r8 = c.b.m.this
                android.webkit.ValueCallback r8 = c.b.m.c(r8)
                r8.onReceiveValue(r7)
                c.b.m r7 = c.b.m.this
                c.b.m.a(r7, r3)
                goto L9b
            L77:
                if (r7 != r4) goto L9a
                if (r8 != r1) goto L82
                if (r9 == 0) goto L82
                android.net.Uri r7 = r9.getData()
                goto L83
            L82:
                r7 = r3
            L83:
                c.b.m r8 = c.b.m.this
                android.webkit.ValueCallback r8 = c.b.m.d(r8)
                if (r8 == 0) goto L9b
                c.b.m r8 = c.b.m.this
                android.webkit.ValueCallback r8 = c.b.m.d(r8)
                r8.onReceiveValue(r7)
                c.b.m r7 = c.b.m.this
                c.b.m.b(r7, r3)
                goto L9b
            L9a:
                r4 = 0
            L9b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c.b.m.a.a(int, int, android.content.Intent):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri[] a(Intent intent) {
        String dataString;
        if (intent.getData() != null && (dataString = intent.getDataString()) != null) {
            return new Uri[]{Uri.parse(dataString)};
        }
        if (intent.getClipData() == null) {
            return null;
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i2 = 0; i2 < itemCount; i2++) {
            uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
        }
        return uriArr;
    }

    m(Activity activity, Context context, List<String> list) {
        this.f1315g = new f(activity);
        this.f1316h = activity;
        this.k = context;
        this.f1313e = new Handler(context.getMainLooper());
        this.f1315g.setOnKeyListener(new h(this));
        ((f) this.f1315g).setOnScrollChangedCallback(new i(this));
        this.f1315g.setWebViewClient(this.f1317i);
        this.f1315g.setWebChromeClient(new j(this, activity));
        a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri b(String str) {
        File fileA;
        String str2 = "";
        String str3 = "";
        if (str == "android.media.action.IMAGE_CAPTURE") {
            str2 = "image-";
            str3 = ".jpg";
        } else if (str == "android.media.action.VIDEO_CAPTURE") {
            str2 = "video-";
            str3 = ".mp4";
        }
        String packageName = this.k.getPackageName();
        try {
            fileA = a(str2, str3);
        } catch (IOException e2) {
            e2.printStackTrace();
            fileA = null;
        }
        return FileProvider.a(this.k, packageName + ".fileprovider", fileA);
    }

    private File a(String str, String str2) {
        return File.createTempFile(str + "_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), str2, this.k.getExternalFilesDir(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a(String[] strArr) {
        return Boolean.valueOf(c(strArr).booleanValue() || a(strArr, "image").booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean b(String[] strArr) {
        return Boolean.valueOf(c(strArr).booleanValue() || a(strArr, "video").booleanValue());
    }

    private Boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private Boolean c(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] a(WebChromeClient.FileChooserParams fileChooserParams) {
        if (Build.VERSION.SDK_INT >= 21) {
            return fileChooserParams.getAcceptTypes();
        }
        return new String[0];
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new k(this));
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    private void e() {
        this.f1315g.clearCache(true);
        this.f1315g.clearFormData();
    }

    private void a(List<String> list) {
        for (String str : list) {
            this.f1315g.addJavascriptInterface(new e(c.f1291a, str, this.f1313e), str);
        }
    }

    void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, Map<String, String> map, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str3, boolean z15, boolean z16, boolean z17) {
        this.f1315g.getSettings().setJavaScriptEnabled(z);
        this.f1315g.getSettings().setBuiltInZoomControls(z6);
        this.f1315g.getSettings().setSupportZoom(z6);
        this.f1315g.getSettings().setDisplayZoomControls(z7);
        this.f1315g.getSettings().setDomStorageEnabled(z8);
        this.f1315g.getSettings().setLoadWithOverviewMode(z9);
        this.f1315g.getSettings().setJavaScriptCanOpenWindowsAutomatically(z11);
        this.f1315g.getSettings().setSupportMultipleWindows(z11);
        this.f1315g.getSettings().setAppCacheEnabled(z12);
        this.f1315g.getSettings().setAllowFileAccessFromFileURLs(z13);
        this.f1315g.getSettings().setAllowUniversalAccessFromFileURLs(z13);
        this.f1315g.getSettings().setUseWideViewPort(z14);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1315g.getSettings().setMediaPlaybackRequiresUserGesture(z5);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            WebView webView = this.f1315g;
            WebView.setWebContentsDebuggingEnabled(z16);
        }
        this.l = z17;
        this.f1317i.a(str3);
        if (z15) {
            this.f1315g.getSettings().setGeolocationEnabled(true);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1315g.getSettings().setMixedContentMode(2);
        }
        if (z2) {
            e();
        }
        if (z3) {
            this.f1315g.setVisibility(8);
        }
        if (z4) {
            d();
        }
        if (str != null) {
            this.f1315g.getSettings().setUserAgentString(str);
        }
        if (!z10) {
            this.f1315g.setVerticalScrollBarEnabled(false);
        }
        if (map != null) {
            this.f1315g.loadUrl(str2, map);
        } else {
            this.f1315g.loadUrl(str2);
        }
    }

    void a(String str) {
        this.f1315g.loadUrl(str);
    }

    void a(String str, Map<String, String> map) {
        this.f1315g.loadUrl(str, map);
    }

    void a(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g != null) {
            ((ViewGroup) this.f1315g.getParent()).removeView(this.f1315g);
        }
        this.f1315g = null;
        if (dVar != null) {
            dVar.a(null);
        }
        this.f1314f = true;
        c.f1291a.a("onDestroy", null);
    }

    @TargetApi(19)
    void b(f.a.a.a.m mVar, o.d dVar) {
        this.f1315g.evaluateJavascript((String) mVar.a("code"), new l(this, dVar));
    }

    void c(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g != null) {
            this.f1315g.reload();
        }
    }

    void d(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g == null || !this.f1315g.canGoBack()) {
            return;
        }
        this.f1315g.goBack();
    }

    void e(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g == null || !this.f1315g.canGoForward()) {
            return;
        }
        this.f1315g.goForward();
    }

    void a(FrameLayout.LayoutParams layoutParams) {
        this.f1315g.setLayoutParams(layoutParams);
    }

    boolean a() {
        return this.f1315g.canGoBack();
    }

    boolean b() {
        return this.f1315g.canGoForward();
    }

    void c() {
        this.f1315g.clearCache(true);
    }

    void f(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g != null) {
            this.f1315g.setVisibility(8);
        }
    }

    void g(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g != null) {
            this.f1315g.setVisibility(0);
        }
    }

    void h(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1315g != null) {
            this.f1315g.stopLoading();
        }
    }
}
