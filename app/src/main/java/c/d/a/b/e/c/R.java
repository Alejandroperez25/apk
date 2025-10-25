package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class R extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<R> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    private final String f3849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3850b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3851c;

    public R(String str, String str2, String str3) {
        this.f3849a = str;
        this.f3850b = str2;
        this.f3851c = str3;
    }

    public final String n() {
        return this.f3849a;
    }

    public final String o() {
        return this.f3850b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3849a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3850b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3851c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
