package c.c.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class e extends j {

    /* renamed from: b, reason: collision with root package name */
    protected byte[] f1371b;

    /* renamed from: c, reason: collision with root package name */
    protected int f1372c;

    @Override // c.c.a.a.c.j
    public void a(OutputStream outputStream) {
    }

    public e(i iVar) {
        super(iVar);
    }

    public void a(byte[] bArr, int i2) {
        this.f1371b = bArr;
        this.f1372c = i2;
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) throws IOException {
        this.f1371b = new byte[this.f1401a.b()];
        c.c.a.a.d.a(inputStream, this.f1371b);
    }

    @Override // c.c.a.a.c.j
    public byte[] b() {
        return this.f1371b;
    }

    @Override // c.c.a.a.c.j
    public int c() {
        return this.f1372c;
    }
}
