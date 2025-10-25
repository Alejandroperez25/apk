package c.d.a.a.i.d;

import android.net.Uri;
import android.os.SystemClock;
import c.d.a.a.i.E;
import c.d.a.a.i.d.a.d;
import c.d.a.a.l.G;
import c.d.a.a.m.H;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final h f2814a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.l.k f2815b;

    /* renamed from: c, reason: collision with root package name */
    private final c.d.a.a.l.k f2816c;

    /* renamed from: d, reason: collision with root package name */
    private final q f2817d;

    /* renamed from: e, reason: collision with root package name */
    private final d.a[] f2818e;

    /* renamed from: f, reason: collision with root package name */
    private final c.d.a.a.i.d.a.i f2819f;

    /* renamed from: g, reason: collision with root package name */
    private final E f2820g;

    /* renamed from: h, reason: collision with root package name */
    private final List<c.d.a.a.q> f2821h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2822i;
    private byte[] j;
    private IOException k;
    private d.a l;
    private boolean m;
    private Uri n;
    private byte[] o;
    private String p;
    private byte[] q;
    private c.d.a.a.k.i r;
    private long s = -9223372036854775807L;
    private boolean t;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public c.d.a.a.i.b.d f2823a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2824b;

        /* renamed from: c, reason: collision with root package name */
        public d.a f2825c;

        public b() {
            a();
        }

        public void a() {
            this.f2823a = null;
            this.f2824b = false;
            this.f2825c = null;
        }
    }

    public f(h hVar, c.d.a.a.i.d.a.i iVar, d.a[] aVarArr, g gVar, G g2, q qVar, List<c.d.a.a.q> list) {
        this.f2814a = hVar;
        this.f2819f = iVar;
        this.f2818e = aVarArr;
        this.f2817d = qVar;
        this.f2821h = list;
        c.d.a.a.q[] qVarArr = new c.d.a.a.q[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            qVarArr[i2] = aVarArr[i2].f2774b;
            iArr[i2] = i2;
        }
        this.f2815b = gVar.a(1);
        if (g2 != null) {
            this.f2815b.a(g2);
        }
        this.f2816c = gVar.a(3);
        this.f2820g = new E(qVarArr);
        this.r = new d(this.f2820g, iArr);
    }

    public void a() throws IOException {
        if (this.k != null) {
            throw this.k;
        }
        if (this.l == null || !this.t) {
            return;
        }
        this.f2819f.c(this.l);
    }

    public E b() {
        return this.f2820g;
    }

    public void a(c.d.a.a.k.i iVar) {
        this.r = iVar;
    }

    public c.d.a.a.k.i c() {
        return this.r;
    }

    public void d() {
        this.k = null;
    }

    public void a(boolean z) {
        this.f2822i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[PHI: r12
  0x0058: PHI (r12v1 long) = (r12v0 long), (r12v0 long), (r12v9 long) binds: [B:10:0x0034, B:12:0x0038, B:14:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r40, long r42, java.util.List<c.d.a.a.i.d.j> r44, c.d.a.a.i.d.f.b r45) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.d.f.a(long, long, java.util.List, c.d.a.a.i.d.f$b):void");
    }

    public void a(c.d.a.a.i.b.d dVar) {
        if (dVar instanceof a) {
            a aVar = (a) dVar;
            this.j = aVar.g();
            a(aVar.f2526a.f3417a, aVar.k, aVar.h());
        }
    }

    public boolean a(c.d.a.a.i.b.d dVar, long j) {
        return this.r.a(this.r.c(this.f2820g.a(dVar.f2528c)), j);
    }

    public boolean a(d.a aVar, long j) {
        int iC;
        int iA = this.f2820g.a(aVar.f2774b);
        if (iA == -1 || (iC = this.r.c(iA)) == -1) {
            return true;
        }
        this.t = (this.l == aVar) | this.t;
        return j == -9223372036854775807L || this.r.a(iC, j);
    }

    public c.d.a.a.i.b.n[] a(j jVar, long j) {
        int iA = jVar == null ? -1 : this.f2820g.a(jVar.f2528c);
        c.d.a.a.i.b.n[] nVarArr = new c.d.a.a.i.b.n[this.r.length()];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            int iB = this.r.b(i2);
            d.a aVar = this.f2818e[iB];
            if (!this.f2819f.b(aVar)) {
                nVarArr[i2] = c.d.a.a.i.b.n.f2569a;
            } else {
                c.d.a.a.i.d.a.e eVarA = this.f2819f.a(aVar, false);
                long jA = eVarA.f2777f - this.f2819f.a();
                long jA2 = a(jVar, iB != iA, eVarA, jA, j);
                if (jA2 < eVarA.f2780i) {
                    nVarArr[i2] = c.d.a.a.i.b.n.f2569a;
                } else {
                    nVarArr[i2] = new c(eVarA, jA, (int) (jA2 - eVarA.f2780i));
                }
            }
        }
        return nVarArr;
    }

    private long a(j jVar, boolean z, c.d.a.a.i.d.a.e eVar, long j, long j2) {
        if (jVar == null || z) {
            long j3 = eVar.p + j;
            if (jVar != null && !this.m) {
                j2 = jVar.f2531f;
            }
            if (!eVar.l && j2 >= j3) {
                return eVar.f2780i + eVar.o.size();
            }
            return H.a((List<? extends Comparable<? super Long>>) eVar.o, Long.valueOf(j2 - j), true, !this.f2819f.b() || jVar == null) + eVar.f2780i;
        }
        return jVar.g();
    }

    private long a(long j) {
        if (this.s != -9223372036854775807L) {
            return this.s - j;
        }
        return -9223372036854775807L;
    }

    private void a(c.d.a.a.i.d.a.e eVar) {
        this.s = eVar.l ? -9223372036854775807L : eVar.a() - this.f2819f.a();
    }

    private a a(Uri uri, String str, int i2, int i3, Object obj) {
        return new a(this.f2816c, new c.d.a.a.l.n(uri, 0L, -1L, null, 1), this.f2818e[i2].f2774b, i3, obj, this.j, str);
    }

    private void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(H.d(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (bArr2.length - byteArray.length) + length, byteArray.length - length);
        this.n = uri;
        this.o = bArr;
        this.p = str;
        this.q = bArr2;
    }

    private void e() {
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    private static final class d extends c.d.a.a.k.c {

        /* renamed from: g, reason: collision with root package name */
        private int f2828g;

        @Override // c.d.a.a.k.i
        public int g() {
            return 0;
        }

        @Override // c.d.a.a.k.i
        public Object h() {
            return null;
        }

        public d(E e2, int[] iArr) {
            super(e2, iArr);
            this.f2828g = a(e2.a(0));
        }

        @Override // c.d.a.a.k.i
        public void a(long j, long j2, long j3, List<? extends c.d.a.a.i.b.l> list, c.d.a.a.i.b.n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.f2828g, jElapsedRealtime)) {
                for (int i2 = this.f3288b - 1; i2 >= 0; i2--) {
                    if (!b(i2, jElapsedRealtime)) {
                        this.f2828g = i2;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // c.d.a.a.k.i
        public int b() {
            return this.f2828g;
        }
    }

    private static final class a extends c.d.a.a.i.b.j {
        public final String k;
        private byte[] l;

        public a(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, c.d.a.a.q qVar, int i2, Object obj, byte[] bArr, String str) {
            super(kVar, nVar, 3, qVar, i2, obj, bArr);
            this.k = str;
        }

        @Override // c.d.a.a.i.b.j
        protected void a(byte[] bArr, int i2) {
            this.l = Arrays.copyOf(bArr, i2);
        }

        public byte[] h() {
            return this.l;
        }
    }

    private static final class c extends c.d.a.a.i.b.b {

        /* renamed from: d, reason: collision with root package name */
        private final c.d.a.a.i.d.a.e f2826d;

        /* renamed from: e, reason: collision with root package name */
        private final long f2827e;

        public c(c.d.a.a.i.d.a.e eVar, long j, int i2) {
            super(i2, eVar.o.size() - 1);
            this.f2826d = eVar;
            this.f2827e = j;
        }
    }
}
