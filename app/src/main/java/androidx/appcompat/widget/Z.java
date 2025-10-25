package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class Z extends G {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f340b;

    public Z(Context context, Resources resources) {
        super(resources);
        this.f340b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.G, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f340b.get();
        if (drawable != null && context != null) {
            C0083j.a();
            C0083j.a(context, i2, drawable);
        }
        return drawable;
    }
}
