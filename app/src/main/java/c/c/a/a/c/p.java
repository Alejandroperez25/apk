package c.c.a.a.c;

import c.c.a.a.c.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class p extends j {

    /* renamed from: b, reason: collision with root package name */
    private int f1423b;

    @Override // c.c.a.a.c.j
    protected byte[] b() {
        return null;
    }

    @Override // c.c.a.a.c.j
    protected int c() {
        return 0;
    }

    public String toString() {
        return "RTMP Window Acknowledgment Size";
    }

    public p(i iVar) {
        super(iVar);
    }

    public p(int i2, c.c.a.a.b.a aVar) {
        super(new i(aVar.a(i.b.WINDOW_ACKNOWLEDGEMENT_SIZE) ? i.a.TYPE_2_RELATIVE_TIMESTAMP_ONLY : i.a.TYPE_0_FULL, 2, i.b.WINDOW_ACKNOWLEDGEMENT_SIZE));
        this.f1423b = i2;
    }

    public int d() {
        return this.f1423b;
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) {
        this.f1423b = c.c.a.a.d.a(inputStream);
    }

    @Override // c.c.a.a.c.j
    protected void a(OutputStream outputStream) throws IOException {
        c.c.a.a.d.a(outputStream, this.f1423b);
    }
}
