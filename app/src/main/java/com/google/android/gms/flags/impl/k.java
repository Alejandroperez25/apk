package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class k implements Callable<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f5166a;

    k(Context context) {
        this.f5166a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() {
        return this.f5166a.getSharedPreferences("google_sdk_flags", 0);
    }
}
