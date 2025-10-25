package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u extends o {
    public static final Parcelable.Creator<u> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f2445a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2446b;

    public u(String str, byte[] bArr) {
        super("PRIV");
        this.f2445a = str;
        this.f2446b = bArr;
    }

    u(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        H.a(string);
        this.f2445a = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        H.a(bArrCreateByteArray);
        this.f2446b = bArrCreateByteArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return H.a((Object) this.f2445a, (Object) uVar.f2445a) && Arrays.equals(this.f2446b, uVar.f2446b);
    }

    public int hashCode() {
        return ((527 + (this.f2445a != null ? this.f2445a.hashCode() : 0)) * 31) + Arrays.hashCode(this.f2446b);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": owner=" + this.f2445a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2445a);
        parcel.writeByteArray(this.f2446b);
    }
}
