package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f5624a = new l();

    private l() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
