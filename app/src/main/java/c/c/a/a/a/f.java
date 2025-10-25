package c.c.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends i {
    @Override // c.c.a.a.a.i, c.c.a.a.a.c
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(k.ECMA_MAP.a());
        c.c.a.a.d.a(outputStream, this.f1326b.size());
        for (Map.Entry<String, c> entry : this.f1326b.entrySet()) {
            j.a(outputStream, entry.getKey(), true);
            entry.getValue().writeTo(outputStream);
        }
        outputStream.write(i.f1325a);
    }

    @Override // c.c.a.a.a.i, c.c.a.a.a.c
    public void a(InputStream inputStream) {
        c.c.a.a.d.a(inputStream);
        super.a(inputStream);
        this.f1327c += 4;
    }

    @Override // c.c.a.a.a.i, c.c.a.a.a.c
    public int a() {
        if (this.f1327c == -1) {
            this.f1327c = super.a();
            this.f1327c += 4;
        }
        return this.f1327c;
    }
}
