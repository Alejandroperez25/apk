package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350k {

    /* renamed from: a, reason: collision with root package name */
    private final String f5054a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5055b;

    public C0350k(String str, String str2) {
        t.a(str, (Object) "log tag cannot be null");
        t.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f5054a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f5055b = null;
        } else {
            this.f5055b = str2;
        }
    }

    public C0350k(String str) {
        this(str, null);
    }

    public final boolean a(int i2) {
        return Log.isLoggable(this.f5054a, i2);
    }

    public final void a(String str, String str2) {
        if (a(3)) {
            Log.d(str, a(str2));
        }
    }

    public final void b(String str, String str2) {
        if (a(2)) {
            Log.v(str, a(str2));
        }
    }

    public final void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, a(str2));
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, a(str2), th);
        }
    }

    private final String a(String str) {
        return this.f5055b == null ? str : this.f5055b.concat(str);
    }
}
