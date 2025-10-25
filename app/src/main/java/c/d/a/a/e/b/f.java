package c.d.a.a.e.b;

import c.d.a.a.e.b.e;
import c.d.a.a.e.q;
import c.d.a.a.m.s;
import c.d.a.a.m.u;
import c.d.a.a.n.h;
import c.d.a.a.x;

/* loaded from: classes.dex */
final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    private final u f1778b;

    /* renamed from: c, reason: collision with root package name */
    private final u f1779c;

    /* renamed from: d, reason: collision with root package name */
    private int f1780d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1781e;

    /* renamed from: f, reason: collision with root package name */
    private int f1782f;

    public f(q qVar) {
        super(qVar);
        this.f1778b = new u(s.f3547a);
        this.f1779c = new u(4);
    }

    @Override // c.d.a.a.e.b.e
    protected boolean a(u uVar) throws e.a {
        int iH = uVar.h();
        int i2 = (iH >> 4) & 15;
        int i3 = iH & 15;
        if (i3 != 7) {
            throw new e.a("Video format not supported: " + i3);
        }
        this.f1782f = i2;
        return i2 != 5;
    }

    @Override // c.d.a.a.e.b.e
    protected void b(u uVar, long j) throws x {
        int iH = uVar.h();
        long jM = j + (uVar.m() * 1000);
        if (iH == 0 && !this.f1781e) {
            u uVar2 = new u(new byte[uVar.b()]);
            uVar.a(uVar2.f3567a, 0, uVar.b());
            h hVarA = h.a(uVar2);
            this.f1780d = hVarA.f3630b;
            this.f1777a.a(c.d.a.a.q.a((String) null, "video/avc", (String) null, -1, -1, hVarA.f3631c, hVarA.f3632d, -1.0f, hVarA.f3629a, -1, hVarA.f3633e, (c.d.a.a.d.f) null));
            this.f1781e = true;
            return;
        }
        if (iH == 1 && this.f1781e) {
            byte[] bArr = this.f1779c.f3567a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.f1780d;
            int i3 = 0;
            while (uVar.b() > 0) {
                uVar.a(this.f1779c.f3567a, i2, this.f1780d);
                this.f1779c.c(0);
                int iV = this.f1779c.v();
                this.f1778b.c(0);
                this.f1777a.a(this.f1778b, 4);
                this.f1777a.a(uVar, iV);
                i3 = i3 + 4 + iV;
            }
            this.f1777a.a(jM, this.f1782f == 1 ? 1 : 0, i3, 0, null);
        }
    }
}
