package com.google.firebase.auth.a.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.firebase.auth.a.a.AbstractC0357b;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.auth.a.a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0355a<T extends AbstractC0357b> {

    /* renamed from: a, reason: collision with root package name */
    private static c.d.a.b.b.a.a f5274a = new c.d.a.b.b.a.a("BiChannelGoogleApi", "FirebaseAuth: ");

    /* renamed from: b, reason: collision with root package name */
    private C0359c<T> f5275b;

    abstract Future<C0359c<T>> a();

    public final <ResultT, A extends a.b> c.d.a.b.h.h<ResultT> a(InterfaceC0367g<A, ResultT> interfaceC0367g) {
        com.google.android.gms.common.api.d<T> dVarA = a(interfaceC0367g.b());
        return dVarA == null ? b() : (c.d.a.b.h.h<ResultT>) dVarA.a(interfaceC0367g.c());
    }

    public final <ResultT, A extends a.b> c.d.a.b.h.h<ResultT> b(InterfaceC0367g<A, ResultT> interfaceC0367g) {
        com.google.android.gms.common.api.d<T> dVarA = a(interfaceC0367g.b());
        if (dVarA == null) {
            return b();
        }
        return (c.d.a.b.h.h<ResultT>) dVarA.b(interfaceC0367g.c());
    }

    private static <ResultT> c.d.a.b.h.h<ResultT> b() {
        return c.d.a.b.h.k.a((Exception) ya.a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable")));
    }

    private final com.google.android.gms.common.api.d<T> a(String str) {
        C0359c<T> c0359cC = c();
        if (c0359cC.f5280c.a(str)) {
            c.d.a.b.b.a.a aVar = f5274a;
            String strValueOf = String.valueOf(c0359cC.f5279b);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 43);
            sb.append("getGoogleApiForMethod() returned Fallback: ");
            sb.append(strValueOf);
            aVar.c(sb.toString(), new Object[0]);
            return (com.google.android.gms.common.api.d<T>) c0359cC.f5279b;
        }
        c.d.a.b.b.a.a aVar2 = f5274a;
        String strValueOf2 = String.valueOf(c0359cC.f5278a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 38);
        sb2.append("getGoogleApiForMethod() returned Gms: ");
        sb2.append(strValueOf2);
        aVar2.c(sb2.toString(), new Object[0]);
        return (com.google.android.gms.common.api.d<T>) c0359cC.f5278a;
    }

    private final C0359c<T> c() {
        C0359c<T> c0359c;
        synchronized (this) {
            if (this.f5275b == null) {
                try {
                    this.f5275b = a().get();
                } catch (Exception e2) {
                    String strValueOf = String.valueOf(e2.getMessage());
                    throw new RuntimeException(strValueOf.length() != 0 ? "There was an error while initializing the connection to Google Play Services: ".concat(strValueOf) : new String("There was an error while initializing the connection to Google Play Services: "));
                }
            }
            c0359c = this.f5275b;
        }
        return c0359c;
    }
}
