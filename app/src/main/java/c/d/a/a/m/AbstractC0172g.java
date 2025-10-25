package c.d.a.a.m;

import android.util.Pair;
import b.a.a$i;
import java.util.ArrayList;

/* renamed from: c.d.a.a.m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0172g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3514a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f3515b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f3516c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        return a(new t(bArr), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(c.d.a.a.m.t r5, boolean r6) throws c.d.a.a.x {
        /*
            int r0 = a(r5)
            int r1 = b(r5)
            r2 = 4
            int r3 = r5.c(r2)
            r4 = 5
            if (r0 == r4) goto L14
            r4 = 29
            if (r0 != r4) goto L24
        L14:
            int r1 = b(r5)
            int r0 = a(r5)
            r4 = 22
            if (r0 != r4) goto L24
            int r3 = r5.c(r2)
        L24:
            if (r6 == 0) goto L73
            r6 = 17
            if (r0 == r6) goto L4a
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                default: goto L2d;
            }
        L2d:
            switch(r0) {
                case 6: goto L4a;
                case 7: goto L4a;
                default: goto L30;
            }
        L30:
            switch(r0) {
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                default: goto L33;
            }
        L33:
            c.d.a.a.x r5 = new c.d.a.a.x
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unsupported audio object type: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L4a:
            a(r5, r0, r3)
            switch(r0) {
                case 17: goto L51;
                case 18: goto L50;
                case 19: goto L51;
                case 20: goto L51;
                case 21: goto L51;
                case 22: goto L51;
                case 23: goto L51;
                default: goto L50;
            }
        L50:
            goto L73
        L51:
            r6 = 2
            int r5 = r5.c(r6)
            if (r5 == r6) goto L5c
            r6 = 3
            if (r5 == r6) goto L5c
            goto L73
        L5c:
            c.d.a.a.x r6 = new c.d.a.a.x
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported epConfig: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L73:
            int[] r5 = c.d.a.a.m.AbstractC0172g.f3516c
            r5 = r5[r3]
            r6 = -1
            if (r5 == r6) goto L7c
            r6 = 1
            goto L7d
        L7c:
            r6 = 0
        L7d:
            c.d.a.a.m.AbstractC0170e.a(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Pair r5 = android.util.Pair.create(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.m.AbstractC0172g.a(c.d.a.a.m.t, boolean):android.util.Pair");
    }

    public static byte[] a(int i2, int i3) {
        int i4 = -1;
        for (int i5 = 0; i5 < f3515b.length; i5++) {
            if (i2 == f3515b[i5]) {
                i4 = i5;
            }
        }
        int i6 = -1;
        for (int i7 = 0; i7 < f3516c.length; i7++) {
            if (i3 == f3516c[i7]) {
                i6 = i7;
            }
        }
        if (i2 == -1 || i6 == -1) {
            throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i2 + ", " + i3);
        }
        return a(2, i4, i6);
    }

    public static byte[] a(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & a$i.AppCompatTheme_windowNoTitle))};
    }

    public static String b(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static byte[] a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[f3514a.length + i3];
        System.arraycopy(f3514a, 0, bArr2, 0, f3514a.length);
        System.arraycopy(bArr, i2, bArr2, f3514a.length, i3);
        return bArr2;
    }

    public static byte[][] b(byte[] bArr) {
        if (!b(bArr, 0)) {
            return (byte[][]) null;
        }
        ArrayList arrayList = new ArrayList();
        int iA = 0;
        do {
            arrayList.add(Integer.valueOf(iA));
            iA = a(bArr, iA + f3514a.length);
        } while (iA != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            byte[] bArr3 = new byte[(i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - iIntValue];
            System.arraycopy(bArr, iIntValue, bArr3, 0, bArr3.length);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }

    private static int a(byte[] bArr, int i2) {
        int length = bArr.length - f3514a.length;
        while (i2 <= length) {
            if (b(bArr, i2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean b(byte[] bArr, int i2) {
        if (bArr.length - i2 <= f3514a.length) {
            return false;
        }
        for (int i3 = 0; i3 < f3514a.length; i3++) {
            if (bArr[i2 + i3] != f3514a[i3]) {
                return false;
            }
        }
        return true;
    }

    private static int a(t tVar) {
        int iC = tVar.c(5);
        return iC == 31 ? tVar.c(6) + 32 : iC;
    }

    private static int b(t tVar) {
        int iC = tVar.c(4);
        if (iC == 15) {
            return tVar.c(24);
        }
        AbstractC0170e.a(iC < 13);
        return f3515b[iC];
    }

    private static void a(t tVar, int i2, int i3) {
        tVar.b(1);
        if (tVar.e()) {
            tVar.b(14);
        }
        boolean zE = tVar.e();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6 || i2 == 20) {
            tVar.b(3);
        }
        if (zE) {
            if (i2 == 22) {
                tVar.b(16);
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                tVar.b(3);
            }
            tVar.b(1);
        }
    }
}
