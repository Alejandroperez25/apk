package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.ActivityC0109j;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0324d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4946a;

    public C0324d(Activity activity) {
        com.google.android.gms.common.internal.t.a(activity, "Activity must not be null");
        this.f4946a = activity;
    }

    public boolean a() {
        return this.f4946a instanceof ActivityC0109j;
    }

    public final boolean b() {
        return this.f4946a instanceof Activity;
    }

    public Activity c() {
        return (Activity) this.f4946a;
    }

    public ActivityC0109j d() {
        return (ActivityC0109j) this.f4946a;
    }
}
