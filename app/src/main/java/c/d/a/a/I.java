package c.d.a.a;

import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f1435a = new I(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final I f1436b = new I(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final I f1437c = new I(Long.MAX_VALUE, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final I f1438d = new I(0, Long.MAX_VALUE);

    /* renamed from: e, reason: collision with root package name */
    public static final I f1439e = f1435a;

    /* renamed from: f, reason: collision with root package name */
    public final long f1440f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1441g;

    public I(long j, long j2) {
        AbstractC0170e.a(j >= 0);
        AbstractC0170e.a(j2 >= 0);
        this.f1440f = j;
        this.f1441g = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        I i2 = (I) obj;
        return this.f1440f == i2.f1440f && this.f1441g == i2.f1441g;
    }

    public int hashCode() {
        return (((int) this.f1440f) * 31) + ((int) this.f1441g);
    }
}
