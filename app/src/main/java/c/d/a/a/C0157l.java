package c.d.a.a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import c.d.a.a.A;
import c.d.a.a.C;
import c.d.a.a.M;
import c.d.a.a.i.w;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.InterfaceC0171f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.d.a.a.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0157l extends AbstractC0122b implements InterfaceC0146i {

    /* renamed from: b, reason: collision with root package name */
    final c.d.a.a.k.l f3337b;

    /* renamed from: c, reason: collision with root package name */
    private final E[] f3338c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.a.a.k.k f3339d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f3340e;

    /* renamed from: f, reason: collision with root package name */
    private final n f3341f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f3342g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<A.b> f3343h;

    /* renamed from: i, reason: collision with root package name */
    private final M.a f3344i;
    private final ArrayDeque<a> j;
    private c.d.a.a.i.w k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    private z s;
    private I t;
    private C0145h u;
    private y v;
    private int w;
    private int x;
    private long y;

    @SuppressLint({"HandlerLeak"})
    public C0157l(E[] eArr, c.d.a.a.k.k kVar, t tVar, InterfaceC0163f interfaceC0163f, InterfaceC0171f interfaceC0171f, Looper looper) {
        c.d.a.a.m.o.b("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.9.6] [" + c.d.a.a.m.H.f3503e + "]");
        AbstractC0170e.b(eArr.length > 0);
        AbstractC0170e.a(eArr);
        this.f3338c = eArr;
        AbstractC0170e.a(kVar);
        this.f3339d = kVar;
        this.l = false;
        this.n = 0;
        this.o = false;
        this.f3343h = new CopyOnWriteArraySet<>();
        this.f3337b = new c.d.a.a.k.l(new G[eArr.length], new c.d.a.a.k.i[eArr.length], null);
        this.f3344i = new M.a();
        this.s = z.f3722a;
        this.t = I.f1439e;
        this.f3340e = new HandlerC0156k(this, looper);
        this.v = y.a(0L, this.f3337b);
        this.j = new ArrayDeque<>();
        this.f3341f = new n(eArr, kVar, this.f3337b, tVar, interfaceC0163f, this.l, this.n, this.o, this.f3340e, interfaceC0171f);
        this.f3342g = new Handler(this.f3341f.b());
    }

    public Looper j() {
        return this.f3340e.getLooper();
    }

    public void a(A.b bVar) {
        this.f3343h.add(bVar);
    }

    public int k() {
        return this.v.f3719g;
    }

    public void a(c.d.a.a.i.w wVar, boolean z, boolean z2) {
        this.u = null;
        this.k = wVar;
        y yVarA = a(z, z2, 2);
        this.q = true;
        this.p++;
        this.f3341f.a(wVar, z, z2);
        a(yVarA, false, 4, 1, false, false);
    }

    public void a(boolean z, boolean z2) {
        boolean z3 = z && !z2;
        if (this.m != z3) {
            this.m = z3;
            this.f3341f.a(z3);
        }
        if (this.l != z) {
            this.l = z;
            a(this.v, false, 4, 1, false, true);
        }
    }

    public boolean l() {
        return this.l;
    }

    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.f3341f.a(i2);
            Iterator<A.b> it = this.f3343h.iterator();
            while (it.hasNext()) {
                it.next().c(i2);
            }
        }
    }

    @Override // c.d.a.a.A
    public void a(int i2, long j) {
        M m = this.v.f3714b;
        if (i2 < 0 || (!m.a() && i2 >= m.b())) {
            throw new s(m, i2, j);
        }
        this.r = true;
        this.p++;
        if (q()) {
            c.d.a.a.m.o.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.f3340e.obtainMessage(0, 1, -1, this.v).sendToTarget();
            return;
        }
        this.w = i2;
        if (m.a()) {
            this.y = j == -9223372036854775807L ? 0L : j;
            this.x = 0;
        } else {
            long jB = j == -9223372036854775807L ? m.a(i2, this.f1491a).b() : AbstractC0132d.b(j);
            Pair<Object, Long> pairA = m.a(this.f1491a, this.f3344i, i2, jB);
            this.y = AbstractC0132d.a(jB);
            this.x = m.a(pairA.first);
        }
        this.f3341f.a(m, i2, AbstractC0132d.b(j));
        Iterator<A.b> it = this.f3343h.iterator();
        while (it.hasNext()) {
            it.next().b(1);
        }
    }

    @Override // c.d.a.a.A
    public void a(boolean z) {
        if (z) {
            this.u = null;
            this.k = null;
        }
        y yVarA = a(z, z, 1);
        this.p++;
        this.f3341f.b(z);
        a(yVarA, false, 4, 1, false, false);
    }

    public void m() {
        c.d.a.a.m.o.b("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.9.6] [" + c.d.a.a.m.H.f3503e + "] [" + o.a() + "]");
        this.k = null;
        this.f3341f.a();
        this.f3340e.removeCallbacksAndMessages(null);
    }

    public C a(C.b bVar) {
        return new C(this.f3341f, bVar, this.v.f3714b, c(), this.f3342g);
    }

    public int n() {
        if (s()) {
            return this.x;
        }
        return this.v.f3714b.a(this.v.f3716d.f3024a);
    }

    @Override // c.d.a.a.A
    public int c() {
        if (s()) {
            return this.w;
        }
        return this.v.f3714b.a(this.v.f3716d.f3024a, this.f3344i).f1454c;
    }

    public long o() {
        if (q()) {
            w.a aVar = this.v.f3716d;
            this.v.f3714b.a(aVar.f3024a, this.f3344i);
            return AbstractC0132d.a(this.f3344i.c(aVar.f3025b, aVar.f3026c));
        }
        return i();
    }

    @Override // c.d.a.a.A
    public long g() {
        if (s()) {
            return this.y;
        }
        if (this.v.f3716d.a()) {
            return AbstractC0132d.a(this.v.n);
        }
        return a(this.v.f3716d, this.v.n);
    }

    public long p() {
        if (q()) {
            if (this.v.k.equals(this.v.f3716d)) {
                return AbstractC0132d.a(this.v.l);
            }
            return o();
        }
        return r();
    }

    @Override // c.d.a.a.A
    public long a() {
        return Math.max(0L, AbstractC0132d.a(this.v.m));
    }

    public boolean q() {
        return !s() && this.v.f3716d.a();
    }

    @Override // c.d.a.a.A
    public int e() {
        if (q()) {
            return this.v.f3716d.f3025b;
        }
        return -1;
    }

    @Override // c.d.a.a.A
    public int b() {
        if (q()) {
            return this.v.f3716d.f3026c;
        }
        return -1;
    }

    @Override // c.d.a.a.A
    public long d() {
        if (q()) {
            this.v.f3714b.a(this.v.f3716d.f3024a, this.f3344i);
            return this.f3344i.b() + AbstractC0132d.a(this.v.f3718f);
        }
        return g();
    }

    public long r() {
        if (s()) {
            return this.y;
        }
        if (this.v.k.f3027d != this.v.f3716d.f3027d) {
            return this.v.f3714b.a(c(), this.f1491a).c();
        }
        long j = this.v.l;
        if (this.v.k.a()) {
            M.a aVarA = this.v.f3714b.a(this.v.k.f3024a, this.f3344i);
            long jA = aVarA.a(this.v.k.f3025b);
            j = jA == Long.MIN_VALUE ? aVarA.f1455d : jA;
        }
        return a(this.v.k, j);
    }

    @Override // c.d.a.a.A
    public M f() {
        return this.v.f3714b;
    }

    void a(Message message) {
        switch (message.what) {
            case 0:
                a((y) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                z zVar = (z) message.obj;
                if (this.s.equals(zVar)) {
                    return;
                }
                this.s = zVar;
                Iterator<A.b> it = this.f3343h.iterator();
                while (it.hasNext()) {
                    it.next().a(zVar);
                }
                return;
            case 2:
                C0145h c0145h = (C0145h) message.obj;
                this.u = c0145h;
                Iterator<A.b> it2 = this.f3343h.iterator();
                while (it2.hasNext()) {
                    it2.next().a(c0145h);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(y yVar, int i2, boolean z, int i3) {
        this.p -= i2;
        if (this.p == 0) {
            if (yVar.f3717e == -9223372036854775807L) {
                yVar = yVar.a(yVar.f3716d, 0L, yVar.f3718f);
            }
            y yVar2 = yVar;
            if ((!this.v.f3714b.a() || this.q) && yVar2.f3714b.a()) {
                this.x = 0;
                this.w = 0;
                this.y = 0L;
            }
            int i4 = this.q ? 0 : 2;
            boolean z2 = this.r;
            this.q = false;
            this.r = false;
            a(yVar2, z, i3, i4, z2, false);
        }
    }

    private y a(boolean z, boolean z2, int i2) {
        if (z) {
            this.w = 0;
            this.x = 0;
            this.y = 0L;
        } else {
            this.w = c();
            this.x = n();
            this.y = g();
        }
        w.a aVarA = z ? this.v.a(this.o, this.f1491a) : this.v.f3716d;
        long j = z ? 0L : this.v.n;
        return new y(z2 ? M.f1451a : this.v.f3714b, z2 ? null : this.v.f3715c, aVarA, j, z ? -9223372036854775807L : this.v.f3718f, i2, false, z2 ? c.d.a.a.i.G.f2504a : this.v.f3721i, z2 ? this.f3337b : this.v.j, aVarA, j, 0L, j);
    }

    private void a(y yVar, boolean z, int i2, int i3, boolean z2, boolean z3) {
        boolean z4 = !this.j.isEmpty();
        this.j.addLast(new a(yVar, this.v, this.f3343h, this.f3339d, z, i2, i3, z2, this.l, z3));
        this.v = yVar;
        if (z4) {
            return;
        }
        while (!this.j.isEmpty()) {
            this.j.peekFirst().a();
            this.j.removeFirst();
        }
    }

    private long a(w.a aVar, long j) {
        long jA = AbstractC0132d.a(j);
        this.v.f3714b.a(aVar.f3024a, this.f3344i);
        return jA + this.f3344i.b();
    }

    private boolean s() {
        return this.v.f3714b.a() || this.p > 0;
    }

    /* renamed from: c.d.a.a.l$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final y f3381a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<A.b> f3382b;

        /* renamed from: c, reason: collision with root package name */
        private final c.d.a.a.k.k f3383c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3384d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3385e;

        /* renamed from: f, reason: collision with root package name */
        private final int f3386f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f3387g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f3388h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f3389i;
        private final boolean j;
        private final boolean k;
        private final boolean l;

        public a(y yVar, y yVar2, Set<A.b> set, c.d.a.a.k.k kVar, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
            this.f3381a = yVar;
            this.f3382b = set;
            this.f3383c = kVar;
            this.f3384d = z;
            this.f3385e = i2;
            this.f3386f = i3;
            this.f3387g = z2;
            this.f3388h = z3;
            this.f3389i = z4 || yVar2.f3719g != yVar.f3719g;
            this.j = (yVar2.f3714b == yVar.f3714b && yVar2.f3715c == yVar.f3715c) ? false : true;
            this.k = yVar2.f3720h != yVar.f3720h;
            this.l = yVar2.j != yVar.j;
        }

        public void a() {
            if (this.j || this.f3386f == 0) {
                Iterator<A.b> it = this.f3382b.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f3381a.f3714b, this.f3381a.f3715c, this.f3386f);
                }
            }
            if (this.f3384d) {
                Iterator<A.b> it2 = this.f3382b.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this.f3385e);
                }
            }
            if (this.l) {
                this.f3383c.a(this.f3381a.j.f3336d);
                Iterator<A.b> it3 = this.f3382b.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this.f3381a.f3721i, this.f3381a.j.f3335c);
                }
            }
            if (this.k) {
                Iterator<A.b> it4 = this.f3382b.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this.f3381a.f3720h);
                }
            }
            if (this.f3389i) {
                Iterator<A.b> it5 = this.f3382b.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this.f3388h, this.f3381a.f3719g);
                }
            }
            if (this.f3387g) {
                Iterator<A.b> it6 = this.f3382b.iterator();
                while (it6.hasNext()) {
                    it6.next().a();
                }
            }
        }
    }
}
