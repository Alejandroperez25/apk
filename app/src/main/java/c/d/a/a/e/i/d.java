package c.d.a.a.e.i;

import c.d.a.a.b.H;
import c.d.a.a.e.h;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.o;
import c.d.a.a.m.u;
import c.d.a.a.x;

/* loaded from: classes.dex */
abstract class d {
    public static c a(h hVar) throws x {
        AbstractC0170e.a(hVar);
        u uVar = new u(16);
        if (a.a(hVar, uVar).f2334a != H.f1535a) {
            return null;
        }
        hVar.a(uVar.f3567a, 0, 4);
        uVar.c(0);
        int iP = uVar.p();
        if (iP != H.f1536b) {
            o.d("WavHeaderReader", "Unsupported RIFF format: " + iP);
            return null;
        }
        a aVarA = a.a(hVar, uVar);
        while (aVarA.f2334a != H.f1537c) {
            hVar.a((int) aVarA.f2335b);
            aVarA = a.a(hVar, uVar);
        }
        AbstractC0170e.b(aVarA.f2335b >= 16);
        hVar.a(uVar.f3567a, 0, 16);
        uVar.c(0);
        int iJ = uVar.j();
        int iJ2 = uVar.j();
        int iW = uVar.w();
        int iW2 = uVar.w();
        int iJ3 = uVar.j();
        int iJ4 = uVar.j();
        int i2 = (iJ2 * iJ4) / 8;
        if (iJ3 != i2) {
            throw new x("Expected block alignment: " + i2 + "; got: " + iJ3);
        }
        int iA = H.a(iJ, iJ4);
        if (iA == 0) {
            o.d("WavHeaderReader", "Unsupported WAV format: " + iJ4 + " bit/sample, type " + iJ);
            return null;
        }
        hVar.a(((int) aVarA.f2335b) - 16);
        return new c(iJ2, iW, iW2, iJ3, iJ4, iA);
    }

    public static void a(h hVar, c cVar) throws x {
        AbstractC0170e.a(hVar);
        AbstractC0170e.a(cVar);
        hVar.b();
        u uVar = new u(8);
        a aVarA = a.a(hVar, uVar);
        while (aVarA.f2334a != c.d.a.a.m.H.h("data")) {
            o.c("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f2334a);
            long j = aVarA.f2335b + 8;
            if (aVarA.f2334a == c.d.a.a.m.H.h("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw new x("Chunk is too large (~2GB+) to skip; id: " + aVarA.f2334a);
            }
            hVar.c((int) j);
            aVarA = a.a(hVar, uVar);
        }
        hVar.c(8);
        cVar.a(hVar.c(), aVarA.f2335b);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2334a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2335b;

        private a(int i2, long j) {
            this.f2334a = i2;
            this.f2335b = j;
        }

        public static a a(h hVar, u uVar) {
            hVar.a(uVar.f3567a, 0, 8);
            uVar.c(0);
            return new a(uVar.p(), uVar.o());
        }
    }
}
