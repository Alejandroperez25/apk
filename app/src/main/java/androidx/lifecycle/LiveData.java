package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: a, reason: collision with root package name */
    static final Object f801a = new Object();

    /* renamed from: h, reason: collision with root package name */
    private boolean f808h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f809i;

    /* renamed from: b, reason: collision with root package name */
    final Object f802b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private b.b.a.b.b<q<? super T>, LiveData<T>.a> f803c = new b.b.a.b.b<>();

    /* renamed from: d, reason: collision with root package name */
    int f804d = 0;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f805e = f801a;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f806f = f801a;

    /* renamed from: g, reason: collision with root package name */
    private int f807g = -1;
    private final Runnable j = new n(this);

    protected void a() {
    }

    protected void b() {
    }

    private void b(LiveData<T>.a aVar) {
        if (aVar.f813b) {
            if (!aVar.a()) {
                aVar.a(false);
            } else {
                if (aVar.f814c >= this.f807g) {
                    return;
                }
                aVar.f814c = this.f807g;
                aVar.f812a.a((Object) this.f805e);
            }
        }
    }

    void a(LiveData<T>.a aVar) {
        if (this.f808h) {
            this.f809i = true;
            return;
        }
        this.f808h = true;
        do {
            this.f809i = false;
            if (aVar != null) {
                b(aVar);
                aVar = null;
            } else {
                b.b.a.b.b<q<? super T>, LiveData<T>.a>.d dVarC = this.f803c.c();
                while (dVarC.hasNext()) {
                    b((a) dVarC.next().getValue());
                    if (this.f809i) {
                        break;
                    }
                }
            }
        } while (this.f809i);
        this.f808h = false;
    }

    public void a(q<? super T> qVar) {
        a("removeObserver");
        LiveData<T>.a aVarRemove = this.f803c.remove(qVar);
        if (aVarRemove == null) {
            return;
        }
        aVarRemove.b();
        aVarRemove.a(false);
    }

    protected void a(T t) {
        a("setValue");
        this.f807g++;
        this.f805e = t;
        a((a) null);
    }

    class LifecycleBoundObserver extends LiveData<T>.a implements e {

        /* renamed from: e, reason: collision with root package name */
        final i f810e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveData f811f;

        @Override // androidx.lifecycle.LiveData.a
        boolean a() {
            return this.f810e.a().a().a(f.b.STARTED);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, f.a aVar) {
            if (this.f810e.a().a() == f.b.DESTROYED) {
                this.f811f.a((q) this.f812a);
            } else {
                a(a());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        void b() {
            this.f810e.a().b(this);
        }
    }

    private abstract class a {

        /* renamed from: a, reason: collision with root package name */
        final q<? super T> f812a;

        /* renamed from: b, reason: collision with root package name */
        boolean f813b;

        /* renamed from: c, reason: collision with root package name */
        int f814c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData f815d;

        abstract boolean a();

        abstract void b();

        void a(boolean z) {
            if (z == this.f813b) {
                return;
            }
            this.f813b = z;
            boolean z2 = this.f815d.f804d == 0;
            this.f815d.f804d += this.f813b ? 1 : -1;
            if (z2 && this.f813b) {
                this.f815d.a();
            }
            if (this.f815d.f804d == 0 && !this.f813b) {
                this.f815d.b();
            }
            if (this.f813b) {
                this.f815d.a(this);
            }
        }
    }

    private static void a(String str) {
        if (b.b.a.a.c.b().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }
}
