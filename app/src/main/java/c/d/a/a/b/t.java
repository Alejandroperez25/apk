package c.d.a.a.b;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f1613a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1614b;

    public t(int i2, float f2) {
        this.f1613a = i2;
        this.f1614b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1613a == tVar.f1613a && Float.compare(tVar.f1614b, this.f1614b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f1613a) * 31) + Float.floatToIntBits(this.f1614b);
    }
}
