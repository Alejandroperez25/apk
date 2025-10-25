package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends o {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2411a;

    public e(String str, byte[] bArr) {
        super(str);
        this.f2411a = bArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    e(Parcel parcel) {
        String string = parcel.readString();
        H.a(string);
        super(string);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        H.a(bArrCreateByteArray);
        this.f2411a = bArrCreateByteArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return super.f2436a.equals(((o) eVar).f2436a) && Arrays.equals(this.f2411a, eVar.f2411a);
    }

    public int hashCode() {
        return ((527 + super.f2436a.hashCode()) * 31) + Arrays.hashCode(this.f2411a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.f2436a);
        parcel.writeByteArray(this.f2411a);
    }
}
