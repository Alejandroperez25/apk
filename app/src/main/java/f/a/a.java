package f.a;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(String str, String str2) {
    }

    public static void b(String str, String str2) {
    }

    public static void c(String str, String str2) {
        Log.w(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
