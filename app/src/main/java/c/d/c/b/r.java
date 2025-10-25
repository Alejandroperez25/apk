package c.d.c.b;

import java.io.IOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
class r<T> extends c.d.c.H<T> {

    /* renamed from: a, reason: collision with root package name */
    private c.d.c.H<T> f4230a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4231b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f4232c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.d.c.p f4233d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c.d.c.c.a f4234e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f4235f;

    r(s sVar, boolean z, boolean z2, c.d.c.p pVar, c.d.c.c.a aVar) {
        this.f4235f = sVar;
        this.f4231b = z;
        this.f4232c = z2;
        this.f4233d = pVar;
        this.f4234e = aVar;
    }

    @Override // c.d.c.H
    public T a(c.d.c.d.b bVar) throws c.d.c.d.e {
        if (this.f4231b) {
            bVar.p();
            return null;
        }
        return b().a(bVar);
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, T t) throws IOException {
        if (this.f4232c) {
            dVar.h();
        } else {
            b().a(dVar, t);
        }
    }

    private c.d.c.H<T> b() {
        c.d.c.H<T> h2 = this.f4230a;
        if (h2 != null) {
            return h2;
        }
        c.d.c.H<T> hA = this.f4233d.a(this.f4235f, this.f4234e);
        this.f4230a = hA;
        return hA;
    }
}
