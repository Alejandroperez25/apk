package c.d.a.a.b;

import c.d.a.a.b.o;
import c.d.a.a.m.AbstractC0170e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class F implements o {

    /* renamed from: g, reason: collision with root package name */
    private E f1523g;
    private long k;
    private long l;
    private boolean m;

    /* renamed from: c, reason: collision with root package name */
    private float f1519c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f1520d = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private int f1517a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f1518b = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f1521e = -1;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f1524h = o.f1588a;

    /* renamed from: i, reason: collision with root package name */
    private ShortBuffer f1525i = this.f1524h.asShortBuffer();
    private ByteBuffer j = o.f1588a;

    /* renamed from: f, reason: collision with root package name */
    private int f1522f = -1;

    @Override // c.d.a.a.b.o
    public int e() {
        return 2;
    }

    public float a(float f2) {
        float fA = c.d.a.a.m.H.a(f2, 0.1f, 8.0f);
        if (this.f1519c != fA) {
            this.f1519c = fA;
            this.f1523g = null;
        }
        flush();
        return fA;
    }

    public float b(float f2) {
        float fA = c.d.a.a.m.H.a(f2, 0.1f, 8.0f);
        if (this.f1520d != fA) {
            this.f1520d = fA;
            this.f1523g = null;
        }
        flush();
        return fA;
    }

    public long a(long j) {
        if (this.l >= 1024) {
            if (this.f1521e == this.f1518b) {
                return c.d.a.a.m.H.d(j, this.k, this.l);
            }
            return c.d.a.a.m.H.d(j, this.k * this.f1521e, this.l * this.f1518b);
        }
        return (long) (this.f1519c * j);
    }

    @Override // c.d.a.a.b.o
    public boolean a(int i2, int i3, int i4) throws o.a {
        if (i4 != 2) {
            throw new o.a(i2, i3, i4);
        }
        int i5 = this.f1522f == -1 ? i2 : this.f1522f;
        if (this.f1518b == i2 && this.f1517a == i3 && this.f1521e == i5) {
            return false;
        }
        this.f1518b = i2;
        this.f1517a = i3;
        this.f1521e = i5;
        this.f1523g = null;
        return true;
    }

    @Override // c.d.a.a.b.o
    public boolean g() {
        return this.f1518b != -1 && (Math.abs(this.f1519c - 1.0f) >= 0.01f || Math.abs(this.f1520d - 1.0f) >= 0.01f || this.f1521e != this.f1518b);
    }

    @Override // c.d.a.a.b.o
    public int c() {
        return this.f1517a;
    }

    @Override // c.d.a.a.b.o
    public int d() {
        return this.f1521e;
    }

    @Override // c.d.a.a.b.o
    public void a(ByteBuffer byteBuffer) {
        AbstractC0170e.b(this.f1523g != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.k += iRemaining;
            this.f1523g.a(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iC = this.f1523g.c() * this.f1517a * 2;
        if (iC > 0) {
            if (this.f1524h.capacity() < iC) {
                this.f1524h = ByteBuffer.allocateDirect(iC).order(ByteOrder.nativeOrder());
                this.f1525i = this.f1524h.asShortBuffer();
            } else {
                this.f1524h.clear();
                this.f1525i.clear();
            }
            this.f1523g.b(this.f1525i);
            this.l += iC;
            this.f1524h.limit(iC);
            this.j = this.f1524h;
        }
    }

    @Override // c.d.a.a.b.o
    public void f() {
        AbstractC0170e.b(this.f1523g != null);
        this.f1523g.a();
        this.m = true;
    }

    @Override // c.d.a.a.b.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.j;
        this.j = o.f1588a;
        return byteBuffer;
    }

    @Override // c.d.a.a.b.o
    public boolean b() {
        return this.m && (this.f1523g == null || this.f1523g.c() == 0);
    }

    @Override // c.d.a.a.b.o
    public void flush() {
        if (g()) {
            if (this.f1523g == null) {
                this.f1523g = new E(this.f1518b, this.f1517a, this.f1519c, this.f1520d, this.f1521e);
            } else {
                this.f1523g.b();
            }
        }
        this.j = o.f1588a;
        this.k = 0L;
        this.l = 0L;
        this.m = false;
    }

    @Override // c.d.a.a.b.o
    public void reset() {
        this.f1519c = 1.0f;
        this.f1520d = 1.0f;
        this.f1517a = -1;
        this.f1518b = -1;
        this.f1521e = -1;
        this.f1524h = o.f1588a;
        this.f1525i = this.f1524h.asShortBuffer();
        this.j = o.f1588a;
        this.f1522f = -1;
        this.f1523g = null;
        this.k = 0L;
        this.l = 0L;
        this.m = false;
    }
}
