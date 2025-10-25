package c.d.a.a.i.c;

import c.d.a.a.i.A;
import c.d.a.a.m.H;
import c.d.a.a.q;
import c.d.a.a.r;
import java.io.IOException;

/* loaded from: classes.dex */
final class k implements A {

    /* renamed from: a, reason: collision with root package name */
    private final q f2719a;

    /* renamed from: c, reason: collision with root package name */
    private long[] f2721c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2722d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.i.c.a.e f2723e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2724f;

    /* renamed from: g, reason: collision with root package name */
    private int f2725g;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.g.a.d f2720b = new c.d.a.a.g.a.d();

    /* renamed from: h, reason: collision with root package name */
    private long f2726h = -9223372036854775807L;

    @Override // c.d.a.a.i.A
    public void a() {
    }

    @Override // c.d.a.a.i.A
    public boolean c() {
        return true;
    }

    public k(c.d.a.a.i.c.a.e eVar, q qVar, boolean z) {
        this.f2719a = qVar;
        this.f2723e = eVar;
        this.f2721c = eVar.f2607b;
        a(eVar, z);
    }

    public String b() {
        return this.f2723e.a();
    }

    public void a(c.d.a.a.i.c.a.e eVar, boolean z) {
        long j = this.f2725g == 0 ? -9223372036854775807L : this.f2721c[this.f2725g - 1];
        this.f2722d = z;
        this.f2723e = eVar;
        this.f2721c = eVar.f2607b;
        if (this.f2726h != -9223372036854775807L) {
            a(this.f2726h);
        } else if (j != -9223372036854775807L) {
            this.f2725g = H.b(this.f2721c, j, false, false);
        }
    }

    public void a(long j) {
        boolean z = false;
        this.f2725g = H.b(this.f2721c, j, true, false);
        if (this.f2722d && this.f2725g == this.f2721c.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f2726h = j;
    }

    @Override // c.d.a.a.i.A
    public int a(r rVar, c.d.a.a.c.f fVar, boolean z) throws IOException {
        if (z || !this.f2724f) {
            rVar.f3685a = this.f2719a;
            this.f2724f = true;
            return -5;
        }
        if (this.f2725g == this.f2721c.length) {
            if (this.f2722d) {
                return -3;
            }
            fVar.b(4);
            return -4;
        }
        int i2 = this.f2725g;
        this.f2725g = i2 + 1;
        byte[] bArrA = this.f2720b.a(this.f2723e.f2606a[i2]);
        if (bArrA == null) {
            return -3;
        }
        fVar.f(bArrA.length);
        fVar.b(1);
        fVar.f1684c.put(bArrA);
        fVar.f1685d = this.f2721c[i2];
        return -4;
    }

    @Override // c.d.a.a.i.A
    public int d(long j) {
        int iMax = Math.max(this.f2725g, H.b(this.f2721c, j, true, false));
        int i2 = iMax - this.f2725g;
        this.f2725g = iMax;
        return i2;
    }
}
