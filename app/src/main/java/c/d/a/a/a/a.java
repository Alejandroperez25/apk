package c.d.a.a.a;

import android.view.Surface;
import c.d.a.a.A;
import c.d.a.a.C0145h;
import c.d.a.a.M;
import c.d.a.a.a.b;
import c.d.a.a.b.j;
import c.d.a.a.b.n;
import c.d.a.a.b.p;
import c.d.a.a.c.e;
import c.d.a.a.g.g;
import c.d.a.a.i.G;
import c.d.a.a.i.w;
import c.d.a.a.i.x;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.InterfaceC0171f;
import c.d.a.a.n.r;
import c.d.a.a.n.s;
import c.d.a.a.q;
import c.d.a.a.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class a implements A.b, g, p, s, x, InterfaceC0163f.a, c.d.a.a.d.b, r, n {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<c.d.a.a.a.b> f1469a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0171f f1470b;

    /* renamed from: c, reason: collision with root package name */
    private final M.b f1471c;

    /* renamed from: d, reason: collision with root package name */
    private final c f1472d;

    /* renamed from: e, reason: collision with root package name */
    private A f1473e;

    @Override // c.d.a.a.n.r
    public final void b() {
    }

    /* renamed from: c.d.a.a.a.a$a, reason: collision with other inner class name */
    public static class C0025a {
        public a a(A a2, InterfaceC0171f interfaceC0171f) {
            return new a(a2, interfaceC0171f);
        }
    }

    protected a(A a2, InterfaceC0171f interfaceC0171f) {
        if (a2 != null) {
            this.f1473e = a2;
        }
        AbstractC0170e.a(interfaceC0171f);
        this.f1470b = interfaceC0171f;
        this.f1469a = new CopyOnWriteArraySet<>();
        this.f1472d = new c();
        this.f1471c = new M.b();
    }

    public final void c() {
        if (this.f1472d.e()) {
            return;
        }
        b.a aVarF = f();
        this.f1472d.f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().d(aVarF);
        }
    }

    public final void d() {
        for (b bVar : new ArrayList(this.f1472d.f1477a)) {
            b(bVar.f1476c, bVar.f1474a);
        }
    }

    @Override // c.d.a.a.g.g
    public final void a(c.d.a.a.g.b bVar) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, bVar);
        }
    }

    @Override // c.d.a.a.b.p
    public final void b(e eVar) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, 1, eVar);
        }
    }

    @Override // c.d.a.a.b.p
    public final void b(String str, long j, long j2) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 1, str, j2);
        }
    }

    @Override // c.d.a.a.b.p
    public final void b(q qVar) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 1, qVar);
        }
    }

    @Override // c.d.a.a.b.p
    public final void a(int i2, long j, long j2) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarG, i2, j, j2);
        }
    }

    @Override // c.d.a.a.b.p
    public final void a(e eVar) {
        b.a aVarE = e();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarE, 1, eVar);
        }
    }

    @Override // c.d.a.a.b.p
    public final void a(int i2) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().d(aVarG, i2);
        }
    }

    @Override // c.d.a.a.b.n
    public void a(j jVar) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, jVar);
        }
    }

    @Override // c.d.a.a.b.n
    public void a(float f2) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, f2);
        }
    }

    @Override // c.d.a.a.n.s
    public final void c(e eVar) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, 2, eVar);
        }
    }

    @Override // c.d.a.a.n.s
    public final void a(String str, long j, long j2) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 2, str, j2);
        }
    }

    @Override // c.d.a.a.n.s
    public final void a(q qVar) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, 2, qVar);
        }
    }

    @Override // c.d.a.a.n.s
    public final void a(int i2, long j) {
        b.a aVarE = e();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarE, i2, j);
        }
    }

    @Override // c.d.a.a.n.s
    public final void d(e eVar) {
        b.a aVarE = e();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarE, 2, eVar);
        }
    }

    @Override // c.d.a.a.n.s
    public final void a(Surface surface) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, surface);
        }
    }

    @Override // c.d.a.a.n.s
    public final void a(int i2, int i3, int i4, float f2) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, i2, i3, i4, f2);
        }
    }

    @Override // c.d.a.a.n.r
    public void a(int i2, int i3) {
        b.a aVarG = g();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarG, i2, i3);
        }
    }

    @Override // c.d.a.a.i.x
    public final void c(int i2, w.a aVar) {
        this.f1472d.a(i2, aVar);
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().c(aVarD);
        }
    }

    @Override // c.d.a.a.i.x
    public final void b(int i2, w.a aVar) {
        b.a aVarD = d(i2, aVar);
        if (this.f1472d.b(aVar)) {
            Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
            while (it.hasNext()) {
                it.next().b(aVarD);
            }
        }
    }

    @Override // c.d.a.a.i.x
    public final void c(int i2, w.a aVar, x.b bVar, x.c cVar) {
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().c(aVarD, bVar, cVar);
        }
    }

    @Override // c.d.a.a.i.x
    public final void a(int i2, w.a aVar, x.b bVar, x.c cVar) {
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, bVar, cVar);
        }
    }

    @Override // c.d.a.a.i.x
    public final void b(int i2, w.a aVar, x.b bVar, x.c cVar) {
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarD, bVar, cVar);
        }
    }

    @Override // c.d.a.a.i.x
    public final void a(int i2, w.a aVar, x.b bVar, x.c cVar, IOException iOException, boolean z) {
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, bVar, cVar, iOException, z);
        }
    }

    @Override // c.d.a.a.i.x
    public final void a(int i2, w.a aVar) {
        this.f1472d.c(aVar);
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().e(aVarD);
        }
    }

    @Override // c.d.a.a.i.x
    public final void a(int i2, w.a aVar, x.c cVar) {
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarD, cVar);
        }
    }

    @Override // c.d.a.a.i.x
    public final void b(int i2, w.a aVar, x.c cVar) {
        b.a aVarD = d(i2, aVar);
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarD, cVar);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a(M m, Object obj, int i2) {
        this.f1472d.a(m);
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().c(aVarF, i2);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a(G g2, c.d.a.a.k.j jVar) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, g2, jVar);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a(boolean z) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, z);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a(boolean z, int i2) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, z, i2);
        }
    }

    @Override // c.d.a.a.A.b
    public final void c(int i2) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().b(aVarF, i2);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a(C0145h c0145h) {
        b.a aVarF;
        if (c0145h.f2485a == 0) {
            aVarF = h();
        } else {
            aVarF = f();
        }
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, c0145h);
        }
    }

    @Override // c.d.a.a.A.b
    public final void b(int i2) {
        this.f1472d.b(i2);
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, i2);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a(z zVar) {
        b.a aVarF = f();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarF, zVar);
        }
    }

    @Override // c.d.a.a.A.b
    public final void a() {
        if (this.f1472d.e()) {
            this.f1472d.g();
            b.a aVarF = f();
            Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
            while (it.hasNext()) {
                it.next().a(aVarF);
            }
        }
    }

    @Override // c.d.a.a.l.InterfaceC0163f.a
    public final void b(int i2, long j, long j2) {
        b.a aVarH = h();
        Iterator<c.d.a.a.a.b> it = this.f1469a.iterator();
        while (it.hasNext()) {
            it.next().a(aVarH, i2, j, j2);
        }
    }

    protected b.a a(M m, int i2, w.a aVar) {
        if (m.a()) {
            aVar = null;
        }
        w.a aVar2 = aVar;
        long jB = this.f1470b.b();
        boolean z = m == this.f1473e.f() && i2 == this.f1473e.c();
        long jA = 0;
        if (aVar2 != null && aVar2.a()) {
            if (z && this.f1473e.e() == aVar2.f3025b && this.f1473e.b() == aVar2.f3026c) {
                jA = this.f1473e.g();
            }
        } else if (z) {
            jA = this.f1473e.d();
        } else if (!m.a()) {
            jA = m.a(i2, this.f1471c).a();
        }
        return new b.a(jB, m, i2, aVar2, jA, this.f1473e.g(), this.f1473e.a());
    }

    private b.a a(b bVar) {
        AbstractC0170e.a(this.f1473e);
        if (bVar == null) {
            int iC = this.f1473e.c();
            b bVarA = this.f1472d.a(iC);
            if (bVarA == null) {
                M mF = this.f1473e.f();
                if (!(iC < mF.b())) {
                    mF = M.f1451a;
                }
                return a(mF, iC, (w.a) null);
            }
            bVar = bVarA;
        }
        return a(bVar.f1475b, bVar.f1476c, bVar.f1474a);
    }

    private b.a e() {
        return a(this.f1472d.b());
    }

    private b.a f() {
        return a(this.f1472d.a());
    }

    private b.a g() {
        return a(this.f1472d.c());
    }

    private b.a h() {
        return a(this.f1472d.d());
    }

    private b.a d(int i2, w.a aVar) {
        AbstractC0170e.a(this.f1473e);
        if (aVar != null) {
            b bVarA = this.f1472d.a(aVar);
            if (bVarA != null) {
                return a(bVarA);
            }
            return a(M.f1451a, i2, aVar);
        }
        M mF = this.f1473e.f();
        if (!(i2 < mF.b())) {
            mF = M.f1451a;
        }
        return a(mF, i2, (w.a) null);
    }

    private static final class c {

        /* renamed from: d, reason: collision with root package name */
        private b f1480d;

        /* renamed from: e, reason: collision with root package name */
        private b f1481e;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1483g;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<b> f1477a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<w.a, b> f1478b = new HashMap<>();

        /* renamed from: c, reason: collision with root package name */
        private final M.a f1479c = new M.a();

        /* renamed from: f, reason: collision with root package name */
        private M f1482f = M.f1451a;

        public b a() {
            if (this.f1477a.isEmpty() || this.f1482f.a() || this.f1483g) {
                return null;
            }
            return this.f1477a.get(0);
        }

        public b b() {
            return this.f1480d;
        }

        public b c() {
            return this.f1481e;
        }

        public b d() {
            if (this.f1477a.isEmpty()) {
                return null;
            }
            return this.f1477a.get(this.f1477a.size() - 1);
        }

        public b a(w.a aVar) {
            return this.f1478b.get(aVar);
        }

        public boolean e() {
            return this.f1483g;
        }

        public b a(int i2) {
            b bVar = null;
            for (int i3 = 0; i3 < this.f1477a.size(); i3++) {
                b bVar2 = this.f1477a.get(i3);
                int iA = this.f1482f.a(bVar2.f1474a.f3024a);
                if (iA != -1 && this.f1482f.a(iA, this.f1479c).f1454c == i2) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        public void b(int i2) {
            h();
        }

        public void a(M m) {
            for (int i2 = 0; i2 < this.f1477a.size(); i2++) {
                b bVarA = a(this.f1477a.get(i2), m);
                this.f1477a.set(i2, bVarA);
                this.f1478b.put(bVarA.f1474a, bVarA);
            }
            if (this.f1481e != null) {
                this.f1481e = a(this.f1481e, m);
            }
            this.f1482f = m;
            h();
        }

        public void f() {
            this.f1483g = true;
        }

        public void g() {
            this.f1483g = false;
            h();
        }

        public void a(int i2, w.a aVar) {
            b bVar = new b(aVar, this.f1482f.a(aVar.f3024a) != -1 ? this.f1482f : M.f1451a, i2);
            this.f1477a.add(bVar);
            this.f1478b.put(aVar, bVar);
            if (this.f1477a.size() != 1 || this.f1482f.a()) {
                return;
            }
            h();
        }

        public boolean b(w.a aVar) {
            b bVarRemove = this.f1478b.remove(aVar);
            if (bVarRemove == null) {
                return false;
            }
            this.f1477a.remove(bVarRemove);
            if (this.f1481e == null || !aVar.equals(this.f1481e.f1474a)) {
                return true;
            }
            this.f1481e = this.f1477a.isEmpty() ? null : this.f1477a.get(0);
            return true;
        }

        public void c(w.a aVar) {
            this.f1481e = this.f1478b.get(aVar);
        }

        private void h() {
            if (this.f1477a.isEmpty()) {
                return;
            }
            this.f1480d = this.f1477a.get(0);
        }

        private b a(b bVar, M m) {
            int iA = m.a(bVar.f1474a.f3024a);
            if (iA == -1) {
                return bVar;
            }
            return new b(bVar.f1474a, m, m.a(iA, this.f1479c).f1454c);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final w.a f1474a;

        /* renamed from: b, reason: collision with root package name */
        public final M f1475b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1476c;

        public b(w.a aVar, M m, int i2) {
            this.f1474a = aVar;
            this.f1475b = m;
            this.f1476c = i2;
        }
    }
}
