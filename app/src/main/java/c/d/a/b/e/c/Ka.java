package c.d.a.b.e.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase_auth.zzp;
import java.util.List;

/* loaded from: classes.dex */
public final class Ka extends com.google.android.gms.common.internal.a.a implements com.google.firebase.auth.a.a.Aa<Ka, zzp.zzb> {
    public static final Parcelable.Creator<Ka> CREATOR = new La();

    /* renamed from: a, reason: collision with root package name */
    private String f3821a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3822b;

    /* renamed from: c, reason: collision with root package name */
    private String f3823c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3824d;

    /* renamed from: e, reason: collision with root package name */
    private ab f3825e;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f3826f;

    public Ka() {
        this.f3825e = ab.o();
    }

    public Ka(String str, boolean z, String str2, boolean z2, ab abVar, List<String> list) {
        this.f3821a = str;
        this.f3822b = z;
        this.f3823c = str2;
        this.f3824d = z2;
        this.f3825e = abVar == null ? ab.o() : ab.a(abVar);
        this.f3826f = list;
    }

    public final List<String> o() {
        return this.f3826f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3821a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f3822b);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f3823c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f3824d);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, (Parcelable) this.f3825e, i2, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f3826f, false);
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }
}
