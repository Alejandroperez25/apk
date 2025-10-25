package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import b.a.a$i;

/* loaded from: classes.dex */
public class a$a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f95a;

    public a$a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f95a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.ActionBarLayout);
        this.f95a = typedArrayObtainStyledAttributes.getInt(a$i.ActionBarLayout_android_layout_gravity, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public a$a(int i2, int i3) {
        super(i2, i3);
        this.f95a = 0;
        this.f95a = 8388627;
    }

    public a$a(a$a a_a) {
        super((ViewGroup.MarginLayoutParams) a_a);
        this.f95a = 0;
        this.f95a = a_a.f95a;
    }

    public a$a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f95a = 0;
    }
}
