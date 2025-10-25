package c.d.a.a.b;

import c.d.a.a.b.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class G implements o {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1526a;

    /* renamed from: b, reason: collision with root package name */
    private int f1527b;

    /* renamed from: c, reason: collision with root package name */
    private int f1528c;

    /* renamed from: f, reason: collision with root package name */
    private int f1531f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1532g;

    /* renamed from: h, reason: collision with root package name */
    private int f1533h;
    private int l;
    private boolean m;
    private long n;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f1534i = o.f1588a;
    private ByteBuffer j = o.f1588a;

    /* renamed from: d, reason: collision with root package name */
    private int f1529d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f1530e = -1;
    private byte[] k = c.d.a.a.m.H.f3504f;

    @Override // c.d.a.a.b.o
    public int e() {
        return 2;
    }

    public void a(int i2, int i3) {
        this.f1527b = i2;
        this.f1528c = i3;
    }

    public void h() {
        this.n = 0L;
    }

    public long i() {
        return this.n;
    }

    @Override // c.d.a.a.b.o
    public boolean a(int i2, int i3, int i4) throws o.a {
        if (i4 != 2) {
            throw new o.a(i2, i3, i4);
        }
        if (this.l > 0) {
            this.n += this.l / this.f1531f;
        }
        this.f1529d = i3;
        this.f1530e = i2;
        this.f1531f = c.d.a.a.m.H.b(2, i3);
        this.k = new byte[this.f1528c * this.f1531f];
        this.l = 0;
        this.f1533h = this.f1527b * this.f1531f;
        boolean z = this.f1526a;
        this.f1526a = (this.f1527b == 0 && this.f1528c == 0) ? false : true;
        this.f1532g = false;
        return z != this.f1526a;
    }

    @Override // c.d.a.a.b.o
    public boolean g() {
        return this.f1526a;
    }

    @Override // c.d.a.a.b.o
    public int c() {
        return this.f1529d;
    }

    @Override // c.d.a.a.b.o
    public int d() {
        return this.f1530e;
    }

    @Override // c.d.a.a.b.o
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 == 0) {
            return;
        }
        this.f1532g = true;
        int iMin = Math.min(i2, this.f1533h);
        this.n += iMin / this.f1531f;
        this.f1533h -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f1533h > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.l + i3) - this.k.length;
        if (this.f1534i.capacity() < length) {
            this.f1534i = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f1534i.clear();
        }
        int iA = c.d.a.a.m.H.a(length, 0, this.l);
        this.f1534i.put(this.k, 0, iA);
        int iA2 = c.d.a.a.m.H.a(length - iA, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iA2);
        this.f1534i.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iA2;
        this.l -= iA;
        System.arraycopy(this.k, iA, this.k, 0, this.l);
        byteBuffer.get(this.k, this.l, i4);
        this.l += i4;
        this.f1534i.flip();
        this.j = this.f1534i;
    }

    @Override // c.d.a.a.b.o
    public void f() {
        this.m = true;
    }

    @Override // c.d.a.a.b.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.j;
        if (this.m && this.l > 0 && byteBuffer == o.f1588a) {
            if (this.f1534i.capacity() < this.l) {
                this.f1534i = ByteBuffer.allocateDirect(this.l).order(ByteOrder.nativeOrder());
            } else {
                this.f1534i.clear();
            }
            this.f1534i.put(this.k, 0, this.l);
            this.l = 0;
            this.f1534i.flip();
            byteBuffer = this.f1534i;
        }
        this.j = o.f1588a;
        return byteBuffer;
    }

    @Override // c.d.a.a.b.o
    public boolean b() {
        return this.m && this.l == 0 && this.j == o.f1588a;
    }

    @Override // c.d.a.a.b.o
    public void flush() {
        this.j = o.f1588a;
        this.m = false;
        if (this.f1532g) {
            this.f1533h = 0;
        }
        this.l = 0;
    }

    @Override // c.d.a.a.b.o
    public void reset() {
        flush();
        this.f1534i = o.f1588a;
        this.f1529d = -1;
        this.f1530e = -1;
        this.k = c.d.a.a.m.H.f3504f;
    }
}
