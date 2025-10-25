package c.d.a.a.n;

import c.d.a.a.m.AbstractC0172g;
import c.d.a.a.m.s;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3632d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3633e;

    public static h a(u uVar) throws x {
        int i2;
        int i3;
        float f2;
        try {
            uVar.d(4);
            int iH = (uVar.h() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = uVar.h() & 31;
            for (int i4 = 0; i4 < iH2; i4++) {
                arrayList.add(b(uVar));
            }
            int iH3 = uVar.h();
            for (int i5 = 0; i5 < iH3; i5++) {
                arrayList.add(b(uVar));
            }
            if (iH2 > 0) {
                s.b bVarA = c.d.a.a.m.s.a((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i6 = bVarA.f3558e;
                int i7 = bVarA.f3559f;
                f2 = bVarA.f3560g;
                i2 = i6;
                i3 = i7;
            } else {
                i2 = -1;
                i3 = -1;
                f2 = 1.0f;
            }
            return new h(arrayList, iH, i2, i3, f2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new x("Error parsing AVC config", e2);
        }
    }

    private h(List<byte[]> list, int i2, int i3, int i4, float f2) {
        this.f3629a = list;
        this.f3630b = i2;
        this.f3631c = i3;
        this.f3632d = i4;
        this.f3633e = f2;
    }

    private static byte[] b(u uVar) {
        int i2 = uVar.i();
        int iD = uVar.d();
        uVar.d(i2);
        return AbstractC0172g.a(uVar.f3567a, iD, i2);
    }
}
