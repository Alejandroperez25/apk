package f.a.c;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class a {
    public static String a(Context context) {
        return context.getFilesDir().getPath();
    }

    public static String b(Context context) {
        return context.getDir("flutter", 0).getPath();
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir().getPath();
        }
        return context.getCacheDir().getPath();
    }
}
