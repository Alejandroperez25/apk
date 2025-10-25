package c.d.c.b;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class v extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f4245a;

    public v(String str) {
        this.f4245a = str;
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f4245a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f4245a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f4245a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f4245a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f4245a).longValue();
        }
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f4245a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f4245a);
    }

    public String toString() {
        return this.f4245a;
    }

    public int hashCode() {
        return this.f4245a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f4245a == vVar.f4245a || this.f4245a.equals(vVar.f4245a);
    }
}
