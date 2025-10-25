package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends o {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2409c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2410d;

    public c(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f2407a = str;
        this.f2408b = str2;
        this.f2409c = i2;
        this.f2410d = bArr;
    }

    c(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        H.a(string);
        this.f2407a = string;
        String string2 = parcel.readString();
        H.a(string2);
        this.f2408b = string2;
        this.f2409c = parcel.readInt();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        H.a(bArrCreateByteArray);
        this.f2410d = bArrCreateByteArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2409c == cVar.f2409c && H.a((Object) this.f2407a, (Object) cVar.f2407a) && H.a((Object) this.f2408b, (Object) cVar.f2408b) && Arrays.equals(this.f2410d, cVar.f2410d);
    }

    public int hashCode() {
        return ((((((527 + this.f2409c) * 31) + (this.f2407a != null ? this.f2407a.hashCode() : 0)) * 31) + (this.f2408b != null ? this.f2408b.hashCode() : 0)) * 31) + Arrays.hashCode(this.f2410d);
    }

    @Override // c.d.a.a.g.b.o
    public String toString() {
        return super.f2436a + ": mimeType=" + this.f2407a + ", description=" + this.f2408b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2407a);
        parcel.writeString(this.f2408b);
        parcel.writeInt(this.f2409c);
        parcel.writeByteArray(this.f2410d);
    }
}
