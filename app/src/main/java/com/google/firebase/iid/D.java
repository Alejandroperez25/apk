package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class D implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5458a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f5459b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f5460c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<G> f5461d;

    /* renamed from: e, reason: collision with root package name */
    private B f5462e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5463f;

    public D(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.a.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private D(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f5461d = new ArrayDeque();
        this.f5463f = false;
        this.f5458a = context.getApplicationContext();
        this.f5459b = new Intent(str).setPackage(this.f5458a.getPackageName());
        this.f5460c = scheduledExecutorService;
    }

    public final synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        this.f5461d.add(new G(intent, pendingResult, this.f5460c));
        a();
    }

    private final synchronized void a() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.f5461d.isEmpty()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            if (this.f5462e != null && this.f5462e.isBinderAlive()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                }
                this.f5462e.a(this.f5461d.poll());
            } else {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z = !this.f5463f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if (!this.f5463f) {
                    this.f5463f = true;
                    try {
                    } catch (SecurityException e2) {
                        Log.e("FirebaseInstanceId", "Exception while binding the service", e2);
                    }
                    if (com.google.android.gms.common.stats.a.a().a(this.f5458a, this.f5459b, this, 65)) {
                        return;
                    }
                    Log.e("FirebaseInstanceId", "binding to the service failed");
                    this.f5463f = false;
                    b();
                }
                return;
            }
        }
    }

    private final void b() {
        while (!this.f5461d.isEmpty()) {
            this.f5461d.poll().a();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f5463f = false;
        if (!(iBinder instanceof B)) {
            String strValueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(strValueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            b();
            return;
        }
        this.f5462e = (B) iBinder;
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        a();
    }
}
