package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c.d.a.b.e.c.Ma;
import c.d.a.b.e.c.Ra;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A extends com.google.android.gms.common.internal.a.a implements com.google.firebase.auth.G {
    public static final Parcelable.Creator<A> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    private String f5322a;

    /* renamed from: b, reason: collision with root package name */
    private String f5323b;

    /* renamed from: c, reason: collision with root package name */
    private String f5324c;

    /* renamed from: d, reason: collision with root package name */
    private String f5325d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f5326e;

    /* renamed from: f, reason: collision with root package name */
    private String f5327f;

    /* renamed from: g, reason: collision with root package name */
    private String f5328g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5329h;

    /* renamed from: i, reason: collision with root package name */
    private String f5330i;

    public A(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f5322a = str;
        this.f5323b = str2;
        this.f5327f = str3;
        this.f5328g = str4;
        this.f5324c = str5;
        this.f5325d = str6;
        if (!TextUtils.isEmpty(this.f5325d)) {
            this.f5326e = Uri.parse(this.f5325d);
        }
        this.f5329h = z;
        this.f5330i = str7;
    }

    public A(Ma ma, String str) {
        com.google.android.gms.common.internal.t.a(ma);
        com.google.android.gms.common.internal.t.a(str);
        String strO = ma.o();
        com.google.android.gms.common.internal.t.a(strO);
        this.f5322a = strO;
        this.f5323b = str;
        this.f5327f = ma.n();
        this.f5324c = ma.l();
        Uri uriP = ma.p();
        if (uriP != null) {
            this.f5325d = uriP.toString();
            this.f5326e = uriP;
        }
        this.f5329h = ma.j();
        this.f5330i = null;
        this.f5328g = ma.k();
    }

    public A(Ra ra) {
        com.google.android.gms.common.internal.t.a(ra);
        this.f5322a = ra.o();
        String strA = ra.a();
        com.google.android.gms.common.internal.t.a(strA);
        this.f5323b = strA;
        this.f5324c = ra.l();
        Uri uriP = ra.p();
        if (uriP != null) {
            this.f5325d = uriP.toString();
            this.f5326e = uriP;
        }
        this.f5327f = ra.n();
        this.f5328g = ra.k();
        this.f5329h = false;
        this.f5330i = ra.q();
    }

    @Override // com.google.firebase.auth.G
    public final String i() {
        return this.f5322a;
    }

    @Override // com.google.firebase.auth.G
    public final String a() {
        return this.f5323b;
    }

    @Override // com.google.firebase.auth.G
    public final String l() {
        return this.f5324c;
    }

    @Override // com.google.firebase.auth.G
    public final Uri h() {
        if (!TextUtils.isEmpty(this.f5325d) && this.f5326e == null) {
            this.f5326e = Uri.parse(this.f5325d);
        }
        return this.f5326e;
    }

    @Override // com.google.firebase.auth.G
    public final String n() {
        return this.f5327f;
    }

    @Override // com.google.firebase.auth.G
    public final String k() {
        return this.f5328g;
    }

    @Override // com.google.firebase.auth.G
    public final boolean j() {
        return this.f5329h;
    }

    public final String o() {
        return this.f5330i;
    }

    public final String p() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f5322a);
            jSONObject.putOpt("providerId", this.f5323b);
            jSONObject.putOpt("displayName", this.f5324c);
            jSONObject.putOpt("photoUrl", this.f5325d);
            jSONObject.putOpt("email", this.f5327f);
            jSONObject.putOpt("phoneNumber", this.f5328g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f5329h));
            jSONObject.putOpt("rawUserInfo", this.f5330i);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new c.d.a.b.e.c.L(e2);
        }
    }

    public static A a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new A(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new c.d.a.b.e.c.L(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, i(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, a(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, l(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5325d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, n(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, k(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, j());
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f5330i, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
