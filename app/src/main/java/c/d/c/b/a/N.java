package c.d.c.b.a;

import java.io.IOException;
import java.util.Currency;

/* loaded from: classes.dex */
class N extends c.d.c.H<Currency> {
    N() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Currency a(c.d.c.d.b bVar) {
        return Currency.getInstance(bVar.j());
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Currency currency) throws IOException {
        dVar.c(currency.getCurrencyCode());
    }
}
