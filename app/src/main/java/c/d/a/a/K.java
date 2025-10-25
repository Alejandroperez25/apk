package c.d.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import c.d.a.a.A;
import c.d.a.a.a.a;
import c.d.a.a.b.j;
import c.d.a.a.b.m;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.InterfaceC0171f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
/* loaded from: classes.dex */
public class K extends AbstractC0122b implements InterfaceC0146i, A.a, A.e, A.d, A.c {
    private c.d.a.a.b.j A;
    private float B;
    private c.d.a.a.i.w C;
    private List<c.d.a.a.j.a> D;
    private boolean E;

    /* renamed from: b, reason: collision with root package name */
    protected final E[] f1442b;

    /* renamed from: c, reason: collision with root package name */
    private final C0157l f1443c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f1444d;

    /* renamed from: e, reason: collision with root package name */
    private final a f1445e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<c.d.a.a.n.r> f1446f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet<c.d.a.a.b.n> f1447g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<c.d.a.a.j.k> f1448h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet<c.d.a.a.g.g> f1449i;
    private final CopyOnWriteArraySet<c.d.a.a.n.s> j;
    private final CopyOnWriteArraySet<c.d.a.a.b.p> k;
    private final InterfaceC0163f l;
    private final c.d.a.a.a.a m;
    private final c.d.a.a.b.m n;
    private q o;
    private q p;
    private Surface q;
    private boolean r;
    private int s;
    private SurfaceHolder t;
    private TextureView u;
    private int v;
    private int w;
    private c.d.a.a.c.e x;
    private c.d.a.a.c.e y;
    private int z;

    protected K(Context context, H h2, c.d.a.a.k.k kVar, t tVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, InterfaceC0163f interfaceC0163f, a.C0025a c0025a, Looper looper) {
        this(context, h2, kVar, tVar, hVar, interfaceC0163f, c0025a, InterfaceC0171f.f3513a, looper);
    }

    protected K(Context context, H h2, c.d.a.a.k.k kVar, t tVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, InterfaceC0163f interfaceC0163f, a.C0025a c0025a, InterfaceC0171f interfaceC0171f, Looper looper) {
        this.l = interfaceC0163f;
        this.f1445e = new a();
        this.f1446f = new CopyOnWriteArraySet<>();
        this.f1447g = new CopyOnWriteArraySet<>();
        this.f1448h = new CopyOnWriteArraySet<>();
        this.f1449i = new CopyOnWriteArraySet<>();
        this.j = new CopyOnWriteArraySet<>();
        this.k = new CopyOnWriteArraySet<>();
        this.f1444d = new Handler(looper);
        this.f1442b = h2.a(this.f1444d, this.f1445e, this.f1445e, this.f1445e, this.f1445e, hVar);
        this.B = 1.0f;
        this.z = 0;
        this.A = c.d.a.a.b.j.f1567a;
        this.s = 1;
        this.D = Collections.emptyList();
        this.f1443c = new C0157l(this.f1442b, kVar, tVar, interfaceC0163f, interfaceC0171f, looper);
        this.m = c0025a.a(this.f1443c, interfaceC0171f);
        a((A.b) this.m);
        this.j.add(this.m);
        this.f1446f.add(this.m);
        this.k.add(this.m);
        this.f1447g.add(this.m);
        a((c.d.a.a.g.g) this.m);
        interfaceC0163f.a(this.f1444d, this.m);
        if (hVar instanceof c.d.a.a.d.c) {
            ((c.d.a.a.d.c) hVar).a(this.f1444d, this.m);
        }
        this.n = new c.d.a.a.b.m(context, this.f1445e);
    }

    public void a(Surface surface) {
        s();
        q();
        a(surface, false);
        int i2 = surface != null ? -1 : 0;
        a(i2, i2);
    }

    public void a(c.d.a.a.b.j jVar) {
        a(jVar, false);
    }

    public void a(c.d.a.a.b.j jVar, boolean z) {
        s();
        if (!c.d.a.a.m.H.a(this.A, jVar)) {
            this.A = jVar;
            for (E e2 : this.f1442b) {
                if (e2.g() == 1) {
                    C cA = this.f1443c.a(e2);
                    cA.a(3);
                    cA.a(jVar);
                    cA.i();
                }
            }
            Iterator<c.d.a.a.b.n> it = this.f1447g.iterator();
            while (it.hasNext()) {
                it.next().a(jVar);
            }
        }
        c.d.a.a.b.m mVar = this.n;
        if (!z) {
            jVar = null;
        }
        a(m(), mVar.a(jVar, m(), l()));
    }

