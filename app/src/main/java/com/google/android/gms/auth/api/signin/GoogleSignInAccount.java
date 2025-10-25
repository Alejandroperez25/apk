package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private static d f4825a = f.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f4826b;

    /* renamed from: c, reason: collision with root package name */
    private String f4827c;

    /* renamed from: d, reason: collision with root package name */
    private String f4828d;

    /* renamed from: e, reason: collision with root package name */
    private String f4829e;

    /* renamed from: f, reason: collision with root package name */
    private String f4830f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f4831g;

    /* renamed from: h, reason: collision with root package name */
    private String f4832h;

    /* renamed from: i, reason: collision with root package name */
    private long f4833i;
    private String j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    public static GoogleSignInAccount a(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount googleSignInAccountA = a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountA.f4832h = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountA;
    }

    private static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long jLongValue = (l == null ? Long.valueOf(f4825a.a() / 1000) : l).longValue();
        t.a(str7);
        t.a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, jLongValue, str7, new ArrayList(set), str5, str6);
    }

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f4826b = i2;
        this.f4827c = str;
        this.f4828d = str2;
        this.f4829e = str3;
        this.f4830f = str4;
        this.f4831g = uri;
        this.f4832h = str5;
        this.f4833i = j;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public String o() {
        return this.f4827c;
    }

    public String p() {
        return this.f4828d;
    }

    public String n() {
        return this.f4829e;
    }

    public Account q() {
        if (this.f4829e == null) {
            return null;
        }
        return new Account(this.f4829e, "com.google");
    }

    public String l() {
        return this.f4830f;
    }

    public String r() {
        return this.l;
    }

    public String s() {
        return this.m;
    }

    public Uri h() {
        return this.f4831g;
    }

    public String t() {
        return this.f4832h;
    }

    public Set<Scope> u() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.a(parcel, 1, this.f4826b);
        c.a(parcel, 2, o(), false);
        c.a(parcel, 3, p(), false);
        c.a(parcel, 4, n(), false);
        c.a(parcel, 5, l(), false);
        c.a(parcel, 6, (Parcelable) h(), i2, false);
        c.a(parcel, 7, t(), false);
        c.a(parcel, 8, this.f4833i);
        c.a(parcel, 9, this.j, false);
        c.b(parcel, 10, this.k, false);
        c.a(parcel, 11, r(), false);
        c.a(parcel, 12, s(), false);
        c.a(parcel, iA);
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + u().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.u().equals(u());
    }
}
