package c.d.a.a.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f1662a;

    public void b() {
        this.f1662a = 0;
    }

    public final boolean c() {
        return e(Integer.MIN_VALUE);
    }

    public final boolean d() {
        return e(4);
    }

    public final boolean e() {
        return e(1);
    }

    public final void b(int i2) {
        this.f1662a = i2;
    }

    public final void c(int i2) {
        this.f1662a = i2 | this.f1662a;
    }

    public final void d(int i2) {
        this.f1662a = (~i2) & this.f1662a;
    }

    protected final boolean e(int i2) {
        return (this.f1662a & i2) == i2;
    }
}
