package io.flutter.plugins.urllauncher;

import android.os.Bundle;
import android.util.Log;
import f.a.a.a.m;
import f.a.a.a.o;
import io.flutter.plugins.urllauncher.b;
import java.util.Map;

/* loaded from: classes.dex */
final class a implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private final b f6236a;

    /* renamed from: b, reason: collision with root package name */
    private o f6237b;

    a(b bVar) {
        this.f6236a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r5, f.a.a.a.o.d r6) {
        /*
            r4 = this;
            java.lang.String r0 = "url"
            java.lang.Object r0 = r5.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r5.f5663a
            int r2 = r1.hashCode()
            r3 = -1109843021(0xffffffffbdd923b3, float:-0.10602512)
            if (r2 == r3) goto L32
            r3 = -185306205(0xfffffffff4f473a3, float:-1.5493968E32)
            if (r2 == r3) goto L28
            r3 = -121617663(0xfffffffff8c04301, float:-3.119625E34)
            if (r2 == r3) goto L1e
            goto L3c
        L1e:
            java.lang.String r2 = "closeWebView"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3c
            r1 = 2
            goto L3d
        L28:
            java.lang.String r2 = "canLaunch"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3c
            r1 = 0
            goto L3d
        L32:
            java.lang.String r2 = "launch"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = -1
        L3d:
            switch(r1) {
                case 0: goto L4c;
                case 1: goto L48;
                case 2: goto L44;
                default: goto L40;
            }
        L40:
            r6.a()
            goto L4f
        L44:
            r4.a(r6)
            goto L4f
        L48:
            r4.a(r5, r6, r0)
            goto L4f
        L4c:
            r4.a(r6, r0)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.urllauncher.a.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    void a(f.a.a.a.e eVar) {
        if (this.f6237b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            a();
        }
        this.f6237b = new o(eVar, "plugins.flutter.io/url_launcher");
        this.f6237b.a(this);
    }

    void a() {
        if (this.f6237b == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            this.f6237b.a((o.c) null);
            this.f6237b = null;
        }
    }

    private void a(o.d dVar, String str) {
        dVar.a(Boolean.valueOf(this.f6236a.a(str)));
    }

    private void a(m mVar, o.d dVar, String str) {
        boolean zBooleanValue = ((Boolean) mVar.a("useWebView")).booleanValue();
        boolean zBooleanValue2 = ((Boolean) mVar.a("enableJavaScript")).booleanValue();
        boolean zBooleanValue3 = ((Boolean) mVar.a("enableDomStorage")).booleanValue();
        if (this.f6236a.a(str, a((Map<String, String>) mVar.a("headers")), zBooleanValue, zBooleanValue2, zBooleanValue3) == b.a.NO_ACTIVITY) {
            dVar.a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        } else {
            dVar.a(true);
        }
    }

    private void a(o.d dVar) {
        this.f6236a.a();
        dVar.a(null);
    }

    private static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }
}
