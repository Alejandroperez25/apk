package c.d.a.b.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.u;

/* loaded from: classes.dex */
public final class i extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    private final int f3989a;

    /* renamed from: b, reason: collision with root package name */
    private final u f3990b;

    i(int i2, u uVar) {
        this.f3989a = i2;
        this.f3990b = uVar;
    }

    public i(u uVar) {
        this(1, uVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3989a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3990b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
