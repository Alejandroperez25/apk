package c.d.a.a.l;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements InterfaceC0161d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3426a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3427b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3428c;

    /* renamed from: d, reason: collision with root package name */
    private final C0160c[] f3429d;

    /* renamed from: e, reason: collision with root package name */
    private int f3430e;

    /* renamed from: f, reason: collision with root package name */
    private int f3431f;

    /* renamed from: g, reason: collision with root package name */
    private int f3432g;

    /* renamed from: h, reason: collision with root package name */
    private C0160c[] f3433h;

    public o(boolean z, int i2) {
        this(z, i2, 0);
    }

    public o(boolean z, int i2, int i3) {
        AbstractC0170e.a(i2 > 0);
        AbstractC0170e.a(i3 >= 0);
        this.f3426a = z;
        this.f3427b = i2;
        this.f3432g = i3;
        this.f3433h = new C0160c[i3 + 100];
        if (i3 > 0) {
            this.f3428c = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f3433h[i4] = new C0160c(this.f3428c, i4 * i2);
            }
        } else {
            this.f3428c = null;
        }
        this.f3429d = new C0160c[1];
    }

    public synchronized void d() {
        if (this.f3426a) {
            a(0);
        }
    }

    public synchronized void a(int i2) {
        boolean z = i2 < this.f3430e;
        this.f3430e = i2;
        if (z) {
            b();
        }
    }

    @Override // c.d.a.a.l.InterfaceC0161d
    public synchronized C0160c a() {
        C0160c c0160c;
        this.f3431f++;
        if (this.f3432g > 0) {
            C0160c[] c0160cArr = this.f3433h;
            int i2 = this.f3432g - 1;
            this.f3432g = i2;
            c0160c = c0160cArr[i2];
            this.f3433h[this.f3432g] = null;
        } else {
            c0160c = new C0160c(new byte[this.f3427b], 0);
        }
        return c0160c;
    }

    @Override // c.d.a.a.l.InterfaceC0161d
    public synchronized void a(C0160c c0160c) {
        this.f3429d[0] = c0160c;
        a(this.f3429d);
    }

    @Override // c.d.a.a.l.InterfaceC0161d
    public synchronized void a(C0160c[] c0160cArr) {
        if (this.f3432g + c0160cArr.length >= this.f3433h.length) {
            this.f3433h = (C0160c[]) Arrays.copyOf(this.f3433h, Math.max(this.f3433h.length * 2, this.f3432g + c0160cArr.length));
        }
        for (C0160c c0160c : c0160cArr) {
            C0160c[] c0160cArr2 = this.f3433h;
            int i2 = this.f3432g;
            this.f3432g = i2 + 1;
            c0160cArr2[i2] = c0160c;
        }
        this.f3431f -= c0160cArr.length;
        notifyAll();
    }

    @Override // c.d.a.a.l.InterfaceC0161d
    public synchronized void b() {
        int i2 = 0;
        int iMax = Math.max(0, H.a(this.f3430e, this.f3427b) - this.f3431f);
        if (iMax >= this.f3432g) {
            return;
        }
        if (this.f3428c != null) {
            int i3 = this.f3432g - 1;
            while (i2 <= i3) {
                C0160c c0160c = this.f3433h[i2];
                if (c0160c.f3391a == this.f3428c) {
                    i2++;
                } else {
                    C0160c c0160c2 = this.f3433h[i3];
                    if (c0160c2.f3391a != this.f3428c) {
                        i3--;
                    } else {
                        this.f3433h[i2] = c0160c2;
                        this.f3433h[i3] = c0160c;
                        i3--;
                        i2++;
                    }
                }
            }
            iMax = Math.max(iMax, i2);
            if (iMax >= this.f3432g) {
                return;
            }
        }
        Arrays.fill(this.f3433h, iMax, this.f3432g, (Object) null);
        this.f3432g = iMax;
    }

    public synchronized int e() {
        return this.f3431f * this.f3427b;
    }

    @Override // c.d.a.a.l.InterfaceC0161d
    public int c() {
        return this.f3427b;
    }
}
