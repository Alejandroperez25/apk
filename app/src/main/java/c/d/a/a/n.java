package c.d.a.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b.a.a$i;
import c.d.a.a.C;
import c.d.a.a.C0143f;
import c.d.a.a.M;
import c.d.a.a.i.v;
import c.d.a.a.i.w;
import c.d.a.a.k.k;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.InterfaceC0171f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class n implements Handler.Callback, v.a, k.a, w.b, C0143f.a, C.a {
    private boolean A;
    private int B;
    private d C;
    private long D;
    private int E;

    /* renamed from: a, reason: collision with root package name */
    private final E[] f3586a;

    /* renamed from: b, reason: collision with root package name */
    private final F[] f3587b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.k.k f3588c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.a.a.k.l f3589d;

    /* renamed from: e, reason: collision with root package name */
    private final t f3590e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0163f f3591f;

    /* renamed from: g, reason: collision with root package name */
    private final c.d.a.a.m.n f3592g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerThread f3593h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f3594i;
    private final M.b j;
    private final M.a k;
    private final long l;
    private final boolean m;
    private final C0143f n;
    private final ArrayList<b> p;
    private final InterfaceC0171f q;
    private y t;
    private c.d.a.a.i.w u;
    private E[] v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;
    private final w r = new w();
    private I s = I.f1439e;
    private final c o = new c();

    public n(E[] eArr, c.d.a.a.k.k kVar, c.d.a.a.k.l lVar, t tVar, InterfaceC0163f interfaceC0163f, boolean z, int i2, boolean z2, Handler handler, InterfaceC0171f interfaceC0171f) {
        this.f3586a = eArr;
        this.f3588c = kVar;
        this.f3589d = lVar;
        this.f3590e = tVar;
        this.f3591f = interfaceC0163f;
        this.x = z;
        this.z = i2;
        this.A = z2;
        this.f3594i = handler;
        this.q = interfaceC0171f;
        this.l = tVar.c();
        this.m = tVar.b();
        this.t = y.a(-9223372036854775807L, lVar);
        this.f3587b = new F[eArr.length];
        for (int i3 = 0; i3 < eArr.length; i3++) {
            eArr[i3].a(i3);
            this.f3587b[i3] = eArr[i3].j();
        }
        this.n = new C0143f(this, interfaceC0171f);
        this.p = new ArrayList<>();
        this.v = new E[0];
        this.j = new M.b();
        this.k = new M.a();
        kVar.a(this, interfaceC0163f);
        this.f3593h = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f3593h.start();
        this.f3592g = interfaceC0171f.a(this.f3593h.getLooper(), this);
    }

    public void a(c.d.a.a.i.w wVar, boolean z, boolean z2) {
        this.f3592g.a(0, z ? 1 : 0, z2 ? 1 : 0, wVar).sendToTarget();
    }

    public void a(boolean z) {
        this.f3592g.a(1, z ? 1 : 0, 0).sendToTarget();
    }

    public void a(int i2) {
        this.f3592g.a(12, i2, 0).sendToTarget();
    }

    public void a(M m, int i2, long j) {
        this.f3592g.a(3, new d(m, i2, j)).sendToTarget();
    }

    public void b(boolean z) {
        this.f3592g.a(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // c.d.a.a.C.a
    public synchronized void a(C c2) {
        if (this.w) {
            c.d.a.a.m.o.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c2.a(false);
        } else {
            this.f3592g.a(14, c2).sendToTarget();
        }
    }

    public synchronized void a() {
        if (this.w) {
            return;
        }
        this.f3592g.a(7);
        boolean z = false;
        while (!this.w) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public Looper b() {
        return this.f3593h.getLooper();
    }

    @Override // c.d.a.a.i.w.b
    public void a(c.d.a.a.i.w wVar, M m, Object obj) {
        this.f3592g.a(8, new a(wVar, m, obj)).sendToTarget();
    }

    @Override // c.d.a.a.i.v.a
    public void a(c.d.a.a.i.v vVar) {
        this.f3592g.a(9, vVar).sendToTarget();
    }

    @Override // c.d.a.a.i.B.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(c.d.a.a.i.v vVar) {
        this.f3592g.a(10, vVar).sendToTarget();
    }

    @Override // c.d.a.a.C0143f.a
    public void a(z zVar) {
        this.f3592g.a(16, zVar).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    b((c.d.a.a.i.w) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    d(message.arg1 != 0);
                    break;
                case 2:
                    g();
                    break;
                case 3:
                    a((d) message.obj);
                    break;
                case 4:
                    b((z) message.obj);
                    break;
                case 5:
                    a((I) message.obj);
                    break;
                case 6:
                    a(message.arg1 != 0, true);
                    break;
                case 7:
                    h();
                    return true;
                case 8:
                    a((a) message.obj);
                    break;
                case 9:
                    c((c.d.a.a.i.v) message.obj);
                    break;
                case 10:
                    d((c.d.a.a.i.v) message.obj);
                    break;
                case 11:
                    j();
                    break;
                case 12:
                    c(message.arg1);
                    break;
                case 13:
                    e(message.arg1 != 0);
                    break;
                case 14:
                    b((C) message.obj);
                    break;
                case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                    d((C) message.obj);
                    break;
                case 16:
                    c((z) message.obj);
                    break;
                default:
                    return false;
            }
            c();
        } catch (C0145h e2) {
            c.d.a.a.m.o.b("ExoPlayerImplInternal", "Playback error.", e2);
            a(false, false);
            this.f3594i.obtainMessage(2, e2).sendToTarget();
            c();
        } catch (IOException e3) {
            c.d.a.a.m.o.b("ExoPlayerImplInternal", "Source error.", e3);
            a(false, false);
            this.f3594i.obtainMessage(2, C0145h.a(e3)).sendToTarget();
            c();
        } catch (RuntimeException e4) {
            c.d.a.a.m.o.b("ExoPlayerImplInternal", "Internal runtime error.", e4);
            a(false, false);
            this.f3594i.obtainMessage(2, C0145h.a(e4)).sendToTarget();
            c();
        }
        return true;
    }

    private void b(int i2) {
        if (this.t.f3719g != i2) {
            this.t = this.t.a(i2);
        }
    }

    private void c(boolean z) {
        if (this.t.f3720h != z) {
            this.t = this.t.a(z);
        }
    }

    private void c() {
        if (this.o.a(this.t)) {
            this.f3594i.obtainMessage(0, this.o.f3612b, this.o.f3613c ? this.o.f3614d : -1, this.t).sendToTarget();
            this.o.b(this.t);
        }
    }

    private void b(c.d.a.a.i.w wVar, boolean z, boolean z2) {
        this.B++;
        a(true, z, z2);
        this.f3590e.a();
        this.u = wVar;
        b(2);
        wVar.a(this, this.f3591f.a());
        this.f3592g.a(2);
    }

    private void d(boolean z) {
        this.y = false;
        this.x = z;
        if (!z) {
            e();
            f();
        } else if (this.t.f3719g == 3) {
            d();
            this.f3592g.a(2);
        } else if (this.t.f3719g == 2) {
            this.f3592g.a(2);
        }
    }

    private void c(int i2) throws C0145h {
        this.z = i2;
        if (!this.r.a(i2)) {
            f(true);
        }
        h(false);
    }

    private void e(boolean z) throws C0145h {
        this.A = z;
        if (!this.r.a(z)) {
            f(true);
        }
        h(false);
    }

    private void f(boolean z) throws C0145h {
        w.a aVar = this.r.c().f3695g.f3698a;
        long jA = a(aVar, this.t.n, true);
        if (jA != this.t.n) {
            this.t = this.t.a(aVar, jA, this.t.f3718f, r());
            if (z) {
                this.o.b(4);
            }
        }
    }

    private void d() {
        this.y = false;
        this.n.b();
        for (E e2 : this.v) {
            e2.start();
        }
    }

    private void e() {
        this.n.c();
        for (E e2 : this.v) {
            a(e2);
        }
    }

    private void f() {
        if (this.r.f()) {
            u uVarC = this.r.c();
            long jE = uVarC.f3689a.e();
            if (jE != -9223372036854775807L) {
                a(jE);
                if (jE != this.t.n) {
                    this.t = this.t.a(this.t.f3716d, jE, this.t.f3718f, r());
                    this.o.b(4);
                }
            } else {
                this.D = this.n.e();
                long jB = uVarC.b(this.D);
                b(this.t.n, jB);
                this.t.n = jB;
            }
            u uVarB = this.r.b();
            this.t.l = uVarB.d();
            this.t.m = r();
        }
    }

    private void g() throws C0145h {
        long jA = this.q.a();
        o();
        if (!this.r.f()) {
            m();
            a(jA, 10L);
            return;
        }
        u uVarC = this.r.c();
        c.d.a.a.m.F.a("doSomeWork");
        f();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        uVarC.f3689a.a(this.t.n - this.l, this.m);
        boolean z = true;
        boolean z2 = true;
        for (E e2 : this.v) {
            e2.a(this.D, jElapsedRealtime);
            z2 = z2 && e2.b();
            boolean z3 = e2.c() || e2.b() || c(e2);
            if (!z3) {
                e2.l();
            }
            z = z && z3;
        }
        if (!z) {
            m();
        }
        long j = uVarC.f3695g.f3701d;
        if (z2 && ((j == -9223372036854775807L || j <= this.t.n) && uVarC.f3695g.f3703f)) {
            b(4);
            e();
        } else if (this.t.f3719g == 2 && g(z)) {
            b(3);
            if (this.x) {
                d();
            }
        } else if (this.t.f3719g == 3 && (this.v.length != 0 ? !z : !k())) {
            this.y = this.x;
            b(2);
            e();
        }
        if (this.t.f3719g == 2) {
            for (E e3 : this.v) {
                e3.l();
            }
        }
        if ((this.x && this.t.f3719g == 3) || this.t.f3719g == 2) {
            a(jA, 10L);
        } else if (this.v.length != 0 && this.t.f3719g != 4) {
            a(jA, 1000L);
        } else {
            this.f3592g.b(2);
        }
        c.d.a.a.m.F.a();
    }

    private void a(long j, long j2) {
        this.f3592g.b(2);
        this.f3592g.a(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #0 {all -> 0x00de, blocks: (B:15:0x0058, B:17:0x005c, B:22:0x0065, B:23:0x006d, B:25:0x0077, B:29:0x0083, B:31:0x008d, B:33:0x009d, B:39:0x00b8, B:43:0x00c2, B:44:0x00c6), top: B:55:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(c.d.a.a.n.d r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.n.a(c.d.a.a.n$d):void");
    }

    private long a(w.a aVar, long j) {
        return a(aVar, j, this.r.c() != this.r.d());
    }

    private long a(w.a aVar, long j, boolean z) throws C0145h {
        e();
        this.y = false;
        b(2);
        u uVarC = this.r.c();
        u uVarH = uVarC;
        while (true) {
            if (uVarH == null) {
                break;
            }
            if (aVar.equals(uVarH.f3695g.f3698a) && uVarH.f3693e) {
                this.r.a(uVarH);
                break;
            }
            uVarH = this.r.h();
        }
        if (uVarC != uVarH || z) {
            for (E e2 : this.v) {
                b(e2);
            }
            this.v = new E[0];
            uVarC = null;
        }
        if (uVarH != null) {
            a(uVarC);
            if (uVarH.f3694f) {
                j = uVarH.f3689a.a(j);
                uVarH.f3689a.a(j - this.l, this.m);
            }
            a(j);
            q();
        } else {
            this.r.b(true);
            this.t = this.t.a(c.d.a.a.i.G.f2504a, this.f3589d);
            a(j);
        }
        h(false);
        this.f3592g.a(2);
        return j;
    }

    private void a(long j) {
        if (this.r.f()) {
            j = this.r.c().a(j);
        }
        this.D = j;
        this.n.a(this.D);
        for (E e2 : this.v) {
            e2.a(this.D);
        }
    }

    private void b(z zVar) {
        this.n.a(zVar);
    }

    private void a(I i2) {
        this.s = i2;
    }

    private void a(boolean z, boolean z2) {
        a(true, z, z);
        this.o.a(this.B + (z2 ? 1 : 0));
        this.B = 0;
        this.f3590e.f();
        b(1);
    }

    private void h() {
        a(true, true, true);
        this.f3590e.d();
        b(1);
        this.f3593h.quit();
        synchronized (this) {
            this.w = true;
            notifyAll();
        }
    }

    private void a(boolean z, boolean z2, boolean z3) {
        this.f3592g.b(2);
        this.y = false;
        this.n.c();
        this.D = 0L;
        for (E e2 : this.v) {
            try {
                b(e2);
            } catch (C0145h | RuntimeException e3) {
                c.d.a.a.m.o.b("ExoPlayerImplInternal", "Stop failed.", e3);
            }
        }
        this.v = new E[0];
        this.r.b(!z2);
        c(false);
        if (z2) {
            this.C = null;
        }
        if (z3) {
            this.r.a(M.f1451a);
            Iterator<b> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().f3602a.a(false);
            }
            this.p.clear();
            this.E = 0;
        }
        w.a aVarA = z2 ? this.t.a(this.A, this.j) : this.t.f3716d;
        long j = z2 ? -9223372036854775807L : this.t.n;
        this.t = new y(z3 ? M.f1451a : this.t.f3714b, z3 ? null : this.t.f3715c, aVarA, j, z2 ? -9223372036854775807L : this.t.f3718f, this.t.f3719g, false, z3 ? c.d.a.a.i.G.f2504a : this.t.f3721i, z3 ? this.f3589d : this.t.j, aVarA, j, 0L, j);
        if (!z || this.u == null) {
            return;
        }
        this.u.a(this);
        this.u = null;
    }

    private void b(C c2) {
        if (c2.f() == -9223372036854775807L) {
            c(c2);
            return;
        }
        if (this.u == null || this.B > 0) {
            this.p.add(new b(c2));
            return;
        }
        b bVar = new b(c2);
        if (a(bVar)) {
            this.p.add(bVar);
            Collections.sort(this.p);
        } else {
            c2.a(false);
        }
    }

    private void c(C c2) {
        if (c2.e().getLooper() == this.f3592g.a()) {
            e(c2);
            if (this.t.f3719g == 3 || this.t.f3719g == 2) {
                this.f3592g.a(2);
                return;
            }
            return;
        }
        this.f3592g.a(15, c2).sendToTarget();
    }

    private void d(final C c2) {
        c2.e().post(new Runnable() { // from class: c.d.a.a.a
            @Override // java.lang.Runnable
            public final void run() {
                n.a(this.f1467a, c2);
            }
        });
    }

    public static /* synthetic */ void a(n nVar, C c2) {
        try {
            nVar.e(c2);
        } catch (C0145h e2) {
            c.d.a.a.m.o.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void e(C c2) {
        if (c2.j()) {
            return;
        }
        try {
            c2.b().a(c2.c(), c2.d());
        } finally {
            c2.a(true);
        }
    }

    private void i() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (!a(this.p.get(size))) {
                this.p.get(size).f3602a.a(false);
                this.p.remove(size);
            }
        }
        Collections.sort(this.p);
    }

    private boolean a(b bVar) {
        if (bVar.f3605d == null) {
            Pair<Object, Long> pairA = a(new d(bVar.f3602a.a(), bVar.f3602a.g(), AbstractC0132d.b(bVar.f3602a.f())), false);
            if (pairA == null) {
                return false;
            }
            bVar.a(this.t.f3714b.a(pairA.first), ((Long) pairA.second).longValue(), pairA.first);
            return true;
        }
        int iA = this.t.f3714b.a(bVar.f3605d);
        if (iA == -1) {
            return false;
        }
        bVar.f3603b = iA;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0040, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007d, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(long r6, long r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.n.b(long, long):void");
    }

    private void a(E e2) {
        if (e2.f() == 2) {
            e2.stop();
        }
    }

    private void b(E e2) {
        this.n.b(e2);
        a(e2);
        e2.e();
    }

    private void j() throws C0145h {
        if (this.r.f()) {
            float f2 = this.n.d().f3723b;
            u uVarD = this.r.d();
            boolean z = true;
            for (u uVarC = this.r.c(); uVarC != null && uVarC.f3693e; uVarC = uVarC.f3696h) {
                if (!uVarC.b(f2)) {
                    if (uVarC == uVarD) {
                        z = false;
                    }
                } else {
                    if (z) {
                        u uVarC2 = this.r.c();
                        boolean zA = this.r.a(uVarC2);
                        boolean[] zArr = new boolean[this.f3586a.length];
                        long jA = uVarC2.a(this.t.n, zA, zArr);
                        if (this.t.f3719g != 4 && jA != this.t.n) {
                            this.t = this.t.a(this.t.f3716d, jA, this.t.f3718f, r());
                            this.o.b(4);
                            a(jA);
                        }
                        boolean[] zArr2 = new boolean[this.f3586a.length];
                        int i2 = 0;
                        for (int i3 = 0; i3 < this.f3586a.length; i3++) {
                            E e2 = this.f3586a[i3];
                            zArr2[i3] = e2.f() != 0;
                            c.d.a.a.i.A a2 = uVarC2.f3691c[i3];
                            if (a2 != null) {
                                i2++;
                            }
                            if (zArr2[i3]) {
                                if (a2 != e2.k()) {
                                    b(e2);
                                } else if (zArr[i3]) {
                                    e2.a(this.D);
                                }
                            }
                        }
                        this.t = this.t.a(uVarC2.f3697i, uVarC2.j);
                        a(zArr2, i2);
                    } else {
                        this.r.a(uVarC);
                        if (uVarC.f3693e) {
                            uVarC.a(Math.max(uVarC.f3695g.f3699b, uVarC.b(this.D)), false);
                        }
                    }
                    h(true);
                    if (this.t.f3719g != 4) {
                        q();
                        f();
                        this.f3592g.a(2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private void a(float f2) {
        for (u uVarE = this.r.e(); uVarE != null; uVarE = uVarE.f3696h) {
            if (uVarE.j != null) {
                for (c.d.a.a.k.i iVar : uVarE.j.f3335c.a()) {
                    if (iVar != null) {
                        iVar.a(f2);
                    }
                }
            }
        }
    }

    private boolean g(boolean z) {
        if (this.v.length == 0) {
            return k();
        }
        if (!z) {
            return false;
        }
        if (!this.t.f3720h) {
            return true;
        }
        u uVarB = this.r.b();
        return (uVarB.c() && uVarB.f3695g.f3703f) || this.f3590e.a(r(), this.n.d().f3723b, this.y);
    }

    private boolean k() {
        u uVarC = this.r.c();
        long j = uVarC.f3695g.f3701d;
        return j == -9223372036854775807L || this.t.n < j || (uVarC.f3696h != null && (uVarC.f3696h.f3693e || uVarC.f3696h.f3695g.f3698a.a()));
    }

    private void l() {
        if (this.r.b() != null) {
            for (E e2 : this.v) {
                if (!e2.h()) {
                    return;
                }
            }
        }
        this.u.a();
    }

    private void m() {
        u uVarB = this.r.b();
        u uVarD = this.r.d();
        if (uVarB == null || uVarB.f3693e) {
            return;
        }
        if (uVarD == null || uVarD.f3696h == uVarB) {
            for (E e2 : this.v) {
                if (!e2.h()) {
                    return;
                }
            }
            uVarB.f3689a.d();
        }
    }

    private void a(a aVar) throws C0145h {
        if (aVar.f3597a != this.u) {
            return;
        }
        M m = this.t.f3714b;
        M m2 = aVar.f3598b;
        Object obj = aVar.f3599c;
        this.r.a(m2);
        this.t = this.t.a(m2, obj);
        i();
        if (this.B > 0) {
            this.o.a(this.B);
            this.B = 0;
            if (this.C == null) {
                if (this.t.f3717e == -9223372036854775807L) {
                    if (m2.a()) {
                        n();
                        return;
                    }
                    Pair<Object, Long> pairB = b(m2, m2.b(this.A), -9223372036854775807L);
                    Object obj2 = pairB.first;
                    long jLongValue = ((Long) pairB.second).longValue();
                    w.a aVarA = this.r.a(obj2, jLongValue);
                    this.t = this.t.a(aVarA, aVarA.a() ? 0L : jLongValue, jLongValue);
                    return;
                }
                return;
            }
            try {
                Pair<Object, Long> pairA = a(this.C, true);
                this.C = null;
                if (pairA == null) {
                    n();
                    return;
                }
                Object obj3 = pairA.first;
                long jLongValue2 = ((Long) pairA.second).longValue();
                w.a aVarA2 = this.r.a(obj3, jLongValue2);
                this.t = this.t.a(aVarA2, aVarA2.a() ? 0L : jLongValue2, jLongValue2);
                return;
            } catch (s e2) {
                this.t = this.t.a(this.t.a(this.A, this.j), -9223372036854775807L, -9223372036854775807L);
                throw e2;
            }
        }
        if (m.a()) {
            if (m2.a()) {
                return;
            }
            Pair<Object, Long> pairB2 = b(m2, m2.b(this.A), -9223372036854775807L);
            Object obj4 = pairB2.first;
            long jLongValue3 = ((Long) pairB2.second).longValue();
            w.a aVarA3 = this.r.a(obj4, jLongValue3);
            this.t = this.t.a(aVarA3, aVarA3.a() ? 0L : jLongValue3, jLongValue3);
            return;
        }
        u uVarE = this.r.e();
        long j = this.t.f3718f;
        Object obj5 = uVarE == null ? this.t.f3716d.f3024a : uVarE.f3690b;
        if (m2.a(obj5) == -1) {
            Object objA = a(obj5, m, m2);
            if (objA == null) {
                n();
                return;
            }
            Pair<Object, Long> pairB3 = b(m2, m2.a(objA, this.k).f1454c, -9223372036854775807L);
            Object obj6 = pairB3.first;
            long jLongValue4 = ((Long) pairB3.second).longValue();
            w.a aVarA4 = this.r.a(obj6, jLongValue4);
            if (uVarE != null) {
                while (uVarE.f3696h != null) {
                    uVarE = uVarE.f3696h;
                    if (uVarE.f3695g.f3698a.equals(aVarA4)) {
                        uVarE.f3695g = this.r.a(uVarE.f3695g);
                    }
                }
            }
            this.t = this.t.a(aVarA4, a(aVarA4, aVarA4.a() ? 0L : jLongValue4), jLongValue4, r());
            return;
        }
        w.a aVar2 = this.t.f3716d;
        if (aVar2.a()) {
            w.a aVarA5 = this.r.a(obj5, j);
            if (!aVarA5.equals(aVar2)) {
                this.t = this.t.a(aVarA5, a(aVarA5, aVarA5.a() ? 0L : j), j, r());
                return;
            }
        }
        if (!this.r.a(aVar2, this.D)) {
            f(false);
        }
        h(false);
    }

    private void n() {
        b(4);
        a(false, true, false);
    }

    private Object a(Object obj, M m, M m2) {
        int iA = m.a(obj);
        int iC = m.c();
        int iA2 = iA;
        int iA3 = -1;
        for (int i2 = 0; i2 < iC && iA3 == -1; i2++) {
            iA2 = m.a(iA2, this.k, this.j, this.z, this.A);
            if (iA2 == -1) {
                break;
            }
            iA3 = m2.a(m.a(iA2));
        }
        if (iA3 == -1) {
            return null;
        }
        return m2.a(iA3);
    }

    private Pair<Object, Long> a(d dVar, boolean z) {
        int iA;
        M m = this.t.f3714b;
        M m2 = dVar.f3619a;
        if (m.a()) {
            return null;
        }
        if (m2.a()) {
            m2 = m;
        }
        try {
            Pair<Object, Long> pairA = m2.a(this.j, this.k, dVar.f3620b, dVar.f3621c);
            if (m == m2 || (iA = m.a(pairA.first)) != -1) {
                return pairA;
            }
            if (!z || a(pairA.first, m2, m) == null) {
                return null;
            }
            return b(m, m.a(iA, this.k).f1454c, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new s(m, dVar.f3620b, dVar.f3621c);
        }
    }

    private Pair<Object, Long> b(M m, int i2, long j) {
        return m.a(this.j, this.k, i2, j);
    }

    private void o() throws C0145h {
        if (this.u == null) {
            return;
        }
        if (this.B > 0) {
            this.u.a();
            return;
        }
        p();
        u uVarB = this.r.b();
        if (uVarB == null || uVarB.c()) {
            c(false);
        } else if (!this.t.f3720h) {
            q();
        }
        if (this.r.f()) {
            u uVarC = this.r.c();
            u uVarD = this.r.d();
            boolean z = false;
            while (this.x && uVarC != uVarD && this.D >= uVarC.f3696h.b()) {
                if (z) {
                    c();
                }
                int i2 = uVarC.f3695g.f3702e ? 0 : 3;
                u uVarH = this.r.h();
                a(uVarC);
                this.t = this.t.a(uVarH.f3695g.f3698a, uVarH.f3695g.f3699b, uVarH.f3695g.f3700c, r());
                this.o.b(i2);
                f();
                uVarC = uVarH;
                z = true;
            }
            if (uVarD.f3695g.f3703f) {
                for (int i3 = 0; i3 < this.f3586a.length; i3++) {
                    E e2 = this.f3586a[i3];
                    c.d.a.a.i.A a2 = uVarD.f3691c[i3];
                    if (a2 != null && e2.k() == a2 && e2.h()) {
                        e2.i();
                    }
                }
                return;
            }
            if (uVarD.f3696h == null) {
                return;
            }
            for (int i4 = 0; i4 < this.f3586a.length; i4++) {
                E e3 = this.f3586a[i4];
                c.d.a.a.i.A a3 = uVarD.f3691c[i4];
                if (e3.k() != a3) {
                    return;
                }
                if (a3 != null && !e3.h()) {
                    return;
                }
            }
            if (!uVarD.f3696h.f3693e) {
                m();
                return;
            }
            c.d.a.a.k.l lVar = uVarD.j;
            u uVarG = this.r.g();
            c.d.a.a.k.l lVar2 = uVarG.j;
            boolean z2 = uVarG.f3689a.e() != -9223372036854775807L;
            for (int i5 = 0; i5 < this.f3586a.length; i5++) {
                E e4 = this.f3586a[i5];
                if (lVar.a(i5)) {
                    if (z2) {
                        e4.i();
                    } else if (!e4.m()) {
                        c.d.a.a.k.i iVarA = lVar2.f3335c.a(i5);
                        boolean zA = lVar2.a(i5);
                        boolean z3 = this.f3587b[i5].g() == 6;
                        G g2 = lVar.f3334b[i5];
                        G g3 = lVar2.f3334b[i5];
                        if (zA && g3.equals(g2) && !z3) {
                            e4.a(a(iVarA), uVarG.f3691c[i5], uVarG.a());
                        } else {
                            e4.i();
                        }
                    }
                }
            }
        }
    }

    private void p() {
        this.r.a(this.D);
        if (this.r.a()) {
            v vVarA = this.r.a(this.D, this.t);
            if (vVarA == null) {
                l();
                return;
            }
            this.r.a(this.f3587b, this.f3588c, this.f3590e.e(), this.u, vVarA).a(this, vVarA.f3699b);
            c(true);
            h(false);
        }
    }

    private void c(c.d.a.a.i.v vVar) throws C0145h {
        if (this.r.a(vVar)) {
            u uVarB = this.r.b();
            uVarB.a(this.n.d().f3723b);
            a(uVarB.f3697i, uVarB.j);
            if (!this.r.f()) {
                a(this.r.h().f3695g.f3699b);
                a((u) null);
            }
            q();
        }
    }

    private void d(c.d.a.a.i.v vVar) {
        if (this.r.a(vVar)) {
            this.r.a(this.D);
            q();
        }
    }

    private void c(z zVar) {
        this.f3594i.obtainMessage(1, zVar).sendToTarget();
        a(zVar.f3723b);
        for (E e2 : this.f3586a) {
            if (e2 != null) {
                e2.a(zVar.f3723b);
            }
        }
    }

    private void q() {
        u uVarB = this.r.b();
        long jE = uVarB.e();
        if (jE == Long.MIN_VALUE) {
            c(false);
            return;
        }
        boolean zA = this.f3590e.a(b(jE), this.n.d().f3723b);
        c(zA);
        if (zA) {
            uVarB.d(this.D);
        }
    }

    private void a(u uVar) throws C0145h {
        u uVarC = this.r.c();
        if (uVarC == null || uVar == uVarC) {
            return;
        }
        boolean[] zArr = new boolean[this.f3586a.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3586a.length; i3++) {
            E e2 = this.f3586a[i3];
            zArr[i3] = e2.f() != 0;
            if (uVarC.j.a(i3)) {
                i2++;
            }
            if (zArr[i3] && (!uVarC.j.a(i3) || (e2.m() && e2.k() == uVar.f3691c[i3]))) {
                b(e2);
            }
        }
        this.t = this.t.a(uVarC.f3697i, uVarC.j);
        a(zArr, i2);
    }

    private void a(boolean[] zArr, int i2) throws C0145h {
        this.v = new E[i2];
        u uVarC = this.r.c();
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3586a.length; i4++) {
            if (uVarC.j.a(i4)) {
                a(i4, zArr[i4], i3);
                i3++;
            }
        }
    }

    private void a(int i2, boolean z, int i3) throws C0145h {
        u uVarC = this.r.c();
        E e2 = this.f3586a[i2];
        this.v[i3] = e2;
        if (e2.f() == 0) {
            G g2 = uVarC.j.f3334b[i2];
            q[] qVarArrA = a(uVarC.j.f3335c.a(i2));
            boolean z2 = this.x && this.t.f3719g == 3;
            e2.a(g2, qVarArrA, uVarC.f3691c[i2], this.D, !z && z2, uVarC.a());
            this.n.a(e2);
            if (z2) {
                e2.start();
            }
        }
    }

    private boolean c(E e2) {
        u uVarD = this.r.d();
        return uVarD.f3696h != null && uVarD.f3696h.f3693e && e2.h();
    }

    private void h(boolean z) {
        u uVarB = this.r.b();
        w.a aVar = uVarB == null ? this.t.f3716d : uVarB.f3695g.f3698a;
        boolean z2 = !this.t.k.equals(aVar);
        if (z2) {
            this.t = this.t.a(aVar);
        }
        this.t.l = uVarB == null ? this.t.n : uVarB.d();
        this.t.m = r();
        if ((z2 || z) && uVarB != null && uVarB.f3693e) {
            a(uVarB.f3697i, uVarB.j);
        }
    }

    private long r() {
        return b(this.t.l);
    }

    private long b(long j) {
        u uVarB = this.r.b();
        if (uVarB == null) {
            return 0L;
        }
        return j - uVarB.b(this.D);
    }

    private void a(c.d.a.a.i.G g2, c.d.a.a.k.l lVar) {
        this.f3590e.a(this.f3586a, g2, lVar.f3335c);
    }

    private static q[] a(c.d.a.a.k.i iVar) {
        int length = iVar != null ? iVar.length() : 0;
        q[] qVarArr = new q[length];
        for (int i2 = 0; i2 < length; i2++) {
            qVarArr[i2] = iVar.a(i2);
        }
        return qVarArr;
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final M f3619a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3620b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3621c;

        public d(M m, int i2, long j) {
            this.f3619a = m;
            this.f3620b = i2;
            this.f3621c = j;
        }
    }

    private static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final C f3602a;

        /* renamed from: b, reason: collision with root package name */
        public int f3603b;

        /* renamed from: c, reason: collision with root package name */
        public long f3604c;

        /* renamed from: d, reason: collision with root package name */
        public Object f3605d;

        public b(C c2) {
            this.f3602a = c2;
        }

        public void a(int i2, long j, Object obj) {
            this.f3603b = i2;
            this.f3604c = j;
            this.f3605d = obj;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if ((this.f3605d == null) != (bVar.f3605d == null)) {
                return this.f3605d != null ? -1 : 1;
            }
            if (this.f3605d == null) {
                return 0;
            }
            int i2 = this.f3603b - bVar.f3603b;
            return i2 != 0 ? i2 : c.d.a.a.m.H.b(this.f3604c, bVar.f3604c);
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c.d.a.a.i.w f3597a;

        /* renamed from: b, reason: collision with root package name */
        public final M f3598b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f3599c;

        public a(c.d.a.a.i.w wVar, M m, Object obj) {
            this.f3597a = wVar;
            this.f3598b = m;
            this.f3599c = obj;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private y f3611a;

        /* renamed from: b, reason: collision with root package name */
        private int f3612b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3613c;

        /* renamed from: d, reason: collision with root package name */
        private int f3614d;

        private c() {
        }

        public boolean a(y yVar) {
            return yVar != this.f3611a || this.f3612b > 0 || this.f3613c;
        }

        public void b(y yVar) {
            this.f3611a = yVar;
            this.f3612b = 0;
            this.f3613c = false;
        }

        public void a(int i2) {
            this.f3612b += i2;
        }

        public void b(int i2) {
            if (this.f3613c && this.f3614d != 4) {
                AbstractC0170e.a(i2 == 4);
            } else {
                this.f3613c = true;
                this.f3614d = i2;
            }
        }
    }
}
