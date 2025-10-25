package c.d.a.a.l;

import android.content.Context;
import c.d.a.a.l.k;

/* loaded from: classes.dex */
public final class s implements k.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3458a;

    /* renamed from: b, reason: collision with root package name */
    private final G f3459b;

    /* renamed from: c, reason: collision with root package name */
    private final k.a f3460c;

    public s(Context context, String str) {
        this(context, str, (G) null);
    }

    public s(Context context, String str, G g2) {
        this(context, g2, new u(str, g2));
    }

    public s(Context context, G g2, k.a aVar) {
        this.f3458a = context.getApplicationContext();
        this.f3459b = g2;
        this.f3460c = aVar;
    }

    @Override // c.d.a.a.l.k.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r a() {
        r rVar = new r(this.f3458a, this.f3460c.a());
        if (this.f3459b != null) {
            rVar.a(this.f3459b);
        }
        return rVar;
    }
}
