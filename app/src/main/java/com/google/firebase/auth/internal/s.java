package com.google.firebase.auth.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f5388a;

    public static void a(Intent intent, Status status) {
        com.google.android.gms.common.internal.a.e.a(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean a(Intent intent) {
        com.google.android.gms.common.internal.t.a(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status b(Intent intent) {
        com.google.android.gms.common.internal.t.a(intent);
        com.google.android.gms.common.internal.t.b(a(intent));
        return (Status) com.google.android.gms.common.internal.a.e.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    static {
        HashMap map = new HashMap();
        f5388a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f5388a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f5388a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f5388a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f5388a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }
}
