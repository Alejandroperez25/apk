package c.d.a.a.e.e;

import android.util.Pair;
import c.d.a.a.b.AbstractC0130h;
import c.d.a.a.e.e.c;
import c.d.a.a.g.b;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.AbstractC0172g;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1881a = H.h("vide");

    /* renamed from: b, reason: collision with root package name */
    private static final int f1882b = H.h("soun");

    /* renamed from: c, reason: collision with root package name */
    private static final int f1883c = H.h("text");

    /* renamed from: d, reason: collision with root package name */
    private static final int f1884d = H.h("sbtl");

    /* renamed from: e, reason: collision with root package name */
    private static final int f1885e = H.h("subt");

    /* renamed from: f, reason: collision with root package name */
    private static final int f1886f = H.h("clcp");

    /* renamed from: g, reason: collision with root package name */
    private static final int f1887g = H.h("meta");

    /* renamed from: h, reason: collision with root package name */
    private static final int f1888h = H.h("mdta");

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f1889i = H.c("OpusHead");

    private interface b {
        boolean a();

        int b();

        int c();
    }

    public static o a(c.a aVar, c.b bVar, long j, c.d.a.a.d.f fVar, boolean z, boolean z2) {
        c.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        c.a aVarE = aVar.e(c.d.a.a.e.e.c.E);
        int iA = a(c(aVarE.d(c.d.a.a.e.e.c.S).Xa));
        if (iA == -1) {
            return null;
        }
        f fVarB = b(aVar.d(c.d.a.a.e.e.c.O).Xa);
        if (j == -9223372036854775807L) {
            j2 = fVarB.f1912b;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long jA = a(bVar2.Xa);
        long jD = j2 != -9223372036854775807L ? H.d(j2, 1000000L, jA) : -9223372036854775807L;
        c.a aVarE2 = aVarE.e(c.d.a.a.e.e.c.F).e(c.d.a.a.e.e.c.G);
        Pair<Long, String> pairD = d(aVarE.d(c.d.a.a.e.e.c.R).Xa);
        c cVarA = a(aVarE2.d(c.d.a.a.e.e.c.T).Xa, fVarB.f1911a, fVarB.f1913c, (String) pairD.second, fVar, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> pairB = b(aVar.e(c.d.a.a.e.e.c.P));
            long[] jArr3 = (long[]) pairB.first;
            jArr2 = (long[]) pairB.second;
            jArr = jArr3;
        }
        if (cVarA.f1900b == null) {
            return null;
        }
        return new o(fVarB.f1911a, iA, ((Long) pairD.first).longValue(), jA, jD, cVarA.f1900b, cVarA.f1902d, cVarA.f1899a, cVarA.f1901c, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.d.a.a.e.e.r a(c.d.a.a.e.e.o r49, c.d.a.a.e.e.c.a r50, c.d.a.a.e.k r51) throws c.d.a.a.x {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.e.d.a(c.d.a.a.e.e.o, c.d.a.a.e.e.c$a, c.d.a.a.e.k):c.d.a.a.e.e.r");
    }

    public static c.d.a.a.g.b a(c.b bVar, boolean z) {
        if (z) {
            return null;
        }
        u uVar = bVar.Xa;
        uVar.c(8);
        while (uVar.b() >= 8) {
            int iD = uVar.d();
            int iP = uVar.p();
            if (uVar.p() == c.d.a.a.e.e.c.Ba) {
                uVar.c(iD);
                return a(uVar, iD + iP);
            }
            uVar.c(iD + iP);
        }
        return null;
    }

    public static c.d.a.a.g.b a(c.a aVar) {
        c.b bVarD = aVar.d(c.d.a.a.e.e.c.S);
        c.b bVarD2 = aVar.d(c.d.a.a.e.e.c.Ca);
        c.b bVarD3 = aVar.d(c.d.a.a.e.e.c.Da);
        if (bVarD == null || bVarD2 == null || bVarD3 == null || c(bVarD.Xa) != f1888h) {
            return null;
        }
        u uVar = bVarD2.Xa;
        uVar.c(12);
        int iP = uVar.p();
        String[] strArr = new String[iP];
        for (int i2 = 0; i2 < iP; i2++) {
            int iP2 = uVar.p();
            uVar.d(4);
            strArr[i2] = uVar.e(iP2 - 8);
        }
        u uVar2 = bVarD3.Xa;
        uVar2.c(8);
        ArrayList arrayList = new ArrayList();
        while (uVar2.b() > 8) {
            int iD = uVar2.d();
            int iP3 = uVar2.p();
            int iP4 = uVar2.p() - 1;
            if (iP4 >= 0 && iP4 < strArr.length) {
                j jVarA = k.a(uVar2, iD + iP3, strArr[iP4]);
                if (jVarA != null) {
                    arrayList.add(jVarA);
                }
            } else {
                c.d.a.a.m.o.c("AtomParsers", "Skipped metadata with unknown key index: " + iP4);
            }
            uVar2.c(iD + iP3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c.d.a.a.g.b(arrayList);
    }

    private static c.d.a.a.g.b a(u uVar, int i2) {
        uVar.d(12);
        while (uVar.d() < i2) {
            int iD = uVar.d();
            int iP = uVar.p();
            if (uVar.p() == c.d.a.a.e.e.c.Da) {
                uVar.c(iD);
                return b(uVar, iD + iP);
            }
            uVar.c(iD + iP);
        }
        return null;
    }

    private static c.d.a.a.g.b b(u uVar, int i2) {
        uVar.d(8);
        ArrayList arrayList = new ArrayList();
        while (uVar.d() < i2) {
            b.a aVarA = k.a(uVar);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c.d.a.a.g.b(arrayList);
    }

    private static long a(u uVar) {
        uVar.c(8);
        uVar.d(c.d.a.a.e.e.c.a(uVar.p()) != 0 ? 16 : 8);
        return uVar.n();
    }

    private static f b(u uVar) {
        boolean z;
        uVar.c(8);
        int iA = c.d.a.a.e.e.c.a(uVar.p());
        uVar.d(iA == 0 ? 8 : 16);
        int iP = uVar.p();
        uVar.d(4);
        int iD = uVar.d();
        int i2 = iA == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            }
            if (uVar.f3567a[iD + i4] != -1) {
                z = false;
                break;
            }
            i4++;
        }
        long j = -9223372036854775807L;
        if (z) {
            uVar.d(i2);
        } else {
            long jN = iA == 0 ? uVar.n() : uVar.x();
            if (jN != 0) {
                j = jN;
            }
        }
        uVar.d(16);
        int iP2 = uVar.p();
        int iP3 = uVar.p();
        uVar.d(4);
        int iP4 = uVar.p();
        int iP5 = uVar.p();
        if (iP2 == 0 && iP3 == 65536 && iP4 == -65536 && iP5 == 0) {
            i3 = 90;
        } else if (iP2 == 0 && iP3 == -65536 && iP4 == 65536 && iP5 == 0) {
            i3 = 270;
        } else if (iP2 == -65536 && iP3 == 0 && iP4 == 0 && iP5 == -65536) {
            i3 = 180;
        }
        return new f(iP, j, i3);
    }

    private static int c(u uVar) {
        uVar.c(16);
        return uVar.p();
    }

    private static int a(int i2) {
        if (i2 == f1882b) {
            return 1;
        }
        if (i2 == f1881a) {
            return 2;
        }
        if (i2 == f1883c || i2 == f1884d || i2 == f1885e || i2 == f1886f) {
            return 3;
        }
        return i2 == f1887g ? 4 : -1;
    }

    private static Pair<Long, String> d(u uVar) {
        uVar.c(8);
        int iA = c.d.a.a.e.e.c.a(uVar.p());
        uVar.d(iA == 0 ? 8 : 16);
        long jN = uVar.n();
        uVar.d(iA == 0 ? 4 : 8);
        int i2 = uVar.i();
        return Pair.create(Long.valueOf(jN), "" + ((char) (((i2 >> 10) & 31) + 96)) + ((char) (((i2 >> 5) & 31) + 96)) + ((char) ((i2 & 31) + 96)));
    }

    private static c a(u uVar, int i2, int i3, String str, c.d.a.a.d.f fVar, boolean z) throws x {
        uVar.c(12);
        int iP = uVar.p();
        c cVar = new c(iP);
        for (int i4 = 0; i4 < iP; i4++) {
            int iD = uVar.d();
            int iP2 = uVar.p();
            AbstractC0170e.a(iP2 > 0, "childAtomSize should be positive");
            int iP3 = uVar.p();
            if (iP3 == c.d.a.a.e.e.c.f1873b || iP3 == c.d.a.a.e.e.c.f1874c || iP3 == c.d.a.a.e.e.c.Z || iP3 == c.d.a.a.e.e.c.la || iP3 == c.d.a.a.e.e.c.f1875d || iP3 == c.d.a.a.e.e.c.f1876e || iP3 == c.d.a.a.e.e.c.f1877f || iP3 == c.d.a.a.e.e.c.La || iP3 == c.d.a.a.e.e.c.Ma) {
                a(uVar, iP3, iD, iP2, i2, i3, fVar, cVar, i4);
            } else if (iP3 == c.d.a.a.e.e.c.f1880i || iP3 == c.d.a.a.e.e.c.aa || iP3 == c.d.a.a.e.e.c.n || iP3 == c.d.a.a.e.e.c.p || iP3 == c.d.a.a.e.e.c.r || iP3 == c.d.a.a.e.e.c.u || iP3 == c.d.a.a.e.e.c.s || iP3 == c.d.a.a.e.e.c.t || iP3 == c.d.a.a.e.e.c.ya || iP3 == c.d.a.a.e.e.c.za || iP3 == c.d.a.a.e.e.c.l || iP3 == c.d.a.a.e.e.c.m || iP3 == c.d.a.a.e.e.c.j || iP3 == c.d.a.a.e.e.c.Pa || iP3 == c.d.a.a.e.e.c.Qa || iP3 == c.d.a.a.e.e.c.Ra || iP3 == c.d.a.a.e.e.c.Sa || iP3 == c.d.a.a.e.e.c.Ua) {
                a(uVar, iP3, iD, iP2, i2, str, z, fVar, cVar, i4);
            } else if (iP3 == c.d.a.a.e.e.c.ja || iP3 == c.d.a.a.e.e.c.ua || iP3 == c.d.a.a.e.e.c.va || iP3 == c.d.a.a.e.e.c.wa || iP3 == c.d.a.a.e.e.c.xa) {
                a(uVar, iP3, iD, iP2, i2, str, cVar);
            } else if (iP3 == c.d.a.a.e.e.c.Oa) {
                cVar.f1900b = c.d.a.a.q.a(Integer.toString(i2), "application/x-camera-motion", (String) null, -1, (c.d.a.a.d.f) null);
            }
            uVar.c(iD + iP2);
        }
        return cVar;
    }

    private static void a(u uVar, int i2, int i3, int i4, int i5, String str, c cVar) {
        String str2;
        String str3;
        uVar.c(i3 + 8 + 8);
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i2 == c.d.a.a.e.e.c.ja) {
            str2 = "application/ttml+xml";
        } else {
            if (i2 == c.d.a.a.e.e.c.ua) {
                int i6 = (i4 - 8) - 8;
                byte[] bArr = new byte[i6];
                uVar.a(bArr, 0, i6);
                listSingletonList = Collections.singletonList(bArr);
                str3 = "application/x-quicktime-tx3g";
                cVar.f1900b = c.d.a.a.q.a(Integer.toString(i5), str3, null, -1, 0, str, -1, null, j, listSingletonList);
            }
            if (i2 == c.d.a.a.e.e.c.va) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == c.d.a.a.e.e.c.wa) {
                str2 = "application/ttml+xml";
                j = 0;
            } else if (i2 == c.d.a.a.e.e.c.xa) {
                str2 = "application/x-mp4-cea-608";
                cVar.f1902d = 1;
            } else {
                throw new IllegalStateException();
            }
        }
        str3 = str2;
        cVar.f1900b = c.d.a.a.q.a(Integer.toString(i5), str3, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(c.d.a.a.m.u r22, int r23, int r24, int r25, int r26, int r27, c.d.a.a.d.f r28, c.d.a.a.e.e.d.c r29, int r30) throws c.d.a.a.x {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.e.d.a(c.d.a.a.m.u, int, int, int, int, int, c.d.a.a.d.f, c.d.a.a.e.e.d$c, int):void");
    }

    private static Pair<long[], long[]> b(c.a aVar) {
        c.b bVarD;
        if (aVar == null || (bVarD = aVar.d(c.d.a.a.e.e.c.Q)) == null) {
            return Pair.create(null, null);
        }
        u uVar = bVarD.Xa;
        uVar.c(8);
        int iA = c.d.a.a.e.e.c.a(uVar.p());
        int iV = uVar.v();
        long[] jArr = new long[iV];
        long[] jArr2 = new long[iV];
        for (int i2 = 0; i2 < iV; i2++) {
            jArr[i2] = iA == 1 ? uVar.x() : uVar.n();
            jArr2[i2] = iA == 1 ? uVar.r() : uVar.p();
            if (uVar.k() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            uVar.d(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float c(u uVar, int i2) {
        uVar.c(i2 + 8);
        return uVar.v() / uVar.v();
    }

    private static void a(u uVar, int i2, int i3, int i4, int i5, String str, boolean z, c.d.a.a.d.f fVar, c cVar, int i6) {
        int i7;
        int i8;
        int iT;
        String str2;
        int i9;
        int i10;
        c.d.a.a.d.f fVar2;
        c cVar2;
        String str3;
        String str4;
        byte[] bArr;
        int i11 = i4;
        c.d.a.a.d.f fVarA = fVar;
        c cVar3 = cVar;
        uVar.c(i3 + 8 + 8);
        if (z) {
            i7 = uVar.i();
            uVar.d(6);
        } else {
            uVar.d(8);
            i7 = 0;
        }
        if (i7 == 0 || i7 == 1) {
            i8 = uVar.i();
            uVar.d(6);
            iT = uVar.t();
            if (i7 == 1) {
                uVar.d(16);
            }
        } else {
            if (i7 != 2) {
                return;
            }
            uVar.d(16);
            iT = (int) Math.round(uVar.y());
            int iV = uVar.v();
            uVar.d(20);
            i8 = iV;
        }
        int iD = uVar.d();
        int iIntValue = i2;
        if (iIntValue == c.d.a.a.e.e.c.aa) {
            Pair<Integer, p> pairC = c(uVar, i3, i11);
            if (pairC != null) {
                iIntValue = ((Integer) pairC.first).intValue();
                fVarA = fVarA == null ? null : fVarA.a(((p) pairC.second).f1984b);
                cVar3.f1899a[i6] = (p) pairC.second;
            }
            uVar.c(iD);
        }
        c.d.a.a.d.f fVar3 = fVarA;
        if (iIntValue == c.d.a.a.e.e.c.n) {
            str2 = "audio/ac3";
        } else if (iIntValue == c.d.a.a.e.e.c.p) {
            str2 = "audio/eac3";
        } else if (iIntValue == c.d.a.a.e.e.c.r) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == c.d.a.a.e.e.c.s || iIntValue == c.d.a.a.e.e.c.t) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == c.d.a.a.e.e.c.u) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == c.d.a.a.e.e.c.ya) {
            str2 = "audio/3gpp";
        } else if (iIntValue == c.d.a.a.e.e.c.za) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == c.d.a.a.e.e.c.l || iIntValue == c.d.a.a.e.e.c.m) {
            str2 = "audio/raw";
        } else if (iIntValue == c.d.a.a.e.e.c.j) {
            str2 = "audio/mpeg";
        } else if (iIntValue == c.d.a.a.e.e.c.Pa) {
            str2 = "audio/alac";
        } else if (iIntValue == c.d.a.a.e.e.c.Qa) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == c.d.a.a.e.e.c.Ra) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == c.d.a.a.e.e.c.Sa) {
            str2 = "audio/opus";
        } else {
            str2 = iIntValue == c.d.a.a.e.e.c.Ua ? "audio/flac" : null;
        }
        int iIntValue2 = iT;
        int i12 = iD;
        int iIntValue3 = i8;
        byte[] bArr2 = null;
        String str5 = str2;
        while (i12 - i3 < i11) {
            uVar.c(i12);
            int iP = uVar.p();
            AbstractC0170e.a(iP > 0, "childAtomSize should be positive");
            int iP2 = uVar.p();
            if (iP2 == c.d.a.a.e.e.c.J || (z && iP2 == c.d.a.a.e.e.c.k)) {
                i9 = iP;
                String str6 = str5;
                i10 = i12;
                fVar2 = fVar3;
                cVar2 = cVar3;
                int iB = iP2 == c.d.a.a.e.e.c.J ? i10 : b(uVar, i10, i9);
                if (iB != -1) {
                    Pair<String, byte[]> pairD = d(uVar, iB);
                    str3 = (String) pairD.first;
                    bArr2 = (byte[]) pairD.second;
                    if ("audio/mp4a-latm".equals(str3)) {
                        Pair<Integer, Integer> pairA = AbstractC0172g.a(bArr2);
                        iIntValue2 = ((Integer) pairA.first).intValue();
                        iIntValue3 = ((Integer) pairA.second).intValue();
                    }
                } else {
                    str3 = str6;
                }
                str4 = str3;
            } else {
                if (iP2 == c.d.a.a.e.e.c.o) {
                    uVar.c(i12 + 8);
                    cVar3.f1900b = AbstractC0130h.a(uVar, Integer.toString(i5), str, fVar3);
                } else if (iP2 == c.d.a.a.e.e.c.q) {
                    uVar.c(i12 + 8);
                    cVar3.f1900b = AbstractC0130h.b(uVar, Integer.toString(i5), str, fVar3);
                } else if (iP2 == c.d.a.a.e.e.c.v) {
                    str4 = str5;
                    fVar2 = fVar3;
                    cVar2 = cVar3;
                    cVar2.f1900b = c.d.a.a.q.a(Integer.toString(i5), str5, (String) null, -1, -1, iIntValue3, iIntValue2, (List<byte[]>) null, fVar2, 0, str);
                    i9 = iP;
                    i10 = i12;
                } else {
                    str4 = str5;
                    int i13 = i12;
                    fVar2 = fVar3;
                    cVar2 = cVar3;
                    if (iP2 == c.d.a.a.e.e.c.Pa) {
                        i9 = iP;
                        byte[] bArr3 = new byte[i9];
                        i10 = i13;
                        uVar.c(i10);
                        uVar.a(bArr3, 0, i9);
                        bArr2 = bArr3;
                    } else {
                        i9 = iP;
                        i10 = i13;
                        if (iP2 == c.d.a.a.e.e.c.Ta) {
                            int i14 = i9 - 8;
                            bArr = new byte[f1889i.length + i14];
                            System.arraycopy(f1889i, 0, bArr, 0, f1889i.length);
                            uVar.c(i10 + 8);
                            uVar.a(bArr, f1889i.length, i14);
                        } else if (i9 == c.d.a.a.e.e.c.Va) {
                            int i15 = i9 - 12;
                            bArr = new byte[i15];
                            uVar.c(i10 + 12);
                            uVar.a(bArr, 0, i15);
                        }
                        bArr2 = bArr;
                    }
                }
                i9 = iP;
                str4 = str5;
                i10 = i12;
                fVar2 = fVar3;
                cVar2 = cVar3;
            }
            i12 = i10 + i9;
            cVar3 = cVar2;
            fVar3 = fVar2;
            str5 = str4;
            i11 = i4;
        }
        String str7 = str5;
        c.d.a.a.d.f fVar4 = fVar3;
        c cVar4 = cVar3;
        if (cVar4.f1900b != null || str7 == null) {
            return;
        }
        cVar4.f1900b = c.d.a.a.q.a(Integer.toString(i5), str7, (String) null, -1, -1, iIntValue3, iIntValue2, "audio/raw".equals(str7) ? 2 : -1, (List<byte[]>) (bArr2 == null ? null : Collections.singletonList(bArr2)), fVar4, 0, str);
    }

    private static int b(u uVar, int i2, int i3) {
        int iD = uVar.d();
        while (iD - i2 < i3) {
            uVar.c(iD);
            int iP = uVar.p();
            AbstractC0170e.a(iP > 0, "childAtomSize should be positive");
            if (uVar.p() == c.d.a.a.e.e.c.J) {
                return iD;
            }
            iD += iP;
        }
        return -1;
    }

    private static Pair<String, byte[]> d(u uVar, int i2) {
        uVar.c(i2 + 8 + 4);
        uVar.d(1);
        e(uVar);
        uVar.d(2);
        int iH = uVar.h();
        if ((iH & 128) != 0) {
            uVar.d(2);
        }
        if ((iH & 64) != 0) {
            uVar.d(uVar.i());
        }
        if ((iH & 32) != 0) {
            uVar.d(2);
        }
        uVar.d(1);
        e(uVar);
        String strA = c.d.a.a.m.r.a(uVar.h());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return Pair.create(strA, null);
        }
        uVar.d(12);
        uVar.d(1);
        int iE = e(uVar);
        byte[] bArr = new byte[iE];
        uVar.a(bArr, 0, iE);
        return Pair.create(strA, bArr);
    }

    private static Pair<Integer, p> c(u uVar, int i2, int i3) {
        Pair<Integer, p> pairA;
        int iD = uVar.d();
        while (iD - i2 < i3) {
            uVar.c(iD);
            int iP = uVar.p();
            AbstractC0170e.a(iP > 0, "childAtomSize should be positive");
            if (uVar.p() == c.d.a.a.e.e.c.V && (pairA = a(uVar, iD, iP)) != null) {
                return pairA;
            }
            iD += iP;
        }
        return null;
    }

    static Pair<Integer, p> a(u uVar, int i2, int i3) {
        int i4 = i2 + 8;
        String strE = null;
        Integer numValueOf = null;
        int i5 = -1;
        int i6 = 0;
        while (i4 - i2 < i3) {
            uVar.c(i4);
            int iP = uVar.p();
            int iP2 = uVar.p();
            if (iP2 == c.d.a.a.e.e.c.ba) {
                numValueOf = Integer.valueOf(uVar.p());
            } else if (iP2 == c.d.a.a.e.e.c.W) {
                uVar.d(4);
                strE = uVar.e(4);
            } else if (iP2 == c.d.a.a.e.e.c.X) {
                i5 = i4;
                i6 = iP;
            }
            i4 += iP;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        AbstractC0170e.a(numValueOf != null, "frma atom is mandatory");
        AbstractC0170e.a(i5 != -1, "schi atom is mandatory");
        p pVarA = a(uVar, i5, i6, strE);
        AbstractC0170e.a(pVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, pVarA);
    }

    private static p a(u uVar, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            uVar.c(i6);
            int iP = uVar.p();
            if (uVar.p() == c.d.a.a.e.e.c.Y) {
                int iA = c.d.a.a.e.e.c.a(uVar.p());
                uVar.d(1);
                if (iA == 0) {
                    uVar.d(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int iH = uVar.h();
                    i4 = iH & 15;
                    i5 = (iH & 240) >> 4;
                }
                boolean z = uVar.h() == 1;
                int iH2 = uVar.h();
                byte[] bArr2 = new byte[16];
                uVar.a(bArr2, 0, bArr2.length);
                if (z && iH2 == 0) {
                    int iH3 = uVar.h();
                    bArr = new byte[iH3];
                    uVar.a(bArr, 0, iH3);
                }
                return new p(z, str, iH2, bArr2, i5, i4, bArr);
            }
            i6 += iP;
        }
    }

    private static byte[] d(u uVar, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            uVar.c(i4);
            int iP = uVar.p();
            if (uVar.p() == c.d.a.a.e.e.c.Ka) {
                return Arrays.copyOfRange(uVar.f3567a, i4, iP + i4);
            }
            i4 += iP;
        }
        return null;
    }

    private static int e(u uVar) {
        int iH = uVar.h();
        int i2 = iH & 127;
        while ((iH & 128) == 128) {
            iH = uVar.h();
            i2 = (i2 << 7) | (iH & 127);
        }
        return i2;
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[H.a(3, 0, length)] && jArr[H.a(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1890a;

        /* renamed from: b, reason: collision with root package name */
        public int f1891b;

        /* renamed from: c, reason: collision with root package name */
        public int f1892c;

        /* renamed from: d, reason: collision with root package name */
        public long f1893d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f1894e;

        /* renamed from: f, reason: collision with root package name */
        private final u f1895f;

        /* renamed from: g, reason: collision with root package name */
        private final u f1896g;

        /* renamed from: h, reason: collision with root package name */
        private int f1897h;

        /* renamed from: i, reason: collision with root package name */
        private int f1898i;

        public a(u uVar, u uVar2, boolean z) {
            this.f1896g = uVar;
            this.f1895f = uVar2;
            this.f1894e = z;
            uVar2.c(12);
            this.f1890a = uVar2.v();
            uVar.c(12);
            this.f1898i = uVar.v();
            AbstractC0170e.b(uVar.p() == 1, "first_chunk must be 1");
            this.f1891b = -1;
        }

        public boolean a() {
            int i2 = this.f1891b + 1;
            this.f1891b = i2;
            if (i2 == this.f1890a) {
                return false;
            }
            this.f1893d = this.f1894e ? this.f1895f.x() : this.f1895f.n();
            if (this.f1891b == this.f1897h) {
                this.f1892c = this.f1896g.v();
                this.f1896g.d(4);
                int i3 = this.f1898i - 1;
                this.f1898i = i3;
                this.f1897h = i3 > 0 ? this.f1896g.v() - 1 : -1;
            }
            return true;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f1911a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1912b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1913c;

        public f(int i2, long j, int i3) {
            this.f1911a = i2;
            this.f1912b = j;
            this.f1913c = i3;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final p[] f1899a;

        /* renamed from: b, reason: collision with root package name */
        public c.d.a.a.q f1900b;

        /* renamed from: c, reason: collision with root package name */
        public int f1901c;

        /* renamed from: d, reason: collision with root package name */
        public int f1902d = 0;

        public c(int i2) {
            this.f1899a = new p[i2];
        }
    }

    /* renamed from: c.d.a.a.e.e.d$d, reason: collision with other inner class name */
    static final class C0027d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final int f1903a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1904b;

        /* renamed from: c, reason: collision with root package name */
        private final u f1905c;

        public C0027d(c.b bVar) {
            this.f1905c = bVar.Xa;
            this.f1905c.c(12);
            this.f1903a = this.f1905c.v();
            this.f1904b = this.f1905c.v();
        }

        @Override // c.d.a.a.e.e.d.b
        public int b() {
            return this.f1904b;
        }

        @Override // c.d.a.a.e.e.d.b
        public int c() {
            return this.f1903a == 0 ? this.f1905c.v() : this.f1903a;
        }

        @Override // c.d.a.a.e.e.d.b
        public boolean a() {
            return this.f1903a != 0;
        }
    }

    static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final u f1906a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1907b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1908c;

        /* renamed from: d, reason: collision with root package name */
        private int f1909d;

        /* renamed from: e, reason: collision with root package name */
        private int f1910e;

        @Override // c.d.a.a.e.e.d.b
        public boolean a() {
            return false;
        }

        public e(c.b bVar) {
            this.f1906a = bVar.Xa;
            this.f1906a.c(12);
            this.f1908c = this.f1906a.v() & 255;
            this.f1907b = this.f1906a.v();
        }

        @Override // c.d.a.a.e.e.d.b
        public int b() {
            return this.f1907b;
        }

        @Override // c.d.a.a.e.e.d.b
        public int c() {
            if (this.f1908c == 8) {
                return this.f1906a.h();
            }
            if (this.f1908c == 16) {
                return this.f1906a.i();
            }
            int i2 = this.f1909d;
            this.f1909d = i2 + 1;
            if (i2 % 2 == 0) {
                this.f1910e = this.f1906a.h();
                return (this.f1910e & 240) >> 4;
            }
            return this.f1910e & 15;
        }
    }
}
