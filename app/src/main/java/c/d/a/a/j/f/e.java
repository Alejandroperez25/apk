package c.d.a.a.j.f;

import android.text.Layout;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f3217a;

    /* renamed from: b, reason: collision with root package name */
    private int f3218b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3219c;

    /* renamed from: d, reason: collision with root package name */
    private int f3220d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3221e;

    /* renamed from: f, reason: collision with root package name */
    private int f3222f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f3223g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f3224h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f3225i = -1;
    private int j = -1;
    private float k;
    private String l;
    private e m;
    private Layout.Alignment n;

    public int a() {
        if (this.f3224h == -1 && this.f3225i == -1) {
            return -1;
        }
        return (this.f3224h == 1 ? 1 : 0) | (this.f3225i == 1 ? 2 : 0);
    }

    public boolean b() {
        return this.f3222f == 1;
    }

    public e a(boolean z) {
        AbstractC0170e.b(this.m == null);
        this.f3222f = z ? 1 : 0;
        return this;
    }

    public boolean c() {
        return this.f3223g == 1;
    }

    public e b(boolean z) {
        AbstractC0170e.b(this.m == null);
        this.f3223g = z ? 1 : 0;
        return this;
    }

    public e c(boolean z) {
        AbstractC0170e.b(this.m == null);
        this.f3224h = z ? 1 : 0;
        return this;
    }

    public e d(boolean z) {
        AbstractC0170e.b(this.m == null);
        this.f3225i = z ? 1 : 0;
        return this;
    }

    public String d() {
        return this.f3217a;
    }

    public e a(String str) {
        AbstractC0170e.b(this.m == null);
        this.f3217a = str;
        return this;
    }

    public int e() {
        if (!this.f3219c) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.f3218b;
    }

    public e a(int i2) {
        AbstractC0170e.b(this.m == null);
        this.f3218b = i2;
        this.f3219c = true;
        return this;
    }

    public boolean f() {
        return this.f3219c;
    }

    public int g() {
        if (!this.f3221e) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.f3220d;
    }

    public e b(int i2) {
        this.f3220d = i2;
        this.f3221e = true;
        return this;
    }

    public boolean h() {
        return this.f3221e;
    }

    public e a(e eVar) {
        a(eVar, true);
        return this;
    }

    private e a(e eVar, boolean z) {
        if (eVar != null) {
            if (!this.f3219c && eVar.f3219c) {
                a(eVar.f3218b);
            }
            if (this.f3224h == -1) {
                this.f3224h = eVar.f3224h;
            }
            if (this.f3225i == -1) {
                this.f3225i = eVar.f3225i;
            }
            if (this.f3217a == null) {
                this.f3217a = eVar.f3217a;
            }
            if (this.f3222f == -1) {
                this.f3222f = eVar.f3222f;
            }
            if (this.f3223g == -1) {
                this.f3223g = eVar.f3223g;
            }
            if (this.n == null) {
                this.n = eVar.n;
            }
            if (this.j == -1) {
                this.j = eVar.j;
                this.k = eVar.k;
            }
            if (z && !this.f3221e && eVar.f3221e) {
                b(eVar.f3220d);
            }
        }
        return this;
    }

    public e b(String str) {
        this.l = str;
        return this;
    }

    public String i() {
        return this.l;
    }

    public Layout.Alignment j() {
        return this.n;
    }

    public e a(Layout.Alignment alignment) {
        this.n = alignment;
        return this;
    }

    public e a(float f2) {
        this.k = f2;
        return this;
    }

    public e c(int i2) {
        this.j = i2;
        return this;
    }

    public int k() {
        return this.j;
    }

    public float l() {
        return this.k;
    }
}
