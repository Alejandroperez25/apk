package com.google.firebase.auth.a.a;

import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class Ia {
    public static String a() {
        return a("firebase-auth");
    }

    private static String a(String str) throws IOException {
        String strA = com.google.android.gms.common.internal.r.a().a(str);
        return (TextUtils.isEmpty(strA) || strA.equals("UNKNOWN")) ? "-1" : strA;
    }
}
