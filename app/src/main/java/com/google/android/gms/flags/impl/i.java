package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class i implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f5162a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5163b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f5164c;

    i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f5162a = sharedPreferences;
        this.f5163b = str;
        this.f5164c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f5162a.getString(this.f5163b, this.f5164c);
    }
}
