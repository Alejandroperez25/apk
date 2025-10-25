package c.d.a.a.e;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2354a = new p(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f2355b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2356c;

    public p(long j, long j2) {
        this.f2355b = j;
        this.f2356c = j2;
    }

    public String toString() {
        return "[timeUs=" + this.f2355b + ", position=" + this.f2356c + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2355b == pVar.f2355b && this.f2356c == pVar.f2356c;
    }

    public int hashCode() {
        return (((int) this.f2355b) * 31) + ((int) this.f2356c);
    }
}
