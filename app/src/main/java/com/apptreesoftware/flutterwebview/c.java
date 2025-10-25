package com.apptreesoftware.flutterwebview;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4821a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4822b;

    /* renamed from: c, reason: collision with root package name */
    private final b f4823c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (g.b.a.c.a((Object) this.f4821a, (Object) cVar.f4821a)) {
                    if (!(this.f4822b == cVar.f4822b) || !g.b.a.c.a(this.f4823c, cVar.f4823c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f4821a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f4822b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode + i2) * 31;
        b bVar = this.f4823c;
        return i3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "RedirectPolicy(url=" + this.f4821a + ", stopOnRedirect=" + this.f4822b + ", matchType=" + this.f4823c + ")";
    }

    public c(String str, boolean z, b bVar) {
        g.b.a.c.b(str, "url");
        g.b.a.c.b(bVar, "matchType");
        this.f4821a = str;
        this.f4822b = z;
        this.f4823c = bVar;
    }

    public final String a() {
        return this.f4821a;
    }

    public final boolean b() {
        return this.f4822b;
    }

    public final b c() {
        return this.f4823c;
    }
}
