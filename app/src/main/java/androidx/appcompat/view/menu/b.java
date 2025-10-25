package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.s;
import androidx.appcompat.view.menu.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements s {

    /* renamed from: a, reason: collision with root package name */
    protected Context f123a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f124b;

    /* renamed from: c, reason: collision with root package name */
    protected k f125c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f126d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f127e;

    /* renamed from: f, reason: collision with root package name */
    private s.a f128f;

    /* renamed from: g, reason: collision with root package name */
    private int f129g;

    /* renamed from: h, reason: collision with root package name */
    private int f130h;

    /* renamed from: i, reason: collision with root package name */
    protected t f131i;

    public abstract void a(n nVar, t.a aVar);

    public abstract boolean a(int i2, n nVar);

    @Override // androidx.appcompat.view.menu.s
    public boolean a(k kVar, n nVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean b(k kVar, n nVar) {
        return false;
    }

    public b(Context context, int i2, int i3) {
        this.f123a = context;
        this.f126d = LayoutInflater.from(context);
        this.f129g = i2;
        this.f130h = i3;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(Context context, k kVar) {
        this.f124b = context;
        this.f127e = LayoutInflater.from(this.f124b);
        this.f125c = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.s
    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f131i;
        if (viewGroup == null) {
            return;
        }
        int i2 = 0;
        if (this.f125c != null) {
            this.f125c.j();
            ArrayList<n> arrayListI = this.f125c.i();
            int size = arrayListI.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                n nVar = arrayListI.get(i4);
                if (a(i3, nVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    n itemData = childAt instanceof t.a ? ((t.a) childAt).getItemData() : null;
                    View viewA = a(nVar, childAt, viewGroup);
                    if (nVar != itemData) {
                        viewA.setPressed(false);
                        viewA.jumpDrawablesToCurrentState();
                    }
                    if (viewA != childAt) {
                        a(viewA, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!a(viewGroup, i2)) {
                i2++;
            }
        }
    }

    protected void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f131i).addView(view, i2);
    }

    protected boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(s.a aVar) {
        this.f128f = aVar;
    }

    public s.a a() {
        return this.f128f;
    }

    public t.a a(ViewGroup viewGroup) {
        return (t.a) this.f126d.inflate(this.f130h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View a(n nVar, View view, ViewGroup viewGroup) {
        t.a aVarA;
        if (view instanceof t.a) {
            aVarA = (t.a) view;
        } else {
            aVarA = a(viewGroup);
        }
        a(nVar, aVarA);
        return (View) aVarA;
    }

    @Override // androidx.appcompat.view.menu.s
    public void a(k kVar, boolean z) {
        if (this.f128f != null) {
            this.f128f.a(kVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.s
    public boolean a(y yVar) {
        if (this.f128f != null) {
            return this.f128f.a(yVar);
        }
        return false;
    }
}
