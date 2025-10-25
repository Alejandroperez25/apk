package c.c.a.a.c;

import c.c.a.a.c.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    protected i f1401a;

    public abstract void a(InputStream inputStream);

    protected abstract void a(OutputStream outputStream);

    protected abstract byte[] b();

    protected abstract int c();

    public j(i iVar) {
        this.f1401a = iVar;
    }

    public i a() {
        return this.f1401a;
    }

    public void a(OutputStream outputStream, int i2, c.c.a.a.b.a aVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream);
        boolean z = this instanceof e;
        byte[] bArrB = z ? b() : byteArrayOutputStream.toByteArray();
        int iC = z ? c() : bArrB.length;
        this.f1401a.d(iC);
        this.f1401a.a(outputStream, i.a.TYPE_0_FULL, aVar);
        int i3 = 0;
        while (iC > i2) {
            outputStream.write(bArrB, i3, i2);
            iC -= i2;
            i3 += i2;
            this.f1401a.a(outputStream, i.a.TYPE_3_RELATIVE_SINGLE_BYTE, aVar);
        }
        outputStream.write(bArrB, i3, iC);
    }
}
