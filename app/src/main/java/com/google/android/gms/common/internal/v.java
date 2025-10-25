package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC0352m;

/* loaded from: classes.dex */
public class v extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<v> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    private final int f5068a;

    /* renamed from: b, reason: collision with root package name */
    private IBinder f5069b;

    /* renamed from: c, reason: collision with root package name */
    private c.d.a.b.b.a f5070c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5071d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5072e;

    v(int i2, IBinder iBinder, c.d.a.b.b.a aVar, boolean z, boolean z2) {
        this.f5068a = i2;
        this.f5069b = iBinder;
        this.f5070c = aVar;
        this.f5071d = z;
        this.f5072e = z2;
    }

    public InterfaceC0352m o() {
        return InterfaceC0352m.a.a(this.f5069b);
    }

    public c.d.a.b.b.a p() {
        return this.f5070c;
    }

    public boolean q() {
        return this.f5071d;
    }

    public boolean r() {
        return this.f5072e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f5068a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5069b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) p(), i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, q());
        com.google.android.gms.common.internal.a.c.a(parcel, 5, r());
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f5070c.equals(vVar.f5070c) && o().equals(vVar.o());
    }
}
