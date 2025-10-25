package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0342b {
    public static com.google.android.gms.common.api.b a(Status status) {
        return status.p() ? new com.google.android.gms.common.api.h(status) : new com.google.android.gms.common.api.b(status);
    }
}
