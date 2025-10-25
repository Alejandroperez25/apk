package c.d.a.a.j.a;

import c.d.a.a.m.AbstractC0170e;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class g implements c.d.a.a.j.d {

    /* renamed from: a, reason: collision with root package name */
    private final List<c.d.a.a.j.a> f3122a;

    @Override // c.d.a.a.j.d
    public int a() {
        return 1;
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public g(List<c.d.a.a.j.a> list) {
        this.f3122a = list;
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        AbstractC0170e.a(i2 == 0);
        return 0L;
    }

    @Override // c.d.a.a.j.d
    public List<c.d.a.a.j.a> b(long j) {
        return j >= 0 ? this.f3122a : Collections.emptyList();
    }
}
