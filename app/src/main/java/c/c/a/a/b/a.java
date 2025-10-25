package c.c.a.a.b;

import c.c.a.a.c.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f1341a;

    /* renamed from: b, reason: collision with root package name */
    private i f1342b;

    /* renamed from: c, reason: collision with root package name */
    private i f1343c;

    /* renamed from: d, reason: collision with root package name */
    private long f1344d = System.nanoTime() / 1000000;

    /* renamed from: e, reason: collision with root package name */
    private ByteArrayOutputStream f1345e = new ByteArrayOutputStream(131072);

    public i b() {
        return this.f1342b;
    }

    public void a(i iVar) {
        this.f1342b = iVar;
    }

    public i c() {
        return this.f1343c;
    }

    public boolean a(i.b bVar) {
        return this.f1343c != null && this.f1343c.c() == bVar;
    }

    public void b(i iVar) {
        this.f1343c = iVar;
    }

    public static void a() {
        f1341a = System.nanoTime() / 1000000;
    }

    public long d() {
        return (System.nanoTime() / 1000000) - f1341a;
    }

    public long e() {
        long jNanoTime = System.nanoTime() / 1000000;
        long j = jNanoTime - this.f1344d;
        this.f1344d = jNanoTime;
        return j;
    }

    public boolean a(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[Math.min(this.f1342b.b() - this.f1345e.size(), i2)];
        c.c.a.a.d.a(inputStream, bArr);
        this.f1345e.write(bArr);
        return this.f1345e.size() == this.f1342b.b();
    }

    public ByteArrayInputStream f() {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f1345e.toByteArray());
        this.f1345e.reset();
        return byteArrayInputStream;
    }

    public void g() {
        this.f1345e.reset();
    }
}
