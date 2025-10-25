package c.d.a.b.e.d;

import b.a.a$i;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3964a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f3965b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f3966c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f3967d = {1, 1, 2, 6, 24, a$i.AppCompatTheme_windowNoTitle, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    private static int[] f3968e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, a$i.AppCompatTheme_viewInflaterClass, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int i2, int i3) {
        long j = i2 << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
