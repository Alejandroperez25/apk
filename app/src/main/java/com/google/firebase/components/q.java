package com.google.firebase.components;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f5436a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5437b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5438c;

    private q(Class<?> cls, int i2, int i3) {
        com.google.android.gms.common.internal.t.a(cls, "Null dependency anInterface.");
        this.f5436a = cls;
        this.f5437b = i2;
        this.f5438c = i3;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q b(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> a() {
        return this.f5436a;
    }

    public boolean b() {
        return this.f5437b == 1;
    }

    public boolean c() {
        return this.f5437b == 2;
    }

    public boolean d() {
        return this.f5438c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f5436a == qVar.f5436a && this.f5437b == qVar.f5437b && this.f5438c == qVar.f5438c;
    }

    public int hashCode() {
        return ((((this.f5436a.hashCode() ^ 1000003) * 1000003) ^ this.f5437b) * 1000003) ^ this.f5438c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5436a);
        sb.append(", type=");
        sb.append(this.f5437b == 1 ? "required" : this.f5437b == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f5438c == 0);
        sb.append("}");
        return sb.toString();
    }
}
