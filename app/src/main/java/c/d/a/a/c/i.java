package c.d.a.a.c;

import c.d.a.a.c.f;
import c.d.a.a.c.g;
import c.d.a.a.m.AbstractC0170e;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class i<I extends f, O extends g, E extends Exception> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f1690a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1691b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f1692c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f1693d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f1694e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f1695f;

    /* renamed from: g, reason: collision with root package name */
    private int f1696g;

    /* renamed from: h, reason: collision with root package name */
    private int f1697h;

    /* renamed from: i, reason: collision with root package name */
    private I f1698i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    protected abstract E a(I i2, O o, boolean z);

    protected abstract E a(Throwable th);

    protected abstract I f();

    protected abstract O g();

    protected i(I[] iArr, O[] oArr) {
        this.f1694e = iArr;
        this.f1696g = iArr.length;
        for (int i2 = 0; i2 < this.f1696g; i2++) {
            ((I[]) this.f1694e)[i2] = f();
        }
        this.f1695f = oArr;
        this.f1697h = oArr.length;
        for (int i3 = 0; i3 < this.f1697h; i3++) {
            ((O[]) this.f1695f)[i3] = g();
        }
        this.f1690a = new h(this);
        this.f1690a.start();
    }

    protected final void a(int i2) {
        AbstractC0170e.b(this.f1696g == this.f1694e.length);
        for (I i3 : this.f1694e) {
            i3.f(i2);
        }
    }

    @Override // c.d.a.a.c.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final I c() {
        I i2;
        I i3;
        synchronized (this.f1691b) {
            h();
            AbstractC0170e.b(this.f1698i == null);
            if (this.f1696g == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f1694e;
                int i4 = this.f1696g - 1;
                this.f1696g = i4;
                i2 = iArr[i4];
            }
            this.f1698i = i2;
            i3 = this.f1698i;
        }
        return i3;
    }

    @Override // c.d.a.a.c.d
    public final void a(I i2) {
        synchronized (this.f1691b) {
            h();
            AbstractC0170e.a(i2 == this.f1698i);
            this.f1692c.addLast(i2);
            i();
            this.f1698i = null;
        }
    }

    @Override // c.d.a.a.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final O b() {
        synchronized (this.f1691b) {
            h();
            if (this.f1693d.isEmpty()) {
                return null;
            }
            return this.f1693d.removeFirst();
        }
    }

    protected void a(O o) {
        synchronized (this.f1691b) {
            b((i<I, O, E>) o);
            i();
        }
    }

    @Override // c.d.a.a.c.d
    public final void flush() {
        synchronized (this.f1691b) {
            this.k = true;
            this.m = 0;
            if (this.f1698i != null) {
                b((i<I, O, E>) this.f1698i);
                this.f1698i = null;
            }
            while (!this.f1692c.isEmpty()) {
                b((i<I, O, E>) this.f1692c.removeFirst());
            }
            while (!this.f1693d.isEmpty()) {
                this.f1693d.removeFirst().f();
            }
        }
    }

    @Override // c.d.a.a.c.d
    public void a() throws InterruptedException {
        synchronized (this.f1691b) {
            this.l = true;
            this.f1691b.notify();
        }
        try {
            this.f1690a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    private void h() throws E {
        if (this.j != null) {
            throw this.j;
        }
    }

    private void i() {
        if (l()) {
            this.f1691b.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (k());
    }

    private boolean k() {
        synchronized (this.f1691b) {
            while (!this.l && !l()) {
                this.f1691b.wait();
            }
            if (this.l) {
                return false;
            }
            I iRemoveFirst = this.f1692c.removeFirst();
            O[] oArr = this.f1695f;
            int i2 = this.f1697h - 1;
            this.f1697h = i2;
            O o = oArr[i2];
            boolean z = this.k;
            this.k = false;
            if (iRemoveFirst.d()) {
                o.c(4);
            } else {
                if (iRemoveFirst.c()) {
                    o.c(Integer.MIN_VALUE);
                }
                try {
                    this.j = (E) a(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    this.j = (E) a((Throwable) e2);
                } catch (RuntimeException e3) {
                    this.j = (E) a((Throwable) e3);
                }
                if (this.j != null) {
                    synchronized (this.f1691b) {
                    }
                    return false;
                }
            }
            synchronized (this.f1691b) {
                if (this.k) {
                    o.f();
                } else if (o.c()) {
                    this.m++;
                    o.f();
                } else {
                    o.f1688c = this.m;
                    this.m = 0;
                    this.f1693d.addLast(o);
                }
                b((i<I, O, E>) iRemoveFirst);
            }
            return true;
        }
    }

    private boolean l() {
        return !this.f1692c.isEmpty() && this.f1697h > 0;
    }

    private void b(I i2) {
        i2.b();
        I[] iArr = this.f1694e;
        int i3 = this.f1696g;
        this.f1696g = i3 + 1;
        iArr[i3] = i2;
    }

    private void b(O o) {
        o.b();
        O[] oArr = this.f1695f;
        int i2 = this.f1697h;
        this.f1697h = i2 + 1;
        oArr[i2] = o;
    }
}
