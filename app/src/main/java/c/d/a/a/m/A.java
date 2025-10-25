package c.d.a.a.m;

import c.d.a.a.AbstractC0132d;

/* loaded from: classes.dex */
public final class A implements q {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0171f f3486a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3487b;

    /* renamed from: c, reason: collision with root package name */
    private long f3488c;

    /* renamed from: d, reason: collision with root package name */
    private long f3489d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.z f3490e = c.d.a.a.z.f3722a;

    public A(InterfaceC0171f interfaceC0171f) {
        this.f3486a = interfaceC0171f;
    }

    public void b() {
        if (this.f3487b) {
            return;
        }
        this.f3489d = this.f3486a.b();
        this.f3487b = true;
    }

    public void c() {
        if (this.f3487b) {
            a(a());
            this.f3487b = false;
        }
    }

    public void a(long j) {
        this.f3488c = j;
        if (this.f3487b) {
            this.f3489d = this.f3486a.b();
        }
    }

    @Override // c.d.a.a.m.q
    public long a() {
        long j = this.f3488c;
        if (!this.f3487b) {
            return j;
        }
        long jB = this.f3486a.b() - this.f3489d;
        if (this.f3490e.f3723b == 1.0f) {
            return j + AbstractC0132d.b(jB);
        }
        return j + this.f3490e.a(jB);
    }

    @Override // c.d.a.a.m.q
    public c.d.a.a.z a(c.d.a.a.z zVar) {
        if (this.f3487b) {
            a(a());
        }
        this.f3490e = zVar;
        return zVar;
    }

    @Override // c.d.a.a.m.q
    public c.d.a.a.z d() {
        return this.f3490e;
    }
}
