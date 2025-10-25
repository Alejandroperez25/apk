package c.d.c.b.a;

import java.io.IOException;

/* loaded from: classes.dex */
class C extends c.d.c.H<Character> {
    C() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Character a(c.d.c.d.b bVar) throws c.d.c.d.e {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        String strJ = bVar.j();
        if (strJ.length() != 1) {
            throw new c.d.c.C("Expecting character, got: " + strJ);
        }
        return Character.valueOf(strJ.charAt(0));
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Character ch) throws IOException {
        dVar.c(ch == null ? null : String.valueOf(ch));
    }
}
