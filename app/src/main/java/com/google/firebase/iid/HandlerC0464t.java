package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.firebase.iid.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class HandlerC0464t extends c.d.a.b.e.d.e {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0461q f5569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC0464t(C0461q c0461q, Looper looper) {
        super(looper);
        this.f5569a = c0461q;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f5569a.a(message);
    }
}
