package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212sa extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0212sa> CREATOR = new C0210ra();

    /* renamed from: a, reason: collision with root package name */
    private final String f3935a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3936b;

    public C0212sa(String str, String str2) {
        this.f3935a = str;
        this.f3936b = str2;
    }

    public final String o() {
        return this.f3935a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3935a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3936b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
