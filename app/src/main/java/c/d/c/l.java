package c.d.c;

import java.io.IOException;

/* loaded from: classes.dex */
class l extends H<Number> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f4308a;

    l(p pVar) {
        this.f4308a = pVar;
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return Float.valueOf((float) bVar.m());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Number number) throws IOException {
        if (number == null) {
            dVar.h();
        } else {
            p.a(number.floatValue());
            dVar.a(number);
        }
    }
}
