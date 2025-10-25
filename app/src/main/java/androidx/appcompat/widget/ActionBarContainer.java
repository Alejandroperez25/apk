package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.a.a$e;
import b.a.a$i;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f207a;

    /* renamed from: b, reason: collision with root package name */
    private View f208b;

    /* renamed from: c, reason: collision with root package name */
    private View f209c;

    /* renamed from: d, reason: collision with root package name */
    private View f210d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f211e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f212f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f213g;

    /* renamed from: h, reason: collision with root package name */
    boolean f214h;

    /* renamed from: i, reason: collision with root package name */
    boolean f215i;
    private int j;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b.d.g.v.a(this, new C0075b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.ActionBar);
        this.f211e = typedArrayObtainStyledAttributes.getDrawable(a$i.ActionBar_background);
        this.f212f = typedArrayObtainStyledAttributes.getDrawable(a$i.ActionBar_backgroundStacked);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(a$i.ActionBar_height, -1);
        if (getId() == a$e.split_action_bar) {
            this.f214h = true;
            this.f213g = typedArrayObtainStyledAttributes.getDrawable(a$i.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f214h ? !(this.f211e != null || this.f212f != null) : this.f213g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f209c = findViewById(a$e.action_bar);
        this.f210d = findViewById(a$e.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f211e != null) {
            this.f211e.setCallback(null);
            unscheduleDrawable(this.f211e);
        }
        this.f211e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f209c != null) {
                this.f211e.setBounds(this.f209c.getLeft(), this.f209c.getTop(), this.f209c.getRight(), this.f209c.getBottom());
            }
        }
        boolean z = false;
        if (!this.f214h ? !(this.f211e != null || this.f212f != null) : this.f213g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f212f != null) {
            this.f212f.setCallback(null);
            unscheduleDrawable(this.f212f);
        }
        this.f212f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f215i && this.f212f != null) {
                this.f212f.setBounds(this.f208b.getLeft(), this.f208b.getTop(), this.f208b.getRight(), this.f208b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f214h ? !(this.f211e != null || this.f212f != null) : this.f213g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f213g != null) {
            this.f213g.setCallback(null);
            unscheduleDrawable(this.f213g);
        }
        this.f213g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f214h && this.f213g != null) {
                this.f213g.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f214h ? !(this.f211e != null || this.f212f != null) : this.f213g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        if (this.f211e != null) {
            this.f211e.setVisible(z, false);
        }
        if (this.f212f != null) {
            this.f212f.setVisible(z, false);
        }
        if (this.f213g != null) {
            this.f213g.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f211e && !this.f214h) || (drawable == this.f212f && this.f215i) || ((drawable == this.f213g && this.f214h) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f211e != null && this.f211e.isStateful()) {
            this.f211e.setState(getDrawableState());
        }
        if (this.f212f != null && this.f212f.isStateful()) {
            this.f212f.setState(getDrawableState());
        }
        if (this.f213g == null || !this.f213g.isStateful()) {
            return;
        }
        this.f213g.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f211e != null) {
            this.f211e.jumpToCurrentState();
        }
        if (this.f212f != null) {
            this.f212f.jumpToCurrentState();
        }
        if (this.f213g != null) {
            this.f213g.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f207a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f207a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(I i2) {
        if (this.f208b != null) {
            removeView(this.f208b);
        }
        this.f208b = i2;
        if (i2 != null) {
            addView(i2);
            ViewGroup.LayoutParams layoutParams = i2.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            i2.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f208b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    private boolean a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private int b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int iB;
        if (this.f209c == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && this.j >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f209c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        if (this.f208b == null || this.f208b.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!a(this.f209c)) {
            iB = b(this.f209c);
        } else {
            iB = !a(this.f210d) ? b(this.f210d) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iB + b(this.f208b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f208b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i4, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f214h) {
            if (this.f213g != null) {
                this.f213g.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f211e != null) {
                if (this.f209c.getVisibility() == 0) {
                    this.f211e.setBounds(this.f209c.getLeft(), this.f209c.getTop(), this.f209c.getRight(), this.f209c.getBottom());
                } else if (this.f210d != null && this.f210d.getVisibility() == 0) {
                    this.f211e.setBounds(this.f210d.getLeft(), this.f210d.getTop(), this.f210d.getRight(), this.f210d.getBottom());
                } else {
                    this.f211e.setBounds(0, 0, 0, 0);
                }
                z3 = true;
            }
            this.f215i = z4;
            if (!z4 || this.f212f == null) {
                z2 = z3;
            } else {
                this.f212f.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }
}
