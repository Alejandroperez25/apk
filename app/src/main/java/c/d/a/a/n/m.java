package c.d.a.a.n;

import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f3649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3650b;

    public static m a(u uVar) throws x {
        try {
            uVar.d(21);
            int iH = uVar.h() & 3;
            int iH2 = uVar.h();
            int iD = uVar.d();
            int i2 = 0;
            int i3 = 0;
            while (i2 < iH2) {
                uVar.d(1);
                int i4 = uVar.i();
                int i5 = i3;
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = uVar.i();
                    i5 += i7 + 4;
                    uVar.d(i7);
                }
                i2++;
                i3 = i5;
            }
            uVar.c(iD);
            byte[] bArr = new byte[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < iH2) {
                uVar.d(1);
                int i10 = uVar.i();
                int i11 = i9;
                for (int i12 = 0; i12 < i10; i12++) {
                    int i13 = uVar.i();
                    System.arraycopy(c.d.a.a.m.s.f3547a, 0, bArr, i11, c.d.a.a.m.s.f3547a.length);
                    int length = i11 + c.d.a.a.m.s.f3547a.length;
                    System.arraycopy(uVar.f3567a, uVar.d(), bArr, length, i13);
                    i11 = length + i13;
                    uVar.d(i13);
                }
                i8++;
                i9 = i11;
            }
            return new m(i3 == 0 ? null : Collections.singletonList(bArr), iH + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new x("Error parsing HEVC config", e2);
        }
    }

    private m(List<byte[]> list, int i2) {
        this.f3649a = list;
        this.f3650b = i2;
    }
}
