package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.a.a implements i, ReflectedParcelable {

    /* renamed from: h, reason: collision with root package name */
    private final int f4848h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4849i;
    private final String j;
    private final PendingIntent k;

    /* renamed from: a, reason: collision with root package name */
    public static final Status f4841a = new Status(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Status f4842b = new Status(14);

    /* renamed from: c, reason: collision with root package name */
    public static final Status f4843c = new Status(8);

    /* renamed from: d, reason: collision with root package name */
    public static final Status f4844d = new Status(15);

    /* renamed from: e, reason: collision with root package name */
    public static final Status f4845e = new Status(16);

    /* renamed from: f, reason: collision with root package name */
    private static final Status f4846f = new Status(17);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f4847g = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new n();

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.f4848h = i2;
        this.f4849i = i3;
        this.j = str;
        this.k = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.i
    public final Status m() {
        return this;
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public final String o() {
        return this.j;
    }

    public final boolean p() {
        return this.k != null;
    }

    public final int q() {
        return this.f4849i;
    }

    public final int hashCode() {
        return s.a(Integer.valueOf(this.f4848h), Integer.valueOf(this.f4849i), this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4848h == status.f4848h && this.f4849i == status.f4849i && s.a(this.j, status.j) && s.a(this.k, status.k);
    }

    public final String r() {
        if (this.j != null) {
            return this.j;
        }
        return c.a(this.f4849i);
    }

    public final String toString() {
        s.a aVarA = s.a(this);
        aVarA.a("statusCode", r());
        aVarA.a("resolution", this.k);
        return aVarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, q());
        com.google.android.gms.common.internal.a.c.a(parcel, 2, o(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.k, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 1000, this.f4848h);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
