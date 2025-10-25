package c.c.a.a.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private List<c> f1320a;

    /* renamed from: b, reason: collision with root package name */
    private int f1321b = -1;

    @Override // c.c.a.a.a.c
    public void writeTo(OutputStream outputStream) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // c.c.a.a.a.c
    public void a(InputStream inputStream) {
        int iA = c.c.a.a.d.a(inputStream);
        this.f1321b = 5;
        this.f1320a = new ArrayList(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            c cVarA = e.a(inputStream);
            this.f1321b += cVarA.a();
            this.f1320a.add(cVarA);
        }
    }

    @Override // c.c.a.a.a.c
    public int a() {
        if (this.f1321b == -1) {
            this.f1321b = 5;
            if (this.f1320a != null) {
                Iterator<c> it = this.f1320a.iterator();
                while (it.hasNext()) {
                    this.f1321b += it.next().a();
                }
            }
        }
        return this.f1321b;
    }
}
