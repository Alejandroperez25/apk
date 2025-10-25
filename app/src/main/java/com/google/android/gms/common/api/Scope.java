package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;

/* loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    private final int f4839a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4840b;

    Scope(int i2, String str) {
        t.a(str, (Object) "scopeUri must not be null or empty");
        this.f4839a = i2;
        this.f4840b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final String o() {
        return this.f4840b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4840b.equals(((Scope) obj).f4840b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4840b.hashCode();
    }

    public final String toString() {
        return this.f4840b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f4839a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, o(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
