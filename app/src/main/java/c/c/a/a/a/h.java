package c.c.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private double f1324a;

    @Override // c.c.a.a.a.c
    public int a() {
        return 9;
    }

    public h(double d2) {
        this.f1324a = d2;
    }

    public h() {
    }

    public double b() {
        return this.f1324a;
    }

    @Override // c.c.a.a.a.c
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(k.NUMBER.a());
        c.c.a.a.d.a(outputStream, this.f1324a);
    }

    @Override // c.c.a.a.a.c
    public void a(InputStream inputStream) {
        this.f1324a = c.c.a.a.d.d(inputStream);
    }

    public static double b(InputStream inputStream) throws IOException {
        inputStream.read();
        return c.c.a.a.d.d(inputStream);
    }

    public static void a(OutputStream outputStream, double d2) throws IOException {
        outputStream.write(k.NUMBER.a());
        c.c.a.a.d.a(outputStream, d2);
    }
}
