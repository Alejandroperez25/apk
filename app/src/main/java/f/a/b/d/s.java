package f.a.b.d;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import c.d.a.a.AbstractC0155j;
import c.d.a.a.K;
import c.d.a.a.b.j;
import c.d.a.a.l.k;
import c.d.a.a.l.u;
import f.a.a.a.g;
import io.flutter.view.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private K f5797a;

    /* renamed from: b, reason: collision with root package name */
    private Surface f5798b;

    /* renamed from: c, reason: collision with root package name */
    private final r.a f5799c;

    /* renamed from: e, reason: collision with root package name */
    private final f.a.a.a.g f5801e;

    /* renamed from: d, reason: collision with root package name */
    private p f5800d = new p();

    /* renamed from: f, reason: collision with root package name */
    private boolean f5802f = false;

    s(Context context, f.a.a.a.g gVar, r.a aVar, String str, String str2) {
        k.a sVar;
        this.f5801e = gVar;
        this.f5799c = aVar;
        this.f5797a = AbstractC0155j.a(context, new c.d.a.a.k.d());
        Uri uri = Uri.parse(str);
        if (a(uri)) {
            sVar = new u("ExoPlayer", null, 8000, 8000, true);
        } else {
            sVar = new c.d.a.a.l.s(context, "ExoPlayer");
        }
        this.f5797a.a(a(uri, sVar, str2, context));
        a(gVar, aVar);
    }

    private static boolean a(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c.d.a.a.i.w a(android.net.Uri r8, c.d.a.a.l.k.a r9, java.lang.String r10, android.content.Context r11) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = -1
            if (r10 != 0) goto L10
            java.lang.String r10 = r8.getLastPathSegment()
            int r0 = c.d.a.a.m.H.k(r10)
            goto L5b
        L10:
            int r5 = r10.hashCode()
            r6 = 3680(0xe60, float:5.157E-42)
            if (r5 == r6) goto L46
            r6 = 103407(0x193ef, float:1.44904E-40)
            if (r5 == r6) goto L3c
            r6 = 3075986(0x2eef92, float:4.310374E-39)
            if (r5 == r6) goto L32
            r6 = 106069776(0x6527f10, float:3.958996E-35)
            if (r5 == r6) goto L28
            goto L50
        L28:
            java.lang.String r5 = "other"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L50
            r10 = 3
            goto L51
        L32:
            java.lang.String r5 = "dash"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L50
            r10 = 1
            goto L51
        L3c:
            java.lang.String r5 = "hls"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L50
            r10 = 2
            goto L51
        L46:
            java.lang.String r5 = "ss"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L50
            r10 = 0
            goto L51
        L50:
            r10 = -1
        L51:
            switch(r10) {
                case 0: goto L5a;
                case 1: goto L58;
                case 2: goto L56;
                case 3: goto L5b;
                default: goto L54;
            }
        L54:
            r0 = -1
            goto L5b
        L56:
            r0 = 2
            goto L5b
        L58:
            r0 = 0
            goto L5b
        L5a:
            r0 = 1
        L5b:
            r10 = 0
            switch(r0) {
                case 0: goto La6;
                case 1: goto L92;
                case 2: goto L88;
                case 3: goto L76;
                default: goto L5f;
            }
        L5f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unsupported type: "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L76:
            c.d.a.a.i.u$a r10 = new c.d.a.a.i.u$a
            r10.<init>(r9)
            c.d.a.a.e.e r9 = new c.d.a.a.e.e
            r9.<init>()
            r10.a(r9)
            c.d.a.a.i.u r8 = r10.a(r8)
            return r8
        L88:
            c.d.a.a.i.d.m$a r10 = new c.d.a.a.i.d.m$a
            r10.<init>(r9)
            c.d.a.a.i.d.m r8 = r10.a(r8)
            return r8
        L92:
            c.d.a.a.i.e.f$a r0 = new c.d.a.a.i.e.f$a
            c.d.a.a.i.e.b$a r1 = new c.d.a.a.i.e.b$a
            r1.<init>(r9)
            c.d.a.a.l.s r2 = new c.d.a.a.l.s
            r2.<init>(r11, r10, r9)
            r0.<init>(r1, r2)
            c.d.a.a.i.e.f r8 = r0.a(r8)
            return r8
        La6:
            c.d.a.a.i.c.g$c r0 = new c.d.a.a.i.c.g$c
            c.d.a.a.i.c.j$a r1 = new c.d.a.a.i.c.j$a
            r1.<init>(r9)
            c.d.a.a.l.s r2 = new c.d.a.a.l.s
            r2.<init>(r11, r10, r9)
            r0.<init>(r1, r2)
            c.d.a.a.i.c.g r8 = r0.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b.d.s.a(android.net.Uri, c.d.a.a.l.k$a, java.lang.String, android.content.Context):c.d.a.a.i.w");
    }

    private void a(f.a.a.a.g gVar, r.a aVar) {
        gVar.a(new q(this));
        this.f5798b = new Surface(aVar.b());
        this.f5797a.a(this.f5798b);
        a(this.f5797a);
        this.f5797a.a(new r(this));
    }

    void a() {
        HashMap map = new HashMap();
        map.put("event", "bufferingUpdate");
        map.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(this.f5797a.p()))));
        this.f5800d.a(map);
    }

    private static void a(K k) {
        if (Build.VERSION.SDK_INT >= 21) {
            j.a aVar = new j.a();
            aVar.a(3);
            k.a(aVar.a());
            return;
        }
        k.a(3);
    }

    void b() {
        this.f5797a.b(true);
    }

    void c() {
        this.f5797a.b(false);
    }

    void a(boolean z) {
        this.f5797a.b(z ? 2 : 0);
    }

    void a(double d2) {
        this.f5797a.a((float) Math.max(0.0d, Math.min(1.0d, d2)));
    }

    void a(int i2) {
        this.f5797a.a(i2);
    }

    long d() {
        return this.f5797a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f5802f) {
            HashMap map = new HashMap();
            map.put("event", "initialized");
            map.put("duration", Long.valueOf(this.f5797a.o()));
            if (this.f5797a.j() != null) {
                c.d.a.a.q qVarJ = this.f5797a.j();
                int i2 = qVarJ.l;
                int i3 = qVarJ.m;
                int i4 = qVarJ.o;
                if (i4 == 90 || i4 == 270) {
                    i2 = this.f5797a.j().m;
                    i3 = this.f5797a.j().l;
                }
                map.put("width", Integer.valueOf(i2));
                map.put("height", Integer.valueOf(i3));
            }
            this.f5800d.a(map);
        }
    }

    void e() {
        if (this.f5802f) {
            this.f5797a.h();
        }
        this.f5799c.a();
        this.f5801e.a((g.c) null);
        if (this.f5798b != null) {
            this.f5798b.release();
        }
        if (this.f5797a != null) {
            this.f5797a.n();
        }
    }
}
