package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class A extends AbstractC0403c implements Cloneable {
    public static final Parcelable.Creator<A> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    private String f5167a;

    /* renamed from: b, reason: collision with root package name */
    private String f5168b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5169c;

    /* renamed from: d, reason: collision with root package name */
    private String f5170d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5171e;

    /* renamed from: f, reason: collision with root package name */
    private String f5172f;

    A(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        com.google.android.gms.common.internal.t.b((z && !TextUtils.isEmpty(str3)) || !((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, ortemprary proof.");
        this.f5167a = str;
        this.f5168b = str2;
        this.f5169c = z;
        this.f5170d = str3;
        this.f5171e = z2;
        this.f5172f = str4;
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String o() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC0403c
    public String p() {
        return "phone";
    }

    public String q() {
        return this.f5168b;
    }

    public final A a(boolean z) {
        this.f5171e = false;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5167a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, q(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5169c);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5170d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5171e);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f5172f, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    public /* synthetic */ Object clone() {
        return new A(this.f5167a, q(), this.f5169c, this.f5170d, this.f5171e, this.f5172f);
    }
}
