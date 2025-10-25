package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c.d.a.b.e.c.Oa;
import com.google.firebase.auth.AbstractC0437s;
import com.google.firebase.auth.ja;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.auth.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425p {

    /* renamed from: a, reason: collision with root package name */
    private Context f5381a;

    /* renamed from: b, reason: collision with root package name */
    private String f5382b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f5383c;

    /* renamed from: d, reason: collision with root package name */
    private c.d.a.b.b.a.a f5384d;

    public C0425p(Context context, String str) {
        com.google.android.gms.common.internal.t.a(context);
        com.google.android.gms.common.internal.t.a(str);
        this.f5382b = str;
        this.f5381a = context.getApplicationContext();
        this.f5383c = this.f5381a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f5382b), 0);
        this.f5384d = new c.d.a.b.b.a.a("StorageHelpers", new String[0]);
    }

    public final void a(AbstractC0437s abstractC0437s) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        String strC = c(abstractC0437s);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        this.f5383c.edit().putString("com.google.firebase.auth.FIREBASE_USER", strC).apply();
    }

    public final AbstractC0437s a() {
        String string = this.f5383c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return a(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void a(AbstractC0437s abstractC0437s, Oa oa) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        com.google.android.gms.common.internal.t.a(oa);
        this.f5383c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC0437s.i()), oa.t()).apply();
    }

    public final Oa b(AbstractC0437s abstractC0437s) {
        com.google.android.gms.common.internal.t.a(abstractC0437s);
        String string = this.f5383c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC0437s.i()), null);
        if (string != null) {
            return Oa.a(string);
        }
        return null;
    }

    public final void a(String str) {
        this.f5383c.edit().remove(str).apply();
    }

    private final String c(AbstractC0437s abstractC0437s) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!E.class.isAssignableFrom(abstractC0437s.getClass())) {
            return null;
        }
        E e2 = (E) abstractC0437s;
        try {
            jSONObject.put("cachedTokenState", e2.y());
            jSONObject.put("applicationName", e2.s().d());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (e2.C() != null) {
                JSONArray jSONArray = new JSONArray();
                List<A> listC = e2.C();
                for (int i2 = 0; i2 < listC.size(); i2++) {
                    jSONArray.put(listC.get(i2).p());
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", e2.o());
            jSONObject.put("version", "2");
            if (e2.A() != null) {
                jSONObject.put("userMetadata", ((G) e2.A()).a());
            }
            List<ja> listA = ((I) e2.B()).a();
            if (listA != null && !listA.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < listA.size(); i3++) {
                    jSONArray2.put(listA.get(i3).o());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e3) {
            this.f5384d.b("Failed to turn object into JSON", e3, new Object[0]);
            throw new c.d.a.b.e.c.L(e3);
        }
    }

    private final E a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        G gA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(A.a(jSONArray2.getString(i2)));
            }
            E e2 = new E(c.d.b.e.a(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                e2.a(Oa.a(string));
            }
            if (!z) {
                e2.r();
            }
            e2.d(str);
            if (jSONObject.has("userMetadata") && (gA = G.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                e2.a(gA);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i3));
                    arrayList2.add("phone".equals(jSONObject2.optString("factorIdKey")) ? com.google.firebase.auth.L.a(jSONObject2) : null);
                }
                e2.b(arrayList2);
            }
            return e2;
        } catch (c.d.a.b.e.c.L | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e3) {
            this.f5384d.a(e3);
            return null;
        }
    }
}
