package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import b.a.a$i;
import b.d.g.C0120a;
import b.d.g.k;
import b.d.g.m;
import b.d.g.o;
import b.d.g.q;
import b.d.g.v;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m, b.d.g.i, q {

    /* renamed from: a, reason: collision with root package name */
    private static final a f577a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f578b = {R.attr.fillViewport};
    private float A;
    private b B;

    /* renamed from: c, reason: collision with root package name */
    private long f579c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f580d;

    /* renamed from: e, reason: collision with root package name */
    private OverScroller f581e;

    /* renamed from: f, reason: collision with root package name */
    private EdgeEffect f582f;

    /* renamed from: g, reason: collision with root package name */
    private EdgeEffect f583g;

    /* renamed from: h, reason: collision with root package name */
    private int f584h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f585i;
    private boolean j;
    private View k;
    private boolean l;
    private VelocityTracker m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int[] t;
    private final int[] u;
    private int v;
    private int w;
    private c x;
    private final o y;
    private final k z;

    public interface b {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    private static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    @Override // b.d.g.l
    public boolean a(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f580d = new Rect();
        this.f585i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.o = true;
        this.s = -1;
        this.t = new int[2];
        this.u = new int[2];
        a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f578b, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.y = new o(this);
        this.z = new k(this);
        setNestedScrollingEnabled(true);
        v.a(this, f577a);
    }

    public void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.z.a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean a(int i2, int i3) {
        return this.z.a(i2, i3);
    }

    public void a(int i2) {
        this.z.b(i2);
    }

    public boolean b(int i2) {
        return this.z.a(i2);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.z.a(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.z.a(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.z.a();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return a(i2, 0);
    }

    @Override // android.view.View, b.d.g.j
    public void stopNestedScroll() {
        a(0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return b(0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.z.a(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.z.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.z.a(f2, f3);
    }

    @Override // b.d.g.m
    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    private void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.z.a(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // b.d.g.l
    public void b(View view, View view2, int i2, int i3) {
        this.y.a(view, view2, i2, i3);
        a(2, i3);
    }

    @Override // b.d.g.l
    public void a(View view, int i2) {
        this.y.a(view, i2);
        a(i2);
    }

    @Override // b.d.g.l
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    @Override // b.d.g.l
    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return a(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        b(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onStopNestedScroll(View view) {
        a(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        f((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    private void a() {
        this.f581e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.p = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2, layoutParams);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.B = bVar;
    }

    private boolean b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public void setFillViewport(boolean z) {
        if (z != this.n) {
            this.n = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (this.B != null) {
            this.B.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.n && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean a(KeyEvent keyEvent) {
        this.f580d.setEmpty();
        if (!b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 62) {
            switch (keyCode) {
                case 19:
                    if (!keyEvent.isAltPressed()) {
                        break;
                    } else {
                        break;
                    }
                case a$i.AppCompatTheme_actionModeCopyDrawable /* 20 */:
                    if (!keyEvent.isAltPressed()) {
                        break;
                    } else {
                        break;
                    }
            }
            return false;
        }
        c(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    private boolean d(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private void c() {
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        } else {
            this.m.clear();
        }
    }

    private void d() {
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
    }

    private void e() {
        if (this.m != null) {
            this.m.recycle();
            this.m = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.l) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 6) {
            switch (i2) {
                case 0:
                    int y = (int) motionEvent.getY();
                    if (!d((int) motionEvent.getX(), y)) {
                        this.l = false;
                        e();
                        break;
                    } else {
                        this.f584h = y;
                        this.s = motionEvent.getPointerId(0);
                        c();
                        this.m.addMovement(motionEvent);
                        this.f581e.computeScrollOffset();
                        this.l = !this.f581e.isFinished();
                        a(2, 0);
                        break;
                    }
                case 1:
                case 3:
                    this.l = false;
                    this.s = -1;
                    e();
                    if (this.f581e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        v.a(this);
                    }
                    a(0);
                    break;
                case 2:
                    int i3 = this.s;
                    if (i3 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                        if (iFindPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                            break;
                        } else {
                            int y2 = (int) motionEvent.getY(iFindPointerIndex);
                            if (Math.abs(y2 - this.f584h) > this.p && (2 & getNestedScrollAxes()) == 0) {
                                this.l = true;
                                this.f584h = y2;
                                d();
                                this.m.addMovement(motionEvent);
                                this.v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                    }
                    break;
            }
        } else {
            a(motionEvent);
        }
        return this.l;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        d();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.v);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f581e.isFinished();
                    this.l = z;
                    if (z && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!this.f581e.isFinished()) {
                        f();
                    }
                    this.f584h = (int) motionEvent.getY();
                    this.s = motionEvent.getPointerId(0);
                    a(2, 0);
                    break;
                } else {
                    return false;
                }
                break;
            case 1:
                VelocityTracker velocityTracker = this.m;
                velocityTracker.computeCurrentVelocity(1000, this.r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.s);
                if (Math.abs(yVelocity) > this.q) {
                    int i2 = -yVelocity;
                    float f2 = i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        f(i2);
                    }
                } else if (this.f581e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    v.a(this);
                }
                this.s = -1;
                g();
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.s + " in onTouchEvent");
                    break;
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f584h - y;
                    if (a(0, i3, this.u, this.t, 0)) {
                        i3 -= this.u[1];
                        this.v += this.t[1];
                    }
                    if (!this.l && Math.abs(i3) > this.p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.l = true;
                        if (i3 > 0) {
                            i3 -= this.p;
                        } else {
                            i3 += this.p;
                        }
                    }
                    int i4 = i3;
                    if (this.l) {
                        this.f584h = y - this.t[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (a(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !b(0)) {
                            this.m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        this.u[1] = 0;
                        a(0, scrollY2, 0, i4 - scrollY2, this.t, 0, this.u);
                        this.f584h -= this.t[1];
                        this.v += this.t[1];
                        if (z2) {
                            int i5 = i4 - this.u[1];
                            h();
                            int i6 = scrollY + i5;
                            if (i6 < 0) {
                                androidx.core.widget.c.a(this.f582f, i5 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f583g.isFinished()) {
                                    this.f583g.onRelease();
                                }
                            } else if (i6 > scrollRange) {
                                androidx.core.widget.c.a(this.f583g, i5 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f582f.isFinished()) {
                                    this.f582f.onRelease();
                                }
                            }
                            if (this.f582f != null && (!this.f582f.isFinished() || !this.f583g.isFinished())) {
                                v.a(this);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                if (this.l && getChildCount() > 0 && this.f581e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    v.a(this);
                }
                this.s = -1;
                g();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f584h = (int) motionEvent.getY(actionIndex);
                this.s = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                a(motionEvent);
                this.f584h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.s));
                break;
        }
        if (this.m != null) {
            this.m.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.s) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f584h = (int) motionEvent.getY(i2);
            this.s = motionEvent.getPointerId(i2);
            if (this.m != null) {
                this.m.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 > scrollRange) {
                    i2 = scrollRange;
                }
                if (i2 != scrollY) {
                    super.scrollTo(getScrollX(), i2);
                    return true;
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r6 = 0
            goto L35
        L34:
            r6 = 1
        L35:
            int r1 = r15 + r13
            if (r2 != 0) goto L3b
            r7 = 0
            goto L3d
        L3b:
            r7 = r19
        L3d:
            int r2 = r16 + r14
            if (r6 != 0) goto L43
            r3 = 0
            goto L45
        L43:
            r3 = r20
        L45:
            int r6 = -r7
            int r7 = r7 + r17
            int r8 = -r3
            int r3 = r3 + r18
            if (r1 <= r7) goto L50
            r6 = r7
        L4e:
            r1 = 1
            goto L55
        L50:
            if (r1 >= r6) goto L53
            goto L4e
        L53:
            r6 = r1
            r1 = 0
        L55:
            if (r2 <= r3) goto L5a
            r8 = r3
        L58:
            r2 = 1
            goto L5f
        L5a:
            if (r2 >= r8) goto L5d
            goto L58
        L5d:
            r8 = r2
            r2 = 0
        L5f:
            if (r2 == 0) goto L7e
            boolean r3 = r12.b(r5)
            if (r3 != 0) goto L7e
            android.widget.OverScroller r3 = r0.f581e
            r7 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r6
            r15 = r8
            r16 = r7
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r6, r8, r1, r2)
            if (r1 != 0) goto L85
            if (r2 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View a(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
            r5 = 0
        Le:
            if (r3 >= r1) goto L54
            java.lang.Object r6 = r0.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L51
            if (r7 >= r15) goto L51
            if (r14 >= r7) goto L29
            if (r8 >= r15) goto L29
            r10 = 1
            goto L2a
        L29:
            r10 = 0
        L2a:
            if (r4 != 0) goto L2f
            r4 = r6
            r5 = r10
            goto L51
        L2f:
            if (r13 == 0) goto L37
            int r11 = r4.getTop()
            if (r7 < r11) goto L3f
        L37:
            if (r13 != 0) goto L41
            int r7 = r4.getBottom()
            if (r8 <= r7) goto L41
        L3f:
            r7 = 1
            goto L42
        L41:
            r7 = 0
        L42:
            if (r5 == 0) goto L49
            if (r10 == 0) goto L51
            if (r7 == 0) goto L51
            goto L50
        L49:
            if (r10 == 0) goto L4e
            r4 = r6
            r5 = 1
            goto L51
        L4e:
            if (r7 == 0) goto L51
        L50:
            r4 = r6
        L51:
            int r3 = r3 + 1
            goto Le
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a(boolean, int, int):android.view.View");
    }

    public boolean c(int i2) {
        boolean z = i2 == 130;
        int height = getHeight();
        if (z) {
            this.f580d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f580d.top + height > bottom) {
                    this.f580d.top = bottom - height;
                }
            }
        } else {
            this.f580d.top = getScrollY() - height;
            if (this.f580d.top < 0) {
                this.f580d.top = 0;
            }
        }
        this.f580d.bottom = this.f580d.top + height;
        return a(i2, this.f580d.top, this.f580d.bottom);
    }

    public boolean d(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        this.f580d.top = 0;
        this.f580d.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f580d.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            this.f580d.top = this.f580d.bottom - height;
        }
        return a(i2, this.f580d.top, this.f580d.bottom);
    }

    private boolean a(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z = false;
        boolean z2 = i2 == 33;
        View viewA = a(z2, i3, i4);
        if (viewA == null) {
            viewA = this;
        }
        if (i3 < scrollY || i4 > i5) {
            g(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        }
        if (viewA != findFocus()) {
            viewA.requestFocus(i2);
        }
        return z;
    }

    public boolean e(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus != null && a(viewFindNextFocus, maxScrollAmount, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.f580d);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f580d);
            g(a(this.f580d));
            viewFindNextFocus.requestFocus(i2);
        } else {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !a(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.f580d);
        offsetDescendantRectToMyCoords(view, this.f580d);
        return this.f580d.bottom + i2 >= getScrollY() && this.f580d.top - i2 <= getScrollY() + i3;
    }

    private void g(int i2) {
        if (i2 != 0) {
            if (this.o) {
                b(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    public final void b(int i2, int i3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f579c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f581e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY);
            a(false);
        } else {
            if (!this.f581e.isFinished()) {
                f();
            }
            scrollBy(i2, i3);
        }
        this.f579c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void c(int i2, int i3) {
        b(i2 - getScrollX(), i3 - getScrollY());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f581e.isFinished()) {
            return;
        }
        this.f581e.computeScrollOffset();
        int currY = this.f581e.getCurrY();
        int i2 = currY - this.w;
        this.w = currY;
        boolean z = false;
        this.u[1] = 0;
        a(0, i2, this.u, (int[]) null, 1);
        int i3 = i2 - this.u[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            a(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            this.u[1] = 0;
            a(0, scrollY2, 0, i4, this.t, 1, this.u);
            i3 = i4 - this.u[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                h();
                if (i3 < 0) {
                    if (this.f582f.isFinished()) {
                        this.f582f.onAbsorb((int) this.f581e.getCurrVelocity());
                    }
                } else if (this.f583g.isFinished()) {
                    this.f583g.onAbsorb((int) this.f581e.getCurrVelocity());
                }
            }
            f();
        }
        if (this.f581e.isFinished()) {
            return;
        }
        v.a(this);
    }

    private void a(boolean z) {
        if (z) {
            a(2, 1);
        } else {
            a(1);
        }
        this.w = getScrollY();
        v.a(this);
    }

    private void f() {
        this.f581e.abortAnimation();
        a(1);
    }

    private void b(View view) {
        view.getDrawingRect(this.f580d);
        offsetDescendantRectToMyCoords(view, this.f580d);
        int iA = a(this.f580d);
        if (iA != 0) {
            scrollBy(0, iA);
        }
    }

    private boolean a(Rect rect, boolean z) {
        int iA = a(rect);
        boolean z2 = iA != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iA);
            } else {
                b(0, iA);
            }
        }
        return z2;
    }

    protected int a(Rect rect) {
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = (rect.top - scrollY) + 0;
            } else {
                i3 = (rect.bottom - i5) + 0;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || rect.bottom >= i5) {
            return 0;
        }
        if (rect.height() > height) {
            i2 = 0 - (i5 - rect.bottom);
        } else {
            i2 = 0 - (scrollY - rect.top);
        }
        return Math.max(i2, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f585i) {
            b(view2);
        } else {
            this.k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (viewFindNextFocusFromRect == null || a(viewFindNextFocusFromRect)) {
            return false;
        }
        return viewFindNextFocusFromRect.requestFocus(i2, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return a(rect, z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f585i = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.f585i = false;
        if (this.k != null && a(this.k, this)) {
            b(this.k);
        }
        this.k = null;
        if (!this.j) {
            if (this.x != null) {
                scrollTo(getScrollX(), this.x.f586a);
                this.x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iB = b(scrollY, paddingTop, measuredHeight);
            if (iB != scrollY) {
                scrollTo(getScrollX(), iB);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !a(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f580d);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f580d);
        g(a(this.f580d));
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    public void f(int i2) {
        if (getChildCount() > 0) {
            this.f581e.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    private void g() {
        this.l = false;
        e();
        a(0);
        if (this.f582f != null) {
            this.f582f.onRelease();
            this.f583g.onRelease();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iB = b(i2, width, width2);
            int iB2 = b(i3, height, height2);
            if (iB == getScrollX() && iB2 == getScrollY()) {
                return;
            }
            super.scrollTo(iB, iB2);
        }
    }

    private void h() {
        if (getOverScrollMode() != 2) {
            if (this.f582f == null) {
                Context context = getContext();
                this.f582f = new EdgeEffect(context);
                this.f583g = new EdgeEffect(context);
                return;
            }
            return;
        }
        this.f582f = null;
        this.f583g = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f582f != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f582f.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f582f.setSize(width, height);
                if (this.f582f.draw(canvas)) {
                    v.a(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f583g.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f583g.setSize(width2, height2);
            if (this.f583g.draw(canvas)) {
                v.a(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.x = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f586a = getScrollY();
        return cVar;
    }

    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new g();

        /* renamed from: a, reason: collision with root package name */
        public int f586a;

        c(Parcelable parcelable) {
            super(parcelable);
        }

        c(Parcel parcel) {
            super(parcel);
            this.f586a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f586a);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f586a + "}";
        }
    }

    static class a extends C0120a {
        a() {
        }

        @Override // b.d.g.C0120a
        public boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 == 4096) {
                int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.c(0, iMin);
                return true;
            }
            if (i2 != 8192) {
                return false;
            }
            int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
            if (iMax == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.c(0, iMax);
            return true;
        }

        @Override // b.d.g.C0120a
        public void a(View view, b.d.g.a.b bVar) {
            int scrollRange;
            super.a(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.b(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            bVar.a(true);
            if (nestedScrollView.getScrollY() > 0) {
                bVar.a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                bVar.a(4096);
            }
        }

        @Override // b.d.g.C0120a
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            b.d.g.a.d.a(accessibilityEvent, nestedScrollView.getScrollX());
            b.d.g.a.d.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }
}
