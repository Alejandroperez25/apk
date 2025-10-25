package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class P extends ThreadLocal<Boolean> {
    P() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Boolean initialValue() {
        return false;
    }
}
