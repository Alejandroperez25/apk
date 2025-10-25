package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.s;
import b.a.a$c;

/* loaded from: classes.dex */
public class r implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f177a;

    /* renamed from: b, reason: collision with root package name */
    private final k f178b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f179c;

    /* renamed from: d, reason: collision with root package name */
    private final int f180d;

    /* renamed from: e, reason: collision with root package name */
    private final int f181e;

    /* renamed from: f, reason: collision with root package name */
    private View f182f;

    /* renamed from: g, reason: collision with root package name */
    private int f183g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f184h;

    /* renamed from: i, reason: collision with root package name */
    private s.a f185i;
    private p j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    public r(Context context, k kVar, View view, boolean z, int i2) {
        this(context, kVar, view, z, i2, 0);
    }

    public r(Context context, k kVar, View view, boolean z, int i2, int i3) {
        this.f183g = 8388611;
        this.l = new q(this);
        this.f177a = context;
        this.f178b = kVar;
        this.f182f = view;
        this.f179c = z;
        this.f180d = i2;
        this.f181e = i3;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(View view) {
        this.f182f = view;
    }

    public void a(boolean z) {
        this.f184h = z;
        if (this.j != null) {
            this.j.b(z);
        }
    }

    public void a(int i2) {
        this.f183g = i2;
    }

    public void a() {
        if (!c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public p b() {
        if (this.j == null) {
            this.j = g();
        }
        return this.j;
    }

    public boolean c() {
        if (f()) {
            return true;
        }
        if (this.f182f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public boolean a(int i2, int i3) {
        if (f()) {
            return true;
        }
        if (this.f182f == null) {
            return false;
        }
        a(i2, i3, true, true);
        return true;
    }

    private p g() {
        p xVar;
        Display defaultDisplay = ((WindowManager) this.f177a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f177a.getResources().getDimensionPixelSize(a$c.abc_cascading_menus_min_smallest_width)) {
            xVar = new i(this.f177a, this.f182f, this.f180d, this.f181e, this.f179c);
        } else {
            xVar = new x(this.f177a, this.f178b, this.f182f, this.f180d, this.f181e, this.f179c);
        }
        xVar.b(this.f178b);
        xVar.a(this.l);
        xVar.a(this.f182f);
        xVar.a(this.f185i);
        xVar.b(this.f184h);
        xVar.a(this.f183g);
        return xVar;
    }

    private void a(int i2, int i3, boolean z, boolean z2) {
        p pVarB = b();
        pVarB.c(z2);
        if (z) {
            if ((b.d.g.c.a(this.f183g, b.d.g.v.b(this.f182f)) & 7) == 5) {
                i2 -= this.f182f.getWidth();
            }
            pVarB.b(i2);
            pVarB.c(i3);
            int i4 = (int) ((this.f177a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            pVarB.a(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        pVarB.a();
    }

    public void d() {
        if (f()) {
            this.j.dismiss();
        }
    }

    protected void e() {
        this.j = null;
        if (this.k != null) {
            this.k.onDismiss();
        }
    }

    public boolean f() {
        return this.j != null && this.j.c();
    }

    public void a(s.a aVar) {
        this.f185i = aVar;
        if (this.j != null) {
            this.j.a(aVar);
        }
    }
}
