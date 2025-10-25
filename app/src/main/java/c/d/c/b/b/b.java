package c.d.c.b.b;

import c.d.c.b.t;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f4196a;

    public abstract void a(AccessibleObject accessibleObject);

    static {
        f4196a = t.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return f4196a;
    }
}
