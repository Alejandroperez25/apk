package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public final class w extends o {
    public static final Parcelable.Creator<w> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    public final String f2447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2448b;

    public w(String str, String str2, String str3) {
        super(str);
        this.f2447a = str2;
        this.f2448b = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    w(Parcel parcel) {
        String string = parcel.readString();
        H.a(string);
        super(string);
        this.f2447a = parcel.readString();
        String string2 = parcel.readString();
        H.a(string2);
        this.f2448b = string2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return super.f2436a.equals(((o) wVar).f2436a) && H.a((Object) this.f2447a, (Object) wVar.f2447a) && H.a((Object) this.f2448b, (Object) wVar.f2448b);
    }

    public int hashCode() {
        return ((((527 + super.f2436a.hashCode()) * 31) + (this.f2447a != null ? this.f2447a.hashCode() : 0)) * 31) + (this.f2448b != null ? this.f2448b.hashCode() : 0);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": value=" + this.f2448b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.f2436a);
        parcel.writeString(this.f2447a);
        parcel.writeString(this.f2448b);
    }
}
