package c.d.a.a.j.b;

import c.d.a.a.j.d;
import java.util.List;

/* loaded from: classes.dex */
final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final List<c.d.a.a.j.a> f3177a;

    @Override // c.d.a.a.j.d
    public int a() {
        return 1;
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        return -1;
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        return 0L;
    }

    public c(List<c.d.a.a.j.a> list) {
        this.f3177a = list;
    }

    @Override // c.d.a.a.j.d
    public List<c.d.a.a.j.a> b(long j) {
        return this.f3177a;
    }
}
