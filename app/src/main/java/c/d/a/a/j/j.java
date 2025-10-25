package c.d.a.a.j;

import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends c.d.a.a.c.g implements d {

    /* renamed from: d, reason: collision with root package name */
    private d f3273d;

    /* renamed from: e, reason: collision with root package name */
    private long f3274e;

    public void a(long j, d dVar, long j2) {
        this.f1687b = j;
        this.f3273d = dVar;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f1687b;
        }
        this.f3274e = j2;
    }

    @Override // c.d.a.a.j.d
    public int a() {
        return this.f3273d.a();
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        return this.f3273d.a(i2) + this.f3274e;
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        return this.f3273d.a(j - this.f3274e);
    }

    @Override // c.d.a.a.j.d
    public List<a> b(long j) {
        return this.f3273d.b(j - this.f3274e);
    }

    @Override // c.d.a.a.c.a
    public void b() {
        super.b();
        this.f3273d = null;
    }
}
