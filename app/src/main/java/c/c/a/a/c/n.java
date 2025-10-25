package c.c.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends j {

    /* renamed from: b, reason: collision with root package name */
    protected List<c.c.a.a.a.c> f1422b;

    public n(i iVar) {
        super(iVar);
    }

    public List<c.c.a.a.a.c> d() {
        return this.f1422b;
    }

    public void a(String str) {
        a(new c.c.a.a.a.j(str));
    }

    public void a(c.c.a.a.a.c cVar) {
        if (this.f1422b == null) {
            this.f1422b = new ArrayList();
        }
        if (cVar == null) {
            cVar = new c.c.a.a.a.g();
        }
        this.f1422b.add(cVar);
    }

    protected void a(InputStream inputStream, int i2) {
        do {
            c.c.a.a.a.c cVarA = c.c.a.a.a.e.a(inputStream);
            a(cVarA);
            i2 += cVarA.a();
        } while (i2 < this.f1401a.b());
    }

    protected void b(OutputStream outputStream) throws IOException {
        if (this.f1422b != null) {
            Iterator<c.c.a.a.a.c> it = this.f1422b.iterator();
            while (it.hasNext()) {
                it.next().writeTo(outputStream);
            }
            return;
        }
        c.c.a.a.a.g.a(outputStream);
    }
}
