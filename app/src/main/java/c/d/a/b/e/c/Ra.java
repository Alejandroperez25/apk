package c.d.a.b.e.c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Ra extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ra> CREATOR = new Ua();

    /* renamed from: a, reason: collision with root package name */
    private String f3852a;

    /* renamed from: b, reason: collision with root package name */
    private String f3853b;

    /* renamed from: c, reason: collision with root package name */
    private String f3854c;

    /* renamed from: d, reason: collision with root package name */
    private String f3855d;

    /* renamed from: e, reason: collision with root package name */
    private String f3856e;

    /* renamed from: f, reason: collision with root package name */
    private String f3857f;

    /* renamed from: g, reason: collision with root package name */
    private String f3858g;

    public Ra() {
    }

    Ra(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f3852a = str;
        this.f3853b = str2;
        this.f3854c = str3;
        this.f3855d = str4;
        this.f3856e = str5;
        this.f3857f = str6;
        this.f3858g = str7;
    }

    public final String o() {
        return this.f3852a;
    }

    public final String l() {
        return this.f3853b;
    }

    public final Uri p() {
        if (TextUtils.isEmpty(this.f3854c)) {
            return null;
        }
        return Uri.parse(this.f3854c);
    }

    public final String a() {
        return this.f3855d;
    }

    public final String k() {
        return this.f3857f;
    }

    public final String q() {
        return this.f3856e;
    }

    public final String n() {
        return this.f3858g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3852a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3853b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3854c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f3855d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f3856e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f3857f, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f3858g, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
