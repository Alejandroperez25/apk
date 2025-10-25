package c.d.a.a.e.h;

import c.d.a.a.b.AbstractC0130h;
import c.d.a.a.e.h.G;
import java.util.List;

/* renamed from: c.d.a.a.e.h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139f implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c.d.a.a.m.t f2151a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.m.u f2152b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2153c;

    /* renamed from: d, reason: collision with root package name */
    private String f2154d;

    /* renamed from: e, reason: collision with root package name */
    private c.d.a.a.e.q f2155e;

    /* renamed from: f, reason: collision with root package name */
    private int f2156f;

    /* renamed from: g, reason: collision with root package name */
    private int f2157g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2158h;

    /* renamed from: i, reason: collision with root package name */
    private long f2159i;
    private c.d.a.a.q j;
    private int k;
    private long l;

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public C0139f() {
        this(null);
    }

    public C0139f(String str) {
        this.f2151a = new c.d.a.a.m.t(new byte[128]);
        this.f2152b = new c.d.a.a.m.u(this.f2151a.f3563a);
        this.f2156f = 0;
        this.f2153c = str;
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        this.f2156f = 0;
        this.f2157g = 0;
        this.f2158h = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2154d = dVar.c();
        this.f2155e = iVar.a(dVar.b(), 1);
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.l = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        while (uVar.b() > 0) {
            switch (this.f2156f) {
                case 0:
                    if (!b(uVar)) {
                        break;
                    } else {
                        this.f2156f = 1;
                        this.f2152b.f3567a[0] = 11;
                        this.f2152b.f3567a[1] = 119;
                        this.f2157g = 2;
                        break;
                    }
                case 1:
                    if (!a(uVar, this.f2152b.f3567a, 128)) {
                        break;
                    } else {
                        c();
                        this.f2152b.c(0);
                        this.f2155e.a(this.f2152b, 128);
                        this.f2156f = 2;
                        break;
                    }
                case 2:
                    int iMin = Math.min(uVar.b(), this.k - this.f2157g);
                    this.f2155e.a(uVar, iMin);
                    this.f2157g += iMin;
                    if (this.f2157g != this.k) {
                        break;
                    } else {
                        this.f2155e.a(this.l, 1, this.k, 0, null);
                        this.l += this.f2159i;
                        this.f2156f = 0;
                        break;
                    }
            }
        }
    }

    private boolean a(c.d.a.a.m.u uVar, byte[] bArr, int i2) {
        int iMin = Math.min(uVar.b(), i2 - this.f2157g);
        uVar.a(bArr, this.f2157g, iMin);
        this.f2157g += iMin;
        return this.f2157g == i2;
    }

    private boolean b(c.d.a.a.m.u uVar) {
        while (true) {
            if (uVar.b() <= 0) {
                return false;
            }
            if (!this.f2158h) {
                this.f2158h = uVar.h() == 11;
            } else {
                int iH = uVar.h();
                if (iH == 119) {
                    this.f2158h = false;
                    return true;
                }
                this.f2158h = iH == 11;
            }
        }
    }

    private void c() {
        this.f2151a.a(0);
        AbstractC0130h.a aVarA = AbstractC0130h.a(this.f2151a);
        if (this.j == null || aVarA.f1564d != this.j.t || aVarA.f1563c != this.j.u || aVarA.f1561a != this.j.f3682g) {
            this.j = c.d.a.a.q.a(this.f2154d, aVarA.f1561a, (String) null, -1, -1, aVarA.f1564d, aVarA.f1563c, (List<byte[]>) null, (c.d.a.a.d.f) null, 0, this.f2153c);
            this.f2155e.a(this.j);
        }
        this.k = aVarA.f1565e;
        this.f2159i = (aVarA.f1566f * 1000000) / this.j.u;
    }
}
