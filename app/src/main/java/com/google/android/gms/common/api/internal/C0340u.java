package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C0323c;
import com.google.android.gms.common.internal.AbstractC0343c;

/* renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0340u implements AbstractC0343c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0323c.a f4961a;

    C0340u(C0323c.a aVar) {
        this.f4961a = aVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c.e
    public final void a() {
        C0323c.this.q.post(new v(this));
    }
}
