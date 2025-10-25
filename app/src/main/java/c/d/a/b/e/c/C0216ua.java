package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216ua extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0216ua> CREATOR = new C0214ta();

    /* renamed from: a, reason: collision with root package name */
    private final String f3940a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3941b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3942c;

    public C0216ua(String str, String str2, String str3) {
        this.f3940a = str;
        this.f3941b = str2;
        this.f3942c = str3;
    }

    public final String n() {
        return this.f3940a;
    }

    public final String o() {
        return this.f3941b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3940a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3941b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3942c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
