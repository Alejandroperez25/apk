package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class c implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f5153a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5154b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Boolean f5155c;

    c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f5153a = sharedPreferences;
        this.f5154b = str;
        this.f5155c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.f5153a.getBoolean(this.f5154b, this.f5155c.booleanValue()));
    }
}
