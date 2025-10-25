package d.a;

import f.a.a.a.o;
import f.a.a.a.q;

/* loaded from: classes.dex */
public final class c implements io.flutter.embedding.engine.c.a, o.c, io.flutter.embedding.engine.c.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5638a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private q.d f5639b;

    /* renamed from: c, reason: collision with root package name */
    private d.a.a f5640c;

    public static final void a(q.d dVar) {
        f5638a.a(dVar);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g.b.a.b bVar) {
            this();
        }

        public final void a(q.d dVar) {
            g.b.a.c.b(dVar, "registrar");
            o oVar = new o(dVar.f(), "wakelock");
            c cVar = new c();
            cVar.f5639b = dVar;
            cVar.f5640c = new d.a.a();
            oVar.a(cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r5, f.a.a.a.o.d r6) {
        /*
            r4 = this;
            java.lang.String r0 = "call"
            g.b.a.c.b(r5, r0)
            java.lang.String r0 = "result"
            g.b.a.c.b(r6, r0)
            f.a.a.a.q$d r0 = r4.f5639b
            r1 = 0
            if (r0 == 0) goto L27
            d.a.a r0 = r4.f5640c
            if (r0 == 0) goto L23
            f.a.a.a.q$d r2 = r4.f5639b
            if (r2 == 0) goto L1f
            android.app.Activity r2 = r2.d()
            r0.a(r2)
            goto L27
        L1f:
            g.b.a.c.a()
            throw r1
        L23:
            g.b.a.c.a()
            throw r1
        L27:
            java.lang.String r0 = r5.f5663a
            if (r0 != 0) goto L2c
            goto L7a
        L2c:
            int r2 = r0.hashCode()
            r3 = -868304044(0xffffffffcc3ebb54, float:-4.9999184E7)
            if (r2 == r3) goto L4f
            r5 = 2105594551(0x7d80d2b7, float:2.140441E37)
            if (r2 == r5) goto L3b
            goto L7a
        L3b:
            java.lang.String r5 = "isEnabled"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L7a
            d.a.a r5 = r4.f5640c
            if (r5 == 0) goto L4b
            r5.a(r6)
            goto L7d
        L4b:
            g.b.a.c.a()
            throw r1
        L4f:
            java.lang.String r2 = "toggle"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7a
            d.a.a r0 = r4.f5640c
            if (r0 == 0) goto L76
            java.lang.String r2 = "enable"
            java.lang.Object r5 = r5.a(r2)
            if (r5 == 0) goto L72
            java.lang.String r2 = "call.argument<Boolean>(\"enable\")!!"
            g.b.a.c.a(r5, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0.a(r5, r6)
            goto L7d
        L72:
            g.b.a.c.a()
            throw r1
        L76:
            g.b.a.c.a()
            throw r1
        L7a:
            r6.a()
        L7d:
            f.a.a.a.q$d r5 = r4.f5639b
            if (r5 == 0) goto L8f
            d.a.a r5 = r4.f5640c
            if (r5 == 0) goto L8b
            android.app.Activity r1 = (android.app.Activity) r1
            r5.a(r1)
            goto L8f
        L8b:
            g.b.a.c.a()
            throw r1
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.c.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }
}
