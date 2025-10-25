package c.d.a.a;

import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f3722a = new z(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f3723b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3724c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3725d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3726e;

    public z(float f2) {
        this(f2, 1.0f, false);
    }

    public z(float f2, float f3, boolean z) {
        AbstractC0170e.a(f2 > 0.0f);
        AbstractC0170e.a(f3 > 0.0f);
        this.f3723b = f2;
        this.f3724c = f3;
        this.f3725d = z;
        this.f3726e = Math.round(f2 * 1000.0f);
    }

    public long a(long j) {
        return j * this.f3726e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f3723b == zVar.f3723b && this.f3724c == zVar.f3724c && this.f3725d == zVar.f3725d;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f3723b)) * 31) + Float.floatToRawIntBits(this.f3724c)) * 31) + (this.f3725d ? 1 : 0);
    }
}
