package c.d.a.a.e.a;

import c.d.a.a.d.f;
import c.d.a.a.e.c;
import c.d.a.a.e.g;
import c.d.a.a.e.h;
import c.d.a.a.e.i;
import c.d.a.a.e.j;
import c.d.a.a.e.n;
import c.d.a.a.e.o;
import c.d.a.a.e.q;
import c.d.a.a.m.H;
import c.d.a.a.x;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1735a = new j() { // from class: c.d.a.a.e.a.a
        @Override // c.d.a.a.e.j
        public final g[] a() {
            return b.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1736b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1737c = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f1738d = H.c("#!AMR\n");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f1739e = H.c("#!AMR-WB\n");

    /* renamed from: f, reason: collision with root package name */
    private static final int f1740f = f1737c[8];

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f1741g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1742h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1743i;
    private long j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private int o;
    private int p;
    private long q;
    private i r;
    private q s;
    private o t;
    private boolean u;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ g[] b() {
        return new g[]{new b()};
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        this.f1742h = i2;
        this.f1741g = new byte[1];
        this.o = -1;
    }

    @Override // c.d.a.a.e.g
    public boolean a(h hVar) {
        return b(hVar);
    }

    @Override // c.d.a.a.e.g
    public void a(i iVar) {
        this.r = iVar;
        this.s = iVar.a(0, 1);
        iVar.a();
    }

    @Override // c.d.a.a.e.g
    public int a(h hVar, n nVar) throws x {
        if (hVar.c() == 0 && !b(hVar)) {
            throw new x("Could not find AMR header.");
        }
        c();
        int iC = c(hVar);
        a(hVar.getLength(), iC);
        return iC;
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.j = 0L;
        this.k = 0;
        this.l = 0;
        if (j != 0 && (this.t instanceof c)) {
            this.q = ((c) this.t).c(j);
        } else {
            this.q = 0L;
        }
    }

    private boolean b(h hVar) {
        if (a(hVar, f1738d)) {
            this.f1743i = false;
            hVar.c(f1738d.length);
            return true;
        }
        if (!a(hVar, f1739e)) {
            return false;
        }
        this.f1743i = true;
        hVar.c(f1739e.length);
        return true;
    }

    private boolean a(h hVar, byte[] bArr) {
        hVar.b();
        byte[] bArr2 = new byte[bArr.length];
        hVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private void c() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.s.a(c.d.a.a.q.a((String) null, this.f1743i ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, f1740f, 1, this.f1743i ? 16000 : 8000, -1, (List<byte[]>) null, (f) null, 0, (String) null));
    }

    private int c(h hVar) {
        if (this.l == 0) {
            try {
                this.k = d(hVar);
                this.l = this.k;
                if (this.o == -1) {
                    this.n = hVar.c();
                    this.o = this.k;
                }
                if (this.o == this.k) {
                    this.p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.s.a(hVar, this.l, true);
        if (iA == -1) {
            return -1;
        }
        this.l -= iA;
        if (this.l > 0) {
            return 0;
        }
        this.s.a(this.q + this.j, 1, this.k, 0, null);
        this.j += 20000;
        return 0;
    }

    private int d(h hVar) throws x {
        hVar.b();
        hVar.a(this.f1741g, 0, 1);
        byte b2 = this.f1741g[0];
        if ((b2 & 131) > 0) {
            throw new x("Invalid padding bits for frame header " + ((int) b2));
        }
        return a((b2 >> 3) & 15);
    }

    private int a(int i2) throws x {
        if (b(i2)) {
            return this.f1743i ? f1737c[i2] : f1736b[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f1743i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw new x(sb.toString());
    }

    private boolean b(int i2) {
        return i2 >= 0 && i2 <= 15 && (c(i2) || d(i2));
    }

    private boolean c(int i2) {
        return this.f1743i && (i2 < 10 || i2 > 13);
    }

    private boolean d(int i2) {
        return !this.f1743i && (i2 < 12 || i2 > 14);
    }

    private void a(long j, int i2) {
        if (this.m) {
            return;
        }
        if ((this.f1742h & 1) == 0 || j == -1 || (this.o != -1 && this.o != this.k)) {
            this.t = new o.b(-9223372036854775807L);
            this.r.a(this.t);
            this.m = true;
        } else if (this.p >= 20 || i2 == -1) {
            this.t = a(j);
            this.r.a(this.t);
            this.m = true;
        }
    }

    private o a(long j) {
        return new c(j, this.n, a(this.o, 20000L), this.o);
    }

    private static int a(int i2, long j) {
        return (int) (((i2 * 8) * 1000000) / j);
    }
}
