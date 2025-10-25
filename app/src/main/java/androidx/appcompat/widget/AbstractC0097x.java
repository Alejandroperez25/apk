package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0097x extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f453a;

    /* renamed from: b, reason: collision with root package name */
    private int f454b;

    /* renamed from: c, reason: collision with root package name */
    private int f455c;

    /* renamed from: d, reason: collision with root package name */
    private int f456d;

    /* renamed from: e, reason: collision with root package name */
    private int f457e;

    /* renamed from: f, reason: collision with root package name */
    private int f458f;

    /* renamed from: g, reason: collision with root package name */
    private Field f459g;

    /* renamed from: h, reason: collision with root package name */
    private a f460h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f461i;
    private boolean j;
    private boolean k;
    private b.d.g.z l;
    private androidx.core.widget.e m;
    b n;

    AbstractC0097x(Context context, boolean z) {
        super(context, null, b.a.a$a.dropDownListViewStyle);
        this.f453a = new Rect();
        this.f454b = 0;
        this.f455c = 0;
        this.f456d = 0;
        this.f457e = 0;
        this.j = z;
        setCacheColorHint(0);
        try {
            this.f459g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f459g.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.j && this.f461i) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f460h = drawable != null ? new a(drawable) : null;
        super.setSelector(this.f460h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f454b = rect.left;
        this.f455c = rect.top;
        this.f456d = rect.right;
        this.f457e = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.n != null) {
            return;
        }
        super.drawableStateChanged();
        a(true);
        a();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f458f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.n != null) {
            this.n.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int measuredHeight = i7;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, iMakeMeasureSpec);
            view.forceLayout();
            if (i8 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return (i6 < 0 || i8 <= i6 || i10 <= 0 || measuredHeight == i5) ? i5 : i10;
            }
            if (i6 >= 0 && i8 >= i6) {
                i10 = measuredHeight;
            }
            i8++;
        }
        return measuredHeight;
    }

    private void a(boolean z) {
        if (this.f460h != null) {
            this.f460h.a(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$a */
    private static class a extends b.a.b.a.e {

        /* renamed from: b, reason: collision with root package name */
        private boolean f462b;

        a(Drawable drawable) {
            super(drawable);
            this.f462b = true;
        }

        void a(boolean z) {
            this.f462b = z;
        }

        @Override // b.a.b.a.e, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f462b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // b.a.b.a.e, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f462b) {
                super.draw(canvas);
            }
        }

        @Override // b.a.b.a.e, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f462b) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // b.a.b.a.e, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f462b) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // b.a.b.a.e, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f462b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            this.n = new b();
            this.n.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L11;
                case 2: goto Lf;
                case 3: goto Lc;
                default: goto L9;
            }
        L9:
            r9 = 0
            r3 = 1
            goto L41
        Lc:
            r9 = 0
            r3 = 0
            goto L41
        Lf:
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L19
            goto Lc
        L19:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L2c
            r9 = 1
            goto L41
        L2c:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.a(r3, r5, r4, r9)
            if (r0 != r2) goto L9
            r7.a(r3, r5)
            goto L9
        L41:
            if (r3 == 0) goto L45
            if (r9 == 0) goto L48
        L45:
            r7.b()
        L48:
            if (r3 == 0) goto L60
            androidx.core.widget.e r9 = r7.m
            if (r9 != 0) goto L55
            androidx.core.widget.e r9 = new androidx.core.widget.e
            r9.<init>(r7)
            r7.m = r9
        L55:
            androidx.core.widget.e r9 = r7.m
            r9.a(r2)
            androidx.core.widget.e r9 = r7.m
            r9.onTouch(r7, r8)
            goto L69
        L60:
            androidx.core.widget.e r8 = r7.m
            if (r8 == 0) goto L69
            androidx.core.widget.e r8 = r7.m
            r8.a(r1)
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0097x.a(android.view.MotionEvent, int):boolean");
    }

    private void a(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    void setListSelectionHidden(boolean z) {
        this.f461i = z;
    }

    private void a() {
        Drawable selector = getSelector();
        if (selector != null && c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void a(Canvas canvas) {
        Drawable selector;
        if (this.f453a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f453a);
        selector.draw(canvas);
    }

    private void a(int i2, View view, float f2, float f3) throws IllegalAccessException, IllegalArgumentException {
        a(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.a(selector, f2, f3);
    }

    private void a(int i2, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z = (selector == null || i2 == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        b(i2, view);
        if (z) {
            Rect rect = this.f453a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.a(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void b(int i2, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f453a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f454b;
        rect.top -= this.f455c;
        rect.right += this.f456d;
        rect.bottom += this.f457e;
        try {
            boolean z = this.f459g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f459g.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void b() {
        this.k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f458f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.l != null) {
            this.l.a();
            this.l = null;
        }
    }

    private void a(View view, int i2, float f2, float f3) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.k = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f458f != -1 && (childAt = getChildAt(this.f458f - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f458f = i2;
        float left = f2 - view.getLeft();
        float top = f3 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i2, view, f2, f3);
        a(false);
        refreshDrawableState();
    }

    private boolean c() {
        return this.k;
    }

    /* renamed from: androidx.appcompat.widget.x$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0097x.this.n = null;
            AbstractC0097x.this.drawableStateChanged();
        }

        public void a() {
            AbstractC0097x.this.n = null;
            AbstractC0097x.this.removeCallbacks(this);
        }

        public void b() {
            AbstractC0097x.this.post(this);
        }
    }
}
