package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.m;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5105b;

    /* renamed from: a, reason: collision with root package name */
    private static d f5104a = new d();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5106c = false;

    public static d a() {
        return f5104a;
    }

    public void a(Context context, String str, int i2, String str2, String str3, String str4, int i3, List<String> list) {
        a(context, str, i2, str2, str3, str4, i3, list, 0L);
    }

    public void a(Context context, String str, int i2, String str2, String str3, String str4, int i3, List<String> list, long j) {
        if (b()) {
            if (TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                Log.e("WakeLockTracker", strValueOf.length() != 0 ? "missing wakeLock key. ".concat(strValueOf) : new String("missing wakeLock key. "));
            } else if (7 == i2 || 8 == i2 || 10 == i2 || 11 == i2) {
                a(context, new WakeLockEvent(System.currentTimeMillis(), i2, str2, i3, c.a(list), str, SystemClock.elapsedRealtime(), m.a(context), str3, c.a(context.getPackageName()), m.b(context), j, str4, false));
            }
        }
    }

    private static void a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(b.f5095a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e2) {
            Log.wtf("WakeLockTracker", e2);
        }
    }

    private static boolean b() {
        if (f5105b == null) {
            f5105b = false;
        }
        return f5105b.booleanValue();
    }
}
