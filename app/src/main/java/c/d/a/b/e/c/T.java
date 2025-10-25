package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class T extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<T> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    private final String f3859a;

    public T(String str) {
        this.f3859a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3859a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
