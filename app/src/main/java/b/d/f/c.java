package b.d.f;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c {
    public static int a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
