package f.a.b.b;

import android.content.Context;
import android.os.Build;
import f.a.a.a.o;
import f.a.a.a.q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a implements io.flutter.embedding.engine.c.a, o.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f5759a;

    /* renamed from: b, reason: collision with root package name */
    private o f5760b;

    public static void a(q.d dVar) {
        a aVar = new a();
        aVar.f5760b = new o(dVar.f(), "plugins.flutter.io/path_provider");
        aVar.f5759a = dVar.b();
        aVar.f5760b.a(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
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
                case -1832373352: goto L3c;
                case -1208689078: goto L32;
                case 299667825: goto L28;
                case 1200320591: goto L1e;
                case 1252916648: goto L14;
                case 1711844626: goto La;
                default: goto L9;
            }
        L9:
            goto L46
        La:
            java.lang.String r1 = "getTemporaryDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 0
            goto L47
        L14:
            java.lang.String r1 = "getStorageDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 2
            goto L47
        L1e:
            java.lang.String r1 = "getApplicationDocumentsDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L28:
            java.lang.String r1 = "getExternalStorageDirectories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 4
            goto L47
        L32:
            java.lang.String r1 = "getExternalCacheDirectories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 3
            goto L47
        L3c:
            java.lang.String r1 = "getApplicationSupportDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = 5
            goto L47
        L46:
            r0 = -1
        L47:
            switch(r0) {
                case 0: goto L82;
                case 1: goto L7a;
                case 2: goto L72;
                case 3: goto L6a;
                case 4: goto L56;
                case 5: goto L4e;
                default: goto L4a;
            }
        L4a:
            r4.a()
            goto L89
        L4e:
            java.lang.String r3 = r2.b()
            r4.a(r3)
            goto L89
        L56:
            java.lang.String r0 = "type"
            java.lang.Object r3 = r3.a(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r3 = f.a.b.b.b.a(r3)
            java.util.List r3 = r2.a(r3)
            r4.a(r3)
            goto L89
        L6a:
            java.util.List r3 = r2.e()
            r4.a(r3)
            goto L89
        L72:
            java.lang.String r3 = r2.d()
            r4.a(r3)
            goto L89
        L7a:
            java.lang.String r3 = r2.c()
            r4.a(r3)
            goto L89
        L82:
            java.lang.String r3 = r2.a()
            r4.a(r3)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b.b.a.a(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    private String a() {
        return this.f5759a.getCacheDir().getPath();
    }

    private String b() {
        return f.a.c.a.a(this.f5759a);
    }

    private String c() {
        return f.a.c.a.b(this.f5759a);
    }

    private String d() {
        File externalFilesDir = this.f5759a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private List<String> e() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f5759a.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f5759a.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f5759a.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f5759a.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }
}
