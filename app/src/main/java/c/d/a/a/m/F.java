package c.d.a.a.m;

import android.annotation.TargetApi;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class F {
    public static void a(String str) {
        if (H.f3499a >= 18) {
            b(str);
        }
    }

    public static void a() {
        if (H.f3499a >= 18) {
            b();
        }
    }

    @TargetApi(18)
    private static void b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    private static void b() {
        Trace.endSection();
    }
}
