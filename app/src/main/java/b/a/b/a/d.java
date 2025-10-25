package b.a.b.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* loaded from: classes.dex */
abstract class d extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    private b f915a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f916b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f917c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f918d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f920f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f923i;
    private Runnable j;
    private long k;
    private long l;
    private a m;

    /* renamed from: e, reason: collision with root package name */
    private int f919e = 255;

    /* renamed from: g, reason: collision with root package name */
    private int f921g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f922h = -1;

    abstract b b();

    d() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f917c != null) {
            this.f917c.draw(canvas);
        }
        if (this.f918d != null) {
            this.f918d.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f915a.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    private boolean c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectE = this.f915a.e();
        if (rectE != null) {
            rect.set(rectE);
            padding = (rectE.right | ((rectE.left | rectE.top) | rectE.bottom)) != 0;
        } else if (this.f917c != null) {
            padding = this.f917c.getPadding(rect);
        } else {
            padding = super.getPadding(rect);
        }
        if (c()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f917c != null) {
            this.f917c.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f920f && this.f919e == i2) {
            return;
        }
        this.f920f = true;
        this.f919e = i2;
        if (this.f917c != null) {
            if (this.k == 0) {
                this.f917c.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f919e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.f915a.x != z) {
            this.f915a.x = z;
            if (this.f917c != null) {
                this.f917c.setDither(this.f915a.x);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f915a.E = true;
        if (this.f915a.D != colorFilter) {
            this.f915a.D = colorFilter;
            if (this.f917c != null) {
                this.f917c.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f915a.H = true;
        if (this.f915a.F != colorStateList) {
            this.f915a.F = colorStateList;
            androidx.core.graphics.drawable.a.a(this.f917c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f915a.I = true;
        if (this.f915a.G != mode) {
            this.f915a.G = mode;
            androidx.core.graphics.drawable.a.a(this.f917c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f918d != null) {
            this.f918d.setBounds(rect);
        }
        if (this.f917c != null) {
            this.f917c.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f915a.C != z) {
            this.f915a.C = z;
            if (this.f917c != null) {
                androidx.core.graphics.drawable.a.a(this.f917c, this.f915a.C);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f915a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        if (this.f918d != null) {
            this.f918d.jumpToCurrentState();
            this.f918d = null;
            this.f922h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f917c != null) {
            this.f917c.jumpToCurrentState();
            if (this.f920f) {
                this.f917c.setAlpha(this.f919e);
            }
        }
        if (this.l != 0) {
            this.l = 0L;
            z = true;
        }
        if (this.k != 0) {
            this.k = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        if (this.f917c != null) {
            androidx.core.graphics.drawable.a.a(this.f917c, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        if (this.f916b == null) {
            this.f916b = new Rect(i2, i3, i4, i5);
        } else {
            this.f916b.set(i2, i3, i4, i5);
        }
        if (this.f917c != null) {
            androidx.core.graphics.drawable.a.a(this.f917c, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        if (this.f916b != null) {
            rect.set(this.f916b);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        if (this.f918d != null) {
            return this.f918d.setLevel(i2);
        }
        if (this.f917c != null) {
            return this.f917c.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f915a.a(i2, a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f915a.f()) {
            return this.f915a.g();
        }
        if (this.f917c != null) {
            return this.f917c.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f915a.f()) {
            return this.f915a.h();
        }
        if (this.f917c != null) {
            return this.f917c.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f915a.f()) {
            return this.f915a.i();
        }
        if (this.f917c != null) {
            return this.f917c.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f915a.f()) {
            return this.f915a.j();
        }
        if (this.f917c != null) {
            return this.f917c.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f915a != null) {
            this.f915a.a();
        }
        if (drawable != this.f917c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f917c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f917c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f918d != null) {
            this.f918d.setVisible(z, z2);
        }
        if (this.f917c != null) {
            this.f917c.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f917c == null || !this.f917c.isVisible()) {
            return -2;
        }
        return this.f915a.l();
    }

    int a() {
        return this.f921g;
    }

    boolean a(int i2) {
        if (i2 == this.f921g) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f915a.B > 0) {
            if (this.f918d != null) {
                this.f918d.setVisible(false, false);
            }
            if (this.f917c != null) {
                this.f918d = this.f917c;
                this.f922h = this.f921g;
                this.l = this.f915a.B + jUptimeMillis;
            } else {
                this.f918d = null;
                this.f922h = -1;
                this.l = 0L;
            }
        } else if (this.f917c != null) {
            this.f917c.setVisible(false, false);
        }
        if (i2 >= 0 && i2 < this.f915a.f932h) {
            Drawable drawableA = this.f915a.a(i2);
            this.f917c = drawableA;
            this.f921g = i2;
            if (drawableA != null) {
                if (this.f915a.A > 0) {
                    this.k = jUptimeMillis + this.f915a.A;
                }
                a(drawableA);
            }
        } else {
            this.f917c = null;
            this.f921g = -1;
        }
        if (this.k != 0 || this.l != 0) {
            if (this.j == null) {
                this.j = new c(this);
            } else {
                unscheduleSelf(this.j);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    private void a(Drawable drawable) {
        if (this.m == null) {
            this.m = new a();
        }
        a aVar = this.m;
        aVar.a(drawable.getCallback());
        drawable.setCallback(aVar);
        try {
            if (this.f915a.A <= 0 && this.f920f) {
                drawable.setAlpha(this.f919e);
            }
            if (this.f915a.E) {
                drawable.setColorFilter(this.f915a.D);
            } else {
                if (this.f915a.H) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f915a.F);
                }
                if (this.f915a.I) {
                    androidx.core.graphics.drawable.a.a(drawable, this.f915a.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f915a.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f915a.C);
            }
            Rect rect = this.f916b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.m.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f920f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r11.f917c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L40
            long r9 = r11.k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L42
            long r9 = r11.k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L26
            android.graphics.drawable.Drawable r3 = r11.f917c
            int r9 = r11.f919e
            r3.setAlpha(r9)
            r11.k = r7
            goto L42
        L26:
            long r9 = r11.k
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            b.a.b.a.d$b r9 = r11.f915a
            int r9 = r9.A
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r11.f917c
            int r3 = 255 - r3
            int r10 = r11.f919e
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L43
        L40:
            r11.k = r7
        L42:
            r3 = 0
        L43:
            android.graphics.drawable.Drawable r9 = r11.f918d
            if (r9 == 0) goto L78
            long r9 = r11.l
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L7a
            long r9 = r11.l
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L61
            android.graphics.drawable.Drawable r0 = r11.f918d
            r0.setVisible(r6, r6)
            r0 = 0
            r11.f918d = r0
            r0 = -1
            r11.f922h = r0
            r11.l = r7
            goto L7a
        L61:
            long r6 = r11.l
            long r6 = r6 - r1
            long r6 = r6 * r4
            int r3 = (int) r6
            b.a.b.a.d$b r4 = r11.f915a
            int r4 = r4.B
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r11.f918d
            int r5 = r11.f919e
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L7b
        L78:
            r11.l = r7
        L7a:
            r0 = r3
        L7b:
            if (r12 == 0) goto L87
            if (r0 == 0) goto L87
            java.lang.Runnable r12 = r11.j
            r3 = 16
            long r1 = r1 + r3
            r11.scheduleSelf(r12, r1)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.b.a.d.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f917c;
    }

    final void a(Resources resources) {
        this.f915a.a(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f915a.a(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f915a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f915a.m()) {
            return null;
        }
        this.f915a.f928d = getChangingConfigurations();
        return this.f915a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f923i && super.mutate() == this) {
            b bVarB = b();
            bVarB.d();
            a(bVarB);
            this.f923i = true;
        }
        return this;
    }

    static abstract class b extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final d f925a;

        /* renamed from: b, reason: collision with root package name */
        Resources f926b;

        /* renamed from: c, reason: collision with root package name */
        int f927c;

        /* renamed from: d, reason: collision with root package name */
        int f928d;

        /* renamed from: e, reason: collision with root package name */
        int f929e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f930f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f931g;

        /* renamed from: h, reason: collision with root package name */
        int f932h;

        /* renamed from: i, reason: collision with root package name */
        boolean f933i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        abstract void d();

        b(b bVar, d dVar, Resources resources) {
            Resources resources2;
            this.f927c = 160;
            this.f933i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f925a = dVar;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = bVar != null ? bVar.f926b : null;
            }
            this.f926b = resources2;
            this.f927c = d.a(resources, bVar != null ? bVar.f927c : 0);
            if (bVar != null) {
                this.f928d = bVar.f928d;
                this.f929e = bVar.f929e;
                this.v = true;
                this.w = true;
                this.f933i = bVar.f933i;
                this.l = bVar.l;
                this.x = bVar.x;
                this.y = bVar.y;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.E = bVar.E;
                this.F = bVar.F;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                if (bVar.f927c == this.f927c) {
                    if (bVar.j) {
                        this.k = new Rect(bVar.k);
                        this.j = true;
                    }
                    if (bVar.m) {
                        this.n = bVar.n;
                        this.o = bVar.o;
                        this.p = bVar.p;
                        this.q = bVar.q;
                        this.m = true;
                    }
                }
                if (bVar.r) {
                    this.s = bVar.s;
                    this.r = true;
                }
                if (bVar.t) {
                    this.u = bVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = bVar.f931g;
                this.f931g = new Drawable[drawableArr.length];
                this.f932h = bVar.f932h;
                SparseArray<Drawable.ConstantState> sparseArray = bVar.f930f;
                if (sparseArray != null) {
                    this.f930f = sparseArray.clone();
                } else {
                    this.f930f = new SparseArray<>(this.f932h);
                }
                int i2 = this.f932h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f930f.put(i3, constantState);
                        } else {
                            this.f931g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f931g = new Drawable[10];
            this.f932h = 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f928d | this.f929e;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f932h;
            if (i2 >= this.f931g.length) {
                b(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f925a);
            this.f931g[i2] = drawable;
            this.f932h++;
            this.f929e = drawable.getChangingConfigurations() | this.f929e;
            a();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        void a() {
            this.r = false;
            this.t = false;
        }

        final int b() {
            return this.f931g.length;
        }

        private void n() {
            if (this.f930f != null) {
                int size = this.f930f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f931g[this.f930f.keyAt(i2)] = b(this.f930f.valueAt(i2).newDrawable(this.f926b));
                }
                this.f930f = null;
            }
        }

        private Drawable b(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f925a);
            return drawableMutate;
        }

        public final int c() {
            return this.f932h;
        }

        public final Drawable a(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.f931g[i2];
            if (drawable != null) {
                return drawable;
            }
            if (this.f930f == null || (iIndexOfKey = this.f930f.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableB = b(this.f930f.valueAt(iIndexOfKey).newDrawable(this.f926b));
            this.f931g[i2] = drawableB;
            this.f930f.removeAt(iIndexOfKey);
            if (this.f930f.size() == 0) {
                this.f930f = null;
            }
            return drawableB;
        }

        final boolean a(int i2, int i3) {
            int i4 = this.f932h;
            Drawable[] drawableArr = this.f931g;
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i5].setLayoutDirection(i2) : false;
                    if (i5 == i3) {
                        z = layoutDirection;
                    }
                }
            }
            this.z = i2;
            return z;
        }

        final void a(Resources resources) {
            if (resources != null) {
                this.f926b = resources;
                int iA = d.a(resources, this.f927c);
                int i2 = this.f927c;
                this.f927c = iA;
                if (i2 != iA) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        final void a(Resources.Theme theme) {
            if (theme != null) {
                n();
                int i2 = this.f932h;
                Drawable[] drawableArr = this.f931g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f929e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                a(theme.getResources());
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f932h;
            Drawable[] drawableArr = this.f931g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    if (drawable.canApplyTheme()) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f930f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void a(boolean z) {
            this.f933i = z;
        }

        public final Rect e() {
            if (this.f933i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            n();
            Rect rect = new Rect();
            int i2 = this.f932h;
            Drawable[] drawableArr = this.f931g;
            Rect rect2 = null;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if (rect.left > rect2.left) {
                        rect2.left = rect.left;
                    }
                    if (rect.top > rect2.top) {
                        rect2.top = rect.top;
                    }
                    if (rect.right > rect2.right) {
                        rect2.right = rect.right;
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect2.bottom = rect.bottom;
                    }
                }
            }
            this.j = true;
            this.k = rect2;
            return rect2;
        }

        public final void b(boolean z) {
            this.l = z;
        }

        public final boolean f() {
            return this.l;
        }

        public final int g() {
            if (!this.m) {
                k();
            }
            return this.n;
        }

        public final int h() {
            if (!this.m) {
                k();
            }
            return this.o;
        }

        public final int i() {
            if (!this.m) {
                k();
            }
            return this.p;
        }

        public final int j() {
            if (!this.m) {
                k();
            }
            return this.q;
        }

        protected void k() {
            this.m = true;
            n();
            int i2 = this.f932h;
            Drawable[] drawableArr = this.f931g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void b(int i2) {
            this.A = i2;
        }

        public final void c(int i2) {
            this.B = i2;
        }

        public final int l() {
            if (this.r) {
                return this.s;
            }
            n();
            int i2 = this.f932h;
            Drawable[] drawableArr = this.f931g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void b(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f931g, 0, drawableArr, 0, i2);
            this.f931g = drawableArr;
        }

        public synchronized boolean m() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int i2 = this.f932h;
            Drawable[] drawableArr = this.f931g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }
    }

    protected void a(b bVar) {
        this.f915a = bVar;
        if (this.f921g >= 0) {
            this.f917c = bVar.a(this.f921g);
            if (this.f917c != null) {
                a(this.f917c);
            }
        }
        this.f922h = -1;
        this.f918d = null;
    }

    static class a implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        private Drawable.Callback f924a;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        a() {
        }

        public a a(Drawable.Callback callback) {
            this.f924a = callback;
            return this;
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f924a;
            this.f924a = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f924a != null) {
                this.f924a.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f924a != null) {
                this.f924a.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static int a(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }
}
