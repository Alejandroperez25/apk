package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.AbstractC0437s;
import com.google.firebase.auth.InterfaceC0402b;
import com.google.firebase.auth.InterfaceC0404d;
import com.google.firebase.auth.T;
import java.util.List;

/* loaded from: classes.dex */
public final class y implements InterfaceC0404d {
    public static final Parcelable.Creator<y> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    private E f5393a;

    /* renamed from: b, reason: collision with root package name */
    private w f5394b;

    /* renamed from: c, reason: collision with root package name */
    private T f5395c;

    y(E e2, w wVar, T t) {
        this.f5393a = e2;
        this.f5394b = wVar;
        this.f5395c = t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public y(E e2) {
        com.google.android.gms.common.internal.t.a(e2);
        this.f5393a = e2;
        List<A> listC = this.f5393a.C();
        this.f5394b = null;
        for (int i2 = 0; i2 < listC.size(); i2++) {
            if (!TextUtils.isEmpty(listC.get(i2).o())) {
                this.f5394b = new w(listC.get(i2).a(), listC.get(i2).o(), e2.e());
            }
        }
        if (this.f5394b == null) {
            this.f5394b = new w(e2.e());
        }
        this.f5395c = e2.D();
    }

    @Override // com.google.firebase.auth.InterfaceC0404d
    public final AbstractC0437s getUser() {
        return this.f5393a;
    }

    @Override // com.google.firebase.auth.InterfaceC0404d
    public final InterfaceC0402b d() {
        return this.f5394b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, (Parcelable) getUser(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) d(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.f5395c, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
