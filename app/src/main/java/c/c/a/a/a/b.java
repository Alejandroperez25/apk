package c.c.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1322a;

    @Override // c.c.a.a.a.c
    public int a() {
        return 2;
    }

    public b(boolean z) {
        this.f1322a = z;
    }

    public b() {
    }

    @Override // c.c.a.a.a.c
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(k.BOOLEAN.a());
        outputStream.write(this.f1322a ? 1 : 0);
    }

    @Override // c.c.a.a.a.c
    public void a(InputStream inputStream) {
        this.f1322a = inputStream.read() == 1;
    }
}
