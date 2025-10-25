package c.d.a.a.b;

import c.d.a.a.b.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class C implements o {

    /* renamed from: a, reason: collision with root package name */
    private int f1493a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f1494b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f1495c = 0;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f1496d = o.f1588a;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f1497e = o.f1588a;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1498f;

    @Override // c.d.a.a.b.o
    public int e() {
        return 2;
    }

    @Override // c.d.a.a.b.o
    public boolean a(int i2, int i3, int i4) throws o.a {
        if (i4 != 3 && i4 != 2 && i4 != Integer.MIN_VALUE && i4 != 1073741824) {
            throw new o.a(i2, i3, i4);
        }
        if (this.f1493a == i2 && this.f1494b == i3 && this.f1495c == i4) {
            return false;
        }
        this.f1493a = i2;
        this.f1494b = i3;
        this.f1495c = i4;
        return true;
    }

    @Override // c.d.a.a.b.o
    public boolean g() {
        return (this.f1495c == 0 || this.f1495c == 2) ? false : true;
    }

    @Override // c.d.a.a.b.o
    public int c() {
        return this.f1494b;
    }

    @Override // c.d.a.a.b.o
    public int d() {
        return this.f1493a;
    }

    @Override // c.d.a.a.b.o
    public void a(ByteBuffer byteBuffer) {
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.f1495c;
        if (i4 == Integer.MIN_VALUE) {
            i2 = (i3 / 3) * 2;
        } else if (i4 == 3) {
            i2 = i3 * 2;
        } else if (i4 == 1073741824) {
            i2 = i3 / 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.f1496d.capacity() < i2) {
            this.f1496d = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f1496d.clear();
        }
        int i5 = this.f1495c;
        if (i5 == Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f1496d.put(byteBuffer.get(iPosition + 1));
                this.f1496d.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i5 == 3) {
            while (iPosition < iLimit) {
                this.f1496d.put((byte) 0);
                this.f1496d.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i5 != 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f1496d.put(byteBuffer.get(iPosition + 2));
                this.f1496d.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f1496d.flip();
        this.f1497e = this.f1496d;
    }

    @Override // c.d.a.a.b.o
    public void f() {
        this.f1498f = true;
    }

    @Override // c.d.a.a.b.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f1497e;
        this.f1497e = o.f1588a;
        return byteBuffer;
    }

    @Override // c.d.a.a.b.o
    public boolean b() {
        return this.f1498f && this.f1497e == o.f1588a;
    }

    @Override // c.d.a.a.b.o
    public void flush() {
        this.f1497e = o.f1588a;
        this.f1498f = false;
    }

    @Override // c.d.a.a.b.o
    public void reset() {
        flush();
        this.f1493a = -1;
        this.f1494b = -1;
        this.f1495c = 0;
        this.f1496d = o.f1588a;
    }
}
