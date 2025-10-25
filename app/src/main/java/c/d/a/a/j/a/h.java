package c.d.a.a.j.a;

import c.d.a.a.e.q;
import c.d.a.a.m.H;
import c.d.a.a.m.o;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3123a = H.h("GA94");

    public static void a(long j, u uVar, q[] qVarArr) {
        while (true) {
            if (uVar.b() <= 1) {
                return;
            }
            int iA = a(uVar);
            int iA2 = a(uVar);
            int iD = uVar.d() + iA2;
            if (iA2 == -1 || iA2 > uVar.b()) {
                o.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iD = uVar.c();
            } else if (iA == 4 && iA2 >= 8) {
                int iH = uVar.h();
                int i2 = uVar.i();
                int iP = i2 == 49 ? uVar.p() : 0;
                int iH2 = uVar.h();
                if (i2 == 47) {
                    uVar.d(1);
                }
                boolean z = iH == 181 && (i2 == 49 || i2 == 47) && iH2 == 3;
                if (i2 == 49) {
                    z &= iP == f3123a;
                }
                if (z) {
                    b(j, uVar, qVarArr);
                }
            }
            uVar.c(iD);
        }
    }

    public static void b(long j, u uVar, q[] qVarArr) {
        int iH = uVar.h();
        if ((iH & 64) != 0) {
            uVar.d(1);
            int i2 = (iH & 31) * 3;
            int iD = uVar.d();
            for (q qVar : qVarArr) {
                uVar.c(iD);
                qVar.a(uVar, i2);
                qVar.a(j, 1, i2, 0, null);
            }
        }
    }

    private static int a(u uVar) {
        int i2 = 0;
        while (uVar.b() != 0) {
            int iH = uVar.h();
            i2 += iH;
            if (iH != 255) {
                return i2;
            }
        }
        return -1;
    }
}
