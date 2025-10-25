package c.d.a.a.e;

import c.d.a.a.m.H;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.l.k f1831b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1832c;

    /* renamed from: d, reason: collision with root package name */
    private long f1833d;

    /* renamed from: f, reason: collision with root package name */
    private int f1835f;

    /* renamed from: g, reason: collision with root package name */
    private int f1836g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f1834e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1830a = new byte[4096];

    public d(c.d.a.a.l.k kVar, long j, long j2) {
        this.f1831b = kVar;
        this.f1833d = j;
        this.f1832c = j2;
    }

    @Override // c.d.a.a.e.h
    public int read(byte[] bArr, int i2, int i3) throws InterruptedException, EOFException {
        int iB = b(bArr, i2, i3);
        if (iB == 0) {
            iB = a(bArr, i2, i3, 0, true);
        }
        g(iB);
        return iB;
    }

    @Override // c.d.a.a.e.h
    public boolean a(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        int iB = b(bArr, i2, i3);
        while (iB < i3 && iB != -1) {
            iB = a(bArr, i2, i3, iB, z);
        }
        g(iB);
        return iB != -1;
    }

    @Override // c.d.a.a.e.h
    public void readFully(byte[] bArr, int i2, int i3) throws InterruptedException, EOFException {
        a(bArr, i2, i3, false);
    }

    @Override // c.d.a.a.e.h
    public int b(int i2) throws InterruptedException, EOFException {
        int iE = e(i2);
        if (iE == 0) {
            iE = a(this.f1830a, 0, Math.min(i2, this.f1830a.length), 0, true);
        }
        g(iE);
        return iE;
    }

    public boolean b(int i2, boolean z) throws InterruptedException, EOFException {
        int iE = e(i2);
        while (iE < i2 && iE != -1) {
            iE = a(this.f1830a, -iE, Math.min(i2, this.f1830a.length + iE), iE, z);
        }
        g(iE);
        return iE != -1;
    }

    @Override // c.d.a.a.e.h
    public void c(int i2) throws InterruptedException, EOFException {
        b(i2, false);
    }

    @Override // c.d.a.a.e.h
    public boolean b(byte[] bArr, int i2, int i3, boolean z) {
        if (!a(i3, z)) {
            return false;
        }
        System.arraycopy(this.f1834e, this.f1835f - i3, bArr, i2, i3);
        return true;
    }

    @Override // c.d.a.a.e.h
    public void a(byte[] bArr, int i2, int i3) {
        b(bArr, i2, i3, false);
    }

    @Override // c.d.a.a.e.h
    public boolean a(int i2, boolean z) throws InterruptedException, EOFException {
        d(i2);
        int iA = this.f1836g - this.f1835f;
        while (iA < i2) {
            iA = a(this.f1834e, this.f1835f, i2, iA, z);
            if (iA == -1) {
                return false;
            }
            this.f1836g = this.f1835f + iA;
        }
        this.f1835f += i2;
        return true;
    }

    @Override // c.d.a.a.e.h
    public void a(int i2) throws InterruptedException, EOFException {
        a(i2, false);
    }

    @Override // c.d.a.a.e.h
    public void b() {
        this.f1835f = 0;
    }

    @Override // c.d.a.a.e.h
    public long a() {
        return this.f1833d + this.f1835f;
    }

    @Override // c.d.a.a.e.h
    public long c() {
        return this.f1833d;
    }

    @Override // c.d.a.a.e.h
    public long getLength() {
        return this.f1832c;
    }

    private void d(int i2) {
        int i3 = this.f1835f + i2;
        if (i3 > this.f1834e.length) {
            this.f1834e = Arrays.copyOf(this.f1834e, H.a(this.f1834e.length * 2, 65536 + i3, i3 + 524288));
        }
    }

    private int e(int i2) {
        int iMin = Math.min(this.f1836g, i2);
        f(iMin);
        return iMin;
    }

    private int b(byte[] bArr, int i2, int i3) {
        if (this.f1836g == 0) {
            return 0;
        }
        int iMin = Math.min(this.f1836g, i3);
        System.arraycopy(this.f1834e, 0, bArr, i2, iMin);
        f(iMin);
        return iMin;
    }

    private void f(int i2) {
        this.f1836g -= i2;
        this.f1835f = 0;
        byte[] bArr = this.f1834e;
        if (this.f1836g < this.f1834e.length - 524288) {
            bArr = new byte[this.f1836g + 65536];
        }
        System.arraycopy(this.f1834e, i2, bArr, 0, this.f1836g);
        this.f1834e = bArr;
    }

    private int a(byte[] bArr, int i2, int i3, int i4, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i5 = this.f1831b.read(bArr, i2 + i4, i3 - i4);
        if (i5 != -1) {
            return i4 + i5;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private void g(int i2) {
        if (i2 != -1) {
            this.f1833d += i2;
        }
    }
}
