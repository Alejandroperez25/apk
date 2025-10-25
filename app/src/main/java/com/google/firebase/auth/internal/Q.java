package com.google.firebase.auth.internal;

import com.google.firebase.auth.C0439u;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final String f5362a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f5363b;

    Q(N n, String str) {
        this.f5363b = n;
        com.google.android.gms.common.internal.t.a(str);
        this.f5362a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        c.d.b.e eVarA = c.d.b.e.a(this.f5362a);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(eVarA);
        AbstractC0417h.a(eVarA.c());
        try {
            zBooleanValue = AbstractC0417h.f5370a.c().booleanValue();
        } catch (SecurityException unused) {
            zBooleanValue = true;
        }
        if (firebaseAuth.a() == null || !zBooleanValue) {
            return;
        }
        c.d.a.b.h.h<C0439u> hVarA = firebaseAuth.a(true);
        N.f5352a.a("Token refreshing started", new Object[0]);
        hVarA.a(new P(this));
    }
}
