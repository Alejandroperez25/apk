package h.a.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f5856a;

    /* renamed from: b, reason: collision with root package name */
    private long f5857b = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    private b f5858c;

    public a(b bVar) {
        this.f5858c = bVar;
    }

    public synchronized void a(long j) {
        this.f5856a += j;
        if (System.currentTimeMillis() - this.f5857b >= 1000) {
            this.f5858c.a(this.f5856a);
            this.f5857b = System.currentTimeMillis();
            this.f5856a = 0L;
        }
    }
}
