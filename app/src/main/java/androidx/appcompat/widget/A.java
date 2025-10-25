package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b.a.a$i;

/* loaded from: classes.dex */
public abstract class A extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f196a;

    /* renamed from: b, reason: collision with root package name */
    private int f197b;

    /* renamed from: c, reason: collision with root package name */
    private int f198c;

    /* renamed from: d, reason: collision with root package name */
    private int f199d;

    /* renamed from: e, reason: collision with root package name */
    private int f200e;

    /* renamed from: f, reason: collision with root package name */
    private int f201f;

    /* renamed from: g, reason: collision with root package name */
    private float f202g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f203h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f204i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    int a(View view) {
        return 0;
    }

    int a(View view, int i2) {
        return 0;
    }

    int b(View view) {
        return 0;
    }

    int c(int i2) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public A(Context context) {
        this(context, null);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public A(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f196a = true;
        this.f197b = -1;
        this.f198c = 0;
        this.f200e = 8388659;
        aa aaVarA = aa.a(context, attributeSet, a$i.LinearLayoutCompat, i2, 0);
        int iA = aaVarA.a(a$i.LinearLayoutCompat_android_orientation, -1);
        if (iA >= 0) {
            setOrientation(iA);
        }
        int iA2 = aaVarA.a(a$i.LinearLayoutCompat_android_gravity, -1);
        if (iA2 >= 0) {
            setGravity(iA2);
        }
        boolean zA = aaVarA.a(a$i.LinearLayoutCompat_android_baselineAligned, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f202g = aaVarA.a(a$i.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f197b = aaVarA.a(a$i.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f203h = aaVarA.a(a$i.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(aaVarA.a(a$i.LinearLayoutCompat_divider));
        this.n = aaVarA.a(a$i.LinearLayoutCompat_showDividers, 0);
        this.o = aaVarA.e(a$i.LinearLayoutCompat_dividerPadding, 0);
        aaVarA.a();
    }

    public void setShowDividers(int i2) {
        if (i2 != this.n) {
            requestLayout();
        }
        this.n = i2;
    }

    public int getShowDividers() {
        return this.n;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.o = i2;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.k == null) {
            return;
        }
        if (this.f199d == 1) {
            a(canvas);
        } else {
            b(canvas);
        }
    }

    void a(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewA = a(i2);
            if (viewA != null && viewA.getVisibility() != 8 && b(i2)) {
                a(canvas, (viewA.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewA.getLayoutParams())).topMargin) - this.m);
            }
        }
        if (b(virtualChildCount)) {
            View viewA2 = a(virtualChildCount - 1);
            if (viewA2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                bottom = viewA2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewA2.getLayoutParams())).bottomMargin;
            }
            a(canvas, bottom);
        }
    }

    void b(Canvas canvas) {
        int right;
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean zA = na.a(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewA = a(i2);
            if (viewA != null && viewA.getVisibility() != 8 && b(i2)) {
                a aVar = (a) viewA.getLayoutParams();
                if (zA) {
                    left = viewA.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else {
                    left = (viewA.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.l;
                }
                b(canvas, left);
            }
        }
        if (b(virtualChildCount)) {
            View viewA2 = a(virtualChildCount - 1);
            if (viewA2 != null) {
                a aVar2 = (a) viewA2.getLayoutParams();
                if (zA) {
                    right = (viewA2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin) - this.l;
                } else {
                    right = viewA2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.l;
            }
            b(canvas, right);
        }
    }

    void a(Canvas canvas, int i2) {
        this.k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.k.draw(canvas);
    }

    void b(Canvas canvas, int i2) {
        this.k.setBounds(i2, getPaddingTop() + this.o, this.l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.f196a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f203h = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f197b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f197b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f197b);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f197b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f198c;
        if (this.f199d == 1 && (i2 = this.f200e & a$i.AppCompatTheme_windowActionBarOverlay) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f201f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f201f;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f197b;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f197b = i2;
    }

    View a(int i2) {
        return getChildAt(i2);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f202g;
    }

    public void setWeightSum(float f2) {
        this.f202g = Math.max(0.0f, f2);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f199d == 1) {
            a(i2, i3);
        } else {
            b(i2, i3);
        }
    }

    protected boolean b(int i2) {
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.n & 4) != 0;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(int r41, int r42) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.a(int, int):void");
    }

    private void c(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewA = a(i4);
            if (viewA.getVisibility() != 8) {
                a aVar = (a) viewA.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewA.getMeasuredHeight();
                    measureChildWithMargins(viewA, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void b(int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.b(int, int):void");
    }

    private void d(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewA = a(i4);
            if (viewA.getVisibility() != 8) {
                a aVar = (a) viewA.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewA.getMeasuredWidth();
                    measureChildWithMargins(viewA, i3, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    void a(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f199d == 1) {
            a(i2, i3, i4, i5);
        } else {
            b(i2, i3, i4, i5);
        }
    }

    void a(int i2, int i3, int i4, int i5) {
        int paddingTop;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i4 - i2;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f200e & a$i.AppCompatTheme_windowActionBarOverlay;
        int i9 = this.f200e & 8388615;
        if (i8 == 16) {
            paddingTop = (((i5 - i3) - this.f201f) / 2) + getPaddingTop();
        } else if (i8 == 80) {
            paddingTop = ((getPaddingTop() + i5) - i3) - this.f201f;
        } else {
            paddingTop = getPaddingTop();
        }
        int iA = 0;
        while (iA < virtualChildCount) {
            View viewA = a(iA);
            if (viewA == null) {
                paddingTop += c(iA);
            } else if (viewA.getVisibility() != 8) {
                int measuredWidth = viewA.getMeasuredWidth();
                int measuredHeight = viewA.getMeasuredHeight();
                a aVar = (a) viewA.getLayoutParams();
                int i10 = aVar.f206b;
                if (i10 < 0) {
                    i10 = i9;
                }
                int iA2 = b.d.g.c.a(i10, b.d.g.v.b(this)) & 7;
                if (iA2 == 1) {
                    i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else if (iA2 == 5) {
                    i6 = (paddingRight - measuredWidth) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else {
                    i6 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                }
                int i11 = i6;
                if (b(iA)) {
                    paddingTop += this.m;
                }
                int i12 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                a(viewA, i11, i12 + a(viewA), measuredWidth, measuredHeight);
                int iB = i12 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + b(viewA);
                iA += a(viewA, iA);
                paddingTop = iB;
            }
            iA++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void b(int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.b(int, int, int, int):void");
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    public void setOrientation(int i2) {
        if (this.f199d != i2) {
            this.f199d = i2;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f199d;
    }

    public void setGravity(int i2) {
        if (this.f200e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & a$i.AppCompatTheme_windowActionBarOverlay) == 0) {
                i2 |= 48;
            }
            this.f200e = i2;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f200e;
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        if ((8388615 & this.f200e) != i3) {
            this.f200e = i3 | (this.f200e & (-8388616));
            requestLayout();
        }
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & a$i.AppCompatTheme_windowActionBarOverlay;
        if ((this.f200e & a$i.AppCompatTheme_windowActionBarOverlay) != i3) {
            this.f200e = i3 | (this.f200e & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        if (this.f199d == 0) {
            return new a(-2, -2);
        }
        if (this.f199d == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(A.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(A.class.getName());
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f205a;

        /* renamed from: b, reason: collision with root package name */
        public int f206b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f206b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.LinearLayoutCompat_Layout);
            this.f205a = typedArrayObtainStyledAttributes.getFloat(a$i.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f206b = typedArrayObtainStyledAttributes.getInt(a$i.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f206b = -1;
            this.f205a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f206b = -1;
        }
    }
}
