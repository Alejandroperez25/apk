package c.d.b;

import android.content.Context;

/* loaded from: classes.dex */
final /* synthetic */ class c implements c.d.b.c.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f4062a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4063b;

    private c(e eVar, Context context) {
        this.f4062a = eVar;
        this.f4063b = context;
    }

    public static c.d.b.c.a a(e eVar, Context context) {
        return new c(eVar, context);
    }

    @Override // c.d.b.c.a
    public Object get() {
        return e.a(this.f4062a, this.f4063b);
    }
}
