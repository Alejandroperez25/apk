package c.d.a.a.g.c;

import c.d.a.a.g.b;
import c.d.a.a.m.E;
import c.d.a.a.m.t;
import c.d.a.a.m.u;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d implements c.d.a.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    private final u f2454a = new u();

    /* renamed from: b, reason: collision with root package name */
    private final t f2455b = new t();

    /* renamed from: c, reason: collision with root package name */
    private E f2456c;

    @Override // c.d.a.a.g.c
    public c.d.a.a.g.b a(c.d.a.a.g.f fVar) {
        if (this.f2456c == null || fVar.f2484f != this.f2456c.c()) {
            this.f2456c = new E(fVar.f1685d);
            this.f2456c.e(fVar.f1685d - fVar.f2484f);
        }
        ByteBuffer byteBuffer = fVar.f1684c;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f2454a.a(bArrArray, iLimit);
        this.f2455b.a(bArrArray, iLimit);
        this.f2455b.b(39);
        long jC = (this.f2455b.c(1) << 32) | this.f2455b.c(32);
        this.f2455b.b(20);
        int iC = this.f2455b.c(12);
        int iC2 = this.f2455b.c(8);
        b.a hVar = null;
        this.f2454a.d(14);
        if (iC2 == 0) {
            hVar = new h();
        } else if (iC2 != 255) {
            switch (iC2) {
                case 4:
                    hVar = j.a(this.f2454a);
                    break;
                case 5:
                    hVar = f.a(this.f2454a, jC, this.f2456c);
                    break;
                case 6:
                    hVar = l.a(this.f2454a, jC, this.f2456c);
                    break;
            }
        } else {
            hVar = b.a(this.f2454a, iC, jC);
        }
        return hVar == null ? new c.d.a.a.g.b(new b.a[0]) : new c.d.a.a.g.b(hVar);
    }
}
