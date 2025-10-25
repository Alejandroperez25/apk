package c.d.a.a.e.f;

import c.d.a.a.m.o;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class n {
    public static int a(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static d a(u uVar) throws x {
        a(1, uVar, false);
        long jO = uVar.o();
        int iH = uVar.h();
        long jO2 = uVar.o();
        int iQ = uVar.q();
        int iQ2 = uVar.q();
        int iQ3 = uVar.q();
        int iH2 = uVar.h();
        return new d(jO, iH, jO2, iQ, iQ2, iQ3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (uVar.h() & 1) > 0, Arrays.copyOf(uVar.f3567a, uVar.c()));
    }

    public static b b(u uVar) throws x {
        a(3, uVar, false);
        String strE = uVar.e((int) uVar.o());
        int length = 11 + strE.length();
        long jO = uVar.o();
        String[] strArr = new String[(int) jO];
        int length2 = length + 4;
        for (int i2 = 0; i2 < jO; i2++) {
            strArr[i2] = uVar.e((int) uVar.o());
            length2 = length2 + 4 + strArr[i2].length();
        }
        if ((uVar.h() & 1) == 0) {
            throw new x("framing bit expected to be set");
        }
        return new b(strE, strArr, length2 + 1);
    }

    public static boolean a(int i2, u uVar, boolean z) throws x {
        if (uVar.b() < 7) {
            if (z) {
                return false;
            }
            throw new x("too short header: " + uVar.b());
        }
        if (uVar.h() != i2) {
            if (z) {
                return false;
            }
            throw new x("expected header type " + Integer.toHexString(i2));
        }
        if (uVar.h() == 118 && uVar.h() == 111 && uVar.h() == 114 && uVar.h() == 98 && uVar.h() == 105 && uVar.h() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new x("expected characters 'vorbis'");
    }

    public static c[] a(u uVar, int i2) throws x {
        a(5, uVar, false);
        int iH = uVar.h() + 1;
        l lVar = new l(uVar.f3567a);
        lVar.b(uVar.d() * 8);
        for (int i3 = 0; i3 < iH; i3++) {
            d(lVar);
        }
        int iA = lVar.a(6) + 1;
        for (int i4 = 0; i4 < iA; i4++) {
            if (lVar.a(16) != 0) {
                throw new x("placeholder of time domain transforms not zeroed out");
            }
        }
        c(lVar);
        b(lVar);
        a(i2, lVar);
        c[] cVarArrA = a(lVar);
        if (lVar.a()) {
            return cVarArrA;
        }
        throw new x("framing bit after modes not set as expected");
    }

    private static c[] a(l lVar) {
        int iA = lVar.a(6) + 1;
        c[] cVarArr = new c[iA];
        for (int i2 = 0; i2 < iA; i2++) {
            cVarArr[i2] = new c(lVar.a(), lVar.a(16), lVar.a(16), lVar.a(8));
        }
        return cVarArr;
    }

    private static void a(int i2, l lVar) throws x {
        int iA = lVar.a(6) + 1;
        for (int i3 = 0; i3 < iA; i3++) {
            int iA2 = lVar.a(16);
            if (iA2 == 0) {
                int iA3 = lVar.a() ? lVar.a(4) + 1 : 1;
                if (lVar.a()) {
                    int iA4 = lVar.a(8) + 1;
                    for (int i4 = 0; i4 < iA4; i4++) {
                        int i5 = i2 - 1;
                        lVar.b(a(i5));
                        lVar.b(a(i5));
                    }
                }
                if (lVar.a(2) != 0) {
                    throw new x("to reserved bits must be zero after mapping coupling steps");
                }
                if (iA3 > 1) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        lVar.b(4);
                    }
                }
                for (int i7 = 0; i7 < iA3; i7++) {
                    lVar.b(8);
                    lVar.b(8);
                    lVar.b(8);
                }
            } else {
                o.d("VorbisUtil", "mapping type other than 0 not supported: " + iA2);
            }
        }
    }

    private static void b(l lVar) throws x {
        int iA = lVar.a(6) + 1;
        for (int i2 = 0; i2 < iA; i2++) {
            if (lVar.a(16) > 2) {
                throw new x("residueType greater than 2 is not decodable");
            }
            lVar.b(24);
            lVar.b(24);
            lVar.b(24);
            int iA2 = lVar.a(6) + 1;
            lVar.b(8);
            int[] iArr = new int[iA2];
            for (int i3 = 0; i3 < iA2; i3++) {
                iArr[i3] = ((lVar.a() ? lVar.a(5) : 0) * 8) + lVar.a(3);
            }
            for (int i4 = 0; i4 < iA2; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((iArr[i4] & (1 << i5)) != 0) {
                        lVar.b(8);
                    }
                }
            }
        }
    }

    private static void c(l lVar) throws x {
        int iA = lVar.a(6) + 1;
        for (int i2 = 0; i2 < iA; i2++) {
            int iA2 = lVar.a(16);
            switch (iA2) {
                case 0:
                    lVar.b(8);
                    lVar.b(16);
                    lVar.b(16);
                    lVar.b(6);
                    lVar.b(8);
                    int iA3 = lVar.a(4) + 1;
                    for (int i3 = 0; i3 < iA3; i3++) {
                        lVar.b(8);
                    }
                    break;
                case 1:
                    int iA4 = lVar.a(5);
                    int[] iArr = new int[iA4];
                    int i4 = -1;
                    for (int i5 = 0; i5 < iA4; i5++) {
                        iArr[i5] = lVar.a(4);
                        if (iArr[i5] > i4) {
                            i4 = iArr[i5];
                        }
                    }
                    int[] iArr2 = new int[i4 + 1];
                    for (int i6 = 0; i6 < iArr2.length; i6++) {
                        iArr2[i6] = lVar.a(3) + 1;
                        int iA5 = lVar.a(2);
                        if (iA5 > 0) {
                            lVar.b(8);
                        }
                        for (int i7 = 0; i7 < (1 << iA5); i7++) {
                            lVar.b(8);
                        }
                    }
                    lVar.b(2);
                    int iA6 = lVar.a(4);
                    int i8 = 0;
                    int i9 = 0;
                    for (int i10 = 0; i10 < iA4; i10++) {
                        i8 += iArr2[iArr[i10]];
                        while (i9 < i8) {
                            lVar.b(iA6);
                            i9++;
                        }
                    }
                    break;
                default:
                    throw new x("floor type greater than 1 not decodable: " + iA2);
            }
        }
    }

    private static a d(l lVar) throws x {
        if (lVar.a(24) != 5653314) {
            throw new x("expected code book to start with [0x56, 0x43, 0x42] at " + lVar.b());
        }
        int iA = lVar.a(16);
        int iA2 = lVar.a(24);
        long[] jArr = new long[iA2];
        boolean zA = lVar.a();
        long jA = 0;
        if (!zA) {
            boolean zA2 = lVar.a();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                if (zA2) {
                    if (lVar.a()) {
                        jArr[i2] = lVar.a(5) + 1;
                    } else {
                        jArr[i2] = 0;
                    }
                } else {
                    jArr[i2] = lVar.a(5) + 1;
                }
            }
        } else {
            int iA3 = lVar.a(5) + 1;
            int i3 = 0;
            while (i3 < jArr.length) {
                int iA4 = lVar.a(a(iA2 - i3));
                int i4 = i3;
                for (int i5 = 0; i5 < iA4 && i4 < jArr.length; i5++) {
                    jArr[i4] = iA3;
                    i4++;
                }
                iA3++;
                i3 = i4;
            }
        }
        int iA5 = lVar.a(4);
        if (iA5 > 2) {
            throw new x("lookup type greater than 2 not decodable: " + iA5);
        }
        if (iA5 == 1 || iA5 == 2) {
            lVar.b(32);
            lVar.b(32);
            int iA6 = lVar.a(4) + 1;
            lVar.b(1);
            if (iA5 != 1) {
                jA = iA2 * iA;
            } else if (iA != 0) {
                jA = a(iA2, iA);
            }
            lVar.b((int) (jA * iA6));
        }
        return new a(iA, iA2, jArr, iA5, zA);
    }

    private static long a(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2059a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2060b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f2061c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2062d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f2063e;

        public a(int i2, int i3, long[] jArr, int i4, boolean z) {
            this.f2059a = i2;
            this.f2060b = i3;
            this.f2061c = jArr;
            this.f2062d = i4;
            this.f2063e = z;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f2064a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f2065b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2066c;

        public b(String str, String[] strArr, int i2) {
            this.f2064a = str;
            this.f2065b = strArr;
            this.f2066c = i2;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f2071a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2072b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2073c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2074d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2075e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2076f;

        /* renamed from: g, reason: collision with root package name */
        public final int f2077g;

        /* renamed from: h, reason: collision with root package name */
        public final int f2078h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f2079i;
        public final byte[] j;

        public d(long j, int i2, long j2, int i3, int i4, int i5, int i6, int i7, boolean z, byte[] bArr) {
            this.f2071a = j;
            this.f2072b = i2;
            this.f2073c = j2;
            this.f2074d = i3;
            this.f2075e = i4;
            this.f2076f = i5;
            this.f2077g = i6;
            this.f2078h = i7;
            this.f2079i = z;
            this.j = bArr;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2067a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2068b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2069c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2070d;

        public c(boolean z, int i2, int i3, int i4) {
            this.f2067a = z;
            this.f2068b = i2;
            this.f2069c = i3;
            this.f2070d = i4;
        }
    }
}
