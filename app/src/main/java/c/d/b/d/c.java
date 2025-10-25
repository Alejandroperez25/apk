package c.d.b.d;

import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f4068a;

    public c(String str) {
        this.f4068a = str;
    }

    public int hashCode() {
        return s.a(this.f4068a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return s.a(this.f4068a, ((c) obj).f4068a);
        }
        return false;
    }

    public String toString() {
        s.a aVarA = s.a(this);
        aVarA.a("token", this.f4068a);
        return aVarA.toString();
    }
}
