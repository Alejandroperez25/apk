package b.d.a;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f1033a = new ThreadLocal<>();

    public static int a(int i2, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int iC = c(iAlpha2, iAlpha);
        return Color.argb(iC, a(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, iC), a(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, iC), a(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, iC));
    }

    private static int c(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    private static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }

    public static int b(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
