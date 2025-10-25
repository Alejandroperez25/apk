package c.d.a.a.e;

import c.d.a.a.g.b.n;
import c.d.a.a.m.u;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final u f2339a = new u(10);

    public c.d.a.a.g.b a(h hVar, n.a aVar) {
        c.d.a.a.g.b bVarA = null;
        int i2 = 0;
        while (true) {
            try {
                hVar.a(this.f2339a.f3567a, 0, 10);
                this.f2339a.c(0);
                if (this.f2339a.l() != c.d.a.a.g.b.n.f2431b) {
                    break;
                }
                this.f2339a.d(3);
                int iU = this.f2339a.u();
                int i3 = iU + 10;
                if (bVarA == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f2339a.f3567a, 0, bArr, 0, 10);
                    hVar.a(bArr, 10, iU);
                    bVarA = new c.d.a.a.g.b.n(aVar).a(bArr, i3);
                } else {
                    hVar.a(iU);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        hVar.b();
        hVar.a(i2);
        return bVarA;
    }
}
