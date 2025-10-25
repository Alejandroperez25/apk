package c.d.a.b.h;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class C<TResult> extends h<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4015a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final A<TResult> f4016b = new A<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f4017c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f4018d;

    /* renamed from: e, reason: collision with root package name */
    private TResult f4019e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f4020f;

    C() {
    }

    @Override // c.d.a.b.h.h
    public final boolean a() {
        boolean z;
        synchronized (this.f4015a) {
            z = this.f4017c;
        }
        return z;
    }

    @Override // c.d.a.b.h.h
    public final boolean c() {
        return this.f4018d;
    }

    @Override // c.d.a.b.h.h
    public final boolean b() {
        boolean z;
        synchronized (this.f4015a) {
            z = this.f4017c && !this.f4018d && this.f4020f == null;
        }
        return z;
    }

    @Override // c.d.a.b.h.h
    public final TResult d() {
        TResult tresult;
        synchronized (this.f4015a) {
            g();
            i();
            if (this.f4020f != null) {
                throw new f(this.f4020f);
            }
            tresult = this.f4019e;
        }
        return tresult;
    }

    @Override // c.d.a.b.h.h
    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f4015a) {
            g();
            i();
            if (cls.isInstance(this.f4020f)) {
                throw cls.cast(this.f4020f);
            }
            if (this.f4020f != null) {
                throw new f(this.f4020f);
            }
            tresult = this.f4019e;
        }
        return tresult;
    }

    @Override // c.d.a.b.h.h
    public final Exception e() {
        Exception exc;
        synchronized (this.f4015a) {
            exc = this.f4020f;
        }
        return exc;
    }

    @Override // c.d.a.b.h.h
    public final h<TResult> a(Executor executor, e<? super TResult> eVar) {
        this.f4016b.a(new v(executor, eVar));
        j();
        return this;
    }

    @Override // c.d.a.b.h.h
    public final h<TResult> a(InterfaceC0230d interfaceC0230d) {
        a(j.f4024a, interfaceC0230d);
        return this;
    }

    @Override // c.d.a.b.h.h
    public final h<TResult> a(Executor executor, InterfaceC0230d interfaceC0230d) {
        this.f4016b.a(new t(executor, interfaceC0230d));
        j();
        return this;
    }

    @Override // c.d.a.b.h.h
    public final h<TResult> a(InterfaceC0229c<TResult> interfaceC0229c) {
        a(j.f4024a, interfaceC0229c);
        return this;
    }

    @Override // c.d.a.b.h.h
    public final h<TResult> a(Executor executor, InterfaceC0229c<TResult> interfaceC0229c) {
        this.f4016b.a(new r(executor, interfaceC0229c));
        j();
        return this;
    }

    @Override // c.d.a.b.h.h
    public final <TContinuationResult> h<TContinuationResult> a(Executor executor, InterfaceC0227a<TResult, TContinuationResult> interfaceC0227a) {
        C c2 = new C();
        this.f4016b.a(new l(executor, interfaceC0227a, c2));
        j();
        return c2;
    }

    @Override // c.d.a.b.h.h
    public final <TContinuationResult> h<TContinuationResult> a(InterfaceC0227a<TResult, h<TContinuationResult>> interfaceC0227a) {
        return b(j.f4024a, interfaceC0227a);
    }

    @Override // c.d.a.b.h.h
    public final h<TResult> a(Executor executor, InterfaceC0228b interfaceC0228b) {
        this.f4016b.a(new p(executor, interfaceC0228b));
        j();
        return this;
    }

    @Override // c.d.a.b.h.h
    public final <TContinuationResult> h<TContinuationResult> b(Executor executor, InterfaceC0227a<TResult, h<TContinuationResult>> interfaceC0227a) {
        C c2 = new C();
        this.f4016b.a(new n(executor, interfaceC0227a, c2));
        j();
        return c2;
    }

    @Override // c.d.a.b.h.h
    public final <TContinuationResult> h<TContinuationResult> a(Executor executor, g<TResult, TContinuationResult> gVar) {
        C c2 = new C();
        this.f4016b.a(new x(executor, gVar, c2));
        j();
        return c2;
    }

    public final void a(TResult tresult) {
        synchronized (this.f4015a) {
            h();
            this.f4017c = true;
            this.f4019e = tresult;
        }
        this.f4016b.a(this);
    }

    public final boolean b(TResult tresult) {
        synchronized (this.f4015a) {
            if (this.f4017c) {
                return false;
            }
            this.f4017c = true;
            this.f4019e = tresult;
            this.f4016b.a(this);
            return true;
        }
    }

    public final void a(Exception exc) {
        com.google.android.gms.common.internal.t.a(exc, "Exception must not be null");
        synchronized (this.f4015a) {
            h();
            this.f4017c = true;
            this.f4020f = exc;
        }
        this.f4016b.a(this);
    }

    public final boolean b(Exception exc) {
        com.google.android.gms.common.internal.t.a(exc, "Exception must not be null");
        synchronized (this.f4015a) {
            if (this.f4017c) {
                return false;
            }
            this.f4017c = true;
            this.f4020f = exc;
            this.f4016b.a(this);
            return true;
        }
    }

    public final boolean f() {
        synchronized (this.f4015a) {
            if (this.f4017c) {
                return false;
            }
            this.f4017c = true;
            this.f4018d = true;
            this.f4016b.a(this);
            return true;
        }
    }

    private final void g() {
        com.google.android.gms.common.internal.t.a(this.f4017c, "Task is not yet complete");
    }

    private final void h() {
        com.google.android.gms.common.internal.t.a(!this.f4017c, "Task is already complete");
    }

    private final void i() {
        if (this.f4018d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.f4015a) {
            if (this.f4017c) {
                this.f4016b.a(this);
            }
        }
    }
}
