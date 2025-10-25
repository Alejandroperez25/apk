package f.a.b.d;

import c.d.a.a.A;
import c.d.a.a.B;
import c.d.a.a.C0145h;
import c.d.a.a.M;
import c.d.a.a.i.G;
import c.d.a.a.z;
import java.util.HashMap;

/* loaded from: classes.dex */
class r implements A.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f5796a;

    @Override // c.d.a.a.A.b
    public /* synthetic */ void a() {
        B.a(this);
    }

    @Override // c.d.a.a.A.b
    public /* synthetic */ void a(M m, Object obj, int i2) {
        B.a(this, m, obj, i2);
    }

    @Override // c.d.a.a.A.b
    public /* synthetic */ void a(G g2, c.d.a.a.k.j jVar) {
        B.a(this, g2, jVar);
    }

    @Override // c.d.a.a.A.b
    public /* synthetic */ void a(z zVar) {
        B.a(this, zVar);
    }

    @Override // c.d.a.a.A.b
    public /* synthetic */ void a(boolean z) {
        B.a(this, z);
    }

    @Override // c.d.a.a.A.b
    public /* synthetic */ void b(int i2) {
        B.b(this, i2);
    }

    @Override // c.d.a.a.A.b
    public /* synthetic */ void c(int i2) {
        B.a(this, i2);
    }

    r(s sVar) {
        this.f5796a = sVar;
    }

    @Override // c.d.a.a.A.b
    public void a(boolean z, int i2) {
        if (i2 == 2) {
            this.f5796a.a();
            return;
        }
        if (i2 == 3) {
            if (this.f5796a.f5802f) {
                return;
            }
            this.f5796a.f5802f = true;
            this.f5796a.f();
            return;
        }
        if (i2 == 4) {
            HashMap map = new HashMap();
            map.put("event", "completed");
            this.f5796a.f5800d.a(map);
        }
    }

    @Override // c.d.a.a.A.b
    public void a(C0145h c0145h) {
        if (this.f5796a.f5800d != null) {
            this.f5796a.f5800d.a("VideoError", "Video player had error " + c0145h, null);
        }
    }
}
