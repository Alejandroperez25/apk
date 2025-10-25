package c.d.a.a.b;

import c.d.a.a.b.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class D implements o {

    /* renamed from: c, reason: collision with root package name */
    private int f1501c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1502d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1505g;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private long n;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f1503e = o.f1588a;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f1504f = o.f1588a;

    /* renamed from: a, reason: collision with root package name */
    private int f1499a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f1500b = -1;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f1506h = c.d.a.a.m.H.f3504f;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f1507i = c.d.a.a.m.H.f3504f;

    @Override // c.d.a.a.b.o
    public int e() {
        return 2;
    }

    public void a(boolean z) {
        this.f1502d = z;
        flush();
    }

    public long h() {
        return this.n;
    }

    @Override // c.d.a.a.b.o
    public boolean a(int i2, int i3, int i4) throws o.a {
        if (i4 != 2) {
            throw new o.a(i2, i3, i4);
        }
        if (this.f1500b == i2 && this.f1499a == i3) {
            return false;
        }
        this.f1500b = i2;
        this.f1499a = i3;
        this.f1501c = i3 * 2;
        return true;
    }

    @Override // c.d.a.a.b.o
    public boolean g() {
        return this.f1500b != -1 && this.f1502d;
    }

    @Override // c.d.a.a.b.o
    public int c() {
        return this.f1499a;
    }

    @Override // c.d.a.a.b.o
    public int d() {
        return this.f1500b;
    }

    @Override // c.d.a.a.b.o
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.f1504f.hasRemaining()) {
            switch (this.j) {
                case 0:
                    b(byteBuffer);
                    break;
                case 1:
                    c(byteBuffer);
                    break;
                case 2:
                    d(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // c.d.a.a.b.o
    public void f() {
        this.f1505g = true;
        if (this.k > 0) {
            a(this.f1506h, this.k);
        }
        if (this.m) {
            return;
        }
        this.n += this.l / this.f1501c;
    }

    @Override // c.d.a.a.b.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f1504f;
        this.f1504f = o.f1588a;
        return byteBuffer;
    }

    @Override // c.d.a.a.b.o
    public boolean b() {
        return this.f1505g && this.f1504f == o.f1588a;
    }

    @Override // c.d.a.a.b.o
    public void flush() {
        if (g()) {
            int iA = a(150000L) * this.f1501c;
            if (this.f1506h.length != iA) {
                this.f1506h = new byte[iA];
            }
            this.l = a(20000L) * this.f1501c;
            if (this.f1507i.length != this.l) {
                this.f1507i = new byte[this.l];
            }
        }
        this.j = 0;
        this.f1504f = o.f1588a;
        this.f1505g = false;
        this.n = 0L;
        this.k = 0;
        this.m = false;
    }

    @Override // c.d.a.a.b.o
    public void reset() {
        this.f1502d = false;
        flush();
        this.f1503e = o.f1588a;
        this.f1499a = -1;
        this.f1500b = -1;
        this.l = 0;
        this.f1506h = c.d.a.a.m.H.f3504f;
        this.f1507i = c.d.a.a.m.H.f3504f;
    }

    private void b(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f1506h.length));
        int iG = g(byteBuffer);
        if (iG == byteBuffer.position()) {
            this.j = 1;
        } else {
            byteBuffer.limit(iG);
            e(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void c(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iF = f(byteBuffer);
        int iPosition = iF - byteBuffer.position();
        int length = this.f1506h.length - this.k;
        if (iF < iLimit && iPosition < length) {
            a(this.f1506h, this.k);
            this.k = 0;
            this.j = 0;
            return;
        }
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f1506h, this.k, iMin);
        this.k += iMin;
        if (this.k == this.f1506h.length) {
            if (this.m) {
                a(this.f1506h, this.l);
                this.n += (this.k - (this.l * 2)) / this.f1501c;
            } else {
                this.n += (this.k - this.l) / this.f1501c;
            }
            a(byteBuffer, this.f1506h, this.k);
            this.k = 0;
            this.j = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void d(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iF = f(byteBuffer);
        byteBuffer.limit(iF);
        this.n += byteBuffer.remaining() / this.f1501c;
        a(byteBuffer, this.f1507i, this.l);
        if (iF < iLimit) {
            a(this.f1507i, this.l);
            this.j = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void a(byte[] bArr, int i2) {
        a(i2);
        this.f1503e.put(bArr, 0, i2);
        this.f1503e.flip();
        this.f1504f = this.f1503e;
    }

    private void e(ByteBuffer byteBuffer) {
        a(byteBuffer.remaining());
        this.f1503e.put(byteBuffer);
        this.f1503e.flip();
        this.f1504f = this.f1503e;
    }

    private void a(int i2) {
        if (this.f1503e.capacity() < i2) {
            this.f1503e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f1503e.clear();
        }
        if (i2 > 0) {
            this.m = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.l);
        int i3 = this.l - iMin;
        System.arraycopy(bArr, i2 - i3, this.f1507i, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f1507i, i3, iMin);
    }

    private int a(long j) {
        return (int) ((j * this.f1500b) / 1000000);
    }

    private int f(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.get(iPosition)) > 4) {
                return this.f1501c * (iPosition / this.f1501c);
            }
        }
        return byteBuffer.limit();
    }

    private int g(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.get(iLimit)) > 4) {
                return (this.f1501c * (iLimit / this.f1501c)) + this.f1501c;
            }
        }
        return byteBuffer.position();
    }
}
