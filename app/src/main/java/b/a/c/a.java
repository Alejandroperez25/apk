package b.a.c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f935a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.f935a = context;
    }

    public int a() {
        Configuration configuration = this.f935a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f935a).hasPermanentMenuKey();
    }

    public int c() {
        return this.f935a.getResources().getDisplayMetrics().widthPixels / 2;
    }
}
