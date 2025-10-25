package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import c.d.a.b.e.c.lb;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.auth.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0426q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorC0426q f5385a = new ExecutorC0426q();

    /* renamed from: b, reason: collision with root package name */
    private Handler f5386b = new lb(Looper.getMainLooper());

    private ExecutorC0426q() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5386b.post(runnable);
    }

    public static ExecutorC0426q a() {
        return f5385a;
    }
}
