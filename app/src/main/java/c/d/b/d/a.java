package c.d.b.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4064a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f4065b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.b.b.c f4066c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f4067d = new AtomicBoolean(b());

    public a(Context context, String str, c.d.b.b.c cVar) {
        this.f4064a = a(context);
        this.f4065b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4066c = cVar;
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || androidx.core.content.a.d(context)) ? context : androidx.core.content.a.c(context);
    }

    public boolean a() {
        return this.f4067d.get();
    }

    private boolean b() {
        ApplicationInfo applicationInfo;
        if (this.f4065b.contains("firebase_data_collection_default_enabled")) {
            return this.f4065b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f4064a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f4064a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
