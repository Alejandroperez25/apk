package c.d.a.a.l;

import android.net.Uri;
import c.d.a.a.m.AbstractC0170e;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class F implements k {

    /* renamed from: a, reason: collision with root package name */
    private final k f3374a;

    /* renamed from: b, reason: collision with root package name */
    private long f3375b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f3376c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f3377d;

    public F(k kVar) {
        AbstractC0170e.a(kVar);
        this.f3374a = kVar;
        this.f3376c = Uri.EMPTY;
        this.f3377d = Collections.emptyMap();
    }

    public void c() {
        this.f3375b = 0L;
    }

    public long d() {
        return this.f3375b;
    }

    public Uri e() {
        return this.f3376c;
    }

    public Map<String, List<String>> f() {
        return this.f3377d;
    }

    @Override // c.d.a.a.l.k
    public void a(G g2) {
        this.f3374a.a(g2);
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) {
        this.f3376c = nVar.f3417a;
        this.f3377d = Collections.emptyMap();
        long jA = this.f3374a.a(nVar);
        Uri uriB = b();
        AbstractC0170e.a(uriB);
        this.f3376c = uriB;
        this.f3377d = a();
        return jA;
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = this.f3374a.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f3375b += i4;
        }
        return i4;
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        return this.f3374a.b();
    }

    @Override // c.d.a.a.l.k
    public Map<String, List<String>> a() {
        return this.f3374a.a();
    }

    @Override // c.d.a.a.l.k
    public void close() {
        this.f3374a.close();
    }
}
