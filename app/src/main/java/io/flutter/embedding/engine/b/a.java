package io.flutter.embedding.engine.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5985a = a.class.getName() + ".aot-shared-library-name";

    /* renamed from: b, reason: collision with root package name */
    private static final String f5986b = a.class.getName() + ".vm-snapshot-data";

    /* renamed from: c, reason: collision with root package name */
    private static final String f5987c = a.class.getName() + ".isolate-snapshot-data";

    /* renamed from: d, reason: collision with root package name */
    private static final String f5988d = a.class.getName() + ".flutter-assets-dir";

    /* renamed from: e, reason: collision with root package name */
    private static a f5989e;

    /* renamed from: f, reason: collision with root package name */
    private String f5990f = "libapp.so";

    /* renamed from: g, reason: collision with root package name */
    private String f5991g = "vm_snapshot_data";

    /* renamed from: h, reason: collision with root package name */
    private String f5992h = "isolate_snapshot_data";

    /* renamed from: i, reason: collision with root package name */
    private String f5993i = "flutter_assets";
    private boolean j = false;
    private e k;
    private C0071a l;

    public static a a() {
        if (f5989e == null) {
            f5989e = new a();
        }
        return f5989e;
    }

    public void a(Context context) {
        a(context, new C0071a());
    }

    public void a(Context context, C0071a c0071a) {
        if (this.l != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Context applicationContext = context.getApplicationContext();
        this.l = c0071a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        c(applicationContext);
        d(applicationContext);
        System.loadLibrary("flutter");
        u.a((WindowManager) applicationContext.getSystemService("window")).a();
        FlutterJNI.nativeRecordStartTimestamp(SystemClock.uptimeMillis() - jUptimeMillis);
    }

    public void a(Context context, String[] strArr) {
        if (this.j) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.l == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            if (this.k != null) {
                this.k.a();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
            ApplicationInfo applicationInfoB = b(context);
            arrayList.add("--icu-native-lib-path=" + applicationInfoB.nativeLibraryDir + File.separator + "libflutter.so");
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            arrayList.add("--aot-shared-library-name=" + this.f5990f);
            arrayList.add("--aot-shared-library-name=" + applicationInfoB.nativeLibraryDir + File.separator + this.f5990f);
            StringBuilder sb = new StringBuilder();
            sb.append("--cache-dir-path=");
            sb.append(f.a.c.a.c(context));
            arrayList.add(sb.toString());
            if (this.l.a() != null) {
                arrayList.add("--log-tag=" + this.l.a());
            }
            FlutterJNI.nativeInit(context, (String[]) arrayList.toArray(new String[0]), null, f.a.c.a.a(context), f.a.c.a.c(context));
            this.j = true;
        } catch (Exception e2) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    private ApplicationInfo b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void c(Context context) {
        Bundle bundle = b(context).metaData;
        if (bundle == null) {
            return;
        }
        this.f5990f = bundle.getString(f5985a, "libapp.so");
        this.f5993i = bundle.getString(f5988d, "flutter_assets");
        this.f5991g = bundle.getString(f5986b, "vm_snapshot_data");
        this.f5992h = bundle.getString(f5987c, "isolate_snapshot_data");
    }

    private void d(Context context) {
        new d(context).a();
    }

    public String b() {
        return this.f5993i;
    }

    public String a(String str) {
        return b(str);
    }

    public String a(String str, String str2) {
        return a("packages" + File.separator + str2 + File.separator + str);
    }

    private String b(String str) {
        return this.f5993i + File.separator + str;
    }

    /* renamed from: io.flutter.embedding.engine.b.a$a, reason: collision with other inner class name */
    public static class C0071a {

        /* renamed from: a, reason: collision with root package name */
        private String f5994a;

        public String a() {
            return this.f5994a;
        }
    }
}
