package c.d.a.a.j.g;

import c.d.a.a.j.d;
import c.d.a.a.m.AbstractC0170e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3231a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final List<c.d.a.a.j.a> f3232b;

    @Override // c.d.a.a.j.d
    public int a() {
        return 1;
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public b(c.d.a.a.j.a aVar) {
        this.f3232b = Collections.singletonList(aVar);
    }

    private b() {
        this.f3232b = Collections.emptyList();
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        AbstractC0170e.a(i2 == 0);
        return 0L;
    }

    @Override // c.d.a.a.j.d
    public List<c.d.a.a.j.a> b(long j) {
        return j >= 0 ? this.f3232b : Collections.emptyList();
    }
}
