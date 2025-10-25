package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.a.h;

/* loaded from: classes.dex */
public class aa {

    /* renamed from: a, reason: collision with root package name */
    private final Context f352a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f353b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f354c;

    public static aa a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aa(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static aa a(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new aa(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public static aa a(Context context, int i2, int[] iArr) {
        return new aa(context, context.obtainStyledAttributes(i2, iArr));
    }

    private aa(Context context, TypedArray typedArray) {
        this.f352a = context;
        this.f353b = typedArray;
    }

    public Drawable a(int i2) {
        int resourceId;
        if (this.f353b.hasValue(i2) && (resourceId = this.f353b.getResourceId(i2, 0)) != 0) {
            return b.a.a.a.a.b(this.f352a, resourceId);
        }
        return this.f353b.getDrawable(i2);
    }

    public Typeface a(int i2, int i3, h.a aVar) {
        int resourceId = this.f353b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f354c == null) {
            this.f354c = new TypedValue();
        }
        return androidx.core.content.a.h.a(this.f352a, resourceId, this.f354c, i3, aVar);
    }

    public CharSequence b(int i2) {
        return this.f353b.getText(i2);
    }

    public String c(int i2) {
        return this.f353b.getString(i2);
    }

    public boolean a(int i2, boolean z) {
        return this.f353b.getBoolean(i2, z);
    }

    public int a(int i2, int i3) {
        return this.f353b.getInt(i2, i3);
    }

    public float a(int i2, float f2) {
        return this.f353b.getFloat(i2, f2);
    }

    public int b(int i2, int i3) {
        return this.f353b.getColor(i2, i3);
    }

    public ColorStateList d(int i2) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f353b.hasValue(i2) || (resourceId = this.f353b.getResourceId(i2, 0)) == 0 || (colorStateListA = b.a.a.a.a.a(this.f352a, resourceId)) == null) ? this.f353b.getColorStateList(i2) : colorStateListA;
    }

    public int c(int i2, int i3) {
        return this.f353b.getInteger(i2, i3);
    }

    public int d(int i2, int i3) {
        return this.f353b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f353b.getDimensionPixelSize(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.f353b.getLayoutDimension(i2, i3);
    }

    public int g(int i2, int i3) {
        return this.f353b.getResourceId(i2, i3);
    }

    public boolean e(int i2) {
        return this.f353b.hasValue(i2);
    }

    public void a() {
        this.f353b.recycle();
    }
}
