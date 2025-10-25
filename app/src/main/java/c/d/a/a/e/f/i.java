package c.d.a.a.e.f;

import c.d.a.a.e.f.k;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class i extends k {
    private static final int n = H.h("Opus");
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean p;

    i() {
    }

    public static boolean b(u uVar) {
        if (uVar.b() < o.length) {
            return false;
        }
        byte[] bArr = new byte[o.length];
        uVar.a(bArr, 0, o.length);
        return Arrays.equals(bArr, o);
    }

    @Override // c.d.a.a.e.f.k
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.p = false;
        }
    }

    @Override // c.d.a.a.e.f.k
    protected long a(u uVar) {
        return b(a(uVar.f3567a));
    }

    @Override // c.d.a.a.e.f.k
    protected boolean a(u uVar, long j, k.a aVar) {
        if (!this.p) {
            byte[] bArrCopyOf = Arrays.copyOf(uVar.f3567a, uVar.c());
            int i2 = bArrCopyOf[9] & 255;
            int i3 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArrCopyOf);
            a(arrayList, i3);
            a(arrayList, 3840);
            aVar.f2048a = q.a((String) null, "audio/opus", (String) null, -1, -1, i2, 48000, arrayList, (c.d.a.a.d.f) null, 0, (String) null);
            this.p = true;
            return true;
        }
        boolean z = uVar.p() == n;
        uVar.c(0);
        return z;
    }

    private void a(List<byte[]> list, int i2) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i2 * 1000000000) / 48000).array());
    }

    private long a(byte[] bArr) {
        int i2;
        int i3 = bArr[0] & 255;
        switch (i3 & 3) {
            case 0:
                i2 = 1;
                break;
            case 1:
            case 2:
                i2 = 2;
                break;
            default:
                i2 = bArr[1] & 63;
                break;
        }
        int i4 = i3 >> 3;
        return i2 * (i4 >= 16 ? 2500 << r3 : i4 >= 12 ? 10000 << (r3 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r3);
    }
}
