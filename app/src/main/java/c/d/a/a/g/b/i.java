package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends o {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final String f2418a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2420c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2421d;

    /* renamed from: e, reason: collision with root package name */
    private final o[] f2422e;

    public i(String str, boolean z, boolean z2, String[] strArr, o[] oVarArr) {
        super("CTOC");
        this.f2418a = str;
        this.f2419b = z;
        this.f2420c = z2;
        this.f2421d = strArr;
        this.f2422e = oVarArr;
    }

    i(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        H.a(string);
        this.f2418a = string;
        this.f2419b = parcel.readByte() != 0;
        this.f2420c = parcel.readByte() != 0;
        this.f2421d = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f2422e = new o[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2422e[i3] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2419b == iVar.f2419b && this.f2420c == iVar.f2420c && H.a((Object) this.f2418a, (Object) iVar.f2418a) && Arrays.equals(this.f2421d, iVar.f2421d) && Arrays.equals(this.f2422e, iVar.f2422e);
    }

    public int hashCode() {
        return ((((527 + (this.f2419b ? 1 : 0)) * 31) + (this.f2420c ? 1 : 0)) * 31) + (this.f2418a != null ? this.f2418a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2418a);
        parcel.writeByte(this.f2419b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2420c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f2421d);
        parcel.writeInt(this.f2422e.length);
        for (o oVar : this.f2422e) {
            parcel.writeParcelable(oVar, 0);
        }
    }
}
