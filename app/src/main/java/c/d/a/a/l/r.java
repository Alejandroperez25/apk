package c.d.a.a.l;

import android.content.Context;
import android.net.Uri;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3449a;

    /* renamed from: b, reason: collision with root package name */
    private final List<G> f3450b;

    /* renamed from: c, reason: collision with root package name */
    private final k f3451c;

    /* renamed from: d, reason: collision with root package name */
    private k f3452d;

    /* renamed from: e, reason: collision with root package name */
    private k f3453e;

    /* renamed from: f, reason: collision with root package name */
    private k f3454f;

    /* renamed from: g, reason: collision with root package name */
    private k f3455g;

    /* renamed from: h, reason: collision with root package name */
    private k f3456h;

    /* renamed from: i, reason: collision with root package name */
    private k f3457i;
    private k j;

    public r(Context context, k kVar) {
        this.f3449a = context.getApplicationContext();
        AbstractC0170e.a(kVar);
        this.f3451c = kVar;
        this.f3450b = new ArrayList();
    }

    @Override // c.d.a.a.l.k
    public void a(G g2) {
        this.f3451c.a(g2);
        this.f3450b.add(g2);
        a(this.f3452d, g2);
        a(this.f3453e, g2);
        a(this.f3454f, g2);
        a(this.f3455g, g2);
        a(this.f3456h, g2);
        a(this.f3457i, g2);
    }

    @Override // c.d.a.a.l.k
    public long a(n nVar) {
        AbstractC0170e.b(this.j == null);
        String scheme = nVar.f3417a.getScheme();
        if (H.a(nVar.f3417a)) {
            if (nVar.f3417a.getPath().startsWith("/android_asset/")) {
                this.j = d();
            } else {
                this.j = c();
            }
        } else if ("asset".equals(scheme)) {
            this.j = d();
        } else if ("content".equals(scheme)) {
            this.j = e();
        } else if ("rtmp".equals(scheme)) {
            this.j = f();
        } else if ("data".equals(scheme)) {
            this.j = g();
        } else if ("rawresource".equals(scheme)) {
            this.j = h();
        } else {
            this.j = this.f3451c;
        }
        return this.j.a(nVar);
    }

    @Override // c.d.a.a.l.k
    public int read(byte[] bArr, int i2, int i3) {
        k kVar = this.j;
        AbstractC0170e.a(kVar);
        return kVar.read(bArr, i2, i3);
    }

    @Override // c.d.a.a.l.k
    public Uri b() {
        if (this.j == null) {
            return null;
        }
        return this.j.b();
    }

    @Override // c.d.a.a.l.k
    public Map<String, List<String>> a() {
        return this.j == null ? Collections.emptyMap() : this.j.a();
    }

    @Override // c.d.a.a.l.k
    public void close() {
        if (this.j != null) {
            try {
                this.j.close();
            } finally {
                this.j = null;
            }
        }
    }

    private k c() {
        if (this.f3452d == null) {
            this.f3452d = new w();
            a(this.f3452d);
        }
        return this.f3452d;
    }

    private k d() {
        if (this.f3453e == null) {
            this.f3453e = new C0162e(this.f3449a);
            a(this.f3453e);
        }
        return this.f3453e;
    }

    private k e() {
        if (this.f3454f == null) {
            this.f3454f = new h(this.f3449a);
            a(this.f3454f);
        }
        return this.f3454f;
    }

    private k f() {
        if (this.f3455g == null) {
            try {
                this.f3455g = (k) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                a(this.f3455g);
            } catch (ClassNotFoundException unused) {
                c.d.a.a.m.o.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.f3455g == null) {
                this.f3455g = this.f3451c;
            }
        }
        return this.f3455g;
    }

    private k g() {
        if (this.f3456h == null) {
            this.f3456h = new i();
            a(this.f3456h);
        }
        return this.f3456h;
    }

    private k h() {
        if (this.f3457i == null) {
            this.f3457i = new E(this.f3449a);
            a(this.f3457i);
        }
        return this.f3457i;
    }

    private void a(k kVar) {
        for (int i2 = 0; i2 < this.f3450b.size(); i2++) {
            kVar.a(this.f3450b.get(i2));
        }
    }

    private void a(k kVar, G g2) {
        if (kVar != null) {
            kVar.a(g2);
        }
    }
}
