package c.d.a.a.i;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.AbstractC0170e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public final int f2501a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.q[] f2502b;

    /* renamed from: c, reason: collision with root package name */
    private int f2503c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public E(c.d.a.a.q... qVarArr) {
        AbstractC0170e.b(qVarArr.length > 0);
        this.f2502b = qVarArr;
        this.f2501a = qVarArr.length;
    }

    E(Parcel parcel) {
        this.f2501a = parcel.readInt();
        this.f2502b = new c.d.a.a.q[this.f2501a];
        for (int i2 = 0; i2 < this.f2501a; i2++) {
            this.f2502b[i2] = (c.d.a.a.q) parcel.readParcelable(c.d.a.a.q.class.getClassLoader());
        }
    }

    public c.d.a.a.q a(int i2) {
        return this.f2502b[i2];
    }

    public int a(c.d.a.a.q qVar) {
        for (int i2 = 0; i2 < this.f2502b.length; i2++) {
            if (qVar == this.f2502b[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f2503c == 0) {
            this.f2503c = 527 + Arrays.hashCode(this.f2502b);
        }
        return this.f2503c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        E e2 = (E) obj;
        return this.f2501a == e2.f2501a && Arrays.equals(this.f2502b, e2.f2502b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2501a);
        for (int i3 = 0; i3 < this.f2501a; i3++) {
            parcel.writeParcelable(this.f2502b[i3], 0);
        }
    }
}
