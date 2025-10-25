package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0466v {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f5574a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5575b;

    /* renamed from: c, reason: collision with root package name */
    private final V f5576c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, X> f5577d;

    public C0466v(Context context) {
        this(context, new V());
    }

    private C0466v(Context context, V v) {
        this.f5577d = new b.c.b();
        this.f5575b = context;
        this.f5574a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f5576c = v;
        File file = new File(androidx.core.content.a.b(this.f5575b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || c()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            b();
            FirebaseInstanceId.a().h();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final synchronized String a() {
        return this.f5574a.getString("topic_operation_queue", "");
    }

    public final synchronized void a(String str) {
        this.f5574a.edit().putString("topic_operation_queue", str).apply();
    }

    private final synchronized boolean c() {
        return this.f5574a.getAll().isEmpty();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void b() {
        this.f5577d.clear();
        V.a(this.f5575b);
        this.f5574a.edit().clear().commit();
    }

    public final synchronized C0465u a(String str, String str2, String str3) {
        return C0465u.a(this.f5574a.getString(b(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String strA = C0465u.a(str4, str5, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f5574a.edit();
        editorEdit.putString(b(str, str2, str3), strA);
        editorEdit.commit();
    }

    public final synchronized X b(String str) {
        X xB;
        X x = this.f5577d.get(str);
        if (x != null) {
            return x;
        }
        try {
            xB = this.f5576c.a(this.f5575b, str);
        } catch (Y unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.a().h();
            xB = this.f5576c.b(this.f5575b, str);
        }
        this.f5577d.put(str, xB);
        return xB;
    }

    public final synchronized void c(String str) {
        String strConcat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor editorEdit = this.f5574a.edit();
        for (String str2 : this.f5574a.getAll().keySet()) {
            if (str2.startsWith(strConcat)) {
                editorEdit.remove(str2);
            }
        }
        editorEdit.commit();
    }
}
