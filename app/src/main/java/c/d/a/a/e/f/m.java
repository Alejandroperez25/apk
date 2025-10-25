package c.d.a.a.e.f;

import c.d.a.a.e.f.k;
import c.d.a.a.e.f.n;
import c.d.a.a.m.u;
import c.d.a.a.q;
import c.d.a.a.x;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class m extends k {
    private a n;
    private int o;
    private boolean p;
    private n.d q;
    private n.b r;

    static int a(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    m() {
    }

    public static boolean b(u uVar) {
        try {
            return n.a(1, uVar, true);
        } catch (x unused) {
            return false;
        }
    }

    @Override // c.d.a.a.e.f.k
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // c.d.a.a.e.f.k
    protected void c(long j) {
        super.c(j);
        this.p = j != 0;
        this.o = this.q != null ? this.q.f2077g : 0;
    }

    @Override // c.d.a.a.e.f.k
    protected long a(u uVar) {
        if ((uVar.f3567a[0] & 1) == 1) {
            return -1L;
        }
        int iA = a(uVar.f3567a[0], this.n);
        long j = this.p ? (this.o + iA) / 4 : 0;
        a(uVar, j);
        this.p = true;
        this.o = iA;
        return j;
    }

    @Override // c.d.a.a.e.f.k
    protected boolean a(u uVar, long j, k.a aVar) {
        if (this.n != null) {
            return false;
        }
        this.n = c(uVar);
        if (this.n == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.f2054a.j);
        arrayList.add(this.n.f2056c);
        aVar.f2048a = q.a((String) null, "audio/vorbis", (String) null, this.n.f2054a.f2075e, -1, this.n.f2054a.f2072b, (int) this.n.f2054a.f2073c, arrayList, (c.d.a.a.d.f) null, 0, (String) null);
        return true;
    }

    a c(u uVar) throws x {
        if (this.q == null) {
            this.q = n.a(uVar);
            return null;
        }
        if (this.r == null) {
            this.r = n.b(uVar);
            return null;
        }
        byte[] bArr = new byte[uVar.c()];
        System.arraycopy(uVar.f3567a, 0, bArr, 0, uVar.c());
        return new a(this.q, this.r, bArr, n.a(uVar, this.q.f2072b), n.a(r5.length - 1));
    }

    static void a(u uVar, long j) {
        uVar.b(uVar.c() + 4);
        uVar.f3567a[uVar.c() - 4] = (byte) (j & 255);
        uVar.f3567a[uVar.c() - 3] = (byte) ((j >>> 8) & 255);
        uVar.f3567a[uVar.c() - 2] = (byte) ((j >>> 16) & 255);
        uVar.f3567a[uVar.c() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int a(byte b2, a aVar) {
        if (!aVar.f2057d[a(b2, aVar.f2058e, 1)].f2067a) {
            return aVar.f2054a.f2077g;
        }
        return aVar.f2054a.f2078h;
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n.d f2054a;

        /* renamed from: b, reason: collision with root package name */
        public final n.b f2055b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f2056c;

        /* renamed from: d, reason: collision with root package name */
        public final n.c[] f2057d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2058e;

        public a(n.d dVar, n.b bVar, byte[] bArr, n.c[] cVarArr, int i2) {
            this.f2054a = dVar;
            this.f2055b = bVar;
            this.f2056c = bArr;
            this.f2057d = cVarArr;
            this.f2058e = i2;
        }
    }
}
