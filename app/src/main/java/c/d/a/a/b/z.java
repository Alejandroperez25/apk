package c.d.a.a.b;

import c.d.a.a.b.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class z implements o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1646a = Float.floatToIntBits(Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    private int f1647b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f1648c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f1649d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f1650e = o.f1588a;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f1651f = o.f1588a;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1652g;

    @Override // c.d.a.a.b.o
    public int e() {
        return 4;
    }

    @Override // c.d.a.a.b.o
    public boolean a(int i2, int i3, int i4) throws o.a {
        if (!c.d.a.a.m.H.d(i4)) {
            throw new o.a(i2, i3, i4);
        }
        if (this.f1647b == i2 && this.f1648c == i3 && this.f1649d == i4) {
            return false;
        }
        this.f1647b = i2;
        this.f1648c = i3;
        this.f1649d = i4;
        return true;
    }

    @Override // c.d.a.a.b.o
    public boolean g() {
        return c.d.a.a.m.H.d(this.f1649d);
    }

    @Override // c.d.a.a.b.o
    public int c() {
        return this.f1648c;
    }

    @Override // c.d.a.a.b.o
    public int d() {
        return this.f1647b;
    }

    @Override // c.d.a.a.b.o
    public void a(ByteBuffer byteBuffer) {
        boolean z = this.f1649d == 1073741824;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (!z) {
            i2 = (i2 / 3) * 4;
        }
        if (this.f1650e.capacity() < i2) {
            this.f1650e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f1650e.clear();
        }
        if (z) {
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), this.f1650e);
                iPosition += 4;
            }
        } else {
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), this.f1650e);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f1650e.flip();
        this.f1651f = this.f1650e;
    }

    @Override // c.d.a.a.b.o
    public void f() {
        this.f1652g = true;
    }

    @Override // c.d.a.a.b.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f1651f;
        this.f1651f = o.f1588a;
        return byteBuffer;
    }

    @Override // c.d.a.a.b.o
    public boolean b() {
        return this.f1652g && this.f1651f == o.f1588a;
    }

    @Override // c.d.a.a.b.o
    public void flush() {
        this.f1651f = o.f1588a;
        this.f1652g = false;
    }

    @Override // c.d.a.a.b.o
    public void reset() {
        flush();
        this.f1647b = -1;
        this.f1648c = -1;
        this.f1649d = 0;
        this.f1650e = o.f1588a;
    }

    private static void a(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f1646a) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
