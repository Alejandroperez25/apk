package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class e implements Callable<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f5156a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f5157b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Integer f5158c;

    e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f5156a = sharedPreferences;
        this.f5157b = str;
        this.f5158c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() {
        return Integer.valueOf(this.f5156a.getInt(this.f5157b, this.f5158c.intValue()));
    }
}
