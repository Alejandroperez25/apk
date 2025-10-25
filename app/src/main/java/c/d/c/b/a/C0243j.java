package c.d.c.b.a;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.d.c.b.a.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243j extends c.d.c.d.d {
    private static final Writer l = new C0242i();
    private static final c.d.c.z m = new c.d.c.z("closed");
    private final List<c.d.c.u> n;
    private String o;
    private c.d.c.u p;

    @Override // c.d.c.d.d, java.io.Flushable
    public void flush() {
    }

    public C0243j() {
        super(l);
        this.n = new ArrayList();
        this.p = c.d.c.w.f4322a;
    }

    public c.d.c.u i() {
        if (!this.n.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.n);
        }
        return this.p;
    }

    private c.d.c.u j() {
        return this.n.get(this.n.size() - 1);
    }

    private void a(c.d.c.u uVar) {
        if (this.o != null) {
            if (!uVar.f() || c()) {
                ((c.d.c.x) j()).a(this.o, uVar);
            }
            this.o = null;
            return;
        }
        if (this.n.isEmpty()) {
            this.p = uVar;
            return;
        }
        c.d.c.u uVarJ = j();
        if (uVarJ instanceof c.d.c.r) {
            ((c.d.c.r) uVarJ).a(uVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d d() {
        c.d.c.r rVar = new c.d.c.r();
        a(rVar);
        this.n.add(rVar);
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d e() {
        if (this.n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof c.d.c.r) {
            this.n.remove(this.n.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d f() {
        c.d.c.x xVar = new c.d.c.x();
        a(xVar);
        this.n.add(xVar);
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d g() {
        if (this.n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof c.d.c.x) {
            this.n.remove(this.n.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d b(String str) {
        if (this.n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        }
        if (j() instanceof c.d.c.x) {
            this.o = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d c(String str) {
        if (str == null) {
            return h();
        }
        a(new c.d.c.z(str));
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d h() {
        a(c.d.c.w.f4322a);
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d d(boolean z) {
        a(new c.d.c.z(Boolean.valueOf(z)));
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d a(Boolean bool) {
        if (bool == null) {
            return h();
        }
        a(new c.d.c.z(bool));
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d a(long j) {
        a(new c.d.c.z(Long.valueOf(j)));
        return this;
    }

    @Override // c.d.c.d.d
    public c.d.c.d.d a(Number number) {
        if (number == null) {
            return h();
        }
        if (!a()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new c.d.c.z(number));
        return this;
    }

    @Override // c.d.c.d.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.n.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.n.add(m);
    }
}
