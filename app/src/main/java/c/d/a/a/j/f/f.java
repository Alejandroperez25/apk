package c.d.a.a.j.f;

import c.d.a.a.m.H;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class f implements c.d.a.a.j.d {

    /* renamed from: a, reason: collision with root package name */
    private final b f3226a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f3227b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, e> f3228c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, c> f3229d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f3230e;

    public f(b bVar, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        this.f3226a = bVar;
        this.f3229d = map2;
        this.f3230e = map3;
        this.f3228c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f3227b = bVar.b();
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        int iB = H.b(this.f3227b, j, false, false);
        if (iB < this.f3227b.length) {
            return iB;
        }
        return -1;
    }

    @Override // c.d.a.a.j.d
    public int a() {
        return this.f3227b.length;
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        return this.f3227b[i2];
    }

    @Override // c.d.a.a.j.d
    public List<c.d.a.a.j.a> b(long j) {
        return this.f3226a.a(j, this.f3228c, this.f3229d, this.f3230e);
    }
}
