package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import b.a.a$i;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0087n {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f419a;

    /* renamed from: b, reason: collision with root package name */
    private Y f420b;

    /* renamed from: c, reason: collision with root package name */
    private Y f421c;

    /* renamed from: d, reason: collision with root package name */
    private Y f422d;

    public C0087n(ImageView imageView) {
        this.f419a = imageView;
    }

    public void a(AttributeSet attributeSet, int i2) {
        int iG;
        aa aaVarA = aa.a(this.f419a.getContext(), attributeSet, a$i.AppCompatImageView, i2, 0);
        try {
            Drawable drawable = this.f419a.getDrawable();
            if (drawable == null && (iG = aaVarA.g(a$i.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = b.a.a.a.a.b(this.f419a.getContext(), iG)) != null) {
                this.f419a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0096w.a(drawable);
            }
            if (aaVarA.e(a$i.AppCompatImageView_tint)) {
                androidx.core.widget.d.a(this.f419a, aaVarA.d(a$i.AppCompatImageView_tint));
            }
            if (aaVarA.e(a$i.AppCompatImageView_tintMode)) {
                androidx.core.widget.d.a(this.f419a, AbstractC0096w.a(aaVarA.a(a$i.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            aaVarA.a();
        }
    }

    public void a(int i2) {
        if (i2 != 0) {
            Drawable drawableB = b.a.a.a.a.b(this.f419a.getContext(), i2);
            if (drawableB != null) {
                AbstractC0096w.a(drawableB);
            }
            this.f419a.setImageDrawable(drawableB);
        } else {
            this.f419a.setImageDrawable(null);
        }
        d();
    }

    boolean a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f419a.getBackground() instanceof RippleDrawable);
    }

    void a(ColorStateList colorStateList) {
        if (this.f421c == null) {
            this.f421c = new Y();
        }
        this.f421c.f336a = colorStateList;
        this.f421c.f339d = true;
        d();
    }

    ColorStateList b() {
        if (this.f421c != null) {
            return this.f421c.f336a;
        }
        return null;
    }

    void a(PorterDuff.Mode mode) {
        if (this.f421c == null) {
            this.f421c = new Y();
        }
        this.f421c.f337b = mode;
        this.f421c.f338c = true;
        d();
    }

    PorterDuff.Mode c() {
        if (this.f421c != null) {
            return this.f421c.f337b;
        }
        return null;
    }

    void d() {
        Drawable drawable = this.f419a.getDrawable();
        if (drawable != null) {
            AbstractC0096w.a(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            if (this.f421c != null) {
                C0083j.a(drawable, this.f421c, this.f419a.getDrawableState());
            } else if (this.f420b != null) {
                C0083j.a(drawable, this.f420b, this.f419a.getDrawableState());
            }
        }
    }

    private boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f420b != null : i2 == 21;
    }

    private boolean a(Drawable drawable) {
        if (this.f422d == null) {
            this.f422d = new Y();
        }
        Y y = this.f422d;
        y.a();
        ColorStateList colorStateListA = androidx.core.widget.d.a(this.f419a);
        if (colorStateListA != null) {
            y.f339d = true;
            y.f336a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.d.b(this.f419a);
        if (modeB != null) {
            y.f338c = true;
            y.f337b = modeB;
        }
        if (!y.f339d && !y.f338c) {
            return false;
        }
        C0083j.a(drawable, y, this.f419a.getDrawableState());
        return true;
    }
}
