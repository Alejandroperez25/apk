package c.d.a.a.i.c;

import android.os.SystemClock;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.I;
import c.d.a.a.e.o;
import c.d.a.a.i.b.n;
import c.d.a.a.i.c.c;
import c.d.a.a.i.c.l;
import c.d.a.a.i.m;
import c.d.a.a.l.C;
import c.d.a.a.l.G;
import c.d.a.a.l.k;
import c.d.a.a.l.y;
import c.d.a.a.m.H;
import c.d.a.a.m.r;
import c.d.a.a.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class j implements c.d.a.a.i.c.c {

    /* renamed from: a, reason: collision with root package name */
    private final C f2702a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f2703b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.k.i f2704c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2705d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.a.a.l.k f2706e;

    /* renamed from: f, reason: collision with root package name */
    private final long f2707f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2708g;

    /* renamed from: h, reason: collision with root package name */
    private final l.c f2709h;

    /* renamed from: i, reason: collision with root package name */
    protected final b[] f2710i;
    private c.d.a.a.i.c.a.b j;
    private int k;
    private IOException l;
    private boolean m;
    private long n;

    public static final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final k.a f2711a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2712b;

        public a(k.a aVar) {
            this(aVar, 1);
        }

        public a(k.a aVar, int i2) {
            this.f2711a = aVar;
            this.f2712b = i2;
        }

        @Override // c.d.a.a.i.c.c.a
        public c.d.a.a.i.c.c a(C c2, c.d.a.a.i.c.a.b bVar, int i2, int[] iArr, c.d.a.a.k.i iVar, int i3, long j, boolean z, boolean z2, l.c cVar, G g2) {
            c.d.a.a.l.k kVarA = this.f2711a.a();
            if (g2 != null) {
                kVarA.a(g2);
            }
            return new j(c2, bVar, i2, iArr, iVar, i3, kVarA, j, this.f2712b, z, z2, cVar);
        }
    }

    public j(C c2, c.d.a.a.i.c.a.b bVar, int i2, int[] iArr, c.d.a.a.k.i iVar, int i3, c.d.a.a.l.k kVar, long j, int i4, boolean z, boolean z2, l.c cVar) {
        this.f2702a = c2;
        this.j = bVar;
        this.f2703b = iArr;
        this.f2704c = iVar;
        this.f2705d = i3;
        this.f2706e = kVar;
        this.k = i2;
        this.f2707f = j;
        this.f2708g = i4;
        this.f2709h = cVar;
        long jC = bVar.c(i2);
        this.n = -9223372036854775807L;
        ArrayList<c.d.a.a.i.c.a.j> arrayListB = b();
        this.f2710i = new b[iVar.length()];
        for (int i5 = 0; i5 < this.f2710i.length; i5++) {
            this.f2710i[i5] = new b(jC, i3, arrayListB.get(iVar.b(i5)), z, z2, cVar);
        }
    }

    @Override // c.d.a.a.i.b.h
    public long a(long j, I i2) {
        for (b bVar : this.f2710i) {
            if (bVar.f2715c != null) {
                long jC = bVar.c(j);
                long jA = bVar.a(jC);
                return H.a(j, i2, jA, (jA >= j || jC >= ((long) (bVar.b() + (-1)))) ? jA : bVar.a(jC + 1));
            }
        }
        return j;
    }

    @Override // c.d.a.a.i.c.c
    public void a(c.d.a.a.i.c.a.b bVar, int i2) {
        try {
            this.j = bVar;
            this.k = i2;
            long jC = this.j.c(this.k);
            ArrayList<c.d.a.a.i.c.a.j> arrayListB = b();
            for (int i3 = 0; i3 < this.f2710i.length; i3++) {
                this.f2710i[i3] = this.f2710i[i3].a(jC, arrayListB.get(this.f2704c.b(i3)));
            }
        } catch (m e2) {
            this.l = e2;
        }
    }

    @Override // c.d.a.a.i.b.h
    public void a() throws IOException {
        if (this.l != null) {
            throw this.l;
        }
        this.f2702a.a();
    }

    @Override // c.d.a.a.i.b.h
    public int a(long j, List<? extends c.d.a.a.i.b.l> list) {
        if (this.l != null || this.f2704c.length() < 2) {
            return list.size();
        }
        return this.f2704c.a(j, list);
    }

    @Override // c.d.a.a.i.b.h
    public void a(long j, long j2, List<? extends c.d.a.a.i.b.l> list, c.d.a.a.i.b.f fVar) {
        int i2;
        n[] nVarArr;
        long j3;
        if (this.l != null) {
            return;
        }
        long j4 = j2 - j;
        long jA = a(j);
        long jB = AbstractC0132d.b(this.j.f2582a) + AbstractC0132d.b(this.j.a(this.k).f2612b) + j2;
        if (this.f2709h == null || !this.f2709h.a(jB)) {
            long jC = c();
            c.d.a.a.i.b.l lVar = list.isEmpty() ? null : list.get(list.size() - 1);
            n[] nVarArr2 = new n[this.f2704c.length()];
            int i3 = 0;
            while (i3 < nVarArr2.length) {
                b bVar = this.f2710i[i3];
                if (bVar.f2715c == null) {
                    nVarArr2[i3] = n.f2569a;
                    i2 = i3;
                    nVarArr = nVarArr2;
                    j3 = jC;
                } else {
                    long jA2 = bVar.a(this.j, this.k, jC);
                    long jB2 = bVar.b(this.j, this.k, jC);
                    i2 = i3;
                    nVarArr = nVarArr2;
                    j3 = jC;
                    long jA3 = a(bVar, lVar, j2, jA2, jB2);
                    if (jA3 < jA2) {
                        nVarArr[i2] = n.f2569a;
                    } else {
                        nVarArr[i2] = new c(bVar, jA3, jB2);
                    }
                }
                i3 = i2 + 1;
                nVarArr2 = nVarArr;
                jC = j3;
            }
            long j5 = jC;
            this.f2704c.a(j, j4, jA, list, nVarArr2);
            b bVar2 = this.f2710i[this.f2704c.b()];
            if (bVar2.f2713a != null) {
                c.d.a.a.i.c.a.j jVar = bVar2.f2714b;
                c.d.a.a.i.c.a.h hVarC = bVar2.f2713a.c() == null ? jVar.c() : null;
                c.d.a.a.i.c.a.h hVarD = bVar2.f2715c == null ? jVar.d() : null;
                if (hVarC != null || hVarD != null) {
                    fVar.f2550a = a(bVar2, this.f2706e, this.f2704c.f(), this.f2704c.g(), this.f2704c.h(), hVarC, hVarD);
                    return;
                }
            }
            long j6 = bVar2.f2716d;
            boolean z = j6 != -9223372036854775807L;
            if (bVar2.b() == 0) {
                fVar.f2551b = z;
                return;
            }
            long jA4 = bVar2.a(this.j, this.k, j5);
            long jB3 = bVar2.b(this.j, this.k, j5);
            a(bVar2, jB3);
            boolean z2 = z;
            long jA5 = a(bVar2, lVar, j2, jA4, jB3);
            if (jA5 < jA4) {
                this.l = new m();
                return;
            }
            if (jA5 > jB3 || (this.m && jA5 >= jB3)) {
                fVar.f2551b = z2;
                return;
            }
            if (z2 && bVar2.a(jA5) >= j6) {
                fVar.f2551b = true;
                return;
            }
            int iMin = (int) Math.min(this.f2708g, (jB3 - jA5) + 1);
            if (j6 != -9223372036854775807L) {
                while (iMin > 1 && bVar2.a((iMin + jA5) - 1) >= j6) {
                    iMin--;
                }
            }
            fVar.f2550a = a(bVar2, this.f2706e, this.f2705d, this.f2704c.f(), this.f2704c.g(), this.f2704c.h(), jA5, iMin, list.isEmpty() ? j2 : -9223372036854775807L);
        }
    }

    @Override // c.d.a.a.i.b.h
    public void a(c.d.a.a.i.b.d dVar) {
        o oVarB;
        if (dVar instanceof c.d.a.a.i.b.k) {
            int iA = this.f2704c.a(((c.d.a.a.i.b.k) dVar).f2528c);
            b bVar = this.f2710i[iA];
            if (bVar.f2715c == null && (oVarB = bVar.f2713a.b()) != null) {
                this.f2710i[iA] = bVar.a(new i((c.d.a.a.e.b) oVarB, bVar.f2714b.f2628e));
            }
        }
        if (this.f2709h != null) {
            this.f2709h.a(dVar);
        }
    }

    @Override // c.d.a.a.i.b.h
    public boolean a(c.d.a.a.i.b.d dVar, boolean z, Exception exc, long j) {
        b bVar;
        int iB;
        if (!z) {
            return false;
        }
        if (this.f2709h != null && this.f2709h.b(dVar)) {
            return true;
        }
        if (!this.j.f2585d && (dVar instanceof c.d.a.a.i.b.l) && (exc instanceof y.e) && ((y.e) exc).f3481c == 404 && (iB = (bVar = this.f2710i[this.f2704c.a(dVar.f2528c)]).b()) != -1 && iB != 0) {
            if (((c.d.a.a.i.b.l) dVar).g() > (bVar.a() + iB) - 1) {
                this.m = true;
                return true;
            }
        }
        return j != -9223372036854775807L && this.f2704c.a(this.f2704c.a(dVar.f2528c), j);
    }

    private long a(b bVar, c.d.a.a.i.b.l lVar, long j, long j2, long j3) {
        if (lVar != null) {
            return lVar.g();
        }
        return H.a(bVar.c(j), j2, j3);
    }

    private ArrayList<c.d.a.a.i.c.a.j> b() {
        List<c.d.a.a.i.c.a.a> list = this.j.a(this.k).f2613c;
        ArrayList<c.d.a.a.i.c.a.j> arrayList = new ArrayList<>();
        for (int i2 : this.f2703b) {
            arrayList.addAll(list.get(i2).f2579c);
        }
        return arrayList;
    }

    private void a(b bVar, long j) {
        this.n = this.j.f2585d ? bVar.b(j) : -9223372036854775807L;
    }

    private long c() {
        if (this.f2707f != 0) {
            return (SystemClock.elapsedRealtime() + this.f2707f) * 1000;
        }
        return System.currentTimeMillis() * 1000;
    }

    private long a(long j) {
        if (this.j.f2585d && this.n != -9223372036854775807L) {
            return this.n - j;
        }
        return -9223372036854775807L;
    }

    protected c.d.a.a.i.b.d a(b bVar, c.d.a.a.l.k kVar, q qVar, int i2, Object obj, c.d.a.a.i.c.a.h hVar, c.d.a.a.i.c.a.h hVar2) {
        String str = bVar.f2714b.f2627d;
        if (hVar != null && (hVar2 = hVar.a(hVar2, str)) == null) {
            hVar2 = hVar;
        }
        return new c.d.a.a.i.b.k(kVar, new c.d.a.a.l.n(hVar2.a(str), hVar2.f2620a, hVar2.f2621b, bVar.f2714b.f()), qVar, i2, obj, bVar.f2713a);
    }

    protected c.d.a.a.i.b.d a(b bVar, c.d.a.a.l.k kVar, int i2, q qVar, int i3, Object obj, long j, int i4, long j2) {
        c.d.a.a.i.c.a.j jVar = bVar.f2714b;
        long jA = bVar.a(j);
        c.d.a.a.i.c.a.h hVarD = bVar.d(j);
        String str = jVar.f2627d;
        if (bVar.f2713a == null) {
            return new c.d.a.a.i.b.o(kVar, new c.d.a.a.l.n(hVarD.a(str), hVarD.f2620a, hVarD.f2621b, jVar.f()), qVar, i3, obj, jA, bVar.b(j), j, i2, qVar);
        }
        int i5 = 1;
        c.d.a.a.i.c.a.h hVar = hVarD;
        int i6 = 1;
        while (i5 < i4) {
            c.d.a.a.i.c.a.h hVarA = hVar.a(bVar.d(i5 + j), str);
            if (hVarA == null) {
                break;
            }
            i6++;
            i5++;
            hVar = hVarA;
        }
        long jB = bVar.b((i6 + j) - 1);
        long j3 = bVar.f2716d;
        return new c.d.a.a.i.b.i(kVar, new c.d.a.a.l.n(hVar.a(str), hVar.f2620a, hVar.f2621b, jVar.f()), qVar, i3, obj, jA, jB, j2, (j3 == -9223372036854775807L || j3 > jB) ? -9223372036854775807L : j3, j, i6, -jVar.f2628e, bVar.f2713a);
    }

    protected static final class c extends c.d.a.a.i.b.b {

        /* renamed from: d, reason: collision with root package name */
        private final b f2718d;

        public c(b bVar, long j, long j2) {
            super(j, j2);
            this.f2718d = bVar;
        }
    }

    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        final c.d.a.a.i.b.e f2713a;

        /* renamed from: b, reason: collision with root package name */
        public final c.d.a.a.i.c.a.j f2714b;

        /* renamed from: c, reason: collision with root package name */
        public final h f2715c;

        /* renamed from: d, reason: collision with root package name */
        private final long f2716d;

        /* renamed from: e, reason: collision with root package name */
        private final long f2717e;

        b(long j, int i2, c.d.a.a.i.c.a.j jVar, boolean z, boolean z2, c.d.a.a.e.q qVar) {
            this(j, jVar, a(i2, jVar, z, z2, qVar), 0L, jVar.e());
        }

        private b(long j, c.d.a.a.i.c.a.j jVar, c.d.a.a.i.b.e eVar, long j2, h hVar) {
            this.f2716d = j;
            this.f2714b = jVar;
            this.f2717e = j2;
            this.f2713a = eVar;
            this.f2715c = hVar;
        }

        b a(long j, c.d.a.a.i.c.a.j jVar) throws m {
            long jB;
            h hVarE = this.f2714b.e();
            h hVarE2 = jVar.e();
            if (hVarE == null) {
                return new b(j, jVar, this.f2713a, this.f2717e, hVarE);
            }
            if (!hVarE.a()) {
                return new b(j, jVar, this.f2713a, this.f2717e, hVarE2);
            }
            int iC = hVarE.c(j);
            if (iC == 0) {
                return new b(j, jVar, this.f2713a, this.f2717e, hVarE2);
            }
            long jB2 = (hVarE.b() + iC) - 1;
            long jA = hVarE.a(jB2) + hVarE.a(jB2, j);
            long jB3 = hVarE2.b();
            long jA2 = hVarE2.a(jB3);
            long j2 = this.f2717e;
            if (jA == jA2) {
                jB = j2 + ((jB2 + 1) - jB3);
            } else {
                if (jA < jA2) {
                    throw new m();
                }
                jB = j2 + (hVarE.b(jA2, j) - jB3);
            }
            return new b(j, jVar, this.f2713a, jB, hVarE2);
        }

        b a(h hVar) {
            return new b(this.f2716d, this.f2714b, this.f2713a, this.f2717e, hVar);
        }

        public long a() {
            return this.f2715c.b() + this.f2717e;
        }

        public int b() {
            return this.f2715c.c(this.f2716d);
        }

        public long a(long j) {
            return this.f2715c.a(j - this.f2717e);
        }

        public long b(long j) {
            return a(j) + this.f2715c.a(j - this.f2717e, this.f2716d);
        }

        public long c(long j) {
            return this.f2715c.b(j, this.f2716d) + this.f2717e;
        }

        public c.d.a.a.i.c.a.h d(long j) {
            return this.f2715c.b(j - this.f2717e);
        }

        public long a(c.d.a.a.i.c.a.b bVar, int i2, long j) {
            if (b() == -1 && bVar.f2587f != -9223372036854775807L) {
                return Math.max(a(), c(((j - AbstractC0132d.b(bVar.f2582a)) - AbstractC0132d.b(bVar.a(i2).f2612b)) - AbstractC0132d.b(bVar.f2587f)));
            }
            return a();
        }

        public long b(c.d.a.a.i.c.a.b bVar, int i2, long j) {
            int iB = b();
            if (iB == -1) {
                return c((j - AbstractC0132d.b(bVar.f2582a)) - AbstractC0132d.b(bVar.a(i2).f2612b)) - 1;
            }
            return (a() + iB) - 1;
        }

        private static boolean a(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        private static boolean b(String str) {
            return r.c(str) || "application/ttml+xml".equals(str);
        }

        private static c.d.a.a.i.b.e a(int i2, c.d.a.a.i.c.a.j jVar, boolean z, boolean z2, c.d.a.a.e.q qVar) {
            List listEmptyList;
            c.d.a.a.e.g hVar;
            String str = jVar.f2626c.f3681f;
            if (b(str)) {
                return null;
            }
            if ("application/x-rawcc".equals(str)) {
                hVar = new c.d.a.a.e.g.a(jVar.f2626c);
            } else if (a(str)) {
                hVar = new c.d.a.a.e.c.g(1);
            } else {
                int i3 = z ? 4 : 0;
                if (z2) {
                    listEmptyList = Collections.singletonList(q.a(null, "application/cea-608", 0, null));
                } else {
                    listEmptyList = Collections.emptyList();
                }
                hVar = new c.d.a.a.e.e.h(i3, null, null, null, listEmptyList, qVar);
            }
            return new c.d.a.a.i.b.e(hVar, i2, jVar.f2626c);
        }
    }
}
