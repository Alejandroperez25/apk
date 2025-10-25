package c.d.a.a.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.g.b;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements b.a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f2397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2398b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2399c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2400d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2401e;

    /* renamed from: f, reason: collision with root package name */
    private int f2402f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b(String str, String str2, long j, long j2, byte[] bArr) {
        this.f2397a = str;
        this.f2398b = str2;
        this.f2399c = j;
        this.f2400d = j2;
        this.f2401e = bArr;
    }

    b(Parcel parcel) {
        String string = parcel.readString();
        H.a(string);
        this.f2397a = string;
        String string2 = parcel.readString();
        H.a(string2);
        this.f2398b = string2;
        this.f2399c = parcel.readLong();
        this.f2400d = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        H.a(bArrCreateByteArray);
        this.f2401e = bArrCreateByteArray;
    }

    public int hashCode() {
        if (this.f2402f == 0) {
            this.f2402f = ((((((((527 + (this.f2397a != null ? this.f2397a.hashCode() : 0)) * 31) + (this.f2398b != null ? this.f2398b.hashCode() : 0)) * 31) + ((int) (this.f2399c ^ (this.f2399c >>> 32)))) * 31) + ((int) (this.f2400d ^ (this.f2400d >>> 32)))) * 31) + Arrays.hashCode(this.f2401e);
        }
        return this.f2402f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2399c == bVar.f2399c && this.f2400d == bVar.f2400d && H.a((Object) this.f2397a, (Object) bVar.f2397a) && H.a((Object) this.f2398b, (Object) bVar.f2398b) && Arrays.equals(this.f2401e, bVar.f2401e);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f2397a + ", id=" + this.f2400d + ", value=" + this.f2398b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2397a);
        parcel.writeString(this.f2398b);
        parcel.writeLong(this.f2399c);
        parcel.writeLong(this.f2400d);
        parcel.writeByteArray(this.f2401e);
    }
}
