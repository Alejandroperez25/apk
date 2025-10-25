package c.d.a.a.n;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f3634a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3635b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3636c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3637d;

    /* renamed from: e, reason: collision with root package name */
    private int f3638e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public j(int i2, int i3, int i4, byte[] bArr) {
        this.f3634a = i2;
        this.f3635b = i3;
        this.f3636c = i4;
        this.f3637d = bArr;
    }

    j(Parcel parcel) {
        this.f3634a = parcel.readInt();
        this.f3635b = parcel.readInt();
        this.f3636c = parcel.readInt();
        this.f3637d = H.a(parcel) ? parcel.createByteArray() : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3634a == jVar.f3634a && this.f3635b == jVar.f3635b && this.f3636c == jVar.f3636c && Arrays.equals(this.f3637d, jVar.f3637d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f3634a);
        sb.append(", ");
        sb.append(this.f3635b);
        sb.append(", ");
        sb.append(this.f3636c);
        sb.append(", ");
        sb.append(this.f3637d != null);
        sb.append(")");
        return sb.toString();
    }

    public int hashCode() {
        if (this.f3638e == 0) {
            this.f3638e = ((((((527 + this.f3634a) * 31) + this.f3635b) * 31) + this.f3636c) * 31) + Arrays.hashCode(this.f3637d);
        }
        return this.f3638e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3634a);
        parcel.writeInt(this.f3635b);
        parcel.writeInt(this.f3636c);
        H.a(parcel, this.f3637d != null);
        if (this.f3637d != null) {
            parcel.writeByteArray(this.f3637d);
        }
    }
}
