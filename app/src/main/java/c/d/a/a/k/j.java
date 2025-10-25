package c.d.a.a.k;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3328a;

    /* renamed from: b, reason: collision with root package name */
    private final i[] f3329b;

    /* renamed from: c, reason: collision with root package name */
    private int f3330c;

    public j(i... iVarArr) {
        this.f3329b = iVarArr;
        this.f3328a = iVarArr.length;
    }

    public i a(int i2) {
        return this.f3329b[i2];
    }

    public i[] a() {
        return (i[]) this.f3329b.clone();
    }

    public int hashCode() {
        if (this.f3330c == 0) {
            this.f3330c = 527 + Arrays.hashCode(this.f3329b);
        }
        return this.f3330c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3329b, ((j) obj).f3329b);
    }
}
