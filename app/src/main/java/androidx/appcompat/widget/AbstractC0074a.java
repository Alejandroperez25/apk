package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.a$i;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0074a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C0004a f341a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f342b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f343c;

    /* renamed from: d, reason: collision with root package name */
    protected C0079f f344d;

    /* renamed from: e, reason: collision with root package name */
    protected int f345e;

    /* renamed from: f, reason: collision with root package name */
    protected b.d.g.z f346f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f347g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f348h;

    protected static int a(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    public abstract void setContentHeight(int i2);

    AbstractC0074a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f341a = new C0004a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(b.a.a$a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f342b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f342b = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a$i.ActionBar, b.a.a$a.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(a$i.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (this.f344d != null) {
            this.f344d.a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f347g = false;
        }
        if (!this.f347g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f347g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f347g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f348h = false;
        }
        if (!this.f348h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f348h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f348h = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f345e;
    }

    public int getAnimatedVisibility() {
        if (this.f346f != null) {
            return this.f341a.f350b;
        }
        return getVisibility();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            if (this.f346f != null) {
                this.f346f.a();
            }
            super.setVisibility(i2);
        }
    }

    protected int a(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    protected int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0004a implements b.d.g.A {

        /* renamed from: a, reason: collision with root package name */
        private boolean f349a = false;

        /* renamed from: b, reason: collision with root package name */
        int f350b;

        protected C0004a() {
        }
    }
}
