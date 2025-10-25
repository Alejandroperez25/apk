package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.InterfaceC0438t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class G implements InterfaceC0438t {
    public static final Parcelable.Creator<G> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private long f5342a;

    /* renamed from: b, reason: collision with root package name */
    private long f5343b;

    public G(long j, long j2) {
        this.f5342a = j;
        this.f5343b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.InterfaceC0438t
    public final long c() {
        return this.f5342a;
    }

    @Override // com.google.firebase.auth.InterfaceC0438t
    public final long b() {
        return this.f5343b;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f5342a);
            jSONObject.put("creationTimestamp", this.f5343b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static G a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new G(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, c());
        com.google.android.gms.common.internal.a.c.a(parcel, 2, b());
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
