package c.d.a.a.e;

import c.d.a.a.e.q;
import c.d.a.a.m.u;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class f implements q {
    @Override // c.d.a.a.e.q
    public void a(long j, int i2, int i3, int i4, q.a aVar) {
    }

    @Override // c.d.a.a.e.q
    public void a(c.d.a.a.q qVar) {
    }

    @Override // c.d.a.a.e.q
    public int a(h hVar, int i2, boolean z) throws EOFException {
        int iB = hVar.b(i2);
        if (iB != -1) {
            return iB;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c.d.a.a.e.q
    public void a(u uVar, int i2) {
        uVar.d(i2);
    }
}
