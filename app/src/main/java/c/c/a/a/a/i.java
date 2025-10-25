package c.c.a.a.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a, reason: collision with root package name */
    protected static final byte[] f1325a = {0, 0, 9};

    /* renamed from: b, reason: collision with root package name */
    Map<String, c> f1326b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    protected int f1327c = -1;

    public c a(String str) {
        return this.f1326b.get(str);
    }

    public void a(String str, boolean z) {
        this.f1326b.put(str, new b(z));
    }

    public void a(String str, String str2) {
        this.f1326b.put(str, new j(str2, false));
    }

    public void a(String str, int i2) {
        this.f1326b.put(str, new h(i2));
    }

    @Override // c.c.a.a.a.c
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(k.OBJECT.a());
        for (Map.Entry<String, c> entry : this.f1326b.entrySet()) {
            j.a(outputStream, entry.getKey(), true);
            entry.getValue().writeTo(outputStream);
        }
        outputStream.write(f1325a);
    }

    @Override // c.c.a.a.a.c
    public void a(InputStream inputStream) {
        this.f1327c = 1;
        InputStream bufferedInputStream = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
        while (true) {
            bufferedInputStream.mark(3);
            byte[] bArr = new byte[3];
            bufferedInputStream.read(bArr);
            if (bArr[0] == f1325a[0] && bArr[1] == f1325a[1] && bArr[2] == f1325a[2]) {
                this.f1327c += 3;
                return;
            }
            bufferedInputStream.reset();
            String strA = j.a(inputStream, true);
            this.f1327c += j.a(strA, true);
            c cVarA = e.a(bufferedInputStream);
            this.f1327c += cVarA.a();
            this.f1326b.put(strA, cVarA);
        }
    }

    @Override // c.c.a.a.a.c
    public int a() {
        if (this.f1327c == -1) {
            this.f1327c = 1;
            for (Map.Entry<String, c> entry : this.f1326b.entrySet()) {
                this.f1327c += j.a(entry.getKey(), true);
                this.f1327c += entry.getValue().a();
            }
            this.f1327c += 3;
        }
        return this.f1327c;
    }
}
