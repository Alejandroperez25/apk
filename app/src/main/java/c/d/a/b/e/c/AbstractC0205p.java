package c.d.a.b.e.c;

/* renamed from: c.d.a.b.e.c.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0205p extends AbstractC0177b<String> {

    /* renamed from: c, reason: collision with root package name */
    final CharSequence f3929c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC0185f f3930d;

    /* renamed from: g, reason: collision with root package name */
    private int f3933g;

    /* renamed from: f, reason: collision with root package name */
    private int f3932f = 0;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3931e = false;

    protected AbstractC0205p(C0201n c0201n, CharSequence charSequence) {
        this.f3930d = c0201n.f3922a;
        this.f3933g = c0201n.f3925d;
        this.f3929c = charSequence;
    }

    abstract int a(int i2);

    abstract int b(int i2);

    @Override // c.d.a.b.e.c.AbstractC0177b
    protected final /* synthetic */ String a() {
        int i2 = this.f3932f;
        while (this.f3932f != -1) {
            int iA = a(this.f3932f);
            if (iA == -1) {
                iA = this.f3929c.length();
                this.f3932f = -1;
            } else {
                this.f3932f = b(iA);
            }
            if (this.f3932f == i2) {
                this.f3932f++;
                if (this.f3932f > this.f3929c.length()) {
                    this.f3932f = -1;
                }
            } else {
                while (i2 < iA && this.f3930d.b(this.f3929c.charAt(i2))) {
                    i2++;
                }
                while (iA > i2 && this.f3930d.b(this.f3929c.charAt(iA - 1))) {
                    iA--;
                }
                if (this.f3931e && i2 == iA) {
                    i2 = this.f3932f;
                } else {
                    if (this.f3933g == 1) {
                        iA = this.f3929c.length();
                        this.f3932f = -1;
                        while (iA > i2 && this.f3930d.b(this.f3929c.charAt(iA - 1))) {
                            iA--;
                        }
                    } else {
                        this.f3933g--;
                    }
                    return this.f3929c.subSequence(i2, iA).toString();
                }
            }
        }
        b();
        return null;
    }
}
