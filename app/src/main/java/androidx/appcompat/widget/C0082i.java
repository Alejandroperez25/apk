package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import b.a.a$i;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0082i {

    /* renamed from: a, reason: collision with root package name */
    private final View f382a;

    /* renamed from: d, reason: collision with root package name */
    private Y f385d;

    /* renamed from: e, reason: collision with root package name */
    private Y f386e;

    /* renamed from: f, reason: collision with root package name */
    private Y f387f;

    /* renamed from: c, reason: collision with root package name */
    private int f384c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final C0083j f383b = C0083j.a();

    C0082i(View view) {
        this.f382a = view;
    }

    void a(AttributeSet attributeSet, int i2) {
        aa aaVarA = aa.a(this.f382a.getContext(), attributeSet, a$i.ViewBackgroundHelper, i2, 0);
        try {
            if (aaVarA.e(a$i.ViewBackgroundHelper_android_background)) {
                this.f384c = aaVarA.g(a$i.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListB = this.f383b.b(this.f382a.getContext(), this.f384c);
                if (colorStateListB != null) {
                    b(colorStateListB);
                }
            }
            if (aaVarA.e(a$i.ViewBackgroundHelper_backgroundTint)) {
                b.d.g.v.a(this.f382a, aaVarA.d(a$i.ViewBackgroundHelper_backgroundTint));
            }
            if (aaVarA.e(a$i.ViewBackgroundHelper_backgroundTintMode)) {
                b.d.g.v.a(this.f382a, AbstractC0096w.a(aaVarA.a(a$i.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            aaVarA.a();
        }
    }

    void a(int i2) {
        this.f384c = i2;
        b(this.f383b != null ? this.f383b.b(this.f382a.getContext(), i2) : null);
        c();
    }

    void a(Drawable drawable) {
        this.f384c = -1;
        b((ColorStateList) null);
        c();
    }

    void a(ColorStateList colorStateList) {
        if (this.f386e == null) {
            this.f386e = new Y();
        }
        this.f386e.f336a = colorStateList;
        this.f386e.f339d = true;
        c();
    }

    ColorStateList a() {
        if (this.f386e != null) {
            return this.f386e.f336a;
        }
        return null;
    }

    void a(PorterDuff.Mode mode) {
        if (this.f386e == null) {
            this.f386e = new Y();
        }
        this.f386e.f337b = mode;
        this.f386e.f338c = true;
        c();
    }

    PorterDuff.Mode b() {
        if (this.f386e != null) {
            return this.f386e.f337b;
        }
        return null;
    }

    void c() {
        Drawable background = this.f382a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            if (this.f386e != null) {
                C0083j.a(background, this.f386e, this.f382a.getDrawableState());
            } else if (this.f385d != null) {
                C0083j.a(background, this.f385d, this.f382a.getDrawableState());
            }
        }
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f385d == null) {
                this.f385d = new Y();
            }
            this.f385d.f336a = colorStateList;
            this.f385d.f339d = true;
        } else {
            this.f385d = null;
        }
        c();
    }

    private boolean d() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f385d != null : i2 == 21;
    }

    private boolean b(Drawable drawable) {
        if (this.f387f == null) {
            this.f387f = new Y();
        }
        Y y = this.f387f;
        y.a();
        ColorStateList colorStateListH = b.d.g.v.h(this.f382a);
        if (colorStateListH != null) {
            y.f339d = true;
            y.f336a = colorStateListH;
        }
        PorterDuff.Mode modeI = b.d.g.v.i(this.f382a);
        if (modeI != null) {
            y.f338c = true;
            y.f337b = modeI;
        }
        if (!y.f339d && !y.f338c) {
            return false;
        }
        C0083j.a(drawable, y, this.f382a.getDrawableState());
        return true;
    }
}
