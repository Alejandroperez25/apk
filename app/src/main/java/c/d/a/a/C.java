package c.d.a.a;

import android.os.Handler;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final b f1424a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1425b;

    /* renamed from: c, reason: collision with root package name */
    private final M f1426c;

    /* renamed from: d, reason: collision with root package name */
    private int f1427d;

    /* renamed from: e, reason: collision with root package name */
    private Object f1428e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f1429f;

    /* renamed from: g, reason: collision with root package name */
    private int f1430g;

    /* renamed from: h, reason: collision with root package name */
    private long f1431h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1432i = true;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public interface a {
        void a(C c2);
    }

    public interface b {
        void a(int i2, Object obj);
    }

    public C(a aVar, b bVar, M m, int i2, Handler handler) {
        this.f1425b = aVar;
        this.f1424a = bVar;
        this.f1426c = m;
        this.f1429f = handler;
        this.f1430g = i2;
    }

    public M a() {
        return this.f1426c;
    }

    public b b() {
        return this.f1424a;
    }

    public C a(int i2) {
        AbstractC0170e.b(!this.j);
        this.f1427d = i2;
        return this;
    }

    public int c() {
        return this.f1427d;
    }

    public C a(Object obj) {
        AbstractC0170e.b(!this.j);
        this.f1428e = obj;
        return this;
    }

    public Object d() {
        return this.f1428e;
    }

    public Handler e() {
        return this.f1429f;
    }

    public long f() {
        return this.f1431h;
    }

    public int g() {
        return this.f1430g;
    }

    public boolean h() {
        return this.f1432i;
    }

    public C i() {
        AbstractC0170e.b(!this.j);
        if (this.f1431h == -9223372036854775807L) {
            AbstractC0170e.a(this.f1432i);
        }
        this.j = true;
        this.f1425b.a(this);
        return this;
    }

    public synchronized boolean j() {
        return this.m;
    }

    public synchronized boolean k() {
        AbstractC0170e.b(this.j);
        AbstractC0170e.b(this.f1429f.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public synchronized void a(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }
}
