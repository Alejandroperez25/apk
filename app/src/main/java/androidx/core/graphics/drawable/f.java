package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f573a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f574b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f575c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f576d;

    f(f fVar) {
        this.f575c = null;
        this.f576d = d.f565a;
        if (fVar != null) {
            this.f573a = fVar.f573a;
            this.f574b = fVar.f574b;
            this.f575c = fVar.f575c;
            this.f576d = fVar.f576d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(this, resources);
        }
        return new d(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f573a | (this.f574b != null ? this.f574b.getChangingConfigurations() : 0);
    }

    boolean a() {
        return this.f574b != null;
    }
}
