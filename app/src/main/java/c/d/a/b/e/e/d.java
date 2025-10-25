package c.d.a.b.e.e;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class d {
    public static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
