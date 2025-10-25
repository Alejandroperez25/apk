package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0468x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final long f5579a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f5580b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseInstanceId f5581c;

    /* renamed from: d, reason: collision with root package name */
    private final C0470z f5582d;

    RunnableC0468x(FirebaseInstanceId firebaseInstanceId, C0455k c0455k, C0470z c0470z, long j) {
        this.f5581c = firebaseInstanceId;
        this.f5582d = c0470z;
        this.f5579a = j;
        this.f5580b.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C0463s.a().a(a())) {
            this.f5580b.acquire();
        }
        try {
            try {
                this.f5581c.a(true);
                if (!this.f5581c.i()) {
                    this.f5581c.a(false);
                    if (C0463s.a().a(a())) {
                        this.f5580b.release();
                        return;
                    }
                    return;
                }
                if (C0463s.a().b(a()) && !b()) {
                    new C0467w(this).a();
                    if (C0463s.a().a(a())) {
                        this.f5580b.release();
                        return;
                    }
                    return;
                }
                if (c() && this.f5582d.a(this.f5581c)) {
                    this.f5581c.a(false);
                } else {
                    this.f5581c.a(this.f5579a);
                }
                if (C0463s.a().a(a())) {
                    this.f5580b.release();
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f5581c.a(false);
                if (C0463s.a().a(a())) {
                    this.f5580b.release();
                }
            }
        } catch (Throwable th) {
            if (C0463s.a().a(a())) {
                this.f5580b.release();
            }
            throw th;
        }
    }

    private final boolean c() throws IOException {
        C0465u c0465uF = this.f5581c.f();
        if (!this.f5581c.a(c0465uF)) {
            return true;
        }
        try {
            String strG = this.f5581c.g();
            if (strG == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((c0465uF == null || (c0465uF != null && !strG.equals(c0465uF.f5571b))) && "[DEFAULT]".equals(this.f5581c.c().d())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf = String.valueOf(this.f5581c.c().d());
                    Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", strG);
                Context contextA = a();
                Intent intent2 = new Intent(contextA, (Class<?>) FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                contextA.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e2) {
            if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                Log.e("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            if (e2.getMessage() == null) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.e("FirebaseInstanceId", sb.toString());
                return false;
            }
            throw e2;
        } catch (SecurityException unused) {
            Log.e("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    final Context a() {
        return this.f5581c.c().c();
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
