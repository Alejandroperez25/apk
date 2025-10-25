package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.InterfaceC0402b;
import java.util.Map;

/* loaded from: classes.dex */
public final class w implements InterfaceC0402b {
    public static final Parcelable.Creator<w> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    private final String f5389a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5390b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f5391c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5392d;

    public w(String str, String str2, boolean z) {
        com.google.android.gms.common.internal.t.a(str);
        com.google.android.gms.common.internal.t.a(str2);
        this.f5389a = str;
        this.f5390b = str2;
        this.f5391c = AbstractC0418i.b(str2);
        this.f5392d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public w(boolean z) {
        this.f5392d = z;
        this.f5390b = null;
        this.f5389a = null;
        this.f5391c = null;
    }

    @Override // com.google.firebase.auth.InterfaceC0402b
    public final String a() {
        return this.f5389a;
    }

    @Override // com.google.firebase.auth.InterfaceC0402b
    public final Map<String, Object> getProfile() {
        return this.f5391c;
    }

    @Override // com.google.firebase.auth.InterfaceC0402b
    public final String getUsername() {
        if ("github.com".equals(this.f5389a)) {
            return (String) this.f5391c.get("login");
        }
        if ("twitter.com".equals(this.f5389a)) {
            return (String) this.f5391c.get("screen_name");
        }
        return null;
    }

    @Override // com.google.firebase.auth.InterfaceC0402b
    public final boolean e() {
        return this.f5392d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, a(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5390b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, e());
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
