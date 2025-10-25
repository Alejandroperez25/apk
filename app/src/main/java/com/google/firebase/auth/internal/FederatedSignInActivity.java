package com.google.firebase.auth.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.ActivityC0109j;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
/* loaded from: classes.dex */
public class FederatedSignInActivity extends ActivityC0109j {
    private static long r;
    private static final C0416g s = C0416g.a();
    private static Handler t;
    private static Runnable u;
    private boolean v = false;

    @Override // androidx.fragment.app.ActivityC0109j, androidx.activity.c, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.LINK".equals(action) && !"com.google.firebase.auth.internal.REAUTHENTICATE".equals(action)) {
            String strValueOf = String.valueOf(action);
            Log.e("IdpSignInActivity", strValueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(strValueOf) : new String("Could not do operation - unknown action: "));
            j();
            return;
        }
        long jA = com.google.android.gms.common.util.f.b().a();
        if (jA - r < 30000) {
            Log.e("IdpSignInActivity", "Could not start operation - already in progress");
            return;
        }
        r = jA;
        if (bundle != null) {
            this.v = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.fragment.app.ActivityC0109j, androidx.activity.c, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    @Override // androidx.fragment.app.ActivityC0109j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onResume() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.FederatedSignInActivity.onResume():void");
    }

    @Override // androidx.fragment.app.ActivityC0109j, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (t != null && u != null) {
            t.removeCallbacks(u);
            u = null;
        }
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        r = 0L;
        this.v = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!b.j.a.b.a(this).a(intent)) {
            C0422m.a(this, L.a("WEB_CONTEXT_CANCELED"));
        } else {
            s.a(this);
        }
        finish();
    }

    private final void a(Status status) {
        r = 0L;
        this.v = false;
        Intent intent = new Intent();
        s.a(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!b.j.a.b.a(this).a(intent)) {
            C0422m.a(getApplicationContext(), status);
        } else {
            s.a(this);
        }
        finish();
    }

    static /* synthetic */ Runnable a(Runnable runnable) {
        u = null;
        return null;
    }
}
