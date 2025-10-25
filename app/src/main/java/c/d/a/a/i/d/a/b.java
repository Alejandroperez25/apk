package c.d.a.a.i.d.a;

import c.d.a.a.l.D;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    private final List<c.d.a.a.h.c> f2748a;

    public b() {
        this(Collections.emptyList());
    }

    public b(List<c.d.a.a.h.c> list) {
        this.f2748a = list;
    }

    @Override // c.d.a.a.i.d.a.h
    public D.a<f> a() {
        return new c.d.a.a.h.b(new g(), this.f2748a);
    }

    @Override // c.d.a.a.i.d.a.h
    public D.a<f> a(d dVar) {
        return new c.d.a.a.h.b(new g(dVar), this.f2748a);
    }
}
