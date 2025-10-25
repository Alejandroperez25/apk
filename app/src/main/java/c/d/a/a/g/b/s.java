package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final int f2440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2442c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2443d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2444e;

    @Override // c.d.a.a.g.b.o, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public s(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f2440a = i2;
        this.f2441b = i3;
        this.f2442c = i4;
        this.f2443d = iArr;
        this.f2444e = iArr2;
    }

    s(Parcel parcel) {
        super("MLLT");
        this.f2440a = parcel.readInt();
        this.f2441b = parcel.readInt();
        this.f2442c = parcel.readInt();
        this.f2443d = parcel.createIntArray();
        this.f2444e = parcel.createIntArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2440a == sVar.f2440a && this.f2441b == sVar.f2441b && this.f2442c == sVar.f2442c && Arrays.equals(this.f2443d, sVar.f2443d) && Arrays.equals(this.f2444e, sVar.f2444e);
    }

    public int hashCode() {
        return ((((((((527 + this.f2440a) * 31) + this.f2441b) * 31) + this.f2442c) * 31) + Arrays.hashCode(this.f2443d)) * 31) + Arrays.hashCode(this.f2444e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2440a);
        parcel.writeInt(this.f2441b);
        parcel.writeInt(this.f2442c);
        parcel.writeIntArray(this.f2443d);
        parcel.writeIntArray(this.f2444e);
    }
}
