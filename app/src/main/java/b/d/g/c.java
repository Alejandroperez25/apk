package b.d.g;

import android.os.Build;
import android.view.Gravity;

/* loaded from: classes.dex */
public abstract class c {
    public static int a(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i2, i3) : i2 & (-8388609);
    }
}
