package c.d.a.a.l;

import c.d.a.a.m.AbstractC0170e;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class m extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final k f3411a;

    /* renamed from: b, reason: collision with root package name */
    private final n f3412b;

    /* renamed from: f, reason: collision with root package name */
    private long f3416f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3414d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3415e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3413c = new byte[1];

    public m(k kVar, n nVar) {
        this.f3411a = kVar;
        this.f3412b = nVar;
    }

    public void a() {
        b();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f3413c) == -1) {
            return -1;
        }
        return this.f3413c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        AbstractC0170e.b(!this.f3415e);
        b();
        int i4 = this.f3411a.read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        this.f3416f += i4;
        return i4;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3415e) {
            return;
        }
        this.f3411a.close();
        this.f3415e = true;
    }

    private void b() {
        if (this.f3414d) {
            return;
        }
        this.f3411a.a(this.f3412b);
        this.f3414d = true;
    }
}
