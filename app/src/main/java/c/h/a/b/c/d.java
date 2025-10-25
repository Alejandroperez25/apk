package c.h.a.b.c;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private long f4732a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private long f4733b = 33;

    /* renamed from: c, reason: collision with root package name */
    private long f4734c = 33;

    public void a(int i2) {
        this.f4732a = System.currentTimeMillis();
        long j = 1000 / i2;
        this.f4733b = j;
        this.f4734c = j;
    }

    public boolean a() {
        if (this.f4734c >= System.currentTimeMillis() - this.f4732a) {
            return true;
        }
        this.f4734c += this.f4733b;
        return false;
    }
}
