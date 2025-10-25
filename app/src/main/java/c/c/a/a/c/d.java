package c.c.a.a.c;

import c.c.a.a.c.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class d extends n {

    /* renamed from: c, reason: collision with root package name */
    private String f1369c;

    /* renamed from: d, reason: collision with root package name */
    private int f1370d;

    @Override // c.c.a.a.c.j
    protected byte[] b() {
        return null;
    }

    @Override // c.c.a.a.c.j
    protected int c() {
        return 0;
    }

    public d(i iVar) {
        super(iVar);
    }

    public d(String str, int i2, c.c.a.a.b.a aVar) {
        super(new i(aVar.a(i.b.COMMAND_AMF0) ? i.a.TYPE_1_RELATIVE_LARGE : i.a.TYPE_0_FULL, 3, i.b.COMMAND_AMF0));
        this.f1369c = str;
        this.f1370d = i2;
    }

    public d(String str, int i2) {
        super(new i(i.a.TYPE_0_FULL, 3, i.b.COMMAND_AMF0));
        this.f1369c = str;
        this.f1370d = i2;
    }

    public String e() {
        return this.f1369c;
    }

    public int f() {
        return this.f1370d;
    }

    @Override // c.c.a.a.c.j
    public void a(InputStream inputStream) {
        this.f1369c = c.c.a.a.a.j.a(inputStream, false);
        this.f1370d = (int) c.c.a.a.a.h.b(inputStream);
        a(inputStream, c.c.a.a.a.j.a(this.f1369c, false) + 9);
    }

    @Override // c.c.a.a.c.j
    protected void a(OutputStream outputStream) throws IOException {
        c.c.a.a.a.j.a(outputStream, this.f1369c, false);
        c.c.a.a.a.h.a(outputStream, this.f1370d);
        b(outputStream);
    }

    public String toString() {
        return "RTMP Command (command: " + this.f1369c + ", transaction ID: " + this.f1370d + ")";
    }
}
