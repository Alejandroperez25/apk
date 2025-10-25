package com.google.firebase.auth;

/* renamed from: com.google.firebase.auth.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0406f {
    public static AbstractC0403c a(String str, String str2) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(str2);
        return new C0405e(str, str2);
    }

    public static AbstractC0403c b(String str, String str2) {
        if (!C0405e.a(str2)) {
            throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
        }
        return new C0405e(str, null, str2, null, false);
    }
}
