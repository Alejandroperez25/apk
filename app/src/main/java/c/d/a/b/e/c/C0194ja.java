package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C0354a;

/* renamed from: c.d.a.b.e.c.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194ja extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<C0194ja> CREATOR = new C0192ia();

    /* renamed from: a, reason: collision with root package name */
    private final String f3915a;

    /* renamed from: b, reason: collision with root package name */
    private final C0354a f3916b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3917c;

    public C0194ja(String str, C0354a c0354a, String str2) {
        this.f3915a = str;
        this.f3916b = c0354a;
        this.f3917c = str2;
    }

    public final String n() {
        return this.f3915a;
    }

    public final C0354a o() {
        return this.f3916b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3915a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3916b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3917c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
