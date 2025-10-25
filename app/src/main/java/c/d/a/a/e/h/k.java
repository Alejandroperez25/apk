package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    private final List<G.a> f2189a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.e.q[] f2190b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2191c;

    /* renamed from: d, reason: collision with root package name */
    private int f2192d;

    /* renamed from: e, reason: collision with root package name */
    private int f2193e;

    /* renamed from: f, reason: collision with root package name */
    private long f2194f;

    public k(List<G.a> list) {
        this.f2189a = list;
        this.f2190b = new c.d.a.a.e.q[list.size()];
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        this.f2191c = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        for (int i2 = 0; i2 < this.f2190b.length; i2++) {
            G.a aVar = this.f2189a.get(i2);
            dVar.a();
            c.d.a.a.e.q qVarA = iVar.a(dVar.b(), 3);
            qVarA.a(c.d.a.a.q.a(dVar.c(), "application/dvbsubs", (String) null, -1, 0, (List<byte[]>) Collections.singletonList(aVar.f2129c), aVar.f2127a, (c.d.a.a.d.f) null));
            this.f2190b[i2] = qVarA;
        }
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f2191c = true;
        this.f2194f = j;
        this.f2193e = 0;
        this.f2192d = 2;
    }

    @Override // c.d.a.a.e.h.l
    public void b() {
        if (this.f2191c) {
            for (c.d.a.a.e.q qVar : this.f2190b) {
                qVar.a(this.f2194f, 1, this.f2193e, 0, null);
            }
            this.f2191c = false;
        }
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        if (this.f2191c) {
            if (this.f2192d != 2 || a(uVar, 32)) {
                if (this.f2192d != 1 || a(uVar, 0)) {
                    int iD = uVar.d();
                    int iB = uVar.b();
                    for (c.d.a.a.e.q qVar : this.f2190b) {
                        uVar.c(iD);
                        qVar.a(uVar, iB);
                    }
                    this.f2193e += iB;
                }
            }
        }
    }

    private boolean a(c.d.a.a.m.u uVar, int i2) {
        if (uVar.b() == 0) {
            return false;
        }
        if (uVar.h() != i2) {
            this.f2191c = false;
        }
        this.f2192d--;
        return this.f2191c;
    }
}
