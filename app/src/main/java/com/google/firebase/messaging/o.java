package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5629a;

    public o(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f5629a = new Bundle(bundle);
    }

    public final String a(String str) {
        Bundle bundle = this.f5629a;
        if (!this.f5629a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strI = i(str);
            if (this.f5629a.containsKey(strI)) {
                str = strI;
            }
        }
        return bundle.getString(str);
    }

    public final boolean b(String str) {
        String strA = a(str);
        return "1".equals(strA) || Boolean.parseBoolean(strA);
    }

    public final Integer c(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strA));
        } catch (NumberFormatException unused) {
            String strH = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strH).length() + 38 + String.valueOf(strA).length());
            sb.append("Couldn't parse value of ");
            sb.append(strH);
            sb.append("(");
            sb.append(strA);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final Long d(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strA));
        } catch (NumberFormatException unused) {
            String strH = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strH).length() + 38 + String.valueOf(strA).length());
            sb.append("Couldn't parse value of ");
            sb.append(strH);
            sb.append("(");
            sb.append(strA);
            sb.append(") into a long");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final String e(String str) {
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf("_loc_key");
        return a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    public final Object[] f(String str) {
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf("_loc_args");
        JSONArray jSONArrayG = g(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        if (jSONArrayG == null) {
            return null;
        }
        String[] strArr = new String[jSONArrayG.length()];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = jSONArrayG.optString(i2);
        }
        return strArr;
    }

    private final JSONArray g(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            return new JSONArray(strA);
        } catch (JSONException unused) {
            String strH = h(str);
            StringBuilder sb = new StringBuilder(String.valueOf(strH).length() + 50 + String.valueOf(strA).length());
            sb.append("Malformed JSON for key ");
            sb.append(strH);
            sb.append(": ");
            sb.append(strA);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    private static String h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final Uri a() {
        String strA = a("gcm.n.link_android");
        if (TextUtils.isEmpty(strA)) {
            strA = a("gcm.n.link");
        }
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return Uri.parse(strA);
    }

    public final String b() {
        String strA = a("gcm.n.sound2");
        return TextUtils.isEmpty(strA) ? a("gcm.n.sound") : strA;
    }

    public final long[] c() throws JSONException {
        JSONArray jSONArrayG = g("gcm.n.vibrate_timings");
        if (jSONArrayG == null) {
            return null;
        }
        try {
            if (jSONArrayG.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            long[] jArr = new long[jSONArrayG.length()];
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jSONArrayG.optLong(i2);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String strValueOf = String.valueOf(jSONArrayG);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(strValueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    final int[] d() throws JSONException {
        JSONArray jSONArrayG = g("gcm.n.light_settings");
        if (jSONArrayG == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayG.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayG.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayG.optInt(1);
            iArr[2] = jSONArrayG.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e2) {
            String strValueOf = String.valueOf(jSONArrayG);
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(strValueOf);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb.toString());
            return null;
        } catch (JSONException unused) {
            String strValueOf2 = String.valueOf(jSONArrayG);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(strValueOf2);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    public final Bundle e() {
        Bundle bundle = new Bundle(this.f5629a);
        for (String str : this.f5629a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle(this.f5629a);
        for (String str : this.f5629a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    private final String b(Resources resources, String str, String str2) {
        String strE = e(str2);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        int identifier = resources.getIdentifier(strE, "string", str);
        if (identifier == 0) {
            String strValueOf = String.valueOf(str2);
            String strValueOf2 = String.valueOf("_loc_key");
            String strH = h(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(strH).length() + 49 + String.valueOf(str2).length());
            sb.append(strH);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] objArrF = f(str2);
        if (objArrF == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrF);
        } catch (MissingFormatArgumentException e2) {
            String strH2 = h(str2);
            String string = Arrays.toString(objArrF);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strH2).length() + 58 + String.valueOf(string).length());
            sb2.append("Missing format argument for ");
            sb2.append(strH2);
            sb2.append(": ");
            sb2.append(string);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e2);
            return null;
        }
    }

    public final String a(Resources resources, String str, String str2) {
        String strA = a(str2);
        return !TextUtils.isEmpty(strA) ? strA : b(resources, str, str2);
    }

    public static boolean a(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(i("gcm.n.e"))) || bundle.getString("gcm.n.icon") != null || bundle.getString(i("gcm.n.icon")) != null;
    }

    private static String i(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }
}
