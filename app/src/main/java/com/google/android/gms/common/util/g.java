package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import b.a.a$i;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f5119a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5120b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f5121c;

    @TargetApi(a$i.AppCompatTheme_actionModeCopyDrawable)
    public static boolean a(Context context) {
        if (f5119a == null) {
            f5119a = Boolean.valueOf(i.e() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f5119a.booleanValue();
    }

    @TargetApi(a$i.AppCompatTheme_actionModeShareDrawable)
    public static boolean b(Context context) {
        if (!a(context)) {
            return false;
        }
        if (i.g()) {
            return c(context) && !i.h();
        }
        return true;
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        if (f5120b == null) {
            f5120b = Boolean.valueOf(i.f() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f5120b.booleanValue();
    }

    public static boolean d(Context context) {
        if (f5121c == null) {
            f5121c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f5121c.booleanValue();
    }
}
