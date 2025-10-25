package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class X extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f332a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<WeakReference<X>> f333b;

    /* renamed from: c, reason: collision with root package name */
    private final Resources f334c;

    /* renamed from: d, reason: collision with root package name */
    private final Resources.Theme f335d;

    public static Context a(Context context) {
        if (!b(context)) {
            return context;
        }
        synchronized (f332a) {
            if (f333b == null) {
                f333b = new ArrayList<>();
            } else {
                for (int size = f333b.size() - 1; size >= 0; size--) {
                    WeakReference<X> weakReference = f333b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f333b.remove(size);
                    }
                }
                for (int size2 = f333b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<X> weakReference2 = f333b.get(size2);
                    X x = weakReference2 != null ? weakReference2.get() : null;
                    if (x != null && x.getBaseContext() == context) {
                        return x;
                    }
                }
            }
            X x2 = new X(context);
            f333b.add(new WeakReference<>(x2));
            return x2;
        }
    }

    private static boolean b(Context context) {
        if ((context instanceof X) || (context.getResources() instanceof Z) || (context.getResources() instanceof ma)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || ma.a();
    }

    private X(Context context) {
        super(context);
        if (ma.a()) {
            this.f334c = new ma(this, context.getResources());
            this.f335d = this.f334c.newTheme();
            this.f335d.setTo(context.getTheme());
        } else {
            this.f334c = new Z(this, context.getResources());
            this.f335d = null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return this.f335d == null ? super.getTheme() : this.f335d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f335d == null) {
            super.setTheme(i2);
        } else {
            this.f335d.applyStyle(i2, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f334c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f334c.getAssets();
    }
}
