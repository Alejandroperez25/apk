package c.h.b.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f4774a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f4775b = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0055a f4776c;

    /* renamed from: c.h.b.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0055a {
        void a(int i2);
    }

    public void a() {
        this.f4774a++;
        if (System.currentTimeMillis() - this.f4775b >= 1000) {
            if (this.f4776c != null) {
                this.f4776c.a(this.f4774a);
            }
            this.f4774a = 0;
            this.f4775b = System.currentTimeMillis();
        }
    }
}
