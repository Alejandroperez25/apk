package c.d.a.a.c;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: b, reason: collision with root package name */
    public final c f1683b = new c();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f1684c;

    /* renamed from: d, reason: collision with root package name */
    public long f1685d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1686e;

    public static f f() {
        return new f(0);
    }

    public f(int i2) {
        this.f1686e = i2;
    }

    public void f(int i2) {
        if (this.f1684c == null) {
            this.f1684c = g(i2);
            return;
        }
        int iCapacity = this.f1684c.capacity();
        int iPosition = this.f1684c.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            return;
        }
        ByteBuffer byteBufferG = g(i3);
        if (iPosition > 0) {
            this.f1684c.position(0);
            this.f1684c.limit(iPosition);
            byteBufferG.put(this.f1684c);
        }
        this.f1684c = byteBufferG;
    }

    public final boolean g() {
        return this.f1684c == null && this.f1686e == 0;
    }

    public final boolean k() {
        return e(1073741824);
    }

    public final void l() {
        this.f1684c.flip();
    }

    @Override // c.d.a.a.c.a
    public void b() {
        super.b();
        if (this.f1684c != null) {
            this.f1684c.clear();
        }
    }

    private ByteBuffer g(int i2) {
        if (this.f1686e == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (this.f1686e == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        throw new IllegalStateException("Buffer too small (" + (this.f1684c == null ? 0 : this.f1684c.capacity()) + " < " + i2 + ")");
    }
}
