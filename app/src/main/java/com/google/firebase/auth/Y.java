package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.InterfaceC0410a;
import java.util.Iterator;

/* loaded from: classes.dex */
final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c.d.b.d.c f5217a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5218b;

    Y(FirebaseAuth firebaseAuth, c.d.b.d.c cVar) {
        this.f5218b = firebaseAuth;
        this.f5217a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f5218b.f5180c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0410a) it.next()).a(this.f5217a);
        }
        Iterator it2 = this.f5218b.f5179b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f5218b);
        }
    }
}
