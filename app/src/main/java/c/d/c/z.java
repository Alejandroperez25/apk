package c.d.c;

import c.d.c.b.AbstractC0233a;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class z extends u {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?>[] f4324a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b, reason: collision with root package name */
    private Object f4325b;

    public z(Boolean bool) {
        a(bool);
    }

    public z(Number number) {
        a(number);
    }

    public z(String str) {
        a(str);
    }

    void a(Object obj) {
        if (obj instanceof Character) {
            this.f4325b = String.valueOf(((Character) obj).charValue());
        } else {
            AbstractC0233a.a((obj instanceof Number) || b(obj));
            this.f4325b = obj;
        }
    }

    public boolean j() {
        return this.f4325b instanceof Boolean;
    }

    Boolean k() {
        return (Boolean) this.f4325b;
    }

    public boolean l() {
        if (j()) {
            return k().booleanValue();
        }
        return Boolean.parseBoolean(p());
    }

    public boolean m() {
        return this.f4325b instanceof Number;
    }

    public Number n() {
        return this.f4325b instanceof String ? new c.d.c.b.v((String) this.f4325b) : (Number) this.f4325b;
    }

    public boolean o() {
        return this.f4325b instanceof String;
    }

    public String p() {
        if (m()) {
            return n().toString();
        }
        if (j()) {
            return k().toString();
        }
        return (String) this.f4325b;
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f4324a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f4325b == null) {
            return 31;
        }
        if (a(this)) {
            long jLongValue = n().longValue();
            return (int) ((jLongValue >>> 32) ^ jLongValue);
        }
        if (this.f4325b instanceof Number) {
            long jDoubleToLongBits = Double.doubleToLongBits(n().doubleValue());
            return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
        }
        return this.f4325b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f4325b == null) {
            return zVar.f4325b == null;
        }
        if (a(this) && a(zVar)) {
            return n().longValue() == zVar.n().longValue();
        }
        if ((this.f4325b instanceof Number) && (zVar.f4325b instanceof Number)) {
            double dDoubleValue = n().doubleValue();
            double dDoubleValue2 = zVar.n().doubleValue();
            if (dDoubleValue != dDoubleValue2) {
                return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
            }
            return true;
        }
        return this.f4325b.equals(zVar.f4325b);
    }

    private static boolean a(z zVar) {
        if (!(zVar.f4325b instanceof Number)) {
            return false;
        }
        Number number = (Number) zVar.f4325b;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
