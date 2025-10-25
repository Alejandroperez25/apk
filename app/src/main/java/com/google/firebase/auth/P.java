package com.google.firebase.auth;

import android.net.Uri;
import c.d.a.b.e.c.AbstractC0223y;
import java.util.Set;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC0223y<String, Integer> f5202a = AbstractC0223y.a("recoverEmail", 2, "resetPassword", 0, "signIn", 4, "verifyEmail", 1);

    /* renamed from: b, reason: collision with root package name */
    private final String f5203b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5204c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5205d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5206e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5207f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5208g;

    private P(String str) {
        this.f5203b = a(str, "apiKey");
        this.f5204c = a(str, "oobCode");
        this.f5205d = a(str, "mode");
        if (this.f5203b == null || this.f5204c == null || this.f5205d == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f5206e = a(str, "continueUrl");
        this.f5207f = a(str, "languageCode");
        this.f5208g = a(str, "tenantId");
    }

    public static P a(String str) {
        com.google.android.gms.common.internal.t.a(str);
        try {
            return new P(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int a() {
        return f5202a.getOrDefault(this.f5205d, 3).intValue();
    }

    public final String b() {
        return this.f5208g;
    }

    private static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(uri.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
