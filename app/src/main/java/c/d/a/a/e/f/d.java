package c.d.a.a.e.f;

import b.a.a$i;
import c.d.a.a.e.f.k;
import c.d.a.a.e.o;
import c.d.a.a.e.p;
import c.d.a.a.m.H;
import c.d.a.a.m.u;
import c.d.a.a.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class d extends k {
    private c.d.a.a.m.m n;
    private a o;

    d() {
    }

    public static boolean b(u uVar) {
        return uVar.b() >= 5 && uVar.h() == 127 && uVar.n() == 1179402563;
    }

    @Override // c.d.a.a.e.f.k
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // c.d.a.a.e.f.k
    protected long a(u uVar) {
        if (a(uVar.f3567a)) {
            return c(uVar);
        }
        return -1L;
    }

    @Override // c.d.a.a.e.f.k
    protected boolean a(u uVar, long j, k.a aVar) {
        byte[] bArr = uVar.f3567a;
        if (this.n == null) {
            this.n = new c.d.a.a.m.m(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, uVar.c());
            bArrCopyOfRange[4] = -128;
            aVar.f2048a = q.a((String) null, "audio/flac", (String) null, -1, this.n.a(), this.n.f3539f, this.n.f3538e, (List<byte[]>) Collections.singletonList(bArrCopyOfRange), (c.d.a.a.d.f) null, 0, (String) null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            this.o = new a();
            this.o.a(uVar);
            return true;
        }
        if (!a(bArr)) {
            return true;
        }
        if (this.o != null) {
            this.o.d(j);
            aVar.f2049b = this.o;
        }
        return false;
    }

    private int c(u uVar) {
        int i2 = (uVar.f3567a[2] & 255) >> 4;
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
            case 7:
                uVar.d(4);
                uVar.B();
                int iH = i2 == 6 ? uVar.h() : uVar.i();
                uVar.c(0);
                return iH + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    private class a implements h, o {

        /* renamed from: a, reason: collision with root package name */
        private long[] f2016a;

        /* renamed from: b, reason: collision with root package name */
        private long[] f2017b;

        /* renamed from: c, reason: collision with root package name */
        private long f2018c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f2019d = -1;

        @Override // c.d.a.a.e.f.h
        public o a() {
            return this;
        }

        @Override // c.d.a.a.e.o
        public boolean c() {
            return true;
        }

        public a() {
        }

        public void d(long j) {
            this.f2018c = j;
        }

        public void a(u uVar) {
            uVar.d(1);
            int iL = uVar.l() / 18;
            this.f2016a = new long[iL];
            this.f2017b = new long[iL];
            for (int i2 = 0; i2 < iL; i2++) {
                this.f2016a[i2] = uVar.r();
                this.f2017b[i2] = uVar.r();
                uVar.d(2);
            }
        }

        @Override // c.d.a.a.e.f.h
        public long a(c.d.a.a.e.h hVar) {
            if (this.f2019d < 0) {
                return -1L;
            }
            long j = -(this.f2019d + 2);
            this.f2019d = -1L;
            return j;
        }

        @Override // c.d.a.a.e.f.h
        public long c(long j) {
            long jB = d.this.b(j);
            this.f2019d = this.f2016a[H.a(this.f2016a, jB, true, true)];
            return jB;
        }

        @Override // c.d.a.a.e.o
        public o.a b(long j) {
            int iA = H.a(this.f2016a, d.this.b(j), true, true);
            long jA = d.this.a(this.f2016a[iA]);
            p pVar = new p(jA, this.f2018c + this.f2017b[iA]);
            if (jA >= j || iA == this.f2016a.length - 1) {
                return new o.a(pVar);
            }
            int i2 = iA + 1;
            return new o.a(pVar, new p(d.this.a(this.f2016a[i2]), this.f2018c + this.f2017b[i2]));
        }

        @Override // c.d.a.a.e.o
        public long d() {
            return d.this.n.b();
        }
    }
}
