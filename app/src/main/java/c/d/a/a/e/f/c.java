package c.d.a.a.e.f;

import c.d.a.a.e.o;
import c.d.a.a.e.p;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.x;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final g f2006a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final long f2007b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2008c;

    /* renamed from: d, reason: collision with root package name */
    private final k f2009d;

    /* renamed from: e, reason: collision with root package name */
    private int f2010e;

    /* renamed from: f, reason: collision with root package name */
    private long f2011f;

    /* renamed from: g, reason: collision with root package name */
    private long f2012g;

    /* renamed from: h, reason: collision with root package name */
    private long f2013h;

    /* renamed from: i, reason: collision with root package name */
    private long f2014i;
    private long j;
    private long k;
    private long l;

    public c(long j, long j2, k kVar, long j3, long j4, boolean z) {
        AbstractC0170e.a(j >= 0 && j2 > j);
        this.f2009d = kVar;
        this.f2007b = j;
        this.f2008c = j2;
        if (j3 == j2 - j || z) {
            this.f2011f = j4;
            this.f2010e = 3;
        } else {
            this.f2010e = 0;
        }
    }

    @Override // c.d.a.a.e.f.h
    public long a(c.d.a.a.e.h hVar) throws IOException {
        switch (this.f2010e) {
            case 0:
                this.f2012g = hVar.c();
                this.f2010e = 1;
                long j = this.f2008c - 65307;
                if (j > this.f2012g) {
                    return j;
                }
                break;
            case 1:
                break;
            case 2:
                long jA = 0;
                if (this.f2013h != 0) {
                    long jA2 = a(this.f2013h, hVar);
                    if (jA2 >= 0) {
                        return jA2;
                    }
                    jA = a(hVar, this.f2013h, -(jA2 + 2));
                }
                this.f2010e = 3;
                return -(jA + 2);
            case 3:
                return -1L;
            default:
                throw new IllegalStateException();
        }
        this.f2011f = c(hVar);
        this.f2010e = 3;
        return this.f2012g;
    }

    @Override // c.d.a.a.e.f.h
    public long c(long j) {
        AbstractC0170e.a(this.f2010e == 3 || this.f2010e == 2);
        this.f2013h = j != 0 ? this.f2009d.b(j) : 0L;
        this.f2010e = 2;
        c();
        return this.f2013h;
    }

    @Override // c.d.a.a.e.f.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a() {
        if (this.f2011f != 0) {
            return new a();
        }
        return null;
    }

    public void c() {
        this.f2014i = this.f2007b;
        this.j = this.f2008c;
        this.k = 0L;
        this.l = this.f2011f;
    }

    public long a(long j, c.d.a.a.e.h hVar) throws IOException {
        if (this.f2014i == this.j) {
            return -(this.k + 2);
        }
        long jC = hVar.c();
        if (!a(hVar, this.j)) {
            if (this.f2014i == jC) {
                throw new IOException("No ogg page can be found.");
            }
            return this.f2014i;
        }
        this.f2006a.a(hVar, false);
        hVar.b();
        long j2 = j - this.f2006a.f2033d;
        int i2 = this.f2006a.f2038i + this.f2006a.j;
        if (j2 >= 0 && j2 <= 72000) {
            hVar.c(i2);
            return -(this.f2006a.f2033d + 2);
        }
        if (j2 < 0) {
            this.j = jC;
            this.l = this.f2006a.f2033d;
        } else {
            long j3 = i2;
            this.f2014i = hVar.c() + j3;
            this.k = this.f2006a.f2033d;
            if ((this.j - this.f2014i) + j3 < 100000) {
                hVar.c(i2);
                return -(this.k + 2);
            }
        }
        if (this.j - this.f2014i < 100000) {
            this.j = this.f2014i;
            return this.f2014i;
        }
        return Math.min(Math.max((hVar.c() - (i2 * (j2 > 0 ? 1L : 2L))) + ((j2 * (this.j - this.f2014i)) / (this.l - this.k)), this.f2014i), this.j - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(long j, long j2, long j3) {
        long j4 = j + (((j2 * (this.f2008c - this.f2007b)) / this.f2011f) - j3);
        if (j4 < this.f2007b) {
            j4 = this.f2007b;
        }
        return j4 >= this.f2008c ? this.f2008c - 1 : j4;
    }

    private class a implements o {
        @Override // c.d.a.a.e.o
        public boolean c() {
            return true;
        }

        private a() {
        }

        @Override // c.d.a.a.e.o
        public o.a b(long j) {
            if (j != 0) {
                return new o.a(new p(j, c.this.a(c.this.f2007b, c.this.f2009d.b(j), 30000L)));
            }
            return new o.a(new p(0L, c.this.f2007b));
        }

        @Override // c.d.a.a.e.o
        public long d() {
            return c.this.f2009d.a(c.this.f2011f);
        }
    }

    void b(c.d.a.a.e.h hVar) throws EOFException {
        if (!a(hVar, this.f2008c)) {
            throw new EOFException();
        }
    }

    boolean a(c.d.a.a.e.h hVar, long j) {
        int i2;
        long jMin = Math.min(j + 3, this.f2008c);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            int i3 = 0;
            if (hVar.c() + length > jMin && (length = (int) (jMin - hVar.c())) < 4) {
                return false;
            }
            hVar.b(bArr, 0, length, false);
            while (true) {
                i2 = length - 3;
                if (i3 < i2) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        hVar.c(i3);
                        return true;
                    }
                    i3++;
                }
            }
            hVar.c(i2);
        }
    }

    long c(c.d.a.a.e.h hVar) throws x, EOFException {
        b(hVar);
        this.f2006a.a();
        while ((this.f2006a.f2032c & 4) != 4 && hVar.c() < this.f2008c) {
            this.f2006a.a(hVar, false);
            hVar.c(this.f2006a.f2038i + this.f2006a.j);
        }
        return this.f2006a.f2033d;
    }

    long a(c.d.a.a.e.h hVar, long j, long j2) throws x, EOFException {
        this.f2006a.a(hVar, false);
        while (this.f2006a.f2033d < j) {
            hVar.c(this.f2006a.f2038i + this.f2006a.j);
            j2 = this.f2006a.f2033d;
            this.f2006a.a(hVar, false);
        }
        hVar.b();
        return j2;
    }
}
