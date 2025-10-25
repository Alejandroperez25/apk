package c.d.a.a.l;

import android.net.Uri;
import c.d.a.a.l.B;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D<T> implements B.d {

    /* renamed from: a, reason: collision with root package name */
    public final n f3364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3365b;

    /* renamed from: c, reason: collision with root package name */
    private final F f3366c;

    /* renamed from: d, reason: collision with root package name */
    private final a<? extends T> f3367d;

    /* renamed from: e, reason: collision with root package name */
    private volatile T f3368e;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    @Override // c.d.a.a.l.B.d
    public final void b() {
    }

    public D(k kVar, Uri uri, int i2, a<? extends T> aVar) {
        this(kVar, new n(uri, 3), i2, aVar);
    }

    public D(k kVar, n nVar, int i2, a<? extends T> aVar) {
        this.f3366c = new F(kVar);
        this.f3364a = nVar;
        this.f3365b = i2;
        this.f3367d = aVar;
    }

    public final T c() {
        return this.f3368e;
    }

    public long d() {
        return this.f3366c.d();
    }

    public Uri e() {
        return this.f3366c.e();
    }

    public Map<String, List<String>> f() {
        return this.f3366c.f();
    }

    @Override // c.d.a.a.l.B.d
    public final void a() throws IOException {
        this.f3366c.c();
        m mVar = new m(this.f3366c, this.f3364a);
        try {
            mVar.a();
            Uri uriB = this.f3366c.b();
            AbstractC0170e.a(uriB);
            this.f3368e = this.f3367d.a(uriB, mVar);
        } finally {
            H.a((Closeable) mVar);
        }
    }
}
