package c.d.a.a.h;

import android.net.Uri;
import c.d.a.a.h.a;
import c.d.a.a.l.D;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class b<T extends a<T>> implements D.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final D.a<T> f2488a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f2489b;

    public b(D.a<T> aVar, List<c> list) {
        this.f2488a = aVar;
        this.f2489b = list;
    }

    @Override // c.d.a.a.l.D.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) {
        T tA = this.f2488a.a(uri, inputStream);
        return (this.f2489b == null || this.f2489b.isEmpty()) ? tA : (T) tA.a(this.f2489b);
    }
}
