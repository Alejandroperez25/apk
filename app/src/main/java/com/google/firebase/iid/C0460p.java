package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import c.d.a.b.h.InterfaceC0227a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0460p {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5554a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Pair<String, String>, c.d.a.b.h.h<InterfaceC0445a>> f5555b = new b.c.b();

    C0460p(Executor executor) {
        this.f5554a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized c.d.a.b.h.h<InterfaceC0445a> a(String str, String str2, InterfaceC0462r interfaceC0462r) {
        final Pair pair = new Pair(str, str2);
        c.d.a.b.h.h<InterfaceC0445a> hVar = this.f5555b.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return hVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        c.d.a.b.h.h hVarB = interfaceC0462r.a().b(this.f5554a, new InterfaceC0227a(this, pair) { // from class: com.google.firebase.iid.o

            /* renamed from: a, reason: collision with root package name */
            private final C0460p f5552a;

            /* renamed from: b, reason: collision with root package name */
            private final Pair f5553b;

            {
                this.f5552a = this;
                this.f5553b = pair;
            }

            @Override // c.d.a.b.h.InterfaceC0227a
            public final Object a(c.d.a.b.h.h hVar2) {
                this.f5552a.a(this.f5553b, hVar2);
                return hVar2;
            }
        });
        this.f5555b.put(pair, hVarB);
        return hVarB;
    }

    final /* synthetic */ c.d.a.b.h.h a(Pair pair, c.d.a.b.h.h hVar) {
        synchronized (this) {
            this.f5555b.remove(pair);
        }
        return hVar;
    }
}
