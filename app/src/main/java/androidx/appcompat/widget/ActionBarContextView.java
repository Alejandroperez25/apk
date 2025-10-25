package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.a.a$e;
import b.a.a$f;
import b.a.a$i;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0074a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f216i;
    private CharSequence j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private boolean r;
    private int s;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC0074a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0074a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.AbstractC0074a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0074a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0074a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a$a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        aa aaVarA = aa.a(context, attributeSet, a$i.ActionMode, i2, 0);
        b.d.g.v.a(this, aaVarA.a(a$i.ActionMode_background));
        this.p = aaVarA.g(a$i.ActionMode_titleTextStyle, 0);
        this.q = aaVarA.g(a$i.ActionMode_subtitleTextStyle, 0);
        this.f345e = aaVarA.f(a$i.ActionMode_height, 0);
        this.s = aaVarA.g(a$i.ActionMode_closeItemLayout, a$f.abc_action_mode_close_item_material);
        aaVarA.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f344d != null) {
            this.f344d.e();
            this.f344d.g();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0074a
    public void setContentHeight(int i2) {
        this.f345e = i2;
    }

    public void setCustomView(View view) {
        if (this.l != null) {
            removeView(this.l);
        }
        this.l = view;
        if (view != null && this.m != null) {
            removeView(this.m);
            this.m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f216i = charSequence;
        a();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        a();
    }

    public CharSequence getTitle() {
        return this.f216i;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    private void a() {
        if (this.m == null) {
            LayoutInflater.from(getContext()).inflate(a$f.abc_action_bar_title_item, this);
            this.m = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = (TextView) this.m.findViewById(a$e.action_bar_title);
            this.o = (TextView) this.m.findViewById(a$e.action_bar_subtitle);
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
        }
        this.n.setText(this.f216i);
        this.o.setText(this.j);
        boolean z = !TextUtils.isEmpty(this.f216i);
        boolean z2 = !TextUtils.isEmpty(this.j);
        this.o.setVisibility(z2 ? 0 : 8);
        this.m.setVisibility((z || z2) ? 0 : 8);
        if (this.m.getParent() == null) {
            addView(this.m);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f345e > 0 ? this.f345e : View.MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        if (this.k != null) {
            int iA = a(this.k, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            paddingLeft = iA - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        if (this.f343c != null && this.f343c.getParent() == this) {
            paddingLeft = a(this.f343c, paddingLeft, iMakeMeasureSpec, 0);
        }
        if (this.m != null && this.l == null) {
            if (this.r) {
                this.m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.m.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.m.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = a(this.m, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        if (this.l != null) {
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = Math.min(layoutParams.height, iMin);
            }
            this.l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i5));
        }
        if (this.f345e <= 0) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i6) {
                    i6 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i6);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iA;
        boolean zA = na.a(this);
        int paddingRight = zA ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        if (this.k == null || this.k.getVisibility() == 8) {
            iA = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i6 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA2 = AbstractC0074a.a(paddingRight, i6, zA);
            iA = AbstractC0074a.a(iA2 + a(this.k, iA2, paddingTop, paddingTop2, zA), i7, zA);
        }
        if (this.m != null && this.l == null && this.m.getVisibility() != 8) {
            iA += a(this.m, iA, paddingTop, paddingTop2, zA);
        }
        int i8 = iA;
        if (this.l != null) {
            a(this.l, i8, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        if (this.f343c != null) {
            a(this.f343c, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f216i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.r) {
            requestLayout();
        }
        this.r = z;
    }
}
