package c.d.a.a.e.e;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.g.b;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements b.a {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final String f1944a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1946c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1947d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ j(Parcel parcel, i iVar) {
        this(parcel);
    }

    public j(String str, byte[] bArr, int i2, int i3) {
        this.f1944a = str;
        this.f1945b = bArr;
        this.f1946c = i2;
        this.f1947d = i3;
    }

    private j(Parcel parcel) {
        String string = parcel.readString();
        H.a(string);
        this.f1944a = string;
        this.f1945b = new byte[parcel.readInt()];
        parcel.readByteArray(this.f1945b);
        this.f1946c = parcel.readInt();
        this.f1947d = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1944a.equals(jVar.f1944a) && Arrays.equals(this.f1945b, jVar.f1945b) && this.f1946c == jVar.f1946c && this.f1947d == jVar.f1947d;
    }

    public int hashCode() {
        return ((((((527 + this.f1944a.hashCode()) * 31) + Arrays.hashCode(this.f1945b)) * 31) + this.f1946c) * 31) + this.f1947d;
    }

    public String toString() {
        return "mdta: key=" + this.f1944a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1944a);
        parcel.writeInt(this.f1945b.length);
        parcel.writeByteArray(this.f1945b);
        parcel.writeInt(this.f1946c);
        parcel.writeInt(this.f1947d);
    }
}
