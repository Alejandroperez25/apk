package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.ActionMenuView;
import b.a.a$f;
import b.d.g.b;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0079f extends androidx.appcompat.view.menu.b implements b.a {
    c A;
    private b B;
    final C0005f C;
    int D;
    d j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private final SparseBooleanArray w;
    private View x;
    e y;
    a z;

    public C0079f(Context context) {
        super(context, a$f.abc_action_menu_layout, a$f.abc_action_menu_item_layout);
        this.w = new SparseBooleanArray();
        this.C = new C0005f();
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.s
    public void a(Context context, androidx.appcompat.view.menu.k kVar) {
        super.a(context, kVar);
        Resources resources = context.getResources();
        b.a.c.a aVarA = b.a.c.a.a(context);
        if (!this.n) {
            this.m = aVarA.b();
        }
        if (!this.t) {
            this.o = aVarA.c();
        }
        if (!this.r) {
            this.q = aVarA.a();
        }
        int measuredWidth = this.o;
        if (this.m) {
            if (this.j == null) {
                this.j = new d(this.f123a);
                if (this.l) {
                    this.j.setImageDrawable(this.k);
                    this.k = null;
                    this.l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.p = measuredWidth;
        this.v = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.x = null;
    }

    public void a(Configuration configuration) {
        if (!this.r) {
            this.q = b.a.c.a.a(this.f124b).a();
        }
        if (this.f125c != null) {
            this.f125c.b(true);
        }
    }

    public void b(boolean z) {
        this.m = z;
        this.n = true;
    }

    public void c(boolean z) {
        this.u = z;
    }

    public void a(Drawable drawable) {
        if (this.j != null) {
            this.j.setImageDrawable(drawable);
        } else {
            this.l = true;
            this.k = drawable;
        }
    }

    public Drawable c() {
        if (this.j != null) {
            return this.j.getDrawable();
        }
        if (this.l) {
            return this.k;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.b
    public View a(androidx.appcompat.view.menu.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.n()) {
            actionView = super.a(nVar, view, viewGroup);
        }
        actionView.setVisibility(nVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public void a(androidx.appcompat.view.menu.n nVar, t.a aVar) {
        aVar.a(nVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f131i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(int i2, androidx.appcompat.view.menu.n nVar) {
        return nVar.i();
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.s
    public void a(boolean z) {
        super.a(z);
        ((View) this.f131i).requestLayout();
        boolean z2 = false;
        if (this.f125c != null) {
            ArrayList<androidx.appcompat.view.menu.n> arrayListK = this.f125c.k();
            int size = arrayListK.size();
            for (int i2 = 0; i2 < size; i2++) {
                b.d.g.b bVarM = arrayListK.get(i2).m();
                if (bVarM != null) {
                    bVarM.a(this);
                }
            }
        }
        ArrayList<androidx.appcompat.view.menu.n> arrayListL = this.f125c != null ? this.f125c.l() : null;
        if (this.m && arrayListL != null) {
            int size2 = arrayListL.size();
            if (size2 == 1) {
                z2 = !arrayListL.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.j == null) {
                this.j = new d(this.f123a);
            }
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup != this.f131i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f131i;
                actionMenuView.addView(this.j, actionMenuView.a());
            }
        } else if (this.j != null && this.j.getParent() == this.f131i) {
            ((ViewGroup) this.f131i).removeView(this.j);
        }
        ((ActionMenuView) this.f131i).setOverflowReserved(this.m);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean a(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.j) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.s
    public boolean a(androidx.appcompat.view.menu.y yVar) {
        boolean z = false;
        if (!yVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.y yVar2 = yVar;
        while (yVar2.q() != this.f125c) {
            yVar2 = (androidx.appcompat.view.menu.y) yVar2.q();
        }
        View viewA = a(yVar2.getItem());
        if (viewA == null) {
            return false;
        }
        this.D = yVar.getItem().getItemId();
        int size = yVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = yVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        this.z = new a(this.f124b, yVar, viewA);
        this.z.a(z);
        this.z.a();
        super.a(yVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f131i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof t.a) && ((t.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean d() {
        if (!this.m || h() || this.f125c == null || this.f131i == null || this.A != null || this.f125c.l().isEmpty()) {
            return false;
        }
        this.A = new c(new e(this.f124b, this.f125c, this.j, true));
        ((View) this.f131i).post(this.A);
        super.a((androidx.appcompat.view.menu.y) null);
        return true;
    }

    public boolean e() {
        if (this.A != null && this.f131i != null) {
            ((View) this.f131i).removeCallbacks(this.A);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar == null) {
            return false;
        }
        eVar.d();
        return true;
    }

    public boolean f() {
        return e() | g();
    }

    public boolean g() {
        if (this.z == null) {
            return false;
        }
        this.z.d();
        return true;
    }

    public boolean h() {
        return this.y != null && this.y.f();
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean b() {
        ArrayList<androidx.appcompat.view.menu.n> arrayListI;
        int size;
        int iA;
        int i2;
        int i3;
        boolean z;
        C0079f c0079f = this;
        int i4 = 0;
        if (c0079f.f125c != null) {
            arrayListI = c0079f.f125c.i();
            size = arrayListI.size();
        } else {
            arrayListI = null;
            size = 0;
        }
        int i5 = c0079f.q;
        int i6 = c0079f.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0079f.f131i;
        int i7 = i5;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.n nVar = arrayListI.get(i10);
            if (nVar.k()) {
                i8++;
            } else if (nVar.j()) {
                i9++;
            } else {
                z2 = true;
            }
            if (c0079f.u && nVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (c0079f.m && (z2 || i9 + i8 > i7)) {
            i7--;
        }
        int i11 = i7 - i8;
        SparseBooleanArray sparseBooleanArray = c0079f.w;
        sparseBooleanArray.clear();
        if (c0079f.s) {
            iA = i6 / c0079f.v;
            i2 = ((i6 % c0079f.v) / iA) + c0079f.v;
        } else {
            iA = 0;
            i2 = 0;
        }
        int i12 = i6;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            androidx.appcompat.view.menu.n nVar2 = arrayListI.get(i13);
            if (nVar2.k()) {
                View viewA = c0079f.a(nVar2, c0079f.x, viewGroup);
                if (c0079f.x == null) {
                    c0079f.x = viewA;
                }
                if (c0079f.s) {
                    iA -= ActionMenuView.a(viewA, i2, iA, iMakeMeasureSpec, i4);
                } else {
                    viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i14 != 0) {
                    measuredWidth = i14;
                }
                int groupId = nVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                nVar2.d(z);
                i3 = size;
                i14 = measuredWidth;
            } else if (nVar2.j()) {
                int groupId2 = nVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i11 > 0 || z3) && i12 > 0 && (!c0079f.s || iA > 0);
                if (z4) {
                    boolean z5 = z4;
                    View viewA2 = c0079f.a(nVar2, c0079f.x, viewGroup);
                    i3 = size;
                    if (c0079f.x == null) {
                        c0079f.x = viewA2;
                    }
                    if (c0079f.s) {
                        int iA2 = ActionMenuView.a(viewA2, i2, iA, iMakeMeasureSpec, 0);
                        iA -= iA2;
                        if (iA2 == 0) {
                            z5 = false;
                        }
                    } else {
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z4 = c0079f.s ? z5 & (i12 >= 0) : z5 & (i12 + i14 > 0);
                } else {
                    i3 = size;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        androidx.appcompat.view.menu.n nVar3 = arrayListI.get(i15);
                        if (nVar3.getGroupId() == groupId2) {
                            if (nVar3.i()) {
                                i11++;
                            }
                            nVar3.d(false);
                        }
                    }
                }
                if (z4) {
                    i11--;
                }
                nVar2.d(z4);
            } else {
                i3 = size;
                nVar2.d(false);
                i13++;
                size = i3;
                c0079f = this;
                i4 = 0;
            }
            i13++;
            size = i3;
            c0079f = this;
            i4 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.s
    public void a(androidx.appcompat.view.menu.k kVar, boolean z) {
        f();
        super.a(kVar, z);
    }

    public void a(ActionMenuView actionMenuView) {
        this.f131i = actionMenuView;
        actionMenuView.a(this.f125c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f$d */
    class d extends C0088o implements ActionMenuView.a {

        /* renamed from: c, reason: collision with root package name */
        private final float[] f365c;

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        public d(Context context) {
            super(context, null, b.a.a$a.actionOverflowButtonStyle);
            this.f365c = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            ha.a(this, getContentDescription());
            setOnTouchListener(new C0080g(this, this, C0079f.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0079f.this.d();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.a(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f$e */
    class e extends androidx.appcompat.view.menu.r {
        public e(Context context, androidx.appcompat.view.menu.k kVar, View view, boolean z) {
            super(context, kVar, view, z, b.a.a$a.actionOverflowMenuStyle);
            a(8388613);
            a(C0079f.this.C);
        }

        @Override // androidx.appcompat.view.menu.r
        protected void e() {
            if (((androidx.appcompat.view.menu.b) C0079f.this).f125c != null) {
                ((androidx.appcompat.view.menu.b) C0079f.this).f125c.close();
            }
            C0079f.this.y = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.f$a */
    private class a extends androidx.appcompat.view.menu.r {
        public a(Context context, androidx.appcompat.view.menu.y yVar, View view) {
            super(context, yVar, view, false, b.a.a$a.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.n) yVar.getItem()).i()) {
                a(C0079f.this.j == null ? (View) ((androidx.appcompat.view.menu.b) C0079f.this).f131i : C0079f.this.j);
            }
            a(C0079f.this.C);
        }

        @Override // androidx.appcompat.view.menu.r
        protected void e() {
            C0079f.this.z = null;
            C0079f.this.D = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.f$f, reason: collision with other inner class name */
    private class C0005f implements s.a {
        C0005f() {
        }

        @Override // androidx.appcompat.view.menu.s.a
        public boolean a(androidx.appcompat.view.menu.k kVar) {
            if (kVar == null) {
                return false;
            }
            C0079f.this.D = ((androidx.appcompat.view.menu.y) kVar).getItem().getItemId();
            s.a aVarA = C0079f.this.a();
            if (aVarA != null) {
                return aVarA.a(kVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.s.a
        public void a(androidx.appcompat.view.menu.k kVar, boolean z) {
            if (kVar instanceof androidx.appcompat.view.menu.y) {
                kVar.n().a(false);
            }
            s.a aVarA = C0079f.this.a();
            if (aVarA != null) {
                aVarA.a(kVar, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private e f363a;

        public c(e eVar) {
            this.f363a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) C0079f.this).f125c != null) {
                ((androidx.appcompat.view.menu.b) C0079f.this).f125c.f();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) C0079f.this).f131i;
            if (view != null && view.getWindowToken() != null && this.f363a.c()) {
                C0079f.this.y = this.f363a;
            }
            C0079f.this.A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.f$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.u a() {
            if (C0079f.this.z != null) {
                return C0079f.this.z.b();
            }
            return null;
        }
    }
}
