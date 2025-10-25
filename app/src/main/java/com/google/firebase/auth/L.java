package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L extends ja {
    public static final Parcelable.Creator<L> CREATOR = new K();

    /* renamed from: a, reason: collision with root package name */
    private final String f5198a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5199b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5200c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5201d;

    public L(String str, String str2, long j, String str3) {
        com.google.android.gms.common.internal.t.a(str);
        this.f5198a = str;
        this.f5199b = str2;
        this.f5200c = j;
        com.google.android.gms.common.internal.t.a(str3);
        this.f5201d = str3;
    }

    public static L a(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new L(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
    }

    @Override // com.google.firebase.auth.ja
    public final JSONObject o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f5198a);
            jSONObject.putOpt("displayName", this.f5199b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5200c));
            jSONObject.putOpt("phoneNumber", this.f5201d);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new c.d.a.b.e.c.L(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5198a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5199b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5200c);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5201d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
