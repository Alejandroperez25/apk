package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    final Intent f5482a;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f5483b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5484c = false;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledFuture<?> f5485d;

    G(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f5482a = intent;
        this.f5483b = pendingResult;
        this.f5485d = scheduledExecutorService.schedule(new Runnable(this, intent) { // from class: com.google.firebase.iid.F

            /* renamed from: a, reason: collision with root package name */
            private final G f5464a;

            /* renamed from: b, reason: collision with root package name */
            private final Intent f5465b;

            {
                this.f5464a = this;
                this.f5465b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                G g2 = this.f5464a;
                String action = this.f5465b.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseInstanceId", sb.toString());
                g2.a();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    final synchronized void a() {
        if (!this.f5484c) {
            this.f5483b.finish();
            this.f5485d.cancel(false);
            this.f5484c = true;
        }
    }
}
