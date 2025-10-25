package c.h.a.c.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f4745a;

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f4746b;

    public static void a(int i2) {
        f4745a = new byte[i2];
        f4746b = new byte[i2];
    }

    public static byte[] a(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = i4 / 4;
        System.arraycopy(bArr, 0, f4746b, 0, i4);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = (i6 * 2) + i4;
            int i8 = i7 + 1;
            f4746b[i7] = bArr[i8];
            f4746b[i8] = bArr[i7];
        }
        return f4746b;
    }

    public static byte[] b(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = i4 / 4;
        System.arraycopy(bArr, 0, f4746b, 0, i4);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i4 + i6;
            int i8 = (i6 * 2) + i4;
            f4746b[i7] = bArr[i8 + 1];
            f4746b[i7 + i5] = bArr[i8];
        }
        return f4746b;
    }

    public static byte[] c(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = i3 - 1;
            while (i6 >= 0) {
                f4745a[i4] = bArr[(i6 * i2) + i5];
                i6--;
                i4++;
            }
        }
        int i7 = i2 * i3;
        int i8 = ((i7 * 3) / 2) - 1;
        int i9 = i2 - 1;
        while (i9 > 0) {
            int i10 = i8;
            int i11 = 0;
            while (i11 < i3 / 2) {
                int i12 = i10 - 1;
                int i13 = (i11 * i2) + i7;
                f4745a[i10] = bArr[i13 + i9];
                f4745a[i12] = bArr[i13 + (i9 - 1)];
                i11++;
                i10 = i12 - 1;
            }
            i9 -= 2;
            i8 = i10;
        }
        return f4745a;
    }

    public static byte[] d(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = 0;
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            f4745a[i5] = bArr[i6];
            i5++;
        }
        int i7 = ((i4 * 3) / 2) - 1;
        while (i7 >= i4) {
            int i8 = i5 + 1;
            f4745a[i5] = bArr[i7 - 1];
            f4745a[i8] = bArr[i7];
            i7 -= 2;
            i5 = i8 + 1;
        }
        return f4745a;
    }

    public static byte[] e(byte[] bArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = i4;
        int i6 = 0;
        while (i5 >= 0) {
            int i7 = i6;
            int i8 = 0;
            while (i8 < i3) {
                f4745a[i7] = bArr[(i8 * i2) + i5];
                i8++;
                i7++;
            }
            i5--;
            i6 = i7;
        }
        int i9 = i2 * i3;
        int i10 = i3 / 2;
        while (i4 >= 0) {
            int i11 = i9;
            int i12 = i3;
            while (i12 < i10 + i3) {
                int i13 = i11 + 1;
                int i14 = (i12 * i2) + i4;
                f4745a[i11] = bArr[i14 - 1];
                f4745a[i13] = bArr[i14];
                i12++;
                i11 = i13 + 1;
            }
            i4 -= 2;
            i9 = i11;
        }
        return f4745a;
    }
}
