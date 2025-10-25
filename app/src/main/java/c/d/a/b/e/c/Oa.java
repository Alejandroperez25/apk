package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.firebase_auth.zzlg;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Oa extends com.google.android.gms.common.internal.a.a implements com.google.firebase.auth.a.a.Aa<Oa, zzlg.zzb> {
    public static final Parcelable.Creator<Oa> CREATOR = new Qa();

    /* renamed from: a, reason: collision with root package name */
    private String f3838a;

    /* renamed from: b, reason: collision with root package name */
    private String f3839b;

    /* renamed from: c, reason: collision with root package name */
    private Long f3840c;

    /* renamed from: d, reason: collision with root package name */
    private String f3841d;

    /* renamed from: e, reason: collision with root package name */
    private Long f3842e;

    public Oa() {
        this.f3842e = Long.valueOf(System.currentTimeMillis());
    }

    Oa(String str, String str2, Long l, String str3, Long l2) {
        this.f3838a = str;
        this.f3839b = str2;
        this.f3840c = l;
        this.f3841d = str3;
        this.f3842e = l2;
    }

    public final boolean o() {
        return com.google.android.gms.common.util.f.b().a() + 300000 < this.f3842e.longValue() + (this.f3840c.longValue() * 1000);
    }

    public final void b(String str) {
        com.google.android.gms.common.internal.t.a(str);
        this.f3838a = str;
    }

    public final String p() {
        return this.f3838a;
    }

    public final String q() {
        return this.f3839b;
    }

    public final long r() {
        if (this.f3840c == null) {
            return 0L;
        }
        return this.f3840c.longValue();
    }

    public final long s() {
        return this.f3842e.longValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3838a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3839b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, Long.valueOf(r()), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f3841d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, Long.valueOf(this.f3842e.longValue()), false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    public final String t() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f3838a);
            jSONObject.put("access_token", this.f3839b);
            jSONObject.put("expires_in", this.f3840c);
            jSONObject.put("token_type", this.f3841d);
            jSONObject.put("issued_at", this.f3842e);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            throw new L(e2);
        }
    }

    public static Oa a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Oa oa = new Oa();
            oa.f3838a = jSONObject.optString("refresh_token", null);
            oa.f3839b = jSONObject.optString("access_token", null);
            oa.f3840c = Long.valueOf(jSONObject.optLong("expires_in"));
            oa.f3841d = jSONObject.optString("token_type", null);
            oa.f3842e = Long.valueOf(jSONObject.optLong("issued_at"));
            return oa;
        } catch (JSONException e2) {
            Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            throw new L(e2);
        }
    }
}
