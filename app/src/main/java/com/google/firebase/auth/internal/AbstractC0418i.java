package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import c.d.a.b.e.c.C0201n;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.auth.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0418i {

    /* renamed from: a, reason: collision with root package name */
    private static final c.d.a.b.b.a.a f5371a = new c.d.a.b.b.a.a("JSONParser", new String[0]);

    public static Map<String, Object> a(String str) {
        com.google.android.gms.common.internal.t.a(str);
        List<String> listA = C0201n.a('.').a(str);
        if (listA.size() < 2) {
            c.d.a.b.b.a.a aVar = f5371a;
            String strValueOf = String.valueOf(str);
            aVar.d(strValueOf.length() != 0 ? "Invalid idToken ".concat(strValueOf) : new String("Invalid idToken "), new Object[0]);
            return Collections.EMPTY_MAP;
        }
        try {
            Map<String, Object> mapB = b(new String(com.google.android.gms.common.util.b.b(listA.get(1)), "UTF-8"));
            return mapB == null ? Collections.EMPTY_MAP : mapB;
        } catch (UnsupportedEncodingException e2) {
            f5371a.a("Unable to decode token", e2, new Object[0]);
            return Collections.EMPTY_MAP;
        }
    }

    public static Map<String, Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return a(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new c.d.a.b.e.c.L(e2);
        }
    }

    private static Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        b.c.b bVar = new b.c.b();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objA = jSONObject.get(next);
            if (objA instanceof JSONArray) {
                objA = a((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            bVar.put(next, objA);
        }
        return bVar;
    }

    private static List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object objA = jSONArray.get(i2);
            if (objA instanceof JSONArray) {
                objA = a((JSONArray) objA);
            } else if (objA instanceof JSONObject) {
                objA = a((JSONObject) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }
}
