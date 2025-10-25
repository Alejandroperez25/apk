package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b;

/* renamed from: com.google.android.gms.common.api.internal.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0337r implements ComponentCallbacks2C0322b.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0323c f4958a;

    C0337r(C0323c c0323c) {
        this.f4958a = c0323c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b.a
    public final void a(boolean z) {
        this.f4958a.q.sendMessage(this.f4958a.q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
