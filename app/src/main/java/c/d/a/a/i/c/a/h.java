package c.d.a.a.i.c.a;

import android.net.Uri;
import c.d.a.a.m.G;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2621b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2622c;

    /* renamed from: d, reason: collision with root package name */
    private int f2623d;

    public h(String str, long j, long j2) {
        this.f2622c = str == null ? "" : str;
        this.f2620a = j;
        this.f2621b = j2;
    }

    public Uri a(String str) {
        return G.a(str, this.f2622c);
    }

    public String b(String str) {
        return G.b(str, this.f2622c);
    }

    public h a(h hVar, String str) {
        String strB = b(str);
        if (hVar == null || !strB.equals(hVar.b(str))) {
            return null;
        }
        if (this.f2621b != -1 && this.f2620a + this.f2621b == hVar.f2620a) {
            return new h(strB, this.f2620a, hVar.f2621b != -1 ? this.f2621b + hVar.f2621b : -1L);
        }
        if (hVar.f2621b == -1 || hVar.f2620a + hVar.f2621b != this.f2620a) {
            return null;
        }
        return new h(strB, hVar.f2620a, this.f2621b != -1 ? hVar.f2621b + this.f2621b : -1L);
    }

    public int hashCode() {
        if (this.f2623d == 0) {
            this.f2623d = ((((527 + ((int) this.f2620a)) * 31) + ((int) this.f2621b)) * 31) + this.f2622c.hashCode();
        }
        return this.f2623d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2620a == hVar.f2620a && this.f2621b == hVar.f2621b && this.f2622c.equals(hVar.f2622c);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f2622c + ", start=" + this.f2620a + ", length=" + this.f2621b + ")";
    }
}
