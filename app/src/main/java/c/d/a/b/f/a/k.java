package c.d.a.b.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v;

/* loaded from: classes.dex */
public final class k extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final int f3991a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.b.b.a f3992b;

    /* renamed from: c, reason: collision with root package name */
    private final v f3993c;

    k(int i2, c.d.a.b.b.a aVar, v vVar) {
        this.f3991a = i2;
        this.f3992b = aVar;
        this.f3993c = vVar;
    }

    public k(int i2) {
        this(new c.d.a.b.b.a(8, null), null);
    }

    private k(c.d.a.b.b.a aVar, v vVar) {
        this(1, aVar, null);
    }

    public final c.d.a.b.b.a o() {
        return this.f3992b;
    }

    public final v p() {
        return this.f3993c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, this.f3991a);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, (Parcelable) this.f3992b, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, (Parcelable) this.f3993c, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
