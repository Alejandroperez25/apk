package com.google.android.gms.common.util;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class o {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
