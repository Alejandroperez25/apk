package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import b.a.a$i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class D implements androidx.appcompat.view.menu.u {

    /* renamed from: a, reason: collision with root package name */
    private static Method f247a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f248b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f249c;
    private Runnable E;
    final Handler F;
    private Rect H;
    private boolean I;
    PopupWindow J;

    /* renamed from: d, reason: collision with root package name */
    private Context f250d;

    /* renamed from: e, reason: collision with root package name */
    private ListAdapter f251e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC0097x f252f;

    /* renamed from: i, reason: collision with root package name */
    private int f255i;
    private int j;
    private boolean l;
    private boolean n;
    private boolean o;
    private View t;
    private DataSetObserver v;
    private View w;
    private Drawable x;
    private AdapterView.OnItemClickListener y;
    private AdapterView.OnItemSelectedListener z;

    /* renamed from: g, reason: collision with root package name */
    private int f253g = -2;

    /* renamed from: h, reason: collision with root package name */
    private int f254h = -2;
    private int k = 1002;
    private boolean m = true;
    private int p = 0;
    private boolean q = false;
    private boolean r = false;
    int s = Integer.MAX_VALUE;
    private int u = 0;
    final e A = new e();
    private final d B = new d();
    private final c C = new c();
    private final a D = new a();
    private final Rect G = new Rect();

    abstract AbstractC0097x a(Context context, boolean z);

    static {
        try {
            f247a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f248b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f249c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public D(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f250d = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.ListPopupWindow, i2, i3);
        this.f255i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a$i.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a$i.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.j != 0) {
            this.l = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.J = new C0089p(context, attributeSet, i2, i3);
        this.J.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        if (this.v == null) {
            this.v = new b();
        } else if (this.f251e != null) {
            this.f251e.unregisterDataSetObserver(this.v);
        }
        this.f251e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        if (this.f252f != null) {
            this.f252f.setAdapter(this.f251e);
        }
    }

    public void a(boolean z) {
        this.I = z;
        this.J.setFocusable(z);
    }

    public boolean b() {
        return this.I;
    }

    public void a(int i2) {
        this.J.setAnimationStyle(i2);
    }

    public View e() {
        return this.w;
    }

    public void a(View view) {
        this.w = view;
    }

    public int f() {
        return this.f255i;
    }

    public void b(int i2) {
        this.f255i = i2;
    }

    public int g() {
        if (this.l) {
            return this.j;
        }
        return 0;
    }

    public void c(int i2) {
        this.j = i2;
        this.l = true;
    }

    public void a(Rect rect) {
        this.H = rect;
    }

    public void d(int i2) {
        this.p = i2;
    }

    public void e(int i2) {
        this.f254h = i2;
    }

    public void f(int i2) {
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            this.f254h = this.G.left + this.G.right + i2;
        } else {
            e(i2);
        }
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    @Override // androidx.appcompat.view.menu.u
    public void a() {
        int width;
        int width2;
        int iK = k();
        boolean zI = i();
        androidx.core.widget.h.a(this.J, this.k);
        if (this.J.isShowing()) {
            if (b.d.g.v.k(e())) {
                if (this.f254h == -1) {
                    width2 = -1;
                } else if (this.f254h == -2) {
                    width2 = e().getWidth();
                } else {
                    width2 = this.f254h;
                }
                if (this.f253g == -1) {
                    if (!zI) {
                        iK = -1;
                    }
                    if (zI) {
                        this.J.setWidth(this.f254h == -1 ? -1 : 0);
                        this.J.setHeight(0);
                    } else {
                        this.J.setWidth(this.f254h == -1 ? -1 : 0);
                        this.J.setHeight(-1);
                    }
                } else if (this.f253g != -2) {
                    iK = this.f253g;
                }
                this.J.setOutsideTouchable((this.r || this.q) ? false : true);
                this.J.update(e(), this.f255i, this.j, width2 < 0 ? -1 : width2, iK < 0 ? -1 : iK);
                return;
            }
            return;
        }
        if (this.f254h == -1) {
            width = -1;
        } else if (this.f254h == -2) {
            width = e().getWidth();
        } else {
            width = this.f254h;
        }
        if (this.f253g == -1) {
            iK = -1;
        } else if (this.f253g != -2) {
            iK = this.f253g;
        }
        this.J.setWidth(width);
        this.J.setHeight(iK);
        c(true);
        this.J.setOutsideTouchable((this.r || this.q) ? false : true);
        this.J.setTouchInterceptor(this.B);
        if (this.o) {
            androidx.core.widget.h.a(this.J, this.n);
        }
        if (f249c != null) {
            try {
                f249c.invoke(this.J, this.H);
            } catch (Exception e2) {
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
            }
        }
        androidx.core.widget.h.a(this.J, e(), this.f255i, this.j, this.p);
        this.f252f.setSelection(-1);
        if (!this.I || this.f252f.isInTouchMode()) {
            h();
        }
        if (this.I) {
            return;
        }
        this.F.post(this.D);
    }

    @Override // androidx.appcompat.view.menu.u
    public void dismiss() {
        this.J.dismiss();
        j();
        this.J.setContentView(null);
        this.f252f = null;
        this.F.removeCallbacks(this.A);
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.J.setOnDismissListener(onDismissListener);
    }

    private void j() {
        if (this.t != null) {
            ViewParent parent = this.t.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
    }

    public void g(int i2) {
        this.J.setInputMethodMode(i2);
    }

    public void h() {
        AbstractC0097x abstractC0097x = this.f252f;
        if (abstractC0097x != null) {
            abstractC0097x.setListSelectionHidden(true);
            abstractC0097x.requestLayout();
        }
    }

    @Override // androidx.appcompat.view.menu.u
    public boolean c() {
        return this.J.isShowing();
    }

    public boolean i() {
        return this.J.getInputMethodMode() == 2;
    }

    @Override // androidx.appcompat.view.menu.u
    public ListView d() {
        return this.f252f;
    }

    private int k() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        int i3;
        int i4;
        if (this.f252f == null) {
            Context context = this.f250d;
            this.E = new B(this);
            this.f252f = a(context, !this.I);
            if (this.x != null) {
                this.f252f.setSelector(this.x);
            }
            this.f252f.setAdapter(this.f251e);
            this.f252f.setOnItemClickListener(this.y);
            this.f252f.setFocusable(true);
            this.f252f.setFocusableInTouchMode(true);
            this.f252f.setOnItemSelectedListener(new C(this));
            this.f252f.setOnScrollListener(this.C);
            if (this.z != null) {
                this.f252f.setOnItemSelectedListener(this.z);
            }
            View view = this.f252f;
            View view2 = this.t;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.u) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(view, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.u);
                        break;
                }
                if (this.f254h >= 0) {
                    i3 = this.f254h;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i3, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.J.setContentView(view);
        } else {
            View view3 = this.t;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            i2 = this.G.top + this.G.bottom;
            if (!this.l) {
                this.j = -this.G.top;
            }
        } else {
            this.G.setEmpty();
            i2 = 0;
        }
        int iA = a(e(), this.j, this.J.getInputMethodMode() == 2);
        if (this.q || this.f253g == -1) {
            return iA + i2;
        }
        switch (this.f254h) {
            case -2:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f250d.getResources().getDisplayMetrics().widthPixels - (this.G.left + this.G.right), Integer.MIN_VALUE);
                break;
            case -1:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f250d.getResources().getDisplayMetrics().widthPixels - (this.G.left + this.G.right), 1073741824);
                break;
            default:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f254h, 1073741824);
                break;
        }
        int iA2 = this.f252f.a(iMakeMeasureSpec, 0, -1, iA - measuredHeight, -1);
        if (iA2 > 0) {
            measuredHeight += i2 + this.f252f.getPaddingTop() + this.f252f.getPaddingBottom();
        }
        return iA2 + measuredHeight;
    }

    public void b(boolean z) {
        this.o = true;
        this.n = z;
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (D.this.c()) {
                D.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            D.this.dismiss();
        }
    }

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.h();
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (D.this.f252f == null || !b.d.g.v.k(D.this.f252f) || D.this.f252f.getCount() <= D.this.f252f.getChildCount() || D.this.f252f.getChildCount() > D.this.s) {
                return;
            }
            D.this.J.setInputMethodMode(2);
            D.this.a();
        }
    }

    private class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && D.this.J != null && D.this.J.isShowing() && x >= 0 && x < D.this.J.getWidth() && y >= 0 && y < D.this.J.getHeight()) {
                D.this.F.postDelayed(D.this.A, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            D.this.F.removeCallbacks(D.this.A);
            return false;
        }
    }

    private class c implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || D.this.i() || D.this.J.getContentView() == null) {
                return;
            }
            D.this.F.removeCallbacks(D.this.A);
            D.this.A.run();
        }
    }

    private void c(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f247a != null) {
            try {
                f247a.invoke(this.J, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int a(View view, int i2, boolean z) {
        if (f248b != null) {
            try {
                return ((Integer) f248b.invoke(this.J, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.J.getMaxAvailableHeight(view, i2);
    }
}
