package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends o {
    public static final Parcelable.Creator<m> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final String f2426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2428c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2429d;

    public m(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f2426a = str;
        this.f2427b = str2;
        this.f2428c = str3;
        this.f2429d = bArr;
    }

    m(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        H.a(string);
        this.f2426a = string;
        String string2 = parcel.readString();
        H.a(string2);
        this.f2427b = string2;
        String string3 = parcel.readString();
        H.a(string3);
        this.f2428c = string3;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        H.a(bArrCreateByteArray);
        this.f2429d = bArrCreateByteArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return H.a((Object) this.f2426a, (Object) mVar.f2426a) && H.a((Object) this.f2427b, (Object) mVar.f2427b) && H.a((Object) this.f2428c, (Object) mVar.f2428c) && Arrays.equals(this.f2429d, mVar.f2429d);
    }

    public int hashCode() {
        return ((((((527 + (this.f2426a != null ? this.f2426a.hashCode() : 0)) * 31) + (this.f2427b != null ? this.f2427b.hashCode() : 0)) * 31) + (this.f2428c != null ? this.f2428c.hashCode() : 0)) * 31) + Arrays.hashCode(this.f2429d);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": mimeType=" + this.f2426a + ", filename=" + this.f2427b + ", description=" + this.f2428c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2426a);
        parcel.writeString(this.f2427b);
        parcel.writeString(this.f2428c);
        parcel.writeByteArray(this.f2429d);
    }
}
