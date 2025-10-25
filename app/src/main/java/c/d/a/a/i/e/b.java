package c.d.a.a.i.e;

import android.net.Uri;
import c.d.a.a.I;
import c.d.a.a.e.e.h;
import c.d.a.a.e.e.o;
import c.d.a.a.i.b.l;
import c.d.a.a.i.b.n;
import c.d.a.a.i.e.a.a;
import c.d.a.a.i.e.c;
import c.d.a.a.i.m;
import c.d.a.a.k.i;
import c.d.a.a.l.C;
import c.d.a.a.l.G;
import c.d.a.a.l.k;
import c.d.a.a.m.H;
import c.d.a.a.q;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final C f2919a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2920b;

    /* renamed from: c, reason: collision with root package name */
    private final i f2921c;

    /* renamed from: d, reason: collision with root package name */
    private final c.d.a.a.i.b.e[] f2922d;

    /* renamed from: e, reason: collision with root package name */
    private final k f2923e;

    /* renamed from: f, reason: collision with root package name */
    private c.d.a.a.i.e.a.a f2924f;

    /* renamed from: g, reason: collision with root package name */
    private int f2925g;

    /* renamed from: h, reason: collision with root package name */
    private IOException f2926h;

    @Override // c.d.a.a.i.b.h
    public void a(c.d.a.a.i.b.d dVar) {
    }

    public static final class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private final k.a f2927a;

        public a(k.a aVar) {
            this.f2927a = aVar;
        }

        @Override // c.d.a.a.i.e.c.a
        public c a(C c2, c.d.a.a.i.e.a.a aVar, int i2, i iVar, G g2) {
            k kVarA = this.f2927a.a();
            if (g2 != null) {
                kVarA.a(g2);
            }
            return new b(c2, aVar, i2, iVar, kVarA);
        }
    }

    public b(C c2, c.d.a.a.i.e.a.a aVar, int i2, i iVar, k kVar) {
        this.f2919a = c2;
        this.f2924f = aVar;
        this.f2920b = i2;
        this.f2921c = iVar;
        this.f2923e = kVar;
        a.b bVar = aVar.f2885f[i2];
        this.f2922d = new c.d.a.a.i.b.e[iVar.length()];
        int i3 = 0;
        while (i3 < this.f2922d.length) {
            int iB = iVar.b(i3);
            q qVar = bVar.j[iB];
            int i4 = i3;
            this.f2922d[i4] = new c.d.a.a.i.b.e(new h(3, null, new o(iB, bVar.f2891a, bVar.f2893c, -9223372036854775807L, aVar.f2886g, qVar, 0, qVar.j != null ? aVar.f2884e.f2890c : null, bVar.f2891a == 2 ? 4 : 0, null, null), null), bVar.f2891a, qVar);
            i3 = i4 + 1;
        }
    }

    @Override // c.d.a.a.i.b.h
    public long a(long j, I i2) {
        a.b bVar = this.f2924f.f2885f[this.f2920b];
        int iA = bVar.a(j);
        long jA = bVar.a(iA);
        return H.a(j, i2, jA, (jA >= j || iA >= bVar.k + (-1)) ? jA : bVar.a(iA + 1));
    }

    @Override // c.d.a.a.i.e.c
    public void a(c.d.a.a.i.e.a.a aVar) {
        a.b bVar = this.f2924f.f2885f[this.f2920b];
        int i2 = bVar.k;
        a.b bVar2 = aVar.f2885f[this.f2920b];
        if (i2 == 0 || bVar2.k == 0) {
            this.f2925g += i2;
        } else {
            int i3 = i2 - 1;
            long jA = bVar.a(i3) + bVar.b(i3);
            long jA2 = bVar2.a(0);
            if (jA <= jA2) {
                this.f2925g += i2;
            } else {
                this.f2925g += bVar.a(jA2);
            }
        }
        this.f2924f = aVar;
    }

    @Override // c.d.a.a.i.b.h
    public void a() throws IOException {
        if (this.f2926h != null) {
            throw this.f2926h;
        }
        this.f2919a.a();
    }

    @Override // c.d.a.a.i.b.h
    public int a(long j, List<? extends l> list) {
        if (this.f2926h != null || this.f2921c.length() < 2) {
            return list.size();
        }
        return this.f2921c.a(j, list);
    }

    @Override // c.d.a.a.i.b.h
    public final void a(long j, long j2, List<? extends l> list, c.d.a.a.i.b.f fVar) {
        int iG;
        if (this.f2926h != null) {
            return;
        }
        a.b bVar = this.f2924f.f2885f[this.f2920b];
        if (bVar.k == 0) {
            fVar.f2551b = !this.f2924f.f2883d;
            return;
        }
        if (list.isEmpty()) {
            iG = bVar.a(j2);
        } else {
            iG = (int) (list.get(list.size() - 1).g() - this.f2925g);
            if (iG < 0) {
                this.f2926h = new m();
                return;
            }
        }
        if (iG >= bVar.k) {
            fVar.f2551b = !this.f2924f.f2883d;
            return;
        }
        long j3 = j2 - j;
        long jA = a(j);
        n[] nVarArr = new n[this.f2921c.length()];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            nVarArr[i2] = new C0034b(bVar, this.f2921c.b(i2), iG);
        }
        this.f2921c.a(j, j3, jA, list, nVarArr);
        long jA2 = bVar.a(iG);
        long jB = jA2 + bVar.b(iG);
        long j4 = list.isEmpty() ? j2 : -9223372036854775807L;
        int i3 = iG + this.f2925g;
        int iB = this.f2921c.b();
        fVar.f2550a = a(this.f2921c.f(), this.f2923e, bVar.a(this.f2921c.b(iB), iG), null, i3, jA2, jB, j4, this.f2921c.g(), this.f2921c.h(), this.f2922d[iB]);
    }

    @Override // c.d.a.a.i.b.h
    public boolean a(c.d.a.a.i.b.d dVar, boolean z, Exception exc, long j) {
        return z && j != -9223372036854775807L && this.f2921c.a(this.f2921c.a(dVar.f2528c), j);
    }

    private static l a(q qVar, k kVar, Uri uri, String str, int i2, long j, long j2, long j3, int i3, Object obj, c.d.a.a.i.b.e eVar) {
        return new c.d.a.a.i.b.i(kVar, new c.d.a.a.l.n(uri, 0L, -1L, str), qVar, i3, obj, j, j2, j3, -9223372036854775807L, i2, 1, j, eVar);
    }

    private long a(long j) {
        if (!this.f2924f.f2883d) {
            return -9223372036854775807L;
        }
        a.b bVar = this.f2924f.f2885f[this.f2920b];
        int i2 = bVar.k - 1;
        return (bVar.a(i2) + bVar.b(i2)) - j;
    }

    /* renamed from: c.d.a.a.i.e.b$b, reason: collision with other inner class name */
    private static final class C0034b extends c.d.a.a.i.b.b {

        /* renamed from: d, reason: collision with root package name */
        private final a.b f2928d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2929e;

        public C0034b(a.b bVar, int i2, int i3) {
            super(i3, bVar.k - 1);
            this.f2928d = bVar;
            this.f2929e = i2;
        }
    }
}
