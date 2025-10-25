package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0465u {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5570a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b, reason: collision with root package name */
    final String f5571b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5572c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5573d;

    private C0465u(String str, String str2, long j) {
        this.f5571b = str;
        this.f5572c = str2;
        this.f5573d = j;
    }

    static C0465u a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0465u(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
        return new C0465u(str, null, 0L);
    }

    static String a(String str, String str2, long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    final boolean b(String str) {
        return System.currentTimeMillis() > this.f5573d + f5570a || !str.equals(this.f5572c);
    }
}
