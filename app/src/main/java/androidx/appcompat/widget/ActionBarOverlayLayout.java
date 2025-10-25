package androidx.appcompat.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import b.a.a$e;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0094u, b.d.g.n {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f217a = {b.a.a$a.actionBarSize, android.R.attr.windowContentOverlay};
    private final Runnable A;
    private final b.d.g.o B;

    /* renamed from: b, reason: collision with root package name */
    private int f218b;

    /* renamed from: c, reason: collision with root package name */
    private int f219c;

    /* renamed from: d, reason: collision with root package name */
    private ContentFrameLayout f220d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f221e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC0095v f222f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f223g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f224h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f225i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private a v;
    private OverScroller w;
    ViewPropertyAnimator x;
    final AnimatorListenerAdapter y;
    private final Runnable z;

    public interface a {
        void a();

        void a(int i2);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.y = new C0076c(this);
        this.z = new RunnableC0077d(this);
        this.A = new RunnableC0078e(this);
        a(context);
        this.B = new b.d.g.o(this);
    }

    private void a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f217a);
        this.f218b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f223g = typedArrayObtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f223g == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f224h = context.getApplicationInfo().targetSdkVersion < 19;
        this.w = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.v = aVar;
        if (getWindowToken() != null) {
            this.v.a(this.f219c);
            if (this.n != 0) {
                onWindowSystemUiVisibilityChanged(this.n);
                b.d.g.v.g(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f225i = z;
        this.f224h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        b.d.g.v.g(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        a();
        int i3 = this.n ^ i2;
        this.n = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        if (this.v != null) {
            this.v.a(!z2);
            if (z || !z2) {
                this.v.a();
            } else {
                this.v.c();
            }
        }
        if ((i3 & 256) == 0 || this.v == null) {
            return;
        }
        b.d.g.v.g(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f219c = i2;
        if (this.v != null) {
            this.v.a(i2);
        }
    }

    private boolean a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        b bVar = (b) view.getLayoutParams();
        if (!z || ((ViewGroup.MarginLayoutParams) bVar).leftMargin == rect.left) {
            z5 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && ((ViewGroup.MarginLayoutParams) bVar).topMargin != rect.top) {
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = rect.top;
            z5 = true;
        }
        if (z4 && ((ViewGroup.MarginLayoutParams) bVar).rightMargin != rect.right) {
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || ((ViewGroup.MarginLayoutParams) bVar).bottomMargin == rect.bottom) {
            return z5;
        }
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        a();
        int iF = b.d.g.v.f(this) & 256;
        boolean zA = a(this.f221e, rect, true, true, false, true);
        this.r.set(rect);
        na.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            zA = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            zA = true;
        }
        if (zA) {
            requestLayout();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-1, -1);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        a();
        measureChildWithMargins(this.f221e, i2, 0, i3, 0);
        b bVar = (b) this.f221e.getLayoutParams();
        int iMax = Math.max(0, this.f221e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
        int iMax2 = Math.max(0, this.f221e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f221e.getMeasuredState());
        boolean z = (b.d.g.v.f(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f218b;
            if (this.j && this.f221e.getTabContainer() != null) {
                measuredHeight += this.f218b;
            }
        } else {
            measuredHeight = this.f221e.getVisibility() != 8 ? this.f221e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.t.set(this.r);
        if (!this.f225i && !z) {
            this.q.top += measuredHeight;
            this.q.bottom += 0;
        } else {
            this.t.top += measuredHeight;
            this.t.bottom += 0;
        }
        a(this.f220d, this.q, true, true, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.f220d.a(this.t);
        }
        measureChildWithMargins(this.f220d, i2, 0, i3, 0);
        b bVar2 = (b) this.f220d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f220d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f220d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f220d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) bVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f223g == null || this.f224h) {
            return;
        }
        int bottom = this.f221e.getVisibility() == 0 ? (int) (this.f221e.getBottom() + this.f221e.getTranslationY() + 0.5f) : 0;
        this.f223g.setBounds(0, bottom, getWidth(), this.f223g.getIntrinsicHeight() + bottom);
        this.f223g.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f221e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.B.a(view, view2, i2);
        this.m = getActionBarHideOffset();
        b();
        if (this.v != null) {
            this.v.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.m += i3;
        setActionBarHideOffset(this.m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f221e.getHeight()) {
                c();
            } else {
                d();
            }
        }
        if (this.v != null) {
            this.v.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.d.g.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        if (a(f2, f3)) {
            f();
        } else {
            e();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    void a() {
        if (this.f220d == null) {
            this.f220d = (ContentFrameLayout) findViewById(a$e.action_bar_activity_content);
            this.f221e = (ActionBarContainer) findViewById(a$e.action_bar_container);
            this.f222f = a(findViewById(a$e.action_bar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC0095v a(View view) {
        if (view instanceof InterfaceC0095v) {
            return (InterfaceC0095v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public int getActionBarHideOffset() {
        if (this.f221e != null) {
            return -((int) this.f221e.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i2) {
        b();
        this.f221e.setTranslationY(-Math.max(0, Math.min(i2, this.f221e.getHeight())));
    }

    void b() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        if (this.x != null) {
            this.x.cancel();
        }
    }

    private void c() {
        b();
        postDelayed(this.z, 600L);
    }

    private void d() {
        b();
        postDelayed(this.A, 600L);
    }

    private void e() {
        b();
        this.z.run();
    }

    private void f() {
        b();
        this.A.run();
    }

    private boolean a(float f2, float f3) {
        this.w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.w.getFinalY() > this.f221e.getHeight();
    }

    public void setWindowCallback(Window.Callback callback) {
        a();
        this.f222f.a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        a();
        this.f222f.a(charSequence);
    }

    public CharSequence getTitle() {
        a();
        return this.f222f.getTitle();
    }

    public void setIcon(int i2) {
        a();
        this.f222f.b(i2);
    }

    public void setIcon(Drawable drawable) {
        a();
        this.f222f.a(drawable);
    }

    public void setLogo(int i2) {
        a();
        this.f222f.a(i2);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
