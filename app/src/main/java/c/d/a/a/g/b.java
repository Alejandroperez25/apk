package c.d.a.a.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new c.d.a.a.g.a();

    /* renamed from: a, reason: collision with root package name */
    private final a[] f2405a;

    public interface a extends Parcelable {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b(a... aVarArr) {
        this.f2405a = aVarArr == null ? new a[0] : aVarArr;
    }

    public b(List<? extends a> list) {
        if (list != null) {
            this.f2405a = new a[list.size()];
            list.toArray(this.f2405a);
        } else {
            this.f2405a = new a[0];
        }
    }

    b(Parcel parcel) {
        this.f2405a = new a[parcel.readInt()];
        for (int i2 = 0; i2 < this.f2405a.length; i2++) {
            this.f2405a[i2] = (a) parcel.readParcelable(a.class.getClassLoader());
        }
    }

    public int f() {
        return this.f2405a.length;
    }

    public a a(int i2) {
        return this.f2405a[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f2405a, ((b) obj).f2405a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2405a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2405a.length);
        for (a aVar : this.f2405a) {
            parcel.writeParcelable(aVar, 0);
        }
    }
}
