package c.d.a.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class c extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<c> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final String f3739a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    private final int f3740b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3741c;

    public c(String str, long j) {
        this.f3739a = str;
        this.f3741c = j;
        this.f3740b = -1;
    }

    public c(String str, int i2, long j) {
        this.f3739a = str;
        this.f3740b = i2;
        this.f3741c = j;
    }

    public String o() {
        return this.f3739a;
    }

    public long p() {
        return this.f3741c == -1 ? this.f3740b : this.f3741c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 1, o(), false);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f3740b);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, p());
        com.google.android.gms.common.internal.a.c.a(parcel, iA);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return ((o() != null && o().equals(cVar.o())) || (o() == null && cVar.o() == null)) && p() == cVar.p();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.s.a(o(), Long.valueOf(p()));
    }

    public String toString() {
        s.a aVarA = com.google.android.gms.common.internal.s.a(this);
        aVarA.a("name", o());
        aVarA.a("version", Long.valueOf(p()));
        return aVarA.toString();
    }
}
