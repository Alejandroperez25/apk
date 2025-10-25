package com.google.android.gms.common.util.a;

import com.google.android.gms.common.internal.t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f5107a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5108b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f5109c;

    public a(String str) {
        this(str, 0);
    }

    private a(String str, int i2) {
        this.f5109c = Executors.defaultThreadFactory();
        t.a(str, (Object) "Name must not be null");
        this.f5107a = str;
        this.f5108b = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f5109c.newThread(new b(runnable, 0));
        threadNewThread.setName(this.f5107a);
        return threadNewThread;
    }
}
