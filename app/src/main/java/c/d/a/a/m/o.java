package c.d.a.a.m;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static int f3542a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3543b = true;

    public static void a(String str, String str2) {
        if (f3542a == 0) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f3542a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f3542a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f3543b) {
            c(str, a(str2, th));
        }
        if (f3542a <= 2) {
            Log.w(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (f3542a <= 3) {
            Log.e(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f3543b) {
            d(str, a(str2, th));
        }
        if (f3542a <= 3) {
            Log.e(str, str2, th);
        }
    }

    private static String a(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " - " + message;
    }
}
