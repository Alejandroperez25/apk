package c.c.a.a.c;

import c.c.a.a.c.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class f extends n {

    /* renamed from: c, reason: collision with root package name */
    private String f1373c;

    @Override // c.c.a.a.c.j
    protected byte[] b() {
        return null;
    }

    @Override // c.c.a.a.c.j
    protected int c() {
        return 0;
    }

    public f(i iVar) {
        super(iVar);
    }

    public f(String str) {
        super(new i(i.a.TYPE_0_FULL, 3, i.b.DATA_AMF0));
        this.f1373c = str;
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) {
        this.f1373c = c.c.a.a.a.j.a(inputStream, false);
        a(inputStream, c.c.a.a.a.j.a(this.f1373c, false));
    }

    @Override // c.c.a.a.c.j
    protected void a(OutputStream outputStream) throws IOException {
        c.c.a.a.a.j.a(outputStream, this.f1373c, false);
        b(outputStream);
    }
}
