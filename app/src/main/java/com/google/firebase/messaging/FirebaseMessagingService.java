package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.C0463s;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {

    /* renamed from: f, reason: collision with root package name */
    private static final Queue<String> f5589f = new ArrayDeque(10);

    public void a() {
    }

    public void a(c cVar) {
    }

    public void a(String str) {
    }

    public void a(String str, Exception exc) {
    }

    public void b(String str) {
    }

    @Override // com.google.firebase.messaging.g
    protected final Intent a(Intent intent) {
        return C0463s.a().b();
    }

    @Override // com.google.firebase.messaging.g
    public final boolean b(Intent intent) throws PendingIntent.CanceledException {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!b.e(intent)) {
            return true;
        }
        b.b(intent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    @Override // com.google.firebase.messaging.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }
}
