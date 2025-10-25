package c.h.a.c.b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f4748a;

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f4749b;

    public static void a(int i2) {
        f4748a = new byte[i2];
        f4749b = new byte[i2];
    }

    public static byte[] a(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = i4 / 4;
        System.arraycopy(bArr, 0, f4749b, 0, i4);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = (i6 * 2) + i4;
            int i8 = i4 + i6;
            f4749b[i7] = bArr[i8 + i5];
            f4749b[i7 + 1] = bArr[i8];
        }
        return f4749b;
    }

    public static byte[] b(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = i4 / 4;
        System.arraycopy(bArr, 0, f4749b, 0, i4);
        int i6 = i4 + i5;
        System.arraycopy(bArr, i6, f4749b, i4, i5);
        System.arraycopy(bArr, i4, f4749b, i6, i5);
        return f4749b;
    }

    public static byte[] c(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i3 - 1;
            while (i7 >= 0) {
                f4748a[i5] = bArr[(i7 * i2) + i6];
                i7--;
                i5++;
            }
        }
        int i8 = i3 * i2;
        int i9 = i8 / 4;
        int i10 = i9 / i2;
        while (true) {
            int i11 = i2 / 2;
            if (i4 >= i11) {
                return f4748a;
            }
            int i12 = i10 - 1;
            while (i12 >= 0) {
                int i13 = i5 + i9;
                int i14 = i2 * i12;
                int i15 = i9 + i8 + i14 + i4;
                f4748a[i13] = bArr[i15 + i11];
                f4748a[i13 + 1] = bArr[i15];
                int i16 = i5 + 1;
                int i17 = i14 + i8 + i4;
                f4748a[i5] = bArr[i17 + i11];
                f4748a[i16] = bArr[i17];
                i12--;
                i5 = i16 + 1;
            }
            i4++;
        }
    }

    public static byte[] d(byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = i4 - 1;
        int i6 = 0;
        while (i5 >= 0) {
            f4748a[i6] = bArr[i5];
            i5--;
            i6++;
        }
        int i7 = (i4 / 4) + i4;
        int i8 = i7 - 1;
        while (i8 >= i4) {
            f4748a[i6] = bArr[i8];
            i8--;
            i6++;
        }
        int length = bArr.length - 1;
        while (length >= i7) {
            f4748a[i6] = bArr[length];
            length--;
            i6++;
        }
        return f4748a;
    }

    public static byte[] e(byte[] bArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i4 >= 0) {
            int i6 = i5;
            int i7 = 0;
            while (i7 < i3) {
                f4748a[i6] = bArr[(i7 * i2) + i4];
                i7++;
                i6++;
            }
            i4--;
            i5 = i6;
        }
        int i8 = i3 * i2;
        int i9 = i8 / 4;
        int i10 = i9 / i2;
        int i11 = i5;
        int i12 = 0;
        while (true) {
            if (i12 >= i2 / 2) {
                return f4748a;
            }
            int i13 = i11;
            int i14 = 0;
            while (i14 < i10) {
                int i15 = i13 + i9;
                int i16 = i2 * i14;
                int i17 = ((i9 + i8) + i16) - i12;
                f4748a[i15] = bArr[(i17 + r5) - 1];
                f4748a[i15 + 1] = bArr[(i17 + i2) - 1];
                int i18 = i13 + 1;
                int i19 = (i16 + i8) - i12;
                f4748a[i13] = bArr[(i19 + r5) - 1];
                f4748a[i18] = bArr[(i19 + i2) - 1];
                i14++;
                i13 = i18 + 1;
            }
            i12++;
            i11 = i13;
        }
    }
}
