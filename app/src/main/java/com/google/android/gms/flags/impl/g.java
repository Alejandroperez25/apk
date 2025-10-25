package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class g implements Callable<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f5159a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5160b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Long f5161c;

    g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f5159a = sharedPreferences;
        this.f5160b = str;
        this.f5161c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return Long.valueOf(this.f5159a.getLong(this.f5160b, this.f5161c.longValue()));
    }
}
