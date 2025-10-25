package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.internal.AbstractC0421l;
import java.util.List;

/* loaded from: classes.dex */
public final class Ja extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<Ja> CREATOR = new Ia();

    /* renamed from: a, reason: collision with root package name */
    private String f3818a;

    /* renamed from: b, reason: collision with root package name */
    private List<Pa> f3819b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.auth.T f3820c;

    public Ja(String str, List<Pa> list, com.google.firebase.auth.T t) {
        this.f3818a = str;
        this.f3819b = list;
        this.f3820c = t;
    }

    public final String o() {
        return this.f3818a;
    }

    public final com.google.firebase.auth.T p() {
        return this.f3820c;
    }

    public final List<com.google.firebase.auth.ja> q() {
        return AbstractC0421l.a(this.f3819b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3818a, false);
        com.google.android.gms.common.internal.a.c.b(parcel, 2, this.f3819b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.f3820c, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
