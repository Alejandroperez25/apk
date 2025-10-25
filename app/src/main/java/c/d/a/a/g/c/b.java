package c.d.a.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.u;

/* loaded from: classes.dex */
public final class b extends c {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f2451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2452b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2453c;

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    private b(long j, byte[] bArr, long j2) {
        this.f2451a = j2;
        this.f2452b = j;
        this.f2453c = bArr;
    }

    private b(Parcel parcel) {
        this.f2451a = parcel.readLong();
        this.f2452b = parcel.readLong();
        this.f2453c = new byte[parcel.readInt()];
        parcel.readByteArray(this.f2453c);
    }

    static b a(u uVar, int i2, long j) {
        long jN = uVar.n();
        byte[] bArr = new byte[i2 - 4];
        uVar.a(bArr, 0, bArr.length);
        return new b(jN, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f2451a);
        parcel.writeLong(this.f2452b);
        parcel.writeInt(this.f2453c.length);
        parcel.writeByteArray(this.f2453c);
    }
}
