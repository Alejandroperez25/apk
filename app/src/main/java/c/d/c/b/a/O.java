package c.d.c.b.a;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
class O extends c.d.c.H<Timestamp> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.d.c.H f4118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f4119b;

    O(P p, c.d.c.H h2) {
        this.f4119b = p;
        this.f4118a = h2;
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Timestamp a(c.d.c.d.b bVar) {
        Date date = (Date) this.f4118a.a(bVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Timestamp timestamp) {
        this.f4118a.a(dVar, timestamp);
    }
}
