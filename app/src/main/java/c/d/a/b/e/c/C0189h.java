package c.d.a.b.e.c;

/* renamed from: c.d.a.b.e.c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0189h extends AbstractC0183e {

    /* renamed from: a, reason: collision with root package name */
    private final char f3911a;

    C0189h(char c2) {
        this.f3911a = c2;
    }

    @Override // c.d.a.b.e.c.AbstractC0185f
    public final boolean b(char c2) {
        return c2 == this.f3911a;
    }

    public final String toString() {
        String strC = AbstractC0185f.c(this.f3911a);
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strC);
        sb.append("')");
        return sb.toString();
    }
}
