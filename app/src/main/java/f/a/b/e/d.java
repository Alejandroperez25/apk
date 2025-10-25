package f.a.b.e;

import android.os.Build;
import android.webkit.CookieManager;
import f.a.a.a.o;

/* loaded from: classes.dex */
class d implements o.c {
    private d() {
    }

    static void a(f.a.a.a.e eVar) {
        new f.a.a.a.o(eVar, "plugins.flutter.io/cookie_manager").a(new d());
    }

    @Override // f.a.a.a.o.c
    public void a(f.a.a.a.m mVar, o.d dVar) {
        String str = mVar.f5663a;
        if (((str.hashCode() == 928375682 && str.equals("clearCookies")) ? (char) 0 : (char) 65535) == 0) {
            a(dVar);
        } else {
            dVar.a();
        }
    }

    private static void a(o.d dVar) {
        CookieManager cookieManager = CookieManager.getInstance();
        boolean zHasCookies = cookieManager.hasCookies();
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.removeAllCookies(new c(dVar, zHasCookies));
        } else {
            cookieManager.removeAllCookie();
            dVar.a(Boolean.valueOf(zHasCookies));
        }
    }
}
