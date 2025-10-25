package c.c.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class b extends j {

    /* renamed from: b, reason: collision with root package name */
    private int f1368b;

    @Override // c.c.a.a.c.j
    protected byte[] b() {
        return null;
    }

    @Override // c.c.a.a.c.j
    protected int c() {
        return 0;
    }

    public b(i iVar) {
        super(iVar);
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) {
        this.f1368b = c.c.a.a.d.a(inputStream);
    }

    @Override // c.c.a.a.c.j
    protected void a(OutputStream outputStream) throws IOException {
        c.c.a.a.d.a(outputStream, this.f1368b);
    }

    public String toString() {
        return "RTMP Acknowledgment (sequence number: " + this.f1368b + ")";
    }
}
