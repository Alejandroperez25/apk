package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f5112a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b, reason: collision with root package name */
    private static DropBoxManager f5113b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5114c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f5115d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static int f5116e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f5117f = 0;

    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i2) {
        try {
            t.a(context);
            t.a(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
