package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: com.google.firebase.iid.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0467w extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC0468x f5578a;

    public C0467w(RunnableC0468x runnableC0468x) {
        this.f5578a = runnableC0468x;
    }

    public final void a() {
        if (FirebaseInstanceId.b()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f5578a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f5578a != null && this.f5578a.b()) {
            if (FirebaseInstanceId.b()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a(this.f5578a, 0L);
            this.f5578a.a().unregisterReceiver(this);
            this.f5578a = null;
        }
    }
}
