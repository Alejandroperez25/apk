package i.a.a;

import android.content.Context;

/* loaded from: classes.dex */
abstract class c {
    abstract String a();

    abstract void a(double d2);

    abstract void a(int i2);

    abstract void a(Context context);

    abstract void a(d dVar);

    abstract void a(String str, Context context);

    abstract void a(String str, boolean z, Context context);

    abstract void a(boolean z, boolean z2, Context context);

    abstract int b(double d2);

    abstract void b();

    abstract void c();

    abstract void d();

    abstract int e();

    abstract int f();

    abstract boolean g();

    c() {
    }

    protected static boolean a(Object obj, Object obj2) {
        return (obj == null && obj2 == null) || (obj != null && obj.equals(obj2));
    }
}
