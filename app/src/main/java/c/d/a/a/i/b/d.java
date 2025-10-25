package c.d.a.a.i.b;

import android.net.Uri;
import c.d.a.a.l.B;
import c.d.a.a.l.F;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.q;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d implements B.d {

    /* renamed from: a, reason: collision with root package name */
    public final c.d.a.a.l.n f2526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2527b;

    /* renamed from: c, reason: collision with root package name */
    public final q f2528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2529d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2530e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2531f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2532g;

    /* renamed from: h, reason: collision with root package name */
    protected final F f2533h;

    public d(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, int i2, q qVar, int i3, Object obj, long j, long j2) {
        this.f2533h = new F(kVar);
        AbstractC0170e.a(nVar);
        this.f2526a = nVar;
        this.f2527b = i2;
        this.f2528c = qVar;
        this.f2529d = i3;
        this.f2530e = obj;
        this.f2531f = j;
        this.f2532g = j2;
    }

    public final long c() {
        return this.f2532g - this.f2531f;
    }

    public final long d() {
        return this.f2533h.d();
    }

    public final Uri e() {
        return this.f2533h.e();
    }

    public final Map<String, List<String>> f() {
        return this.f2533h.f();
    }
}
