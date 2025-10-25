package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import c.d.a.b.e.c.lb;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private static c.d.a.b.b.a.a f5352a = new c.d.a.b.b.a.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: b, reason: collision with root package name */
    private final c.d.b.e f5353b;

    /* renamed from: c, reason: collision with root package name */
    volatile long f5354c;

    /* renamed from: d, reason: collision with root package name */
    volatile long f5355d;

    /* renamed from: e, reason: collision with root package name */
    private long f5356e;

    /* renamed from: f, reason: collision with root package name */
    private HandlerThread f5357f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f5358g;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f5359h;

    public N(c.d.b.e eVar) {
        f5352a.a("Initializing TokenRefresher", new Object[0]);
        com.google.android.gms.common.internal.t.a(eVar);
        this.f5353b = eVar;
        this.f5357f = new HandlerThread("TokenRefresher", 10);
        this.f5357f.start();
        this.f5358g = new lb(this.f5357f.getLooper());
        this.f5359h = new Q(this, this.f5353b.d());
        this.f5356e = 300000L;
    }

    public final void b() {
        c.d.a.b.b.a.a aVar = f5352a;
        long j = this.f5354c - this.f5356e;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        aVar.a(sb.toString(), new Object[0]);
        d();
        this.f5355d = Math.max((this.f5354c - com.google.android.gms.common.util.f.b().a()) - this.f5356e, 0L) / 1000;
        this.f5358g.postDelayed(this.f5359h, this.f5355d * 1000);
    }

    final void c() {
        long j;
        int i2 = (int) this.f5355d;
        if (i2 == 30 || i2 == 60 || i2 == 120 || i2 == 240 || i2 == 480) {
            j = 2 * this.f5355d;
        } else {
            j = i2 != 960 ? 30L : 960L;
        }
        this.f5355d = j;
        this.f5354c = com.google.android.gms.common.util.f.b().a() + (this.f5355d * 1000);
        c.d.a.b.b.a.a aVar = f5352a;
        long j2 = this.f5354c;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j2);
        aVar.a(sb.toString(), new Object[0]);
        this.f5358g.postDelayed(this.f5359h, this.f5355d * 1000);
    }

    public final void d() {
        this.f5358g.removeCallbacks(this.f5359h);
    }
}
