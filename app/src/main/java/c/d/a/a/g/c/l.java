package c.d.a.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.E;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
public final class l extends c {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final long f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2482b;

    /* synthetic */ l(long j, long j2, k kVar) {
        this(j, j2);
    }

    private l(long j, long j2) {
        this.f2481a = j;
        this.f2482b = j2;
    }

    static l a(u uVar, long j, E e2) {
        long jA = a(uVar, j);
        return new l(jA, e2.d(jA));
    }

    static long a(u uVar, long j) {
        long jH = uVar.h();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | uVar.n()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f2481a);
        parcel.writeLong(this.f2482b);
    }
}
