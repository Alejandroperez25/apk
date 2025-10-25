package com.google.android.gms.common.util.a;

import android.os.Process;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f5110a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5111b;

    public b(Runnable runnable, int i2) {
        this.f5110a = runnable;
        this.f5111b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f5111b);
        this.f5110a.run();
    }
}
