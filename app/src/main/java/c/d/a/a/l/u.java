package c.d.a.a.l;

import c.d.a.a.l.y;

/* loaded from: classes.dex */
public final class u extends y.a {

    /* renamed from: b, reason: collision with root package name */
    private final String f3466b;

    /* renamed from: c, reason: collision with root package name */
    private final G f3467c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3468d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3469e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3470f;

    public u(String str, G g2) {
        this(str, g2, 8000, 8000, false);
    }

    public u(String str, G g2, int i2, int i3, boolean z) {
        this.f3466b = str;
        this.f3467c = g2;
        this.f3468d = i2;
        this.f3469e = i3;
        this.f3470f = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.a.a.l.y.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t a(y.f fVar) {
        t tVar = new t(this.f3466b, null, this.f3468d, this.f3469e, this.f3470f, fVar);
        if (this.f3467c != null) {
            tVar.a(this.f3467c);
        }
        return tVar;
    }
}
