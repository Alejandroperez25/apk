package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f5073a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5074b;

    public x(Context context) {
        t.a(context);
        this.f5073a = context.getResources();
        this.f5074b = this.f5073a.getResourcePackageName(c.d.a.b.b.i$a.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f5073a.getIdentifier(str, "string", this.f5074b);
        if (identifier == 0) {
            return null;
        }
        return this.f5073a.getString(identifier);
    }
}
