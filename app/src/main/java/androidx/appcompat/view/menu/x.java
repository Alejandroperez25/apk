package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.F;
import b.a.a$c;
import b.a.a$f;

/* loaded from: classes.dex */
final class x extends p implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, s, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    private static final int f188b = a$f.abc_popup_menu_item_layout;

    /* renamed from: c, reason: collision with root package name */
    private final Context f189c;

    /* renamed from: d, reason: collision with root package name */
    private final k f190d;

    /* renamed from: e, reason: collision with root package name */
    private final j f191e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f192f;

    /* renamed from: g, reason: collision with root package name */
    private final int f193g;

    /* renamed from: h, reason: collision with root package name */
    private final int f194h;

    /* renamed from: i, reason: collision with root package name */
    private final int f195i;
    final F j;
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private s.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    final ViewTreeObserver.OnGlobalLayoutListener k = new v(this);
    private final View.OnAttachStateChangeListener l = new w(this);
    private int u = 0;

    @Override // androidx.appcompat.view.menu.p
    public void b(k kVar) {
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean b() {
        return false;
    }

    public x(Context context, k kVar, View view, int i2, int i3, boolean z) {
        this.f189c = context;
        this.f190d = kVar;
        this.f192f = z;
        this.f191e = new j(kVar, LayoutInflater.from(context), this.f192f, f188b);
        this.f194h = i2;
        this.f195i = i3;
        Resources resources = context.getResources();
        this.f193g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a$c.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new F(this.f189c, null, this.f194h, this.f195i);
        kVar.a(this, context);
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(boolean z) {
        this.f191e.a(z);
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(int i2) {
        this.u = i2;
    }

    private boolean g() {
        if (c()) {
            return true;
        }
        if (this.r || this.n == null) {
            return false;
        }
        this.o = this.n;
        this.j.a((PopupWindow.OnDismissListener) this);
        this.j.a((AdapterView.OnItemClickListener) this);
        this.j.a(true);
        View view = this.o;
        boolean z = this.q == null;
        this.q = view.getViewTreeObserver();
        if (z) {
            this.q.addOnGlobalLayoutListener(this.k);
        }
        view.addOnAttachStateChangeListener(this.l);
        this.j.a(view);
        this.j.d(this.u);
        if (!this.s) {
            this.t = p.a(this.f191e, null, this.f189c, this.f193g);
            this.s = true;
        }
        this.j.f(this.t);
        this.j.g(2);
        this.j.a(e());
        this.j.a();
        ListView listViewD = this.j.d();
        listViewD.setOnKeyListener(this);
        if (this.v && this.f190d.m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f189c).inflate(a$f.abc_popup_menu_header_item_layout, (ViewGroup) listViewD, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f190d.m());
            }
            frameLayout.setEnabled(false);
            listViewD.addHeaderView(frameLayout, null, false);
        }
        this.j.a((ListAdapter) this.f191e);
        this.j.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.u
    public void a() {
        if (!g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.u
    public void dismiss() {
        if (c()) {
            this.j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.u
    public boolean c() {
        return !this.r && this.j.c();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.f190d.close();
        if (this.q != null) {
            if (!this.q.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        if (this.m != null) {
            this.m.onDismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(boolean z) {
        this.s = false;
        if (this.f191e != null) {
            this.f191e.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(s.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean a(y yVar) {
        if (yVar.hasVisibleItems()) {
            r rVar = new r(this.f189c, yVar, this.o, this.f192f, this.f194h, this.f195i);
            rVar.a(this.p);
            rVar.a(p.a((k) yVar));
            rVar.a(this.m);
            this.m = null;
            this.f190d.a(false);
            int iF = this.j.f();
            int iG = this.j.g();
            if ((Gravity.getAbsoluteGravity(this.u, b.d.g.v.b(this.n)) & 7) == 5) {
                iF += this.n.getWidth();
            }
            if (rVar.a(iF, iG)) {
                if (this.p == null) {
                    return true;
                }
                this.p.a(yVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(k kVar, boolean z) {
        if (kVar != this.f190d) {
            return;
        }
        dismiss();
        if (this.p != null) {
            this.p.a(kVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(View view) {
        this.n = view;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.u
    public ListView d() {
        return this.j.d();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(int i2) {
        this.j.b(i2);
    }

    @Override // androidx.appcompat.view.menu.p
    public void c(int i2) {
        this.j.c(i2);
    }

    @Override // androidx.appcompat.view.menu.p
    public void c(boolean z) {
        this.v = z;
    }
}
