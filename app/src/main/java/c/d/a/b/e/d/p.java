package c.d.a.b.e.d;

/* loaded from: classes.dex */
final class p extends o {

    /* renamed from: b, reason: collision with root package name */
    private final n f3972b = new n();

    p() {
    }

    @Override // c.d.a.b.e.d.o
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f3972b.a(th, true).add(th2);
    }
}
