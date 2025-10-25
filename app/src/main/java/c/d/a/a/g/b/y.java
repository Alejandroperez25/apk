package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class y extends o {
    public static final Parcelable.Creator<y> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    public final String f2449a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2450b;

    public y(String str, String str2, String str3) {
        super(str);
        this.f2449a = str2;
        this.f2450b = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    y(Parcel parcel) {
        String string = parcel.readString();
        H.a(string);
        super(string);
        this.f2449a = parcel.readString();
        String string2 = parcel.readString();
        H.a(string2);
        this.f2450b = string2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return super.f2436a.equals(((o) yVar).f2436a) && H.a((Object) this.f2449a, (Object) yVar.f2449a) && H.a((Object) this.f2450b, (Object) yVar.f2450b);
    }

    public int hashCode() {
        return ((((527 + super.f2436a.hashCode()) * 31) + (this.f2449a != null ? this.f2449a.hashCode() : 0)) * 31) + (this.f2450b != null ? this.f2450b.hashCode() : 0);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": url=" + this.f2450b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.f2436a);
        parcel.writeString(this.f2449a);
        parcel.writeString(this.f2450b);
    }
}
