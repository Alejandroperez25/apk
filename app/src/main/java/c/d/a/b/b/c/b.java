package c.d.a.b.b.c;

import android.content.Context;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f3743a = new b();

    /* renamed from: b, reason: collision with root package name */
    private a f3744b = null;

    private final synchronized a b(Context context) {
        if (this.f3744b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3744b = new a(context);
        }
        return this.f3744b;
    }

    public static a a(Context context) {
        return f3743a.b(context);
    }
}
