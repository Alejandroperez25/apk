package c.d.a.a.b;

import b.a.a$i;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: c.d.a.a.b.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0130h {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1555a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1556b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1557c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f1558d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f1559e = {32, 40, 48, 56, 64, 80, 96, a$i.AppCompatTheme_windowActionBarOverlay, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f1560f = {69, 87, a$i.AppCompatTheme_textColorAlertDialogListItem, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    /* renamed from: c.d.a.a.b.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1561a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1562b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1563c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1564d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1565e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1566f;

        private a(String str, int i2, int i3, int i4, int i5, int i6) {
            this.f1561a = str;
            this.f1562b = i2;
            this.f1564d = i3;
            this.f1563c = i4;
            this.f1565e = i5;
            this.f1566f = i6;
        }
    }

    public static c.d.a.a.q a(c.d.a.a.m.u uVar, String str, String str2, c.d.a.a.d.f fVar) {
        int i2 = f1556b[(uVar.h() & 192) >> 6];
        int iH = uVar.h();
        int i3 = f1558d[(iH & 56) >> 3];
        if ((iH & 4) != 0) {
            i3++;
        }
        return c.d.a.a.q.a(str, "audio/ac3", (String) null, -1, -1, i3, i2, (List<byte[]>) null, fVar, 0, str2);
    }

    public static c.d.a.a.q b(c.d.a.a.m.u uVar, String str, String str2, c.d.a.a.d.f fVar) {
        uVar.d(2);
        int i2 = f1556b[(uVar.h() & 192) >> 6];
        int iH = uVar.h();
        int i3 = f1558d[(iH & 14) >> 1];
        if ((iH & 1) != 0) {
            i3++;
        }
        if (((uVar.h() & 30) >> 1) > 0 && (2 & uVar.h()) != 0) {
            i3 += 2;
        }
        int i4 = i3;
        String str3 = "audio/eac3";
        if (uVar.b() > 0 && (uVar.h() & 1) != 0) {
            str3 = "audio/eac3-joc";
        }
        return c.d.a.a.q.a(str, str3, (String) null, -1, -1, i4, i2, (List<byte[]>) null, fVar, 0, str2);
    }

    public static a a(c.d.a.a.m.t tVar) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iC;
        int i7;
        int i8;
        int i9;
        int iB = tVar.b();
        tVar.b(40);
        boolean z = tVar.c(5) == 16;
        tVar.a(iB);
        int i10 = -1;
        if (z) {
            tVar.b(16);
            switch (tVar.c(2)) {
                case 0:
                    i10 = 0;
                    break;
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    i10 = 2;
                    break;
            }
            tVar.b(3);
            int iC2 = (tVar.c(11) + 1) * 2;
            int iC3 = tVar.c(2);
            if (iC3 == 3) {
                i8 = f1557c[tVar.c(2)];
                iC = 3;
                i7 = 6;
            } else {
                iC = tVar.c(2);
                i7 = f1555a[iC];
                i8 = f1556b[iC3];
            }
            int i11 = i7 * 256;
            int iC4 = tVar.c(3);
            boolean zE = tVar.e();
            int i12 = f1558d[iC4] + (zE ? 1 : 0);
            tVar.b(10);
            if (tVar.e()) {
                tVar.b(8);
            }
            if (iC4 == 0) {
                tVar.b(5);
                if (tVar.e()) {
                    tVar.b(8);
                }
            }
            if (i10 == 1 && tVar.e()) {
                tVar.b(16);
            }
            if (tVar.e()) {
                if (iC4 > 2) {
                    tVar.b(2);
                }
                if ((iC4 & 1) != 0 && iC4 > 2) {
                    tVar.b(6);
                }
                if ((iC4 & 4) != 0) {
                    tVar.b(6);
                }
                if (zE && tVar.e()) {
                    tVar.b(5);
                }
                if (i10 == 0) {
                    if (tVar.e()) {
                        tVar.b(6);
                    }
                    if (iC4 == 0 && tVar.e()) {
                        tVar.b(6);
                    }
                    if (tVar.e()) {
                        tVar.b(6);
                    }
                    int iC5 = tVar.c(2);
                    if (iC5 == 1) {
                        tVar.b(5);
                    } else if (iC5 == 2) {
                        tVar.b(12);
                    } else if (iC5 == 3) {
                        int iC6 = tVar.c(5);
                        if (tVar.e()) {
                            tVar.b(5);
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                tVar.b(4);
                            }
                            if (tVar.e()) {
                                if (tVar.e()) {
                                    tVar.b(4);
                                }
                                if (tVar.e()) {
                                    tVar.b(4);
                                }
                            }
                        }
                        if (tVar.e()) {
                            tVar.b(5);
                            if (tVar.e()) {
                                tVar.b(7);
                                if (tVar.e()) {
                                    tVar.b(8);
                                }
                            }
                        }
                        tVar.b((iC6 + 2) * 8);
                        tVar.f();
                    }
                    if (iC4 < 2) {
                        if (tVar.e()) {
                            tVar.b(14);
                        }
                        if (iC4 == 0 && tVar.e()) {
                            tVar.b(14);
                        }
                    }
                    if (tVar.e()) {
                        if (iC == 0) {
                            tVar.b(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (tVar.e()) {
                                    tVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (tVar.e()) {
                tVar.b(5);
                if (iC4 == 2) {
                    tVar.b(4);
                }
                if (iC4 >= 6) {
                    tVar.b(2);
                }
                if (tVar.e()) {
                    tVar.b(8);
                }
                if (iC4 == 0 && tVar.e()) {
                    tVar.b(8);
                }
                i9 = 3;
                if (iC3 < 3) {
                    tVar.d();
                }
            } else {
                i9 = 3;
            }
            if (i10 == 0 && iC != i9) {
                tVar.d();
            }
            if (i10 == 2 && (iC == i9 || tVar.e())) {
                tVar.b(6);
            }
            String str2 = "audio/eac3";
            if (tVar.e() && tVar.c(6) == 1 && tVar.c(8) == 1) {
                str2 = "audio/eac3-joc";
            }
            i5 = i10;
            str = str2;
            i2 = iC2;
            i3 = i8;
            i6 = i11;
            i4 = i12;
        } else {
            tVar.b(32);
            int iC7 = tVar.c(2);
            int iA = a(iC7, tVar.c(6));
            tVar.b(8);
            int iC8 = tVar.c(3);
            if ((iC8 & 1) != 0 && iC8 != 1) {
                tVar.b(2);
            }
            if ((iC8 & 4) != 0) {
                tVar.b(2);
            }
            if (iC8 == 2) {
                tVar.b(2);
            }
            str = "audio/ac3";
            i2 = iA;
            i3 = f1556b[iC7];
            i4 = f1558d[iC8] + (tVar.e() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new a(str, i5, i4, i3, i2, i6);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 255) >> 3) == 16) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f1555a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i2 = iPosition; i2 <= iLimit; i2++) {
            if ((byteBuffer.getInt(i2 + 4) & (-16777217)) == -1167101192) {
                return i2 - iPosition;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int a(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= f1556b.length || i3 < 0 || i4 >= f1560f.length) {
            return -1;
        }
        int i5 = f1556b[i2];
        if (i5 == 44100) {
            return (f1560f[i4] + (i3 % 2)) * 2;
        }
        int i6 = f1559e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }
}