    public void a(float f2) {
        s();
        float fA = c.d.a.a.m.H.a(f2, 0.0f, 1.0f);
        if (this.B == fA) {
            return;
        }
        this.B = fA;
        r();
        Iterator<c.d.a.a.b.n> it = this.f1447g.iterator();
        while (it.hasNext()) {
            it.next().a(fA);
        }
    }

    @Deprecated
    public void a(int i2) {
        int iF = c.d.a.a.m.H.f(i2);
        int iG = c.d.a.a.m.H.g(i2);
        j.a aVar = new j.a();
        aVar.b(iF);
        aVar.a(iG);
        a(aVar.a());
    }

    public q j() {
        return this.o;
    }

    public void a(c.d.a.a.g.g gVar) {
        this.f1449i.add(gVar);
    }

    public Looper k() {
        return this.f1443c.j();
    }

    public void a(A.b bVar) {
        s();
        this.f1443c.a(bVar);
    }

    public int l() {
        s();
        return this.f1443c.k();
    }

    public void a(c.d.a.a.i.w wVar) {
        a(wVar, true, true);
    }

    public void a(c.d.a.a.i.w wVar, boolean z, boolean z2) {
        s();
        if (this.C != null) {
            this.C.a(this.m);
            this.m.d();
        }
        this.C = wVar;
        wVar.a(this.f1444d, this.m);
        a(m(), this.n.a(m()));
        this.f1443c.a(wVar, z, z2);
    }

    public void b(boolean z) {
        s();
        a(z, this.n.a(z, l()));
    }

    public boolean m() {
        s();
        return this.f1443c.l();
    }

    public void b(int i2) {
        s();
        this.f1443c.a(i2);
    }

    @Override // c.d.a.a.A
    public void a(int i2, long j) {
        s();
        this.m.c();
        this.f1443c.a(i2, j);
    }

    @Override // c.d.a.a.A
    public void a(boolean z) {
        s();
        this.f1443c.a(z);
        if (this.C != null) {
            this.C.a(this.m);
            this.m.d();
            if (z) {
                this.C = null;
            }
        }
        this.n.b();
        this.D = Collections.emptyList();
    }

    public void n() {
        this.n.b();
        this.f1443c.m();
        q();
        if (this.q != null) {
            if (this.r) {
                this.q.release();
            }
            this.q = null;
        }
        if (this.C != null) {
            this.C.a(this.m);
            this.C = null;
        }
        this.l.a(this.m);
        this.D = Collections.emptyList();
    }

    @Override // c.d.a.a.A
    public M f() {
        s();
        return this.f1443c.f();
    }

    @Override // c.d.a.a.A
    public int c() {
        s();
        return this.f1443c.c();
    }

    public long o() {
        s();
        return this.f1443c.o();
    }

    @Override // c.d.a.a.A
    public long g() {
        s();
        return this.f1443c.g();
    }

    public long p() {
        s();
        return this.f1443c.p();
    }

    @Override // c.d.a.a.A
    public long a() {
        s();
        return this.f1443c.a();
    }

    @Override // c.d.a.a.A
    public int e() {
        s();
        return this.f1443c.e();
    }

    @Override // c.d.a.a.A
    public int b() {
        s();
        return this.f1443c.b();
    }

    @Override // c.d.a.a.A
    public long d() {
        s();
        return this.f1443c.d();
    }

