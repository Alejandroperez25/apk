package c.d.a.a.i.c.a;

import c.d.a.a.m.H;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2617c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2618d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2619e;

    public g(String str, String str2, String str3, String str4, String str5) {
        this.f2615a = str;
        this.f2616b = str2;
        this.f2617c = str3;
        this.f2618d = str4;
        this.f2619e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return H.a((Object) this.f2615a, (Object) gVar.f2615a) && H.a((Object) this.f2616b, (Object) gVar.f2616b) && H.a((Object) this.f2617c, (Object) gVar.f2617c) && H.a((Object) this.f2618d, (Object) gVar.f2618d) && H.a((Object) this.f2619e, (Object) gVar.f2619e);
    }

    public int hashCode() {
        return ((((((((527 + (this.f2615a != null ? this.f2615a.hashCode() : 0)) * 31) + (this.f2616b != null ? this.f2616b.hashCode() : 0)) * 31) + (this.f2617c != null ? this.f2617c.hashCode() : 0)) * 31) + (this.f2618d != null ? this.f2618d.hashCode() : 0)) * 31) + (this.f2619e != null ? this.f2619e.hashCode() : 0);
    }
}
