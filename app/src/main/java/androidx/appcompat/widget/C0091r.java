package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import b.a.a$i;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.appcompat.widget.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0091r {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f430a;

    /* renamed from: b, reason: collision with root package name */
    private Y f431b;

    /* renamed from: c, reason: collision with root package name */
    private Y f432c;

    /* renamed from: d, reason: collision with root package name */
    private Y f433d;

    /* renamed from: e, reason: collision with root package name */
    private Y f434e;

    /* renamed from: f, reason: collision with root package name */
    private Y f435f;

    /* renamed from: g, reason: collision with root package name */
    private Y f436g;

    /* renamed from: h, reason: collision with root package name */
    private final C0093t f437h;

    /* renamed from: i, reason: collision with root package name */
    private int f438i = 0;
    private Typeface j;
    private boolean k;

    C0091r(TextView textView) {
        this.f430a = textView;
        this.f437h = new C0093t(this.f430a);
    }

    @SuppressLint({"NewApi"})
    void a(AttributeSet attributeSet, int i2) throws Resources.NotFoundException {
        ColorStateList colorStateListD;
        ColorStateList colorStateListD2;
        boolean z;
        boolean zA;
        Context context = this.f430a.getContext();
        C0083j c0083jA = C0083j.a();
        aa aaVarA = aa.a(context, attributeSet, a$i.AppCompatTextHelper, i2, 0);
        int iG = aaVarA.g(a$i.AppCompatTextHelper_android_textAppearance, -1);
        if (aaVarA.e(a$i.AppCompatTextHelper_android_drawableLeft)) {
            this.f431b = a(context, c0083jA, aaVarA.g(a$i.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (aaVarA.e(a$i.AppCompatTextHelper_android_drawableTop)) {
            this.f432c = a(context, c0083jA, aaVarA.g(a$i.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (aaVarA.e(a$i.AppCompatTextHelper_android_drawableRight)) {
            this.f433d = a(context, c0083jA, aaVarA.g(a$i.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (aaVarA.e(a$i.AppCompatTextHelper_android_drawableBottom)) {
            this.f434e = a(context, c0083jA, aaVarA.g(a$i.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (aaVarA.e(a$i.AppCompatTextHelper_android_drawableStart)) {
                this.f435f = a(context, c0083jA, aaVarA.g(a$i.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (aaVarA.e(a$i.AppCompatTextHelper_android_drawableEnd)) {
                this.f436g = a(context, c0083jA, aaVarA.g(a$i.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        aaVarA.a();
        boolean z2 = this.f430a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z3 = true;
        if (iG != -1) {
            aa aaVarA2 = aa.a(context, iG, a$i.TextAppearance);
            if (z2 || !aaVarA2.e(a$i.TextAppearance_textAllCaps)) {
                z = false;
                zA = false;
            } else {
                zA = aaVarA2.a(a$i.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, aaVarA2);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList colorStateListD3 = aaVarA2.e(a$i.TextAppearance_android_textColor) ? aaVarA2.d(a$i.TextAppearance_android_textColor) : null;
                colorStateListD2 = aaVarA2.e(a$i.TextAppearance_android_textColorHint) ? aaVarA2.d(a$i.TextAppearance_android_textColorHint) : null;
                ColorStateList colorStateList = colorStateListD3;
                colorStateListD = aaVarA2.e(a$i.TextAppearance_android_textColorLink) ? aaVarA2.d(a$i.TextAppearance_android_textColorLink) : null;
                colorStateListD = colorStateList;
            } else {
                colorStateListD = null;
                colorStateListD2 = null;
            }
            aaVarA2.a();
        } else {
            colorStateListD = null;
            colorStateListD2 = null;
            z = false;
            zA = false;
        }
        aa aaVarA3 = aa.a(context, attributeSet, a$i.TextAppearance, i2, 0);
        if (z2 || !aaVarA3.e(a$i.TextAppearance_textAllCaps)) {
            z3 = z;
        } else {
            zA = aaVarA3.a(a$i.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (aaVarA3.e(a$i.TextAppearance_android_textColor)) {
                colorStateListD = aaVarA3.d(a$i.TextAppearance_android_textColor);
            }
            if (aaVarA3.e(a$i.TextAppearance_android_textColorHint)) {
                colorStateListD2 = aaVarA3.d(a$i.TextAppearance_android_textColorHint);
            }
            if (aaVarA3.e(a$i.TextAppearance_android_textColorLink)) {
                colorStateListD = aaVarA3.d(a$i.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && aaVarA3.e(a$i.TextAppearance_android_textSize) && aaVarA3.e(a$i.TextAppearance_android_textSize, -1) == 0) {
            this.f430a.setTextSize(0, 0.0f);
        }
        a(context, aaVarA3);
        aaVarA3.a();
        if (colorStateListD != null) {
            this.f430a.setTextColor(colorStateListD);
        }
        if (colorStateListD2 != null) {
            this.f430a.setHintTextColor(colorStateListD2);
        }
        if (colorStateListD != null) {
            this.f430a.setLinkTextColor(colorStateListD);
        }
        if (!z2 && z3) {
            a(zA);
        }
        if (this.j != null) {
            this.f430a.setTypeface(this.j, this.f438i);
        }
        this.f437h.a(attributeSet, i2);
        if (androidx.core.widget.b.f606a && this.f437h.a() != 0) {
            int[] iArrE = this.f437h.e();
            if (iArrE.length > 0) {
                if (this.f430a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f430a.setAutoSizeTextTypeUniformWithConfiguration(this.f437h.c(), this.f437h.d(), this.f437h.b(), 0);
                } else {
                    this.f430a.setAutoSizeTextTypeUniformWithPresetSizes(iArrE, 0);
                }
            }
        }
        aa aaVarA4 = aa.a(context, attributeSet, a$i.AppCompatTextView);
        int iE = aaVarA4.e(a$i.AppCompatTextView_firstBaselineToTopHeight, -1);
        int iE2 = aaVarA4.e(a$i.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int iE3 = aaVarA4.e(a$i.AppCompatTextView_lineHeight, -1);
        aaVarA4.a();
        if (iE != -1) {
            androidx.core.widget.i.a(this.f430a, iE);
        }
        if (iE2 != -1) {
            androidx.core.widget.i.b(this.f430a, iE2);
        }
        if (iE3 != -1) {
            androidx.core.widget.i.c(this.f430a, iE3);
        }
    }

    private void a(Context context, aa aaVar) {
        String strC;
        this.f438i = aaVar.a(a$i.TextAppearance_android_textStyle, this.f438i);
        boolean z = true;
        if (aaVar.e(a$i.TextAppearance_android_fontFamily) || aaVar.e(a$i.TextAppearance_fontFamily)) {
            this.j = null;
            int i2 = aaVar.e(a$i.TextAppearance_fontFamily) ? a$i.TextAppearance_fontFamily : a$i.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.j = aaVar.a(i2, this.f438i, new C0090q(this, new WeakReference(this.f430a)));
                    if (this.j != null) {
                        z = false;
                    }
                    this.k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.j != null || (strC = aaVar.c(i2)) == null) {
                return;
            }
            this.j = Typeface.create(strC, this.f438i);
            return;
        }
        if (aaVar.e(a$i.TextAppearance_android_typeface)) {
            this.k = false;
            switch (aaVar.a(a$i.TextAppearance_android_typeface, 1)) {
                case 1:
                    this.j = Typeface.SANS_SERIF;
                    break;
                case 2:
                    this.j = Typeface.SERIF;
                    break;
                case 3:
                    this.j = Typeface.MONOSPACE;
                    break;
            }
        }
    }

    void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.k) {
            this.j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f438i);
            }
        }
    }

    void a(Context context, int i2) {
        ColorStateList colorStateListD;
        aa aaVarA = aa.a(context, i2, a$i.TextAppearance);
        if (aaVarA.e(a$i.TextAppearance_textAllCaps)) {
            a(aaVarA.a(a$i.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && aaVarA.e(a$i.TextAppearance_android_textColor) && (colorStateListD = aaVarA.d(a$i.TextAppearance_android_textColor)) != null) {
            this.f430a.setTextColor(colorStateListD);
        }
        if (aaVarA.e(a$i.TextAppearance_android_textSize) && aaVarA.e(a$i.TextAppearance_android_textSize, -1) == 0) {
            this.f430a.setTextSize(0, 0.0f);
        }
        a(context, aaVarA);
        aaVarA.a();
        if (this.j != null) {
            this.f430a.setTypeface(this.j, this.f438i);
        }
    }

    void a(boolean z) {
        this.f430a.setAllCaps(z);
    }

    void a() {
        if (this.f431b != null || this.f432c != null || this.f433d != null || this.f434e != null) {
            Drawable[] compoundDrawables = this.f430a.getCompoundDrawables();
            a(compoundDrawables[0], this.f431b);
            a(compoundDrawables[1], this.f432c);
            a(compoundDrawables[2], this.f433d);
            a(compoundDrawables[3], this.f434e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f435f == null && this.f436g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f430a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f435f);
            a(compoundDrawablesRelative[2], this.f436g);
        }
    }

    private void a(Drawable drawable, Y y) {
        if (drawable == null || y == null) {
            return;
        }
        C0083j.a(drawable, y, this.f430a.getDrawableState());
    }

    private static Y a(Context context, C0083j c0083j, int i2) {
        ColorStateList colorStateListB = c0083j.b(context, i2);
        if (colorStateListB == null) {
            return null;
        }
        Y y = new Y();
        y.f339d = true;
        y.f336a = colorStateListB;
        return y;
    }

    void a(boolean z, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f606a) {
            return;
        }
        b();
    }

    void a(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (androidx.core.widget.b.f606a || c()) {
            return;
        }
        b(i2, f2);
    }

    void b() {
        this.f437h.f();
    }

    boolean c() {
        return this.f437h.g();
    }

    private void b(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f437h.a(i2, f2);
    }

    void a(int i2) {
        this.f437h.a(i2);
    }

    void a(int i2, int i3, int i4, int i5) {
        this.f437h.a(i2, i3, i4, i5);
    }

    void a(int[] iArr, int i2) {
        this.f437h.a(iArr, i2);
    }

    int d() {
        return this.f437h.a();
    }

    int e() {
        return this.f437h.b();
    }

    int f() {
        return this.f437h.c();
    }

    int g() {
        return this.f437h.d();
    }

    int[] h() {
        return this.f437h.e();
    }
}
