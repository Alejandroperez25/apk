package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ma extends Resources {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f417a = false;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f418b;

    public static boolean a() {
        return b() && Build.VERSION.SDK_INT <= 20;
    }

    public ma(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f418b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f418b.get();
        if (context != null) {
            return C0083j.a().a(context, this, i2);
        }
        return super.getDrawable(i2);
    }

    final Drawable a(int i2) {
        return super.getDrawable(i2);
    }

    public static boolean b() {
        return f417a;
    }
}
