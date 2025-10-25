package c.d.a.a.e.e;

import c.d.a.a.m.H;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1973a = {H.h("isom"), H.h("iso2"), H.h("iso3"), H.h("iso4"), H.h("iso5"), H.h("iso6"), H.h("avc1"), H.h("hvc1"), H.h("hev1"), H.h("mp41"), H.h("mp42"), H.h("3g2a"), H.h("3g2b"), H.h("3gr6"), H.h("3gs6"), H.h("3ge6"), H.h("3gg6"), H.h("M4V "), H.h("M4A "), H.h("f4v "), H.h("kddi"), H.h("M4VP"), H.h("qt  "), H.h("MSNV")};

    public static boolean a(c.d.a.a.e.h hVar) {
        return a(hVar, true);
    }

    public static boolean b(c.d.a.a.e.h hVar) {
        return a(hVar, false);
    }

    private static boolean a(c.d.a.a.e.h hVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        long length = hVar.getLength();
        long j = 4096;
        long j2 = -1;
        if (length != -1 && length <= 4096) {
            j = length;
        }
        u uVar = new u(64);
        boolean z5 = false;
        int i2 = (int) j;
        int i3 = 0;
        boolean z6 = false;
        while (i3 < i2) {
            uVar.a(8);
            hVar.a(uVar.f3567a, z5 ? 1 : 0, 8);
            long jN = uVar.n();
            int iP = uVar.p();
            int i4 = 16;
            if (jN == 1) {
                hVar.a(uVar.f3567a, 8, 8);
                uVar.b(16);
                jN = uVar.r();
            } else {
                if (jN == 0) {
                    long length2 = hVar.getLength();
                    if (length2 != j2) {
                        jN = (length2 - hVar.a()) + 8;
                    }
                }
                i4 = 8;
            }
            if (length != -1 && i3 + jN > length) {
                return z5;
            }
            long j3 = i4;
            if (jN < j3) {
                return z5;
            }
            i3 += i4;
            if (iP == c.B) {
                i2 += (int) jN;
                if (length != -1 && i2 > length) {
                    i2 = (int) length;
                }
                j2 = -1;
            } else {
                if (iP == c.K || iP == c.M) {
                    z2 = false;
                    z3 = true;
                    break;
                }
                int i5 = i2;
                long j4 = jN;
                if ((i3 + jN) - j3 >= i5) {
                    break;
                }
                int i6 = (int) (j4 - j3);
                i3 += i6;
                if (iP == c.f1872a) {
                    if (i6 < 8) {
                        return false;
                    }
                    uVar.a(i6);
                    hVar.a(uVar.f3567a, 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            z4 = z6;
                            break;
                        }
                        z4 = true;
                        if (i8 == 1) {
                            uVar.d(4);
                        } else if (a(uVar.p())) {
                            break;
                        }
                        i8++;
                    }
                    if (!z4) {
                        return false;
                    }
                    z6 = z4;
                } else if (i6 != 0) {
                    hVar.a(i6);
                }
                i2 = i5;
                j2 = -1;
                z5 = false;
            }
        }
        z2 = false;
        z3 = false;
        if (z6 && z == z3) {
            return true;
        }
        return z2;
    }

    private static boolean a(int i2) {
        if ((i2 >>> 8) == H.h("3gp")) {
            return true;
        }
        for (int i3 : f1973a) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }
}
