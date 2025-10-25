package c.d.c;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
class n extends H<AtomicLong> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ H f4309a;

    n(H h2) {
        this.f4309a = h2;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, AtomicLong atomicLong) {
        this.f4309a.a(dVar, Long.valueOf(atomicLong.get()));
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicLong a(c.d.c.d.b bVar) {
        return new AtomicLong(((Number) this.f4309a.a(bVar)).longValue());
    }
}
