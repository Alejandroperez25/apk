package c.d.a.b.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3751a = g.f3754a;

    /* renamed from: b, reason: collision with root package name */
    private static final e f3752b = new e();

    public static e a() {
        return f3752b;
    }

    e() {
    }

    public int a(Context context) {
        return a(context, f3751a);
    }

    public int a(Context context, int i2) {
        int iA = g.a(context, i2);
        if (g.b(context, iA)) {
            return 18;
        }
        return iA;
    }

    public boolean a(int i2) {
        return g.b(i2);
    }

    public Intent a(Context context, int i2, String str) {
        switch (i2) {
            case 1:
            case 2:
                if (context != null && com.google.android.gms.common.util.g.b(context)) {
                    return I.a();
                }
                return I.a("com.google.android.gms", a(context, str));
            case 3:
                return I.a("com.google.android.gms");
            default:
                return null;
        }
    }

    public PendingIntent a(Context context, int i2, int i3) {
        return a(context, i2, i3, null);
    }

    public PendingIntent a(Context context, int i2, int i3, String str) {
        Intent intentA = a(context, i2, str);
        if (intentA == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, intentA, 134217728);
    }

    public String b(int i2) {
        return g.a(i2);
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f3751a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.d.a.b.b.c.b.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }
}
