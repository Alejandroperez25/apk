package c.d.a.a.i;

import c.d.a.a.e.q;
import c.d.a.a.i.y;
import c.d.a.a.l.C0160c;
import c.d.a.a.l.InterfaceC0161d;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class z implements c.d.a.a.e.q {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0161d f3060a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3061b;

    /* renamed from: c, reason: collision with root package name */
    private final y f3062c = new y();

    /* renamed from: d, reason: collision with root package name */
    private final y.a f3063d = new y.a();

    /* renamed from: e, reason: collision with root package name */
    private final c.d.a.a.m.u f3064e = new c.d.a.a.m.u(32);

    /* renamed from: f, reason: collision with root package name */
    private a f3065f;

    /* renamed from: g, reason: collision with root package name */
    private a f3066g;

    /* renamed from: h, reason: collision with root package name */
    private a f3067h;

    /* renamed from: i, reason: collision with root package name */
    private c.d.a.a.q f3068i;
    private boolean j;
    private c.d.a.a.q k;
    private long l;
    private long m;
    private boolean n;
    private b o;

    public interface b {
        void a(c.d.a.a.q qVar);
    }

    public z(InterfaceC0161d interfaceC0161d) {
        this.f3060a = interfaceC0161d;
        this.f3061b = interfaceC0161d.c();
        this.f3065f = new a(0L, this.f3061b);
        this.f3066g = this.f3065f;
        this.f3067h = this.f3065f;
    }

    public void a() {
        a(false);
    }

    public void a(boolean z) {
        this.f3062c.a(z);
        a(this.f3065f);
        this.f3065f = new a(0L, this.f3061b);
        this.f3066g = this.f3065f;
        this.f3067h = this.f3065f;
        this.m = 0L;
        this.f3060a.b();
    }

    public void a(int i2) {
        this.f3062c.b(i2);
    }

    public void b() {
        this.n = true;
    }

    public int c() {
        return this.f3062c.a();
    }

    public void b(int i2) {
        this.m = this.f3062c.a(i2);
        if (this.m == 0 || this.m == this.f3065f.f3069a) {
            a(this.f3065f);
            this.f3065f = new a(this.m, this.f3061b);
            this.f3066g = this.f3065f;
            this.f3067h = this.f3065f;
            return;
        }
        a aVar = this.f3065f;
        while (this.m > aVar.f3070b) {
            aVar = aVar.f3073e;
        }
        a aVar2 = aVar.f3073e;
        a(aVar2);
        aVar.f3073e = new a(aVar.f3070b, this.f3061b);
        this.f3067h = this.m == aVar.f3070b ? aVar.f3073e : aVar;
        if (this.f3066g == aVar2) {
            this.f3066g = aVar.f3073e;
        }
    }

    public boolean d() {
        return this.f3062c.e();
    }

    public int e() {
        return this.f3062c.b();
    }

    public int f() {
        return this.f3062c.c();
    }

    public int g() {
        return this.f3062c.d();
    }

    public c.d.a.a.q h() {
        return this.f3062c.f();
    }

    public long i() {
        return this.f3062c.g();
    }

    public boolean j() {
        return this.f3062c.h();
    }

    public long k() {
        return this.f3062c.i();
    }

    public void l() {
        this.f3062c.j();
        this.f3066g = this.f3065f;
    }

    public void a(long j, boolean z, boolean z2) {
        c(this.f3062c.b(j, z, z2));
    }

    public void m() {
        c(this.f3062c.l());
    }

    public void n() {
        c(this.f3062c.m());
    }

    public int o() {
        return this.f3062c.k();
    }

    public int b(long j, boolean z, boolean z2) {
        return this.f3062c.a(j, z, z2);
    }

    public boolean c(int i2) {
        return this.f3062c.c(i2);
    }

    public int a(c.d.a.a.r rVar, c.d.a.a.c.f fVar, boolean z, boolean z2, long j) {
        switch (this.f3062c.a(rVar, fVar, z, z2, this.f3068i, this.f3063d)) {
            case -5:
                this.f3068i = rVar.f3685a;
                return -5;
            case -4:
                if (fVar.d()) {
                    return -4;
                }
                if (fVar.f1685d < j) {
                    fVar.c(Integer.MIN_VALUE);
                }
                if (fVar.k()) {
                    a(fVar, this.f3063d);
                }
                fVar.f(this.f3063d.f3057a);
                a(this.f3063d.f3058b, fVar.f1684c, this.f3063d.f3057a);
                return -4;
            case -3:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    private void a(c.d.a.a.c.f fVar, y.a aVar) {
        int i2;
        long j = aVar.f3058b;
        this.f3064e.a(1);
        a(j, this.f3064e.f3567a, 1);
        long j2 = j + 1;
        byte b2 = this.f3064e.f3567a[0];
        boolean z = (b2 & 128) != 0;
        int i3 = b2 & 127;
        if (fVar.f1683b.f1663a == null) {
            fVar.f1683b.f1663a = new byte[16];
        }
        a(j2, fVar.f1683b.f1663a, i3);
        long j3 = j2 + i3;
        if (z) {
            this.f3064e.a(2);
            a(j3, this.f3064e.f3567a, 2);
            j3 += 2;
            i2 = this.f3064e.i();
        } else {
            i2 = 1;
        }
        int[] iArr = fVar.f1683b.f1666d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = fVar.f1683b.f1667e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i2 * 6;
            this.f3064e.a(i4);
            a(j3, this.f3064e.f3567a, i4);
            j3 += i4;
            this.f3064e.c(0);
            for (int i5 = 0; i5 < i2; i5++) {
                iArr2[i5] = this.f3064e.i();
                iArr4[i5] = this.f3064e.v();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f3057a - ((int) (j3 - aVar.f3058b));
        }
        q.a aVar2 = aVar.f3059c;
        fVar.f1683b.a(i2, iArr2, iArr4, aVar2.f2358b, fVar.f1683b.f1663a, aVar2.f2357a, aVar2.f2359c, aVar2.f2360d);
        int i6 = (int) (j3 - aVar.f3058b);
        aVar.f3058b += i6;
        aVar.f3057a -= i6;
    }

    private void a(long j, ByteBuffer byteBuffer, int i2) {
        b(j);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.f3066g.f3070b - j));
            byteBuffer.put(this.f3066g.f3072d.f3391a, this.f3066g.a(j), iMin);
            i2 -= iMin;
            j += iMin;
            if (j == this.f3066g.f3070b) {
                this.f3066g = this.f3066g.f3073e;
            }
        }
    }

    private void a(long j, byte[] bArr, int i2) {
        b(j);
        long j2 = j;
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (this.f3066g.f3070b - j2));
            System.arraycopy(this.f3066g.f3072d.f3391a, this.f3066g.a(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += iMin;
            if (j2 == this.f3066g.f3070b) {
                this.f3066g = this.f3066g.f3073e;
            }
        }
    }

    private void b(long j) {
        while (j >= this.f3066g.f3070b) {
            this.f3066g = this.f3066g.f3073e;
        }
    }

    private void c(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.f3065f.f3070b) {
            this.f3060a.a(this.f3065f.f3072d);
            this.f3065f = this.f3065f.a();
        }
        if (this.f3066g.f3069a < this.f3065f.f3069a) {
            this.f3066g = this.f3065f;
        }
    }

    public void a(b bVar) {
        this.o = bVar;
    }

    public void a(long j) {
        if (this.l != j) {
            this.l = j;
            this.j = true;
        }
    }

    @Override // c.d.a.a.e.q
    public void a(c.d.a.a.q qVar) {
        c.d.a.a.q qVarA = a(qVar, this.l);
        boolean zA = this.f3062c.a(qVarA);
        this.k = qVar;
        this.j = false;
        if (this.o == null || !zA) {
            return;
        }
        this.o.a(qVarA);
    }

    @Override // c.d.a.a.e.q
    public int a(c.d.a.a.e.h hVar, int i2, boolean z) throws EOFException {
        int i3 = hVar.read(this.f3067h.f3072d.f3391a, this.f3067h.a(this.m), d(i2));
        if (i3 != -1) {
            e(i3);
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c.d.a.a.e.q
    public void a(c.d.a.a.m.u uVar, int i2) {
        while (i2 > 0) {
            int iD = d(i2);
            uVar.a(this.f3067h.f3072d.f3391a, this.f3067h.a(this.m), iD);
            i2 -= iD;
            e(iD);
        }
    }

    @Override // c.d.a.a.e.q
    public void a(long j, int i2, int i3, int i4, q.a aVar) {
        if (this.j) {
            a(this.k);
        }
        long j2 = j + this.l;
        if (this.n) {
            if ((i2 & 1) == 0 || !this.f3062c.a(j2)) {
                return;
            } else {
                this.n = false;
            }
        }
        this.f3062c.a(j2, i2, (this.m - i3) - i4, i3, aVar);
    }

    private void a(a aVar) {
        if (aVar.f3071c) {
            boolean z = this.f3067h.f3071c;
            C0160c[] c0160cArr = new C0160c[(z ? 1 : 0) + (((int) (this.f3067h.f3069a - aVar.f3069a)) / this.f3061b)];
            for (int i2 = 0; i2 < c0160cArr.length; i2++) {
                c0160cArr[i2] = aVar.f3072d;
                aVar = aVar.a();
            }
            this.f3060a.a(c0160cArr);
        }
    }

    private int d(int i2) {
        if (!this.f3067h.f3071c) {
            this.f3067h.a(this.f3060a.a(), new a(this.f3067h.f3070b, this.f3061b));
        }
        return Math.min(i2, (int) (this.f3067h.f3070b - this.m));
    }

    private void e(int i2) {
        this.m += i2;
        if (this.m == this.f3067h.f3070b) {
            this.f3067h = this.f3067h.f3073e;
        }
    }

    private static c.d.a.a.q a(c.d.a.a.q qVar, long j) {
        if (qVar == null) {
            return null;
        }
        return (j == 0 || qVar.k == Long.MAX_VALUE) ? qVar : qVar.a(qVar.k + j);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f3069a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3070b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3071c;

        /* renamed from: d, reason: collision with root package name */
        public C0160c f3072d;

        /* renamed from: e, reason: collision with root package name */
        public a f3073e;

        public a(long j, int i2) {
            this.f3069a = j;
            this.f3070b = j + i2;
        }

        public void a(C0160c c0160c, a aVar) {
            this.f3072d = c0160c;
            this.f3073e = aVar;
            this.f3071c = true;
        }

        public int a(long j) {
            return ((int) (j - this.f3069a)) + this.f3072d.f3392b;
        }

        public a a() {
            this.f3072d = null;
            a aVar = this.f3073e;
            this.f3073e = null;
            return aVar;
        }
    }
}
