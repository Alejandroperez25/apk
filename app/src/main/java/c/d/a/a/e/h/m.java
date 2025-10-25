package c.d.a.a.e.h;

import android.util.Pair;
import c.d.a.a.e.h.G;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private static final double[] f2195a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: b, reason: collision with root package name */
    private String f2196b;

    /* renamed from: c, reason: collision with root package name */
    private c.d.a.a.e.q f2197c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2198d;

    /* renamed from: e, reason: collision with root package name */
    private long f2199e;

    /* renamed from: f, reason: collision with root package name */
    private final I f2200f;

    /* renamed from: g, reason: collision with root package name */
    private final c.d.a.a.m.u f2201g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f2202h;

    /* renamed from: i, reason: collision with root package name */
    private final a f2203i;
    private final t j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;

    @Override // c.d.a.a.e.h.l
    public void b() {
    }

    public m() {
        this(null);
    }

    public m(I i2) {
        this.f2200f = i2;
        this.f2202h = new boolean[4];
        this.f2203i = new a(128);
        if (i2 != null) {
            this.j = new t(178, 128);
            this.f2201g = new c.d.a.a.m.u();
        } else {
            this.j = null;
            this.f2201g = null;
        }
    }

    @Override // c.d.a.a.e.h.l
    public void a() {
        c.d.a.a.m.s.a(this.f2202h);
        this.f2203i.a();
        if (this.f2200f != null) {
            this.j.a();
        }
        this.k = 0L;
        this.l = false;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.e.i iVar, G.d dVar) {
        dVar.a();
        this.f2196b = dVar.c();
        this.f2197c = iVar.a(dVar.b(), 2);
        if (this.f2200f != null) {
            this.f2200f.a(iVar, dVar);
        }
    }

    @Override // c.d.a.a.e.h.l
    public void a(long j, int i2) {
        this.m = j;
    }

    @Override // c.d.a.a.e.h.l
    public void a(c.d.a.a.m.u uVar) {
        int i2;
        int iD = uVar.d();
        int iC = uVar.c();
        byte[] bArr = uVar.f3567a;
        this.k += uVar.b();
        this.f2197c.a(uVar, uVar.b());
        while (true) {
            int iA = c.d.a.a.m.s.a(bArr, iD, iC, this.f2202h);
            if (iA == iC) {
                break;
            }
            int i3 = iA + 3;
            int i4 = uVar.f3567a[i3] & 255;
            int i5 = iA - iD;
            if (!this.f2198d) {
                if (i5 > 0) {
                    this.f2203i.a(bArr, iD, iA);
                }
                if (this.f2203i.a(i4, i5 < 0 ? -i5 : 0)) {
                    Pair<c.d.a.a.q, Long> pairA = a(this.f2203i, this.f2196b);
                    this.f2197c.a((c.d.a.a.q) pairA.first);
                    this.f2199e = ((Long) pairA.second).longValue();
                    this.f2198d = true;
                }
            }
            if (this.f2200f != null) {
                if (i5 > 0) {
                    this.j.a(bArr, iD, iA);
                    i2 = 0;
                } else {
                    i2 = -i5;
                }
                if (this.j.b(i2)) {
                    this.f2201g.a(this.j.f2281d, c.d.a.a.m.s.a(this.j.f2281d, this.j.f2282e));
                    this.f2200f.a(this.o, this.f2201g);
                }
                if (i4 == 178 && uVar.f3567a[iA + 2] == 1) {
                    this.j.a(i4);
                }
            }
            if (i4 == 0 || i4 == 179) {
                int i6 = iC - iA;
                if (this.l && this.q && this.f2198d) {
                    this.f2197c.a(this.o, this.p ? 1 : 0, ((int) (this.k - this.n)) - i6, i6, null);
                }
                if (!this.l || this.q) {
                    this.n = this.k - i6;
                    this.o = this.m != -9223372036854775807L ? this.m : this.l ? this.o + this.f2199e : 0L;
                    this.p = false;
                    this.m = -9223372036854775807L;
                    this.l = true;
                }
                this.q = i4 == 0;
            } else if (i4 == 184) {
                this.p = true;
            }
            iD = i3;
        }
        if (!this.f2198d) {
            this.f2203i.a(bArr, iD, iC);
        }
        if (this.f2200f != null) {
            this.j.a(bArr, iD, iC);
        }
    }

    private static Pair<c.d.a.a.q, Long> a(a aVar, String str) {
        float f2;
        float f3;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f2208e, aVar.f2206c);
        int i2 = bArrCopyOf[4] & 255;
        int i3 = bArrCopyOf[5] & 255;
        int i4 = (i2 << 4) | (i3 >> 4);
        int i5 = ((i3 & 15) << 8) | (bArrCopyOf[6] & 255);
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                f2 = (i5 * 4) / (i4 * 3);
                f3 = f2;
                break;
            case 3:
                f2 = (i5 * 16) / (i4 * 9);
                f3 = f2;
                break;
            case 4:
                f2 = (i5 * 121) / (i4 * 100);
                f3 = f2;
                break;
            default:
                f3 = 1.0f;
                break;
        }
        c.d.a.a.q qVarA = c.d.a.a.q.a(str, "video/mpeg2", (String) null, -1, -1, i4, i5, -1.0f, (List<byte[]>) Collections.singletonList(bArrCopyOf), -1, f3, (c.d.a.a.d.f) null);
        long j = 0;
        int i6 = (bArrCopyOf[7] & 15) - 1;
        if (i6 >= 0 && i6 < f2195a.length) {
            double d2 = f2195a[i6];
            int i7 = aVar.f2207d + 9;
            int i8 = (bArrCopyOf[i7] & 96) >> 5;
            if (i8 != (bArrCopyOf[i7] & 31)) {
                d2 *= (i8 + 1.0d) / (r0 + 1);
            }
            j = (long) (1000000.0d / d2);
        }
        return Pair.create(qVarA, Long.valueOf(j));
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f2204a = {0, 0, 1};

        /* renamed from: b, reason: collision with root package name */
        private boolean f2205b;

        /* renamed from: c, reason: collision with root package name */
        public int f2206c;

        /* renamed from: d, reason: collision with root package name */
        public int f2207d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f2208e;

        public a(int i2) {
            this.f2208e = new byte[i2];
        }

        public void a() {
            this.f2205b = false;
            this.f2206c = 0;
            this.f2207d = 0;
        }

        public boolean a(int i2, int i3) {
            if (this.f2205b) {
                this.f2206c -= i3;
                if (this.f2207d == 0 && i2 == 181) {
                    this.f2207d = this.f2206c;
                } else {
                    this.f2205b = false;
                    return true;
                }
            } else if (i2 == 179) {
                this.f2205b = true;
            }
            a(f2204a, 0, f2204a.length);
            return false;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f2205b) {
                int i4 = i3 - i2;
                if (this.f2208e.length < this.f2206c + i4) {
                    this.f2208e = Arrays.copyOf(this.f2208e, (this.f2206c + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f2208e, this.f2206c, i4);
                this.f2206c += i4;
            }
        }
    }
}
