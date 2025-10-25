package c.h.a.c.a;

import android.opengl.GLES20;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(boolean z, int i2, int i3, int i4, int i5) {
        if (!z) {
            GLES20.glViewport(0, 0, i2, i3);
        } else if (i2 > i3) {
            int i6 = (i4 * i3) / i5;
            GLES20.glViewport((i2 - i6) / 2, 0, i6, i3);
        } else {
            int i7 = (i5 * i2) / i4;
            GLES20.glViewport(0, (i3 - i7) / 2, i2, i7);
        }
    }
}
