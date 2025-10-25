package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f5165a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f5165a == null) {
                f5165a = (SharedPreferences) c.d.a.b.e.e.d.a(new k(context));
            }
            sharedPreferences = f5165a;
        }
        return sharedPreferences;
    }
}
