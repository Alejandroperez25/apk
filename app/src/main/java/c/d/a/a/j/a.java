package c.d.a.a.j;

import android.graphics.Bitmap;
import android.text.Layout;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3075a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f3076b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f3077c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3078d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3079e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3080f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3081g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3082h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3083i;
    public final float j;
    public final boolean k;
    public final int l;
    public final int m;
    public final float n;

    public a(Bitmap bitmap, float f2, int i2, float f3, int i3, float f4, float f5) {
        this(null, null, bitmap, f3, 0, i3, f2, i2, Integer.MIN_VALUE, Float.MIN_VALUE, f4, f5, false, -16777216);
    }

    public a(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, int i5, float f5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, i5, f5, f4, Float.MIN_VALUE, false, -16777216);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, Float.MIN_VALUE, f4, Float.MIN_VALUE, z, i5);
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6) {
        this.f3075a = charSequence;
        this.f3076b = alignment;
        this.f3077c = bitmap;
        this.f3078d = f2;
        this.f3079e = i2;
        this.f3080f = i3;
        this.f3081g = f3;
        this.f3082h = i4;
        this.f3083i = f5;
        this.j = f6;
        this.k = z;
        this.l = i6;
        this.m = i5;
        this.n = f4;
    }
}
