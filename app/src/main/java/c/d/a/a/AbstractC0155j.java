package c.d.a.a;

import android.content.Context;
import android.os.Looper;
import c.d.a.a.a.a;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.l.q;

/* renamed from: c.d.a.a.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0155j {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0163f f3074a;

    public static K a(Context context, c.d.a.a.k.k kVar) {
        return a(context, new C0144g(context), kVar);
    }

    public static K a(Context context, H h2, c.d.a.a.k.k kVar) {
        return a(context, h2, kVar, new C0133e());
    }

    public static K a(Context context, H h2, c.d.a.a.k.k kVar, t tVar) {
        return a(context, h2, kVar, tVar, null, c.d.a.a.m.H.a());
    }

    public static K a(Context context, H h2, c.d.a.a.k.k kVar, t tVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, Looper looper) {
        return a(context, h2, kVar, tVar, hVar, new a.C0025a(), looper);
    }

    public static K a(Context context, H h2, c.d.a.a.k.k kVar, t tVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, a.C0025a c0025a, Looper looper) {
        return a(context, h2, kVar, tVar, hVar, a(), c0025a, looper);
    }

    public static K a(Context context, H h2, c.d.a.a.k.k kVar, t tVar, c.d.a.a.d.h<c.d.a.a.d.j> hVar, InterfaceC0163f interfaceC0163f, a.C0025a c0025a, Looper looper) {
        return new K(context, h2, kVar, tVar, hVar, interfaceC0163f, c0025a, looper);
    }

    private static synchronized InterfaceC0163f a() {
        if (f3074a == null) {
            f3074a = new q.a().a();
        }
        return f3074a;
    }
}
