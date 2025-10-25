package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class y extends AbstractDialogInterfaceOnClickListenerC0346f {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Intent f5075a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Activity f5076b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f5077c;

    y(Intent intent, Activity activity, int i2) {
        this.f5075a = intent;
        this.f5076b = activity;
        this.f5077c = i2;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC0346f
    public final void a() {
        if (this.f5075a != null) {
            this.f5076b.startActivityForResult(this.f5075a, this.f5077c);
        }
    }
}
