package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes.dex */
final class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5216a;

    X(FirebaseAuth firebaseAuth) {
        this.f5216a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f5216a.f5181d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f5216a);
        }
    }
}
