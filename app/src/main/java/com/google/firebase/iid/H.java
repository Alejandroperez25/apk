package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final /* synthetic */ class H implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f5486a = new H();

    private H() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
