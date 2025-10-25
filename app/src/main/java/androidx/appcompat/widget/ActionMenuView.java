package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.A;

/* loaded from: classes.dex */
public class ActionMenuView extends A implements k.b, androidx.appcompat.view.menu.t {
    e A;
    private androidx.appcompat.view.menu.k p;
    private Context q;
    private int r;
    private boolean s;
    private C0079f t;
    private s.a u;
    k.a v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public interface a {
        boolean a();

        boolean b();
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f2);
        this.z = (int) (f2 * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public void setPopupTheme(int i2) {
        if (this.r != i2) {
            this.r = i2;
            if (i2 == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public int getPopupTheme() {
        return this.r;
    }

    public void setPresenter(C0079f c0079f) {
        this.t = c0079f;
        this.t.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.t != null) {
            this.t.a(false);
            if (this.t.h()) {
                this.t.e();
                this.t.d();
            }
        }
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    @Override // androidx.appcompat.widget.A, android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z = this.w;
        this.w = View.MeasureSpec.getMode(i2) == 1073741824;
        if (z != this.w) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.w && this.p != null && size != this.x) {
            this.x = size;
            this.p.b(true);
        }
        int childCount = getChildCount();
        if (this.w && childCount > 0) {
            e(i2, i3);
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            c cVar = (c) getChildAt(i4).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024f A[ADDED_TO_REGION, LOOP:5: B:139:0x024f->B:144:0x0272, LOOP_START, PHI: r3 r32
  0x024f: PHI (r3v8 int) = (r3v7 int), (r3v9 int) binds: [B:138:0x024d, B:144:0x0272] A[DONT_GENERATE, DONT_INLINE]
  0x024f: PHI (r32v1 int) = (r32v0 int), (r32v2 int) binds: [B:138:0x024d, B:144:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027e  */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.e(int, int):void");
    }

    static int a(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.d();
        int i6 = 2;
        if (i3 <= 0 || (z && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z || i7 >= 2) {
                i6 = i7;
            }
        }
        cVar.f229f = !cVar.f226c && z;
        cVar.f227d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), iMakeMeasureSpec);
        return i6;
    }

    @Override // androidx.appcompat.widget.A, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int width;
        int paddingLeft;
        if (!this.w) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zA = na.a(this);
        int measuredWidth = paddingRight;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f226c) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    if (d(i12)) {
                        measuredWidth2 += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth2;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth2;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    measuredWidth -= measuredWidth2;
                    i10 = 1;
                } else {
                    measuredWidth -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    d(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth3 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth3 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth3 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i7 = measuredWidth / i16;
            i6 = 0;
        } else {
            i6 = 0;
            i7 = 0;
        }
        int iMax = Math.max(i6, i7);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f226c) {
                    int i17 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth4, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
                i6++;
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f226c) {
                int i19 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth5 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth5, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth5 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
            i6++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.c();
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.A, android.view.ViewGroup
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f206b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.A, android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.A, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.f206b <= 0) {
                cVar.f206b = 16;
            }
            return cVar;
        }
        return generateDefaultLayoutParams();
    }

    @Override // androidx.appcompat.widget.A, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    public c a() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f226c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    @Override // androidx.appcompat.view.menu.k.b
    public boolean a(androidx.appcompat.view.menu.n nVar) {
        return this.p.a(nVar, 0);
    }

    public void a(androidx.appcompat.view.menu.k kVar) {
        this.p = kVar;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            this.p = new androidx.appcompat.view.menu.k(context);
            this.p.a(new d());
            this.t = new C0079f(context);
            this.t.b(true);
            this.t.a(this.u != null ? this.u : new b());
            this.p.a(this.t, this.q);
            this.t.a(this);
        }
        return this.p;
    }

    public void a(s.a aVar, k.a aVar2) {
        this.u = aVar;
        this.v = aVar2;
    }

    public androidx.appcompat.view.menu.k b() {
        return this.p;
    }

    public boolean c() {
        return this.t != null && this.t.d();
    }

    public boolean d() {
        return this.t != null && this.t.h();
    }

    public void e() {
        if (this.t != null) {
            this.t.f();
        }
    }

    protected boolean d(int i2) {
        boolean zA = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.c(z);
    }

    private class d implements k.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public boolean a(androidx.appcompat.view.menu.k kVar, MenuItem menuItem) {
            return ActionMenuView.this.A != null && ActionMenuView.this.A.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.k.a
        public void a(androidx.appcompat.view.menu.k kVar) {
            if (ActionMenuView.this.v != null) {
                ActionMenuView.this.v.a(kVar);
            }
        }
    }

    private static class b implements s.a {
        @Override // androidx.appcompat.view.menu.s.a
        public void a(androidx.appcompat.view.menu.k kVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.s.a
        public boolean a(androidx.appcompat.view.menu.k kVar) {
            return false;
        }

        b() {
        }
    }

    public static class c extends A.a {

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f226c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f227d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f228e;

        /* renamed from: f, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f229f;

        /* renamed from: g, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f230g;

        /* renamed from: h, reason: collision with root package name */
        boolean f231h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f226c = cVar.f226c;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.f226c = false;
        }
    }
}
