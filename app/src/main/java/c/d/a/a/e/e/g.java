package c.d.a.a.e.e;

import c.d.a.a.m.H;

/* loaded from: classes.dex */
abstract class g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f1918a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f1919b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1920c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f1921d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f1922e;

        /* renamed from: f, reason: collision with root package name */
        public final long f1923f;

        private a(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
            this.f1918a = jArr;
            this.f1919b = iArr;
            this.f1920c = i2;
            this.f1921d = jArr2;
            this.f1922e = iArr2;
            this.f1923f = j;
        }
    }

    public static a a(int i2, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i3 = 8192 / i2;
        int i4 = 0;
        int iA = 0;
        for (int i5 : iArr2) {
            iA += H.a(i5, i3);
        }
        long[] jArr2 = new long[iA];
        int[] iArr3 = new int[iA];
        long[] jArr3 = new long[iA];
        int[] iArr4 = new int[iA];
        int i6 = 0;
        int i7 = 0;
        int iMax = 0;
        while (i4 < iArr2.length) {
            int i8 = iArr2[i4];
            long j2 = jArr[i4];
            while (i8 > 0) {
                int iMin = Math.min(i3, i8);
                jArr2[i7] = j2;
                iArr3[i7] = i2 * iMin;
                iMax = Math.max(iMax, iArr3[i7]);
                jArr3[i7] = i6 * j;
                iArr4[i7] = 1;
                j2 += iArr3[i7];
                i6 += iMin;
                i8 -= iMin;
                i7++;
            }
            i4++;
            iArr2 = iArr;
        }
        return new a(jArr2, iArr3, iMax, jArr3, iArr4, j * i6);
    }
}
