package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import c.d.a.b.h.InterfaceC0229c;

/* loaded from: classes.dex */
public final class B extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final E f5457a;

    public B(E e2) {
        this.f5457a = e2;
    }

    final void a(final G g2) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.f5457a.a(g2.f5482a).a(AbstractC0446b.a(), new InterfaceC0229c(g2) { // from class: com.google.firebase.iid.A

            /* renamed from: a, reason: collision with root package name */
            private final G f5456a;

            {
                this.f5456a = g2;
            }

            @Override // c.d.a.b.h.InterfaceC0229c
            public final void a(c.d.a.b.h.h hVar) {
                this.f5456a.a();
            }
        });
    }
}
