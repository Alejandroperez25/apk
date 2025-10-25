package c.d.a.a.g.a;

import c.d.a.a.g.f;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.u;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements c.d.a.a.g.c {
    @Override // c.d.a.a.g.c
    public c.d.a.a.g.b a(f fVar) {
        ByteBuffer byteBuffer = fVar.f1684c;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        u uVar = new u(bArrArray, iLimit);
        String strZ = uVar.z();
        AbstractC0170e.a(strZ);
        String str = strZ;
        String strZ2 = uVar.z();
        AbstractC0170e.a(strZ2);
        String str2 = strZ2;
        long jN = uVar.n();
        long jN2 = uVar.n();
        if (jN2 != 0) {
            o.c("EventMessageDecoder", "Ignoring non-zero presentation_time_delta: " + jN2);
        }
        return new c.d.a.a.g.b(new b(str, str2, H.d(uVar.n(), 1000L, jN), uVar.n(), Arrays.copyOfRange(bArrArray, uVar.d(), iLimit)));
    }
}
