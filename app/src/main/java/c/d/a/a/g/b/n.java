package c.d.a.a.g.b;

import c.d.a.a.m.H;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n implements c.d.a.a.g.c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2430a = new a() { // from class: c.d.a.a.g.b.a
        @Override // c.d.a.a.g.b.n.a
        public final boolean a(int i2, int i3, int i4, int i5, int i6) {
            return n.a(i2, i3, i4, i5, i6);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final int f2431b = H.h("ID3");

    /* renamed from: c, reason: collision with root package name */
    private final a f2432c;

    public interface a {
        boolean a(int i2, int i3, int i4, int i5, int i6);
    }

    private static String a(int i2) {
        switch (i2) {
            case 1:
                return "UTF-16";
            case 2:
                return "UTF-16BE";
            case 3:
                return "UTF-8";
            default:
                return "ISO-8859-1";
        }
    }

    static /* synthetic */ boolean a(int i2, int i3, int i4, int i5, int i6) {
        return false;
    }

    private static int b(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    public n() {
        this(null);
    }

    public n(a aVar) {
        this.f2432c = aVar;
    }

    @Override // c.d.a.a.g.c
    public c.d.a.a.g.b a(c.d.a.a.g.f fVar) {
        ByteBuffer byteBuffer = fVar.f1684c;
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public c.d.a.a.g.b a(byte[] bArr, int i2) {
        ArrayList arrayList = new ArrayList();
        c.d.a.a.m.u uVar = new c.d.a.a.m.u(bArr, i2);
        b bVarA = a(uVar);
        if (bVarA == null) {
            return null;
        }
        int iD = uVar.d();
        int i3 = bVarA.f2433a == 2 ? 6 : 10;
        int iG = bVarA.f2435c;
        if (bVarA.f2434b) {
            iG = g(uVar, bVarA.f2435c);
        }
        uVar.b(iD + iG);
        boolean z = false;
        if (!a(uVar, bVarA.f2433a, i3, false)) {
            if (bVarA.f2433a != 4 || !a(uVar, 4, i3, true)) {
                c.d.a.a.m.o.c("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarA.f2433a);
                return null;
            }
            z = true;
        }
        while (uVar.b() >= i3) {
            o oVarA = a(bVarA.f2433a, uVar, z, i3, this.f2432c);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        return new c.d.a.a.g.b(arrayList);
    }

    private static b a(c.d.a.a.m.u uVar) {
        if (uVar.b() < 10) {
            c.d.a.a.m.o.c("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iL = uVar.l();
        if (iL != f2431b) {
            c.d.a.a.m.o.c("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + iL);
            return null;
        }
        int iH = uVar.h();
        uVar.d(1);
        int iH2 = uVar.h();
        int iU = uVar.u();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                c.d.a.a.m.o.c("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iP = uVar.p();
                uVar.d(iP);
                iU -= iP + 4;
            }
        } else {
            if (iH != 4) {
                c.d.a.a.m.o.c("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
                return null;
            }
            if ((iH2 & 64) != 0) {
                int iU2 = uVar.u();
                uVar.d(iU2 - 4);
                iU -= iU2;
            }
            if ((iH2 & 16) != 0) {
                iU -= 10;
            }
        }
        return new b(iH, iH < 4 && (iH2 & 128) != 0, iU);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[PHI: r3
  0x0078: PHI (r3v15 boolean) = (r3v5 boolean), (r3v18 boolean) binds: [B:39:0x0085, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(c.d.a.a.m.u r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.d()
        L8:
            int r3 = r18.b()     // Catch: java.lang.Throwable -> Lb2
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.p()     // Catch: java.lang.Throwable -> Lb2
            long r8 = r18.n()     // Catch: java.lang.Throwable -> Lb2
            int r10 = r18.i()     // Catch: java.lang.Throwable -> Lb2
            goto L2c
        L22:
            int r7 = r18.l()     // Catch: java.lang.Throwable -> Lb2
            int r8 = r18.l()     // Catch: java.lang.Throwable -> Lb2
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.c(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.c(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L89
        L78:
            r7 = 1
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L89
            goto L78
        L88:
            r3 = 0
        L89:
            r7 = 0
        L8a:
            if (r3 == 0) goto L8d
            goto L8e
        L8d:
            r4 = 0
        L8e:
            if (r7 == 0) goto L92
            int r4 = r4 + 4
        L92:
            long r3 = (long) r4
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.c(r2)
            return r6
        L9b:
            int r3 = r18.b()     // Catch: java.lang.Throwable -> Lb2
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.c(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.d(r3)     // Catch: java.lang.Throwable -> Lb2
            goto L8
        Lae:
            r1.c(r2)
            return r4
        Lb2:
            r0 = move-exception
            r1.c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.g.b.n.a(c.d.a.a.m.u, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ee A[Catch: all -> 0x012c, UnsupportedEncodingException -> 0x021e, TryCatch #1 {UnsupportedEncodingException -> 0x021e, blocks: (B:92:0x011a, B:164:0x01f8, B:94:0x0122, B:103:0x013b, B:106:0x0145, B:114:0x015f, B:123:0x0177, B:135:0x0192, B:142:0x01a4, B:149:0x01b5, B:154:0x01cd, B:161:0x01e9, B:162:0x01ee), top: B:174:0x0110, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static c.d.a.a.g.b.o a(int r19, c.d.a.a.m.u r20, boolean r21, int r22, c.d.a.a.g.b.n.a r23) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.g.b.n.a(int, c.d.a.a.m.u, boolean, int, c.d.a.a.g.b.n$a):c.d.a.a.g.b.o");
    }

    private static w a(c.d.a.a.m.u uVar, int i2) {
        if (i2 < 1) {
            return null;
        }
        int iH = uVar.h();
        String strA = a(iH);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        uVar.a(bArr, 0, i3);
        int iA = a(bArr, 0, iH);
        String str = new String(bArr, 0, iA, strA);
        int iB = iA + b(iH);
        return new w("TXXX", str, a(bArr, iB, a(bArr, iB, iH), strA));
    }

    private static w a(c.d.a.a.m.u uVar, int i2, String str) {
        if (i2 < 1) {
            return null;
        }
        int iH = uVar.h();
        String strA = a(iH);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        uVar.a(bArr, 0, i3);
        return new w(str, null, new String(bArr, 0, a(bArr, 0, iH), strA));
    }

    private static y b(c.d.a.a.m.u uVar, int i2) {
        if (i2 < 1) {
            return null;
        }
        int iH = uVar.h();
        String strA = a(iH);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        uVar.a(bArr, 0, i3);
        int iA = a(bArr, 0, iH);
        String str = new String(bArr, 0, iA, strA);
        int iB = iA + b(iH);
        return new y("WXXX", str, a(bArr, iB, b(bArr, iB), "ISO-8859-1"));
    }

    private static y b(c.d.a.a.m.u uVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        uVar.a(bArr, 0, i2);
        return new y(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static u c(c.d.a.a.m.u uVar, int i2) {
        byte[] bArr = new byte[i2];
        uVar.a(bArr, 0, i2);
        int iB = b(bArr, 0);
        return new u(new String(bArr, 0, iB, "ISO-8859-1"), b(bArr, iB + 1, bArr.length));
    }

    private static m d(c.d.a.a.m.u uVar, int i2) {
        int iH = uVar.h();
        String strA = a(iH);
        int i3 = i2 - 1;
        byte[] bArr = new byte[i3];
        uVar.a(bArr, 0, i3);
        int iB = b(bArr, 0);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i4 = iB + 1;
        int iA = a(bArr, i4, iH);
        String strA2 = a(bArr, i4, iA, strA);
        int iB2 = iA + b(iH);
        int iA2 = a(bArr, iB2, iH);
        return new m(str, strA2, a(bArr, iB2, iA2, strA), b(bArr, iA2 + b(iH), bArr.length));
    }

    private static c a(c.d.a.a.m.u uVar, int i2, int i3) {
        int iB;
        String strD;
        int iH = uVar.h();
        String strA = a(iH);
        int i4 = i2 - 1;
        byte[] bArr = new byte[i4];
        uVar.a(bArr, 0, i4);
        if (i3 == 2) {
            String str = "image/" + H.d(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            strD = str;
            iB = 2;
        } else {
            iB = b(bArr, 0);
            strD = H.d(new String(bArr, 0, iB, "ISO-8859-1"));
            if (strD.indexOf(47) == -1) {
                strD = "image/" + strD;
            }
        }
        int i5 = bArr[iB + 1] & 255;
        int i6 = iB + 2;
        int iA = a(bArr, i6, iH);
        return new c(strD, new String(bArr, i6, iA - i6, strA), i5, b(bArr, iA + b(iH), bArr.length));
    }

    private static k e(c.d.a.a.m.u uVar, int i2) {
        if (i2 < 4) {
            return null;
        }
        int iH = uVar.h();
        String strA = a(iH);
        byte[] bArr = new byte[3];
        uVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        uVar.a(bArr2, 0, i3);
        int iA = a(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iA, strA);
        int iB = iA + b(iH);
        return new k(str, str2, a(bArr2, iB, a(bArr2, iB, iH), strA));
    }

    private static g a(c.d.a.a.m.u uVar, int i2, int i3, boolean z, int i4, a aVar) {
        int iD = uVar.d();
        int iB = b(uVar.f3567a, iD);
        String str = new String(uVar.f3567a, iD, iB - iD, "ISO-8859-1");
        uVar.c(iB + 1);
        int iP = uVar.p();
        int iP2 = uVar.p();
        long jN = uVar.n();
        long j = jN == 4294967295L ? -1L : jN;
        long jN2 = uVar.n();
        long j2 = jN2 == 4294967295L ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i5 = iD + i2;
        while (uVar.d() < i5) {
            o oVarA = a(i3, uVar, z, i4, aVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new g(str, iP, iP2, j, j2, oVarArr);
    }

    private static i b(c.d.a.a.m.u uVar, int i2, int i3, boolean z, int i4, a aVar) {
        int iD = uVar.d();
        int iB = b(uVar.f3567a, iD);
        String str = new String(uVar.f3567a, iD, iB - iD, "ISO-8859-1");
        uVar.c(iB + 1);
        int iH = uVar.h();
        boolean z2 = (iH & 2) != 0;
        boolean z3 = (iH & 1) != 0;
        int iH2 = uVar.h();
        String[] strArr = new String[iH2];
        for (int i5 = 0; i5 < iH2; i5++) {
            int iD2 = uVar.d();
            int iB2 = b(uVar.f3567a, iD2);
            strArr[i5] = new String(uVar.f3567a, iD2, iB2 - iD2, "ISO-8859-1");
            uVar.c(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i6 = iD + i2;
        while (uVar.d() < i6) {
            o oVarA = a(i3, uVar, z, i4, aVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new i(str, z2, z3, strArr, oVarArr);
    }

    private static s f(c.d.a.a.m.u uVar, int i2) {
        int i3 = uVar.i();
        int iL = uVar.l();
        int iL2 = uVar.l();
        int iH = uVar.h();
        int iH2 = uVar.h();
        c.d.a.a.m.t tVar = new c.d.a.a.m.t();
        tVar.a(uVar);
        int i4 = ((i2 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iC = tVar.c(iH);
            int iC2 = tVar.c(iH2);
            iArr[i5] = iC;
            iArr2[i5] = iC2;
        }
        return new s(i3, iL, iL2, iArr, iArr2);
    }

    private static e c(c.d.a.a.m.u uVar, int i2, String str) {
        byte[] bArr = new byte[i2];
        uVar.a(bArr, 0, i2);
        return new e(str, bArr);
    }

    private static int g(c.d.a.a.m.u uVar, int i2) {
        byte[] bArr = uVar.f3567a;
        int iD = uVar.d();
        while (true) {
            int i3 = iD + 1;
            if (i3 >= i2) {
                return i2;
            }
            if ((bArr[iD] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, iD + 2, bArr, i3, (i2 - iD) - 2);
                i2--;
            }
            iD = i3;
        }
    }

    private static String b(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static int a(byte[] bArr, int i2, int i3) {
        int iB = b(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if (iB % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(bArr, iB + 1);
        }
        return bArr.length;
    }

    private static int b(byte[] bArr, int i2) {
        while (i2 < bArr.length) {
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
        return bArr.length;
    }

    private static byte[] b(byte[] bArr, int i2, int i3) {
        if (i3 <= i2) {
            return H.f3504f;
        }
        return Arrays.copyOfRange(bArr, i2, i3);
    }

    private static String a(byte[] bArr, int i2, int i3, String str) {
        return (i3 <= i2 || i3 > bArr.length) ? "" : new String(bArr, i2, i3 - i2, str);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f2433a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2434b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2435c;

        public b(int i2, boolean z, int i3) {
            this.f2433a = i2;
            this.f2434b = z;
            this.f2435c = i3;
        }
    }
}
