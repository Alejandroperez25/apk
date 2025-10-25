package c.d.a.a.e.g;

import c.d.a.a.e.g;
import c.d.a.a.e.h;
import c.d.a.a.e.i;
import c.d.a.a.e.n;
import c.d.a.a.e.o;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.q;
import c.d.a.a.x;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2080a = H.h("RCC\u0001");

    /* renamed from: b, reason: collision with root package name */
    private final q f2081b;

    /* renamed from: d, reason: collision with root package name */
    private c.d.a.a.e.q f2083d;

    /* renamed from: f, reason: collision with root package name */
    private int f2085f;

    /* renamed from: g, reason: collision with root package name */
    private long f2086g;

    /* renamed from: h, reason: collision with root package name */
    private int f2087h;

    /* renamed from: i, reason: collision with root package name */
    private int f2088i;

    /* renamed from: c, reason: collision with root package name */
    private final u f2082c = new u(9);

    /* renamed from: e, reason: collision with root package name */
    private int f2084e = 0;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    public a(q qVar) {
        this.f2081b = qVar;
    }

    @Override // c.d.a.a.e.g
    public void a(i iVar) {
        iVar.a(new o.b(-9223372036854775807L));
        this.f2083d = iVar.a(0, 3);
        iVar.a();
        this.f2083d.a(this.f2081b);
    }

    @Override // c.d.a.a.e.g
    public boolean a(h hVar) {
        this.f2082c.a();
        hVar.a(this.f2082c.f3567a, 0, 8);
        return this.f2082c.p() == f2080a;
    }

    @Override // c.d.a.a.e.g
    public int a(h hVar, n nVar) {
        while (true) {
            switch (this.f2084e) {
                case 0:
                    if (!b(hVar)) {
                        return -1;
                    }
                    this.f2084e = 1;
                    break;
                case 1:
                    if (c(hVar)) {
                        this.f2084e = 2;
                        break;
                    } else {
                        this.f2084e = 0;
                        return -1;
                    }
                case 2:
                    d(hVar);
                    this.f2084e = 1;
                    return 0;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.f2084e = 0;
    }

    private boolean b(h hVar) throws IOException {
        this.f2082c.a();
        if (!hVar.a(this.f2082c.f3567a, 0, 8, true)) {
            return false;
        }
        if (this.f2082c.p() != f2080a) {
            throw new IOException("Input not RawCC");
        }
        this.f2085f = this.f2082c.h();
        return true;
    }

    private boolean c(h hVar) throws x {
        this.f2082c.a();
        if (this.f2085f == 0) {
            if (!hVar.a(this.f2082c.f3567a, 0, 5, true)) {
                return false;
            }
            this.f2086g = (this.f2082c.n() * 1000) / 45;
        } else if (this.f2085f == 1) {
            if (!hVar.a(this.f2082c.f3567a, 0, 9, true)) {
                return false;
            }
            this.f2086g = this.f2082c.r();
        } else {
            throw new x("Unsupported version number: " + this.f2085f);
        }
        this.f2087h = this.f2082c.h();
        this.f2088i = 0;
        return true;
    }

    private void d(h hVar) {
        while (this.f2087h > 0) {
            this.f2082c.a();
            hVar.readFully(this.f2082c.f3567a, 0, 3);
            this.f2083d.a(this.f2082c, 3);
            this.f2088i += 3;
            this.f2087h--;
        }
        if (this.f2088i > 0) {
            this.f2083d.a(this.f2086g, 1, this.f2088i, 0, null);
        }
    }
}
