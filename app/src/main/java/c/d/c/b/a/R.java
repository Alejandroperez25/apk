package c.d.c.b.a;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
class R extends c.d.c.H<Locale> {
    R() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Locale a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(bVar.j(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (strNextToken2 == null && strNextToken3 == null) {
            return new Locale(strNextToken);
        }
        if (strNextToken3 == null) {
            return new Locale(strNextToken, strNextToken2);
        }
        return new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Locale locale) throws IOException {
        dVar.c(locale == null ? null : locale.toString());
    }
}
