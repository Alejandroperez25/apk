package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b;

/* renamed from: com.google.firebase.auth.internal.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0427r implements ComponentCallbacks2C0322b.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0424o f5387a;

    C0427r(C0424o c0424o) {
        this.f5387a = c0424o;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b.a
    public final void a(boolean z) {
        if (z) {
            this.f5387a.f5380c = true;
            this.f5387a.a();
        } else {
            this.f5387a.f5380c = false;
            if (this.f5387a.b()) {
                this.f5387a.f5379b.b();
            }
        }
    }
}
