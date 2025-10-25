package c.d.c.b.a;

import java.io.IOException;

/* renamed from: c.d.c.b.a.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255v<T> extends c.d.c.H<T> {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.c.B<T> f4183a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.c.t<T> f4184b;

    /* renamed from: c, reason: collision with root package name */
    final c.d.c.p f4185c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.c.c.a<T> f4186d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.c.I f4187e;

    /* renamed from: f, reason: collision with root package name */
    private final C0255v<T>.a f4188f = new a();

    /* renamed from: g, reason: collision with root package name */
    private c.d.c.H<T> f4189g;

    public C0255v(c.d.c.B<T> b2, c.d.c.t<T> tVar, c.d.c.p pVar, c.d.c.c.a<T> aVar, c.d.c.I i2) {
        this.f4183a = b2;
        this.f4184b = tVar;
        this.f4185c = pVar;
        this.f4186d = aVar;
        this.f4187e = i2;
    }

    @Override // c.d.c.H
    public T a(c.d.c.d.b bVar) {
        if (this.f4184b == null) {
            return b().a(bVar);
        }
        c.d.c.u uVarA = c.d.c.b.D.a(bVar);
        if (uVarA.f()) {
            return null;
        }
        return this.f4184b.a(uVarA, this.f4186d.b(), this.f4188f);
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, T t) throws IOException {
        if (this.f4183a == null) {
            b().a(dVar, t);
        } else if (t == null) {
            dVar.h();
        } else {
            c.d.c.b.D.a(this.f4183a.a(t, this.f4186d.b(), this.f4188f), dVar);
        }
    }

    private c.d.c.H<T> b() {
        c.d.c.H<T> h2 = this.f4189g;
        if (h2 != null) {
            return h2;
        }
        c.d.c.H<T> hA = this.f4185c.a(this.f4187e, this.f4186d);
        this.f4189g = hA;
        return hA;
    }

    /* renamed from: c.d.c.b.a.v$a */
    private final class a implements c.d.c.A, c.d.c.s {
        private a() {
        }
    }
}
