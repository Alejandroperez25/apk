package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Lock f4834a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private static a f4835b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f4836c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private final SharedPreferences f4837d;

    public static a a(Context context) {
        t.a(context);
        f4834a.lock();
        try {
            if (f4835b == null) {
                f4835b = new a(context.getApplicationContext());
            }
            return f4835b;
        } finally {
            f4834a.unlock();
        }
    }

    private a(Context context) {
        this.f4837d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public GoogleSignInAccount a() {
        return a(b("defaultGoogleSignInAccount"));
    }

    private final GoogleSignInAccount a(String str) {
        String strB;
        if (TextUtils.isEmpty(str) || (strB = b(a("googleSignInAccount", str))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a(strB);
        } catch (JSONException unused) {
            return null;
        }
    }

    private final String b(String str) {
        this.f4836c.lock();
        try {
            return this.f4837d.getString(str, null);
        } finally {
            this.f4836c.unlock();
        }
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
