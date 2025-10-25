package c.d.a.a.i.c;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.e.b f2700a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2701b;

    @Override // c.d.a.a.i.c.h
    public boolean a() {
        return true;
    }

    @Override // c.d.a.a.i.c.h
    public long b() {
        return 0L;
    }

    public i(c.d.a.a.e.b bVar, long j) {
        this.f2700a = bVar;
        this.f2701b = j;
    }

    @Override // c.d.a.a.i.c.h
    public int c(long j) {
        return this.f2700a.f1756a;
    }

    @Override // c.d.a.a.i.c.h
    public long a(long j) {
        return this.f2700a.f1760e[(int) j] - this.f2701b;
    }

    @Override // c.d.a.a.i.c.h
    public long a(long j, long j2) {
        return this.f2700a.f1759d[(int) j];
    }

    @Override // c.d.a.a.i.c.h
    public c.d.a.a.i.c.a.h b(long j) {
        return new c.d.a.a.i.c.a.h(null, this.f2700a.f1758c[(int) j], this.f2700a.f1757b[r8]);
    }

    @Override // c.d.a.a.i.c.h
    public long b(long j, long j2) {
        return this.f2700a.c(j + this.f2701b);
    }
}
