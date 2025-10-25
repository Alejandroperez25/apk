package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class k extends o {
    public static final Parcelable.Creator<k> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public final String f2423a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2424b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2425c;

    public k(String str, String str2, String str3) {
        super("COMM");
        this.f2423a = str;
        this.f2424b = str2;
        this.f2425c = str3;
    }

    k(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        H.a(string);
        this.f2423a = string;
        String string2 = parcel.readString();
        H.a(string2);
        this.f2424b = string2;
        String string3 = parcel.readString();
        H.a(string3);
        this.f2425c = string3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return H.a((Object) this.f2424b, (Object) kVar.f2424b) && H.a((Object) this.f2423a, (Object) kVar.f2423a) && H.a((Object) this.f2425c, (Object) kVar.f2425c);
    }

    public int hashCode() {
        return ((((527 + (this.f2423a != null ? this.f2423a.hashCode() : 0)) * 31) + (this.f2424b != null ? this.f2424b.hashCode() : 0)) * 31) + (this.f2425c != null ? this.f2425c.hashCode() : 0);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": language=" + this.f2423a + ", description=" + this.f2424b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.f2436a);
        parcel.writeString(this.f2423a);
        parcel.writeString(this.f2425c);
    }
}
