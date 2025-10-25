package c.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.widget.FrameLayout;
import f.a.a.a.o;
import f.a.a.a.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements o.c, q.a {

    /* renamed from: a, reason: collision with root package name */
    static o f1291a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f1292b;

    /* renamed from: c, reason: collision with root package name */
    private m f1293c;

    /* renamed from: d, reason: collision with root package name */
    private Context f1294d;

    public static void a(q.d dVar) {
        if (dVar.d() != null) {
            f1291a = new o(dVar.f(), "flutter_webview_plugin");
            c cVar = new c(dVar.d(), dVar.e());
            dVar.a(cVar);
            f1291a.a(cVar);
        }
    }

    c(Activity activity, Context context) {
        this.f1292b = activity;
        this.f1294d = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r3, f.a.a.a.o.d r4) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.c.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    private void a(o.d dVar) {
        this.f1293c.c();
        WebStorage.getInstance().deleteAllData();
        dVar.a(null);
    }

    void b(f.a.a.a.m mVar, o.d dVar) {
        boolean z;
        boolean zBooleanValue = ((Boolean) mVar.a("hidden")).booleanValue();
        String str = (String) mVar.a("url");
        String str2 = (String) mVar.a("userAgent");
        boolean zBooleanValue2 = ((Boolean) mVar.a("withJavascript")).booleanValue();
        boolean zBooleanValue3 = ((Boolean) mVar.a("clearCache")).booleanValue();
        boolean zBooleanValue4 = ((Boolean) mVar.a("clearCookies")).booleanValue();
        boolean zBooleanValue5 = ((Boolean) mVar.a("mediaPlaybackRequiresUserGesture")).booleanValue();
        boolean zBooleanValue6 = ((Boolean) mVar.a("withZoom")).booleanValue();
        boolean zBooleanValue7 = ((Boolean) mVar.a("displayZoomControls")).booleanValue();
        boolean zBooleanValue8 = ((Boolean) mVar.a("withLocalStorage")).booleanValue();
        boolean zBooleanValue9 = ((Boolean) mVar.a("withOverviewMode")).booleanValue();
        boolean zBooleanValue10 = ((Boolean) mVar.a("supportMultipleWindows")).booleanValue();
        boolean zBooleanValue11 = ((Boolean) mVar.a("appCacheEnabled")).booleanValue();
        Map<String, String> map = (Map) mVar.a("headers");
        boolean zBooleanValue12 = ((Boolean) mVar.a("scrollBar")).booleanValue();
        boolean zBooleanValue13 = ((Boolean) mVar.a("allowFileURLs")).booleanValue();
        boolean zBooleanValue14 = ((Boolean) mVar.a("useWideViewPort")).booleanValue();
        String str3 = (String) mVar.a("invalidUrlRegex");
        boolean zBooleanValue15 = ((Boolean) mVar.a("geolocationEnabled")).booleanValue();
        boolean zBooleanValue16 = ((Boolean) mVar.a("debuggingEnabled")).booleanValue();
        boolean zBooleanValue17 = ((Boolean) mVar.a("ignoreSSLErrors")).booleanValue();
        if (this.f1293c == null || this.f1293c.f1314f) {
            Map map2 = (Map) mVar.f5664b;
            List arrayList = new ArrayList();
            if (map2.containsKey("javascriptChannelNames")) {
                arrayList = (List) map2.get("javascriptChannelNames");
            }
            z = zBooleanValue9;
            this.f1293c = new m(this.f1292b, this.f1294d, arrayList);
        } else {
            z = zBooleanValue9;
        }
        this.f1292b.addContentView(this.f1293c.f1315g, a(mVar));
        this.f1293c.a(zBooleanValue2, zBooleanValue3, zBooleanValue, zBooleanValue4, zBooleanValue5, str2, str, map, zBooleanValue6, zBooleanValue7, zBooleanValue8, z, zBooleanValue12, zBooleanValue10, zBooleanValue11, zBooleanValue13, zBooleanValue14, str3, zBooleanValue15, zBooleanValue16, zBooleanValue17);
        dVar.a(null);
    }

    private FrameLayout.LayoutParams a(f.a.a.a.m mVar) {
        if (((Map) mVar.a("rect")) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(this.f1292b, ((Number) r5.get("width")).intValue()), a(this.f1292b, ((Number) r5.get("height")).intValue()));
            layoutParams.setMargins(a(this.f1292b, ((Number) r5.get("left")).intValue()), a(this.f1292b, ((Number) r5.get("top")).intValue()), 0, 0);
            return layoutParams;
        }
        Display defaultDisplay = this.f1292b.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return new FrameLayout.LayoutParams(point.x, point.y);
    }

    private void d(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.h(mVar, dVar);
        }
        dVar.a(null);
    }

    void c(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.a(mVar, dVar);
            this.f1293c = null;
        }
    }

    private void b(o.d dVar) {
        if (this.f1293c != null) {
            dVar.a(Boolean.valueOf(this.f1293c.a()));
        } else {
            dVar.a("Webview is null", null, null);
        }
    }

    private void e(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.d(mVar, dVar);
        }
        dVar.a(null);
    }

    private void c(o.d dVar) {
        if (this.f1293c != null) {
            dVar.a(Boolean.valueOf(this.f1293c.b()));
        } else {
            dVar.a("Webview is null", null, null);
        }
    }

    private void f(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.e(mVar, dVar);
        }
        dVar.a(null);
    }

    private void g(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.c(mVar, dVar);
        }
        dVar.a(null);
    }

    private void h(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            String str = (String) mVar.a("url");
            Map<String, String> map = (Map) mVar.a("headers");
            if (map != null) {
                this.f1293c.a(str, map);
            } else {
                this.f1293c.a(str);
            }
        }
        dVar.a(null);
    }

    private void i(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.b(mVar, dVar);
        }
    }

    private void j(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.a(a(mVar));
        }
        dVar.a(null);
    }

    private void k(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.f(mVar, dVar);
        }
        dVar.a(null);
    }

    private void l(f.a.a.a.m mVar, o.d dVar) {
        if (this.f1293c != null) {
            this.f1293c.g(mVar, dVar);
        }
        dVar.a(null);
    }

    private void m(f.a.a.a.m mVar, o.d dVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new b(this));
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        dVar.a(null);
    }

    private int a(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // f.a.a.a.q.a
    public boolean onActivityResult(int i2, int i3, Intent intent) {
        if (this.f1293c == null || this.f1293c.j == null) {
            return false;
        }
        return this.f1293c.j.a(i2, i3, intent);
    }
}
