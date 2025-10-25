package c.d.d;

/* renamed from: c.d.d.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0284j {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f4412a = a();

    static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static C0285k b() {
        if (f4412a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0285k.f4414b;
    }

    private static final C0285k a(String str) {
        return (C0285k) f4412a.getMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
