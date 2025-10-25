package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class h extends a<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) c.d.a.b.e.e.d.a(new i(sharedPreferences, str, str2));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
