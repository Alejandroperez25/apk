package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<V> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    private final String f3861a;

    public V(String str) {
        this.f3861a = str;
    }

    public final String o() {
        return this.f3861a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3861a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
