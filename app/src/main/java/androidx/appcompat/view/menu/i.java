package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.widget.E;
import androidx.appcompat.widget.F;
import b.a.a$c;
import b.a.a$f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class i extends p implements s, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    private static final int f139b = a$f.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c, reason: collision with root package name */
    private final Context f140c;

    /* renamed from: d, reason: collision with root package name */
    private final int f141d;

    /* renamed from: e, reason: collision with root package name */
    private final int f142e;

    /* renamed from: f, reason: collision with root package name */
    private final int f143f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f144g;

    /* renamed from: h, reason: collision with root package name */
    final Handler f145h;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private s.a y;
    ViewTreeObserver z;

    /* renamed from: i, reason: collision with root package name */
    private final List<k> f146i = new ArrayList();
    final List<a> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new e(this);
    private final View.OnAttachStateChangeListener l = new f(this);
    private final E m = new h(this);
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = h();

    @Override // androidx.appcompat.view.menu.s
    public boolean b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    protected boolean f() {
        return false;
    }

    public i(Context context, View view, int i2, int i3, boolean z) {
        this.f140c = context;
        this.p = view;
        this.f142e = i2;
        this.f143f = i3;
        this.f144g = z;
        Resources resources = context.getResources();
        this.f141d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a$c.abc_config_prefDialogWidth));
        this.f145h = new Handler();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(boolean z) {
        this.w = z;
    }

    private F g() {
        F f2 = new F(this.f140c, null, this.f142e, this.f143f);
        f2.a(this.m);
        f2.a((AdapterView.OnItemClickListener) this);
        f2.a((PopupWindow.OnDismissListener) this);
        f2.a(this.p);
        f2.d(this.o);
        f2.a(true);
        f2.g(2);
        return f2;
    }

    @Override // androidx.appcompat.view.menu.u
    public void a() {
        if (c()) {
            return;
        }
        Iterator<k> it = this.f146i.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        this.f146i.clear();
        this.q = this.p;
        if (this.q != null) {
            boolean z = this.z == null;
            this.z = this.q.getViewTreeObserver();
            if (z) {
                this.z.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // androidx.appcompat.view.menu.u
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.j.toArray(new a[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a aVar = aVarArr[i2];
                if (aVar.f147a.c()) {
                    aVar.f147a.dismiss();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    private int h() {
        return b.d.g.v.b(this.p) == 1 ? 0 : 1;
    }

    private int d(int i2) {
        ListView listViewA = this.j.get(this.j.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + listViewA.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(k kVar) {
        kVar.a(this, this.f140c);
        if (c()) {
            c(kVar);
        } else {
            this.f146i.add(kVar);
        }
    }

    private void c(k kVar) {
        a aVar;
        View viewA;
        int i2;
        int i3;
        int width;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f140c);
        j jVar = new j(kVar, layoutInflaterFrom, this.f144g, f139b);
        if (!c() && this.w) {
            jVar.a(true);
        } else if (c()) {
            jVar.a(p.a(kVar));
        }
        int iA = p.a(jVar, null, this.f140c, this.f141d);
        F fG = g();
        fG.a((ListAdapter) jVar);
        fG.f(iA);
        fG.d(this.o);
        if (this.j.size() > 0) {
            aVar = this.j.get(this.j.size() - 1);
            viewA = a(aVar, kVar);
        } else {
            aVar = null;
            viewA = null;
        }
        if (viewA != null) {
            fG.c(false);
            fG.a((Object) null);
            int iD = d(iA);
            boolean z = iD == 1;
            this.r = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                fG.a(viewA);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewA.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + viewA.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                width = z ? i2 + iA : i2 - viewA.getWidth();
            } else {
                width = z ? i2 + viewA.getWidth() : i2 - iA;
            }
            fG.b(width);
            fG.b(true);
            fG.c(i3);
        } else {
            if (this.s) {
                fG.b(this.u);
            }
            if (this.t) {
                fG.c(this.v);
            }
            fG.a(e());
        }
        this.j.add(new a(fG, kVar, this.r));
        fG.a();
        ListView listViewD = fG.d();
        listViewD.setOnKeyListener(this);
        if (aVar == null && this.x && kVar.m() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(a$f.abc_popup_menu_header_item_layout, (ViewGroup) listViewD, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.m());
            listViewD.addHeaderView(frameLayout, null, false);
            fG.a();
        }
    }

    private MenuItem a(k kVar, k kVar2) {
        int size = kVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = kVar.getItem(i2);
            if (item.hasSubMenu() && kVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(a aVar, k kVar) {
        j jVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = a(aVar.f148b, kVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = aVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            jVar = (j) headerViewListAdapter.getWrappedAdapter();
        } else {
            jVar = (j) adapter;
            headersCount = 0;
        }
        int count = jVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemA == jVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.u
    public boolean c() {
        return this.j.size() > 0 && this.j.get(0).f147a.c();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        a aVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                aVar = null;
                break;
            }
            aVar = this.j.get(i2);
            if (!aVar.f147a.c()) {
                break;
            } else {
                i2++;
            }
        }
        if (aVar != null) {
            aVar.f148b.a(false);
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(boolean z) {
        Iterator<a> it = this.j.iterator();
        while (it.hasNext()) {
            p.a(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(s.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean a(y yVar) {
        for (a aVar : this.j) {
            if (yVar == aVar.f148b) {
                aVar.a().requestFocus();
                return true;
            }
        }
        if (!yVar.hasVisibleItems()) {
            return false;
        }
        b(yVar);
        if (this.y != null) {
            this.y.a(yVar);
        }
        return true;
    }

    private int d(k kVar) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (kVar == this.j.get(i2).f148b) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(k kVar, boolean z) {
        int iD = d(kVar);
        if (iD < 0) {
            return;
        }
        int i2 = iD + 1;
        if (i2 < this.j.size()) {
            this.j.get(i2).f148b.a(false);
        }
        a aVarRemove = this.j.remove(iD);
        aVarRemove.f148b.a(this);
        if (this.B) {
            aVarRemove.f147a.b((Object) null);
            aVarRemove.f147a.a(0);
        }
        aVarRemove.f147a.dismiss();
        int size = this.j.size();
        if (size > 0) {
            this.r = this.j.get(size - 1).f149c;
        } else {
            this.r = h();
        }
        if (size != 0) {
            if (z) {
                this.j.get(0).f148b.a(false);
                return;
            }
            return;
        }
        dismiss();
        if (this.y != null) {
            this.y.a(kVar, true);
        }
        if (this.z != null) {
            if (this.z.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = b.d.g.c.a(i2, b.d.g.v.b(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = b.d.g.c.a(this.n, b.d.g.v.b(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.u
    public ListView d() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(this.j.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public void c(boolean z) {
        this.x = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final F f147a;

        /* renamed from: b, reason: collision with root package name */
        public final k f148b;

        /* renamed from: c, reason: collision with root package name */
        public final int f149c;

        public a(F f2, k kVar, int i2) {
            this.f147a = f2;
            this.f148b = kVar;
            this.f149c = i2;
        }

        public ListView a() {
            return this.f147a.d();
        }
    }
}
