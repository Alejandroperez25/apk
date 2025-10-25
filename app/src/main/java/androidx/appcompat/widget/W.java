package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
abstract class W {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f323a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f324b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f325c = {android.R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f326d = {android.R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f327e = {android.R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f328f = {android.R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f329g = {android.R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f330h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f331i = new int[0];
    private static final int[] j = new int[1];

    public static int a(Context context, int i2) {
        j[0] = i2;
        aa aaVarA = aa.a(context, (AttributeSet) null, j);
        try {
            return aaVarA.b(0, 0);
        } finally {
            aaVarA.a();
        }
    }

    public static ColorStateList b(Context context, int i2) {
        j[0] = i2;
        aa aaVarA = aa.a(context, (AttributeSet) null, j);
        try {
            return aaVarA.d(0);
        } finally {
            aaVarA.a();
        }
    }

    public static int c(Context context, int i2) {
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null && colorStateListB.isStateful()) {
            return colorStateListB.getColorForState(f324b, colorStateListB.getDefaultColor());
        }
        TypedValue typedValueA = a();
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValueA, true);
        return a(context, i2, typedValueA.getFloat());
    }

    private static TypedValue a() {
        TypedValue typedValue = f323a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f323a.set(typedValue2);
        return typedValue2;
    }

    static int a(Context context, int i2, float f2) {
        return b.d.a.a.b(a(context, i2), Math.round(Color.alpha(r0) * f2));
    }
}
