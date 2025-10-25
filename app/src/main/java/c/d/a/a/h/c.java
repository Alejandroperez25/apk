package c.d.a.a.h;

/* loaded from: classes.dex */
public final class c implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2492c;

    public c(int i2, int i3, int i4) {
        this.f2490a = i2;
        this.f2491b = i3;
        this.f2492c = i4;
    }

    public String toString() {
        return this.f2490a + "." + this.f2491b + "." + this.f2492c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2490a == cVar.f2490a && this.f2491b == cVar.f2491b && this.f2492c == cVar.f2492c;
    }

    public int hashCode() {
        return (((this.f2490a * 31) + this.f2491b) * 31) + this.f2492c;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int i2 = this.f2490a - cVar.f2490a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f2491b - cVar.f2491b;
        return i3 == 0 ? this.f2492c - cVar.f2492c : i3;
    }
}
