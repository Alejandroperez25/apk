package androidx.appcompat.widget;

/* loaded from: classes.dex */
class H {

    /* renamed from: a, reason: collision with root package name */
    private int f264a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f265b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f266c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f267d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f268e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f269f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f270g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f271h = false;

    H() {
    }

    public int a() {
        return this.f264a;
    }

    public int b() {
        return this.f265b;
    }

    public int c() {
        return this.f270g ? this.f265b : this.f264a;
    }

    public int d() {
        return this.f270g ? this.f264a : this.f265b;
    }

    public void a(int i2, int i3) {
        this.f266c = i2;
        this.f267d = i3;
        this.f271h = true;
        if (this.f270g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f264a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f265b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f264a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f265b = i3;
        }
    }

    public void b(int i2, int i3) {
        this.f271h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f268e = i2;
            this.f264a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f269f = i3;
            this.f265b = i3;
        }
    }

    public void a(boolean z) {
        if (z == this.f270g) {
            return;
        }
        this.f270g = z;
        if (!this.f271h) {
            this.f264a = this.f268e;
            this.f265b = this.f269f;
        } else if (z) {
            this.f264a = this.f267d != Integer.MIN_VALUE ? this.f267d : this.f268e;
            this.f265b = this.f266c != Integer.MIN_VALUE ? this.f266c : this.f269f;
        } else {
            this.f264a = this.f266c != Integer.MIN_VALUE ? this.f266c : this.f268e;
            this.f265b = this.f267d != Integer.MIN_VALUE ? this.f267d : this.f269f;
        }
    }
}