    private void q() {
        if (this.u != null) {
            if (this.u.getSurfaceTextureListener() != this.f1445e) {
                c.d.a.a.m.o.c("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.u.setSurfaceTextureListener(null);
            }
            this.u = null;
        }
        if (this.t != null) {
            this.t.removeCallback(this.f1445e);
            this.t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (E e2 : this.f1442b) {
            if (e2.g() == 2) {
                C cA = this.f1443c.a(e2);
                cA.a(1);
                cA.a(surface);
                cA.i();
                arrayList.add(cA);
            }
        }
        if (this.q != null && this.q != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C) it.next()).k();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.r) {
                this.q.release();
            }
        }
        this.q = surface;
        this.r = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3) {
        if (i2 == this.v && i3 == this.w) {
            return;
        }
        this.v = i2;
        this.w = i3;
        Iterator<c.d.a.a.n.r> it = this.f1446f.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        float fA = this.B * this.n.a();
        for (E e2 : this.f1442b) {
            if (e2.g() == 1) {
                C cA = this.f1443c.a(e2);
                cA.a(2);
                cA.a(Float.valueOf(fA));
                cA.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i2) {
        this.f1443c.a(z && i2 != -1, i2 != 1);
    }

    private void s() {
        if (Looper.myLooper() != k()) {
            c.d.a.a.m.o.a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.E ? null : new IllegalStateException());
            this.E = true;
        }
    }

    private final class a implements c.d.a.a.n.s, c.d.a.a.b.p, c.d.a.a.j.k, c.d.a.a.g.g, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, m.b {
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private a() {
        }

        @Override // c.d.a.a.n.s
        public void c(c.d.a.a.c.e eVar) {
            K.this.x = eVar;
            Iterator it = K.this.j.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.n.s) it.next()).c(eVar);
            }
        }

        @Override // c.d.a.a.n.s
        public void a(String str, long j, long j2) {
            Iterator it = K.this.j.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.n.s) it.next()).a(str, j, j2);
            }
        }

        @Override // c.d.a.a.n.s
        public void a(q qVar) {
            K.this.o = qVar;
            Iterator it = K.this.j.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.n.s) it.next()).a(qVar);
            }
        }

        @Override // c.d.a.a.n.s
        public void a(int i2, long j) {
            Iterator it = K.this.j.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.n.s) it.next()).a(i2, j);
            }
        }

        @Override // c.d.a.a.n.s
        public void a(int i2, int i3, int i4, float f2) {
            Iterator it = K.this.f1446f.iterator();
            while (it.hasNext()) {
                c.d.a.a.n.r rVar = (c.d.a.a.n.r) it.next();
                if (!K.this.j.contains(rVar)) {
                    rVar.a(i2, i3, i4, f2);
                }
            }
            Iterator it2 = K.this.j.iterator();
            while (it2.hasNext()) {
                ((c.d.a.a.n.s) it2.next()).a(i2, i3, i4, f2);
            }
        }

        @Override // c.d.a.a.n.s
        public void a(Surface surface) {
            if (K.this.q == surface) {
                Iterator it = K.this.f1446f.iterator();
                while (it.hasNext()) {
                    ((c.d.a.a.n.r) it.next()).b();
                }
            }
            Iterator it2 = K.this.j.iterator();
            while (it2.hasNext()) {
                ((c.d.a.a.n.s) it2.next()).a(surface);
            }
        }

        @Override // c.d.a.a.n.s
        public void d(c.d.a.a.c.e eVar) {
            Iterator it = K.this.j.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.n.s) it.next()).d(eVar);
            }
            K.this.o = null;
            K.this.x = null;
        }

        @Override // c.d.a.a.b.p
        public void b(c.d.a.a.c.e eVar) {
            K.this.y = eVar;
            Iterator it = K.this.k.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.b.p) it.next()).b(eVar);
            }
        }

        @Override // c.d.a.a.b.p
        public void a(int i2) {
            if (K.this.z == i2) {
                return;
            }
            K.this.z = i2;
            Iterator it = K.this.f1447g.iterator();
            while (it.hasNext()) {
                c.d.a.a.b.n nVar = (c.d.a.a.b.n) it.next();
                if (!K.this.k.contains(nVar)) {
                    nVar.a(i2);
                }
            }
            Iterator it2 = K.this.k.iterator();
            while (it2.hasNext()) {
                ((c.d.a.a.b.p) it2.next()).a(i2);
            }
        }

        @Override // c.d.a.a.b.p
        public void b(String str, long j, long j2) {
            Iterator it = K.this.k.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.b.p) it.next()).b(str, j, j2);
            }
        }

        @Override // c.d.a.a.b.p
        public void b(q qVar) {
            K.this.p = qVar;
            Iterator it = K.this.k.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.b.p) it.next()).b(qVar);
            }
        }

        @Override // c.d.a.a.b.p
        public void a(int i2, long j, long j2) {
            Iterator it = K.this.k.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.b.p) it.next()).a(i2, j, j2);
            }
        }

        @Override // c.d.a.a.b.p
        public void a(c.d.a.a.c.e eVar) {
            Iterator it = K.this.k.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.b.p) it.next()).a(eVar);
            }
            K.this.p = null;
            K.this.y = null;
            K.this.z = 0;
        }

        @Override // c.d.a.a.j.k
        public void a(List<c.d.a.a.j.a> list) {
            K.this.D = list;
            Iterator it = K.this.f1448h.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.j.k) it.next()).a(list);
            }
        }

        @Override // c.d.a.a.g.g
        public void a(c.d.a.a.g.b bVar) {
            Iterator it = K.this.f1449i.iterator();
            while (it.hasNext()) {
                ((c.d.a.a.g.g) it.next()).a(bVar);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            K.this.a(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            K.this.a(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            K.this.a((Surface) null, false);
            K.this.a(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            K.this.a(new Surface(surfaceTexture), true);
            K.this.a(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            K.this.a(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            K.this.a((Surface) null, true);
            K.this.a(0, 0);
            return true;
        }

        @Override // c.d.a.a.b.m.b
        public void a(float f2) {
            K.this.r();
        }

        @Override // c.d.a.a.b.m.b
        public void b(int i2) {
            K.this.a(K.this.m(), i2);
        }
    }
}
