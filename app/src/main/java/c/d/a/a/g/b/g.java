package c.d.a.a.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends o {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final String f2412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2413b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2414c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2415d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2416e;

    /* renamed from: f, reason: collision with root package name */
    private final o[] f2417f;

    @Override // c.d.a.a.g.b.o, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public g(String str, int i2, int i3, long j, long j2, o[] oVarArr) {
        super("CHAP");
        this.f2412a = str;
        this.f2413b = i2;
        this.f2414c = i3;
        this.f2415d = j;
        this.f2416e = j2;
        this.f2417f = oVarArr;
    }

    g(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        H.a(string);
        this.f2412a = string;
        this.f2413b = parcel.readInt();
        this.f2414c = parcel.readInt();
        this.f2415d = parcel.readLong();
        this.f2416e = parcel.readLong();
        int i2 = parcel.readInt();
        this.f2417f = new o[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2417f[i3] = (o) parcel.readParcelable(o.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2413b == gVar.f2413b && this.f2414c == gVar.f2414c && this.f2415d == gVar.f2415d && this.f2416e == gVar.f2416e && H.a((Object) this.f2412a, (Object) gVar.f2412a) && Arrays.equals(this.f2417f, gVar.f2417f);
    }

    public int hashCode() {
        return ((((((((527 + this.f2413b) * 31) + this.f2414c) * 31) + ((int) this.f2415d)) * 31) + ((int) this.f2416e)) * 31) + (this.f2412a != null ? this.f2412a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2412a);
        parcel.writeInt(this.f2413b);
        parcel.writeInt(this.f2414c);
        parcel.writeLong(this.f2415d);
        parcel.writeLong(this.f2416e);
        parcel.writeInt(this.f2417f.length);
        for (o oVar : this.f2417f) {
            parcel.writeParcelable(oVar, 0);
        }
    }
}
