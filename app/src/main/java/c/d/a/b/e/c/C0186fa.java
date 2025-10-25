package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d.a.b.e.c.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186fa extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0186fa> CREATOR = new C0184ea();

    /* renamed from: a, reason: collision with root package name */
    private final String f3900a;

    public C0186fa(String str) {
        this.f3900a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3900a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
