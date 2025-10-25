package c.d.a.b.b.c;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3742a;

    public a(Context context) {
        this.f3742a = context;
    }

    public ApplicationInfo a(String str, int i2) {
        return this.f3742a.getPackageManager().getApplicationInfo(str, i2);
    }

    public PackageInfo b(String str, int i2) {
        return this.f3742a.getPackageManager().getPackageInfo(str, i2);
    }

    public int a(String str, String str2) {
        return this.f3742a.getPackageManager().checkPermission(str, str2);
    }

    public CharSequence a(String str) {
        return this.f3742a.getPackageManager().getApplicationLabel(this.f3742a.getPackageManager().getApplicationInfo(str, 0));
    }
}
