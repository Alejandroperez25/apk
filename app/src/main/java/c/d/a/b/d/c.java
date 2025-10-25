package c.d.a.b.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f3773a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3774b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final e f3775c = new e();

    private c() {
    }

    private static c c() {
        c cVar;
        synchronized (c.class) {
            cVar = f3773a;
        }
        return cVar;
    }

    public static b a() {
        return c().f3774b;
    }

    public static e b() {
        return c().f3775c;
    }

    static {
        c cVar = new c();
        synchronized (c.class) {
            f3773a = cVar;
        }
    }
}
