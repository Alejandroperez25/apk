package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public final String f2437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2439c;

    public q(String str, String str2, String str3) {
        super("----");
        this.f2437a = str;
        this.f2438b = str2;
        this.f2439c = str3;
    }

    q(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        H.a(string);
        this.f2437a = string;
        String string2 = parcel.readString();
        H.a(string2);
        this.f2438b = string2;
        String string3 = parcel.readString();
        H.a(string3);
        this.f2439c = string3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return H.a((Object) this.f2438b, (Object) qVar.f2438b) && H.a((Object) this.f2437a, (Object) qVar.f2437a) && H.a((Object) this.f2439c, (Object) qVar.f2439c);
    }

    public int hashCode() {
        return ((((527 + (this.f2437a != null ? this.f2437a.hashCode() : 0)) * 31) + (this.f2438b != null ? this.f2438b.hashCode() : 0)) * 31) + (this.f2439c != null ? this.f2439c.hashCode() : 0);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": domain=" + this.f2437a + ", description=" + this.f2438b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.f2436a);
        parcel.writeString(this.f2437a);
        parcel.writeString(this.f2439c);
    }
}
