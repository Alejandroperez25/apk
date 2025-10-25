package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0446b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f5523a = H.f5486a;

    static Executor a() {
        return f5523a;
    }

    static Executor b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), I.f5487a);
    }

    static final /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
