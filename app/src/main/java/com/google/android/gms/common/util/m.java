package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import b.a.a$i;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    private static long f5134b;

    /* renamed from: a, reason: collision with root package name */
    private static final IntentFilter f5133a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c, reason: collision with root package name */
    private static float f5135c = Float.NaN;

    @TargetApi(a$i.AppCompatTheme_actionModeCopyDrawable)
    public static int a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, f5133a);
        int i2 = ((intentRegisterReceiver == null ? 0 : intentRegisterReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return (i.e() ? powerManager.isInteractive() : powerManager.isScreenOn() ? 2 : 0) | i2;
    }

    public static synchronized float b(Context context) {
        if (SystemClock.elapsedRealtime() - f5134b < 60000 && !Float.isNaN(f5135c)) {
            return f5135c;
        }
        if (context.getApplicationContext().registerReceiver(null, f5133a) != null) {
            f5135c = r6.getIntExtra("level", -1) / r6.getIntExtra("scale", -1);
        }
        f5134b = SystemClock.elapsedRealtime();
        return f5135c;
    }
}
