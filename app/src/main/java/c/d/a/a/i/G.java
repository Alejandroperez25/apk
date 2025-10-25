package c.d.a.a.i;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f2505b;

    /* renamed from: c, reason: collision with root package name */
    private final E[] f2506c;

    /* renamed from: d, reason: collision with root package name */
    private int f2507d;

    /* renamed from: a, reason: collision with root package name */
    public static final G f2504a = new G(new E[0]);
    public static final Parcelable.Creator<G> CREATOR = new F();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public G(E... eArr) {
        this.f2506c = eArr;
        this.f2505b = eArr.length;
    }

    G(Parcel parcel) {
        this.f2505b = parcel.readInt();
        this.f2506c = new E[this.f2505b];
        for (int i2 = 0; i2 < this.f2505b; i2++) {
            this.f2506c[i2] = (E) parcel.readParcelable(E.class.getClassLoader());
        }
    }

    public E a(int i2) {
        return this.f2506c[i2];
    }

    public int a(E e2) {
        for (int i2 = 0; i2 < this.f2505b; i2++) {
            if (this.f2506c[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f2507d == 0) {
            this.f2507d = Arrays.hashCode(this.f2506c);
        }
        return this.f2507d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        G g2 = (G) obj;
        return this.f2505b == g2.f2505b && Arrays.equals(this.f2506c, g2.f2506c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2505b);
        for (int i3 = 0; i3 < this.f2505b; i3++) {
            parcel.writeParcelable(this.f2506c[i3], 0);
        }
    }
}
