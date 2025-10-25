package io.flutter.plugins.firebase.core;

import android.content.Context;
import c.d.b.e;
import c.d.b.j;
import f.a.a.a.o;
import f.a.a.a.q;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements io.flutter.embedding.engine.c.a, o.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f6188a;

    public static void a(q.d dVar) {
        new o(dVar.f(), "plugins.flutter.io/firebase_core").a(new a(dVar.b()));
    }

    private a(Context context) {
        this.f6188a = context;
    }

    private Map<String, Object> a(e eVar) {
        HashMap map = new HashMap();
        map.put("name", eVar.d());
        j jVarE = eVar.e();
        HashMap map2 = new HashMap();
        map2.put("googleAppID", jVarE.b());
        map2.put("GCMSenderID", jVarE.d());
        map2.put("APIKey", jVarE.a());
        map2.put("databaseURL", jVarE.c());
        map2.put("storageBucket", jVarE.e());
        map2.put("projectID", jVarE.f());
        map.put("options", map2);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // f.a.a.a.o.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f.a.a.a.m r5, f.a.a.a.o.d r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f5663a
            int r1 = r0.hashCode()
            r2 = -2051749503(0xffffffff85b4c981, float:-1.700114E-35)
            if (r1 == r2) goto L2a
            r2 = -1323159523(0xffffffffb122301d, float:-2.3601452E-9)
            if (r1 == r2) goto L20
            r2 = 2031988394(0x791daeaa, float:5.1170826E34)
            if (r1 == r2) goto L16
            goto L34
        L16:
            java.lang.String r1 = "FirebaseApp#allApps"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = 1
            goto L35
        L20:
            java.lang.String r1 = "FirebaseApp#configure"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = 0
            goto L35
        L2a:
            java.lang.String r1 = "FirebaseApp#appNamed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = 2
            goto L35
        L34:
            r0 = -1
        L35:
            r1 = 0
            switch(r0) {
                case 0: goto L7d;
                case 1: goto L56;
                case 2: goto L3e;
                default: goto L39;
            }
        L39:
            r6.a()
            goto Le6
        L3e:
            java.lang.Object r5 = r5.a()
            java.lang.String r5 = (java.lang.String) r5
            c.d.b.e r5 = c.d.b.e.a(r5)     // Catch: java.lang.IllegalStateException -> L51
            java.util.Map r5 = r4.a(r5)     // Catch: java.lang.IllegalStateException -> L51
            r6.a(r5)     // Catch: java.lang.IllegalStateException -> L51
            goto Le6
        L51:
            r6.a(r1)
            goto Le6
        L56:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.Context r0 = r4.f6188a
            java.util.List r0 = c.d.b.e.a(r0)
            java.util.Iterator r0 = r0.iterator()
        L65:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            c.d.b.e r1 = (c.d.b.e) r1
            java.util.Map r1 = r4.a(r1)
            r5.add(r1)
            goto L65
        L79:
            r6.a(r5)
            goto Le6
        L7d:
            java.lang.Object r5 = r5.a()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r0 = "name"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "options"
            java.lang.Object r5 = r5.get(r2)
            java.util.Map r5 = (java.util.Map) r5
            c.d.b.j$a r2 = new c.d.b.j$a
            r2.<init>()
            java.lang.String r3 = "APIKey"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.a(r3)
            java.lang.String r3 = "googleAppID"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.b(r3)
            java.lang.String r3 = "databaseURL"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.c(r3)
            java.lang.String r3 = "GCMSenderID"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.d(r3)
            java.lang.String r3 = "projectID"
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.f(r3)
            java.lang.String r3 = "storageBucket"
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            r2.e(r5)
            c.d.b.j r5 = r2.a()
            android.content.Context r2 = r4.f6188a
            c.d.b.e.a(r2, r5, r0)
            r6.a(r1)
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.core.a.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }
}
