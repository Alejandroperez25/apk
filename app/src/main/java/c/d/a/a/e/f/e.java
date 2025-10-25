package c.d.a.a.e.f;

import c.d.a.a.e.q;
import c.d.a.a.m.u;
import c.d.a.a.x;

/* loaded from: classes.dex */
public class e implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f2021a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.f.a
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return e.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private c.d.a.a.e.i f2022b;

    /* renamed from: c, reason: collision with root package name */
    private k f2023c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2024d;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new e()};
    }

    @Override // c.d.a.a.e.g
    public boolean a(c.d.a.a.e.h hVar) {
        try {
            return b(hVar);
        } catch (x unused) {
            return false;
        }
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.f2022b = iVar;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        if (this.f2023c != null) {
            this.f2023c.a(j, j2);
        }
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) throws x {
        if (this.f2023c == null) {
            if (!b(hVar)) {
                throw new x("Failed to determine bitstream type");
            }
            hVar.b();
        }
        if (!this.f2024d) {
            q qVarA = this.f2022b.a(0, 1);
            this.f2022b.a();
            this.f2023c.a(this.f2022b, qVarA);
            this.f2024d = true;
        }
        return this.f2023c.a(hVar, nVar);
    }

    private boolean b(c.d.a.a.e.h hVar) {
        g gVar = new g();
        if (!gVar.a(hVar, true) || (gVar.f2032c & 2) != 2) {
            return false;
        }
        int iMin = Math.min(gVar.j, 8);
        u uVar = new u(iMin);
        hVar.a(uVar.f3567a, 0, iMin);
        a(uVar);
        if (d.b(uVar)) {
            this.f2023c = new d();
        } else {
            a(uVar);
            if (m.b(uVar)) {
                this.f2023c = new m();
            } else {
                a(uVar);
                if (!i.b(uVar)) {
                    return false;
                }
                this.f2023c = new i();
            }
        }
        return true;
    }

    private static u a(u uVar) {
        uVar.c(0);
        return uVar;
    }
}
