package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC0352m;

/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0347g extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0347g> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final int f5039a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5040b;

    /* renamed from: c, reason: collision with root package name */
    private int f5041c;

    /* renamed from: d, reason: collision with root package name */
    String f5042d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f5043e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f5044f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f5045g;

    /* renamed from: h, reason: collision with root package name */
    Account f5046h;

    /* renamed from: i, reason: collision with root package name */
    c.d.a.b.b.c[] f5047i;
    c.d.a.b.b.c[] j;
    private boolean k;

    public C0347g(int i2) {
        this.f5039a = 4;
        this.f5041c = c.d.a.b.b.e.f3751a;
        this.f5040b = i2;
        this.k = true;
    }

    C0347g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c.d.a.b.b.c[] cVarArr, c.d.a.b.b.c[] cVarArr2, boolean z) {
        this.f5039a = i2;
        this.f5040b = i3;
        this.f5041c = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f5042d = "com.google.android.gms";
        } else {
            this.f5042d = str;
        }
        if (i2 < 2) {
            this.f5046h = iBinder != null ? AbstractBinderC0341a.a(InterfaceC0352m.a.a(iBinder)) : null;
        } else {
            this.f5043e = iBinder;
            this.f5046h = account;
        }
        this.f5044f = scopeArr;
        this.f5045g = bundle;
        this.f5047i = cVarArr;
        this.j = cVarArr2;
        this.k = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5039a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5040b);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5041c);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5042d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5043e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, (Parcelable[]) this.f5044f, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f5045g, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, (Parcelable) this.f5046h, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 10, (Parcelable[]) this.f5047i, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 11, (Parcelable[]) this.j, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 12, this.k);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
