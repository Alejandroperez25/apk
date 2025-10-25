package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final /* synthetic */ class I implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    static final ThreadFactory f5487a = new I();

    private I() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return AbstractC0446b.a(runnable);
    }
}
