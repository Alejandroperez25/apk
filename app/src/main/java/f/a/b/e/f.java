package f.a.b.e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.View;
import android.webkit.WebStorage;
import android.webkit.WebView;
import b.a.a$i;
import f.a.a.a.o;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements io.flutter.plugin.platform.g, o.c {

    /* renamed from: a, reason: collision with root package name */
    private final k f5818a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a.a.a.o f5819b;

    /* renamed from: c, reason: collision with root package name */
    private final i f5820c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f5821d;

    @Override // io.flutter.plugin.platform.g
    @SuppressLint({"NewApi"})
    public /* synthetic */ void a(View view) {
        io.flutter.plugin.platform.f.a(this, view);
    }

    @TargetApi(a$i.AppCompatTheme_actionModeBackground)
    f(Context context, f.a.a.a.e eVar, int i2, Map<String, Object> map, View view) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        b bVar = new b();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        bVar.a(displayManager);
        this.f5818a = new k(context, view);
        bVar.b(displayManager);
        this.f5821d = new Handler(context.getMainLooper());
        this.f5818a.getSettings().setDomStorageEnabled(true);
        this.f5819b = new f.a.a.a.o(eVar, "plugins.flutter.io/webview_" + i2);
        this.f5819b.a(this);
        this.f5820c = new i(this.f5819b);
        a((Map<String, Object>) map.get("settings"));
        if (map.containsKey("javascriptChannelNames")) {
            a((List<String>) map.get("javascriptChannelNames"));
        }
        b(((Integer) map.get("autoMediaPlaybackPolicy")).intValue());
        if (map.containsKey("userAgent")) {
            a((String) map.get("userAgent"));
        }
        if (map.containsKey("initialUrl")) {
            this.f5818a.loadUrl((String) map.get("initialUrl"));
        }
    }

    @Override // io.flutter.plugin.platform.g
    public View d() {
        return this.f5818a;
    }

    @Override // io.flutter.plugin.platform.g
    public void c() {
        this.f5818a.b();
    }

    @Override // io.flutter.plugin.platform.g
    public void a() {
        this.f5818a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r3, f.a.a.a.o.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.f5663a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1990164468: goto L8b;
                case -1707388194: goto L80;
                case -1241591313: goto L76;
                case -1088982730: goto L6c;
                case -1067273523: goto L62;
                case -934641255: goto L58;
                case -759238347: goto L4d;
                case -318289731: goto L43;
                case -317054497: goto L39;
                case 336631465: goto L2f;
                case 651673601: goto L23;
                case 1937913574: goto L17;
                case 1966196898: goto Lb;
                default: goto L9;
            }
        L9:
            goto L95
        Lb:
            java.lang.String r1 = "getTitle"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 12
            goto L96
        L17:
            java.lang.String r1 = "evaluateJavascript"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 8
            goto L96
        L23:
            java.lang.String r1 = "removeJavascriptChannels"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 10
            goto L96
        L2f:
            java.lang.String r1 = "loadUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 0
            goto L96
        L39:
            java.lang.String r1 = "canGoBack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 2
            goto L96
        L43:
            java.lang.String r1 = "goForward"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 5
            goto L96
        L4d:
            java.lang.String r1 = "clearCache"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 11
            goto L96
        L58:
            java.lang.String r1 = "reload"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 6
            goto L96
        L62:
            java.lang.String r1 = "canGoForward"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 3
            goto L96
        L6c:
            java.lang.String r1 = "currentUrl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 7
            goto L96
        L76:
            java.lang.String r1 = "goBack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 4
            goto L96
        L80:
            java.lang.String r1 = "addJavascriptChannels"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 9
            goto L96
        L8b:
            java.lang.String r1 = "updateSettings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            r0 = 1
            goto L96
        L95:
            r0 = -1
        L96:
            switch(r0) {
                case 0: goto Lcd;
                case 1: goto Lc9;
                case 2: goto Lc5;
                case 3: goto Lc1;
                case 4: goto Lbd;
                case 5: goto Lb9;
                case 6: goto Lb5;
                case 7: goto Lb1;
                case 8: goto Lad;
                case 9: goto La9;
                case 10: goto La5;
                case 11: goto La1;
                case 12: goto L9d;
                default: goto L99;
            }
        L99:
            r4.a()
            goto Ld0
        L9d:
            r2.h(r4)
            goto Ld0
        La1:
            r2.g(r4)
            goto Ld0
        La5:
            r2.f(r3, r4)
            goto Ld0
        La9:
            r2.e(r3, r4)
            goto Ld0
        Lad:
            r2.d(r3, r4)
            goto Ld0
        Lb1:
            r2.f(r4)
            goto Ld0
        Lb5:
            r2.e(r4)
            goto Ld0
        Lb9:
            r2.d(r4)
            goto Ld0
        Lbd:
            r2.c(r4)
            goto Ld0
        Lc1:
            r2.b(r4)
            goto Ld0
        Lc5:
            r2.a(r4)
            goto Ld0
        Lc9:
            r2.c(r3, r4)
            goto Ld0
        Lcd:
            r2.b(r3, r4)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b.e.f.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    private void b(f.a.a.a.m mVar, o.d dVar) {
        Map map = (Map) mVar.f5664b;
        String str = (String) map.get("url");
        Map<String, String> mapEmptyMap = (Map) map.get("headers");
        if (mapEmptyMap == null) {
            mapEmptyMap = Collections.emptyMap();
        }
        this.f5818a.loadUrl(str, mapEmptyMap);
        dVar.a(null);
    }

    private void a(o.d dVar) {
        dVar.a(Boolean.valueOf(this.f5818a.canGoBack()));
    }

    private void b(o.d dVar) {
        dVar.a(Boolean.valueOf(this.f5818a.canGoForward()));
    }

    private void c(o.d dVar) {
        if (this.f5818a.canGoBack()) {
            this.f5818a.goBack();
        }
        dVar.a(null);
    }

    private void d(o.d dVar) {
        if (this.f5818a.canGoForward()) {
            this.f5818a.goForward();
        }
        dVar.a(null);
    }

    private void e(o.d dVar) {
        this.f5818a.reload();
        dVar.a(null);
    }

    private void f(o.d dVar) {
        dVar.a(this.f5818a.getUrl());
    }

    private void c(f.a.a.a.m mVar, o.d dVar) {
        a((Map<String, Object>) mVar.f5664b);
        dVar.a(null);
    }

    @TargetApi(19)
    private void d(f.a.a.a.m mVar, o.d dVar) {
        String str = (String) mVar.f5664b;
        if (str == null) {
            throw new UnsupportedOperationException("JavaScript string cannot be null");
        }
        this.f5818a.evaluateJavascript(str, new e(this, dVar));
    }

    private void e(f.a.a.a.m mVar, o.d dVar) {
        a((List<String>) mVar.f5664b);
        dVar.a(null);
    }

    private void f(f.a.a.a.m mVar, o.d dVar) {
        Iterator it = ((List) mVar.f5664b).iterator();
        while (it.hasNext()) {
            this.f5818a.removeJavascriptInterface((String) it.next());
        }
        dVar.a(null);
    }

    private void g(o.d dVar) {
        this.f5818a.clearCache(true);
        WebStorage.getInstance().deleteAllData();
        dVar.a(null);
    }

    private void h(o.d dVar) {
        dVar.a(this.f5818a.getTitle());
    }

    private void a(Map<String, Object> map) {
        for (String str : map.keySet()) {
            char c2 = 65535;
            int iHashCode = str.hashCode();
            if (iHashCode != -1151668596) {
                if (iHashCode != -1069908877) {
                    if (iHashCode != 311430650) {
                        if (iHashCode == 858297331 && str.equals("hasNavigationDelegate")) {
                            c2 = 1;
                        }
                    } else if (str.equals("userAgent")) {
                        c2 = 3;
                    }
                } else if (str.equals("debuggingEnabled")) {
                    c2 = 2;
                }
            } else if (str.equals("jsMode")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    a(((Integer) map.get(str)).intValue());
                    break;
                case 1:
                    this.f5818a.setWebViewClient(this.f5820c.a(((Boolean) map.get(str)).booleanValue()));
                    break;
                case 2:
                    boolean zBooleanValue = ((Boolean) map.get(str)).booleanValue();
                    k kVar = this.f5818a;
                    WebView.setWebContentsDebuggingEnabled(zBooleanValue);
                    break;
                case 3:
                    a((String) map.get(str));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown WebView setting: " + str);
            }
        }
    }

    private void a(int i2) {
        switch (i2) {
            case 0:
                this.f5818a.getSettings().setJavaScriptEnabled(false);
                return;
            case 1:
                this.f5818a.getSettings().setJavaScriptEnabled(true);
                return;
            default:
                throw new IllegalArgumentException("Trying to set unknown JavaScript mode: " + i2);
        }
    }

    private void b(int i2) {
        this.f5818a.getSettings().setMediaPlaybackRequiresUserGesture(i2 != 1);
    }

    private void a(List<String> list) {
        for (String str : list) {
            this.f5818a.addJavascriptInterface(new m(this.f5819b, str, this.f5821d), str);
        }
    }

    private void a(String str) {
        this.f5818a.getSettings().setUserAgentString(str);
    }

    @Override // io.flutter.plugin.platform.g
    public void b() {
        this.f5819b.a((o.c) null);
        this.f5818a.c();
        this.f5818a.destroy();
    }
}
