package c.d.a.a.b;

import c.d.a.a.b.o;
import c.d.a.a.m.AbstractC0170e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class u implements o {

    /* renamed from: c, reason: collision with root package name */
    private int[] f1617c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1618d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1619e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1622h;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f1620f = o.f1588a;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f1621g = o.f1588a;

    /* renamed from: a, reason: collision with root package name */
    private int f1615a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f1616b = -1;

    @Override // c.d.a.a.b.o
    public int e() {
        return 2;
    }

    public void a(int[] iArr) {
        this.f1617c = iArr;
    }

    @Override // c.d.a.a.b.o
    public boolean a(int i2, int i3, int i4) throws o.a {
        boolean z = !Arrays.equals(this.f1617c, this.f1619e);
        this.f1619e = this.f1617c;
        if (this.f1619e == null) {
            this.f1618d = false;
            return z;
        }
        if (i4 != 2) {
            throw new o.a(i2, i3, i4);
        }
        if (!z && this.f1616b == i2 && this.f1615a == i3) {
            return false;
        }
        this.f1616b = i2;
        this.f1615a = i3;
        this.f1618d = i3 != this.f1619e.length;
        int i5 = 0;
        while (i5 < this.f1619e.length) {
            int i6 = this.f1619e[i5];
            if (i6 >= i3) {
                throw new o.a(i2, i3, i4);
            }
            this.f1618d = (i6 != i5) | this.f1618d;
            i5++;
        }
        return true;
    }

    @Override // c.d.a.a.b.o
    public boolean g() {
        return this.f1618d;
    }

    @Override // c.d.a.a.b.o
    public int c() {
        return this.f1619e == null ? this.f1615a : this.f1619e.length;
    }

    @Override // c.d.a.a.b.o
    public int d() {
        return this.f1616b;
    }

    @Override // c.d.a.a.b.o
    public void a(ByteBuffer byteBuffer) {
        AbstractC0170e.b(this.f1619e != null);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f1615a * 2)) * this.f1619e.length * 2;
        if (this.f1620f.capacity() < length) {
            this.f1620f = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f1620f.clear();
        }
        while (iPosition < iLimit) {
            for (int i2 : this.f1619e) {
                this.f1620f.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f1615a * 2;
        }
        byteBuffer.position(iLimit);
        this.f1620f.flip();
        this.f1621g = this.f1620f;
    }

    @Override // c.d.a.a.b.o
    public void f() {
        this.f1622h = true;
    }

    @Override // c.d.a.a.b.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f1621g;
        this.f1621g = o.f1588a;
        return byteBuffer;
    }

    @Override // c.d.a.a.b.o
    public boolean b() {
        return this.f1622h && this.f1621g == o.f1588a;
    }

    @Override // c.d.a.a.b.o
    public void flush() {
        this.f1621g = o.f1588a;
        this.f1622h = false;
    }

    @Override // c.d.a.a.b.o
    public void reset() {
        flush();
        this.f1620f = o.f1588a;
        this.f1615a = -1;
        this.f1616b = -1;
        this.f1619e = null;
        this.f1617c = null;
        this.f1618d = false;
    }
}
