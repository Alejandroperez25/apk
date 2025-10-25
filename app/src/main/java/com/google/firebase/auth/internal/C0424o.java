package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import c.d.a.b.e.c.Oa;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0322b;

/* renamed from: com.google.firebase.auth.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424o {

    /* renamed from: a, reason: collision with root package name */
    private volatile int f5378a;

    /* renamed from: b, reason: collision with root package name */
    private final N f5379b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f5380c;

    public C0424o(c.d.b.e eVar) {
        this(eVar.c(), new N(eVar));
    }

    private C0424o(Context context, N n) {
        this.f5380c = false;
        this.f5378a = 0;
        this.f5379b = n;
        ComponentCallbacks2C0322b.a((Application) context.getApplicationContext());
        ComponentCallbacks2C0322b.a().a(new C0427r(this));
    }

    public final void a(Oa oa) {
        if (oa == null) {
            return;
        }
        long jR = oa.r();
        if (jR <= 0) {
            jR = 3600;
        }
        long jS = oa.s() + (jR * 1000);
        N n = this.f5379b;
        n.f5354c = jS;
        n.f5355d = -1L;
        if (b()) {
            this.f5379b.b();
        }
    }

    public final void a() {
        this.f5379b.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        return this.f5378a > 0 && !this.f5380c;
    }
}
