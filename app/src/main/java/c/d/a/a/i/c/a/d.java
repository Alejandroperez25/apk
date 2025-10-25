package c.d.a.a.i.c.a;

import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2605c;

    public d(String str, String str2, String str3) {
        this.f2603a = str;
        this.f2604b = str2;
        this.f2605c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return H.a((Object) this.f2603a, (Object) dVar.f2603a) && H.a((Object) this.f2604b, (Object) dVar.f2604b) && H.a((Object) this.f2605c, (Object) dVar.f2605c);
    }

    public int hashCode() {
        return ((((this.f2603a != null ? this.f2603a.hashCode() : 0) * 31) + (this.f2604b != null ? this.f2604b.hashCode() : 0)) * 31) + (this.f2605c != null ? this.f2605c.hashCode() : 0);
    }
}
