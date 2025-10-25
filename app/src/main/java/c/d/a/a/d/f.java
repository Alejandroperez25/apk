package c.d.a.a.d;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.AbstractC0132d;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f implements Comparator<a>, Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final a[] f1704a;

    /* renamed from: b, reason: collision with root package name */
    private int f1705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1707d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static f a(f fVar, f fVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            str = fVar.f1706c;
            for (a aVar : fVar.f1704a) {
                if (aVar.f()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (fVar2 != null) {
            if (str == null) {
                str = fVar2.f1706c;
            }
            int size = arrayList.size();
            for (a aVar2 : fVar2.f1704a) {
                if (aVar2.f() && !a(arrayList, size, aVar2.f1709b)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f(str, arrayList);
    }

    public f(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public f(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    public f(a... aVarArr) {
        this((String) null, aVarArr);
    }

    public f(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private f(String str, boolean z, a... aVarArr) {
        this.f1706c = str;
        aVarArr = z ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f1704a = aVarArr;
        this.f1707d = aVarArr.length;
    }

    f(Parcel parcel) {
        this.f1706c = parcel.readString();
        this.f1704a = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f1707d = this.f1704a.length;
    }

    public a a(int i2) {
        return this.f1704a[i2];
    }

    public f a(String str) {
        return H.a((Object) this.f1706c, (Object) str) ? this : new f(str, false, this.f1704a);
    }

    public int hashCode() {
        if (this.f1705b == 0) {
            this.f1705b = ((this.f1706c == null ? 0 : this.f1706c.hashCode()) * 31) + Arrays.hashCode(this.f1704a);
        }
        return this.f1705b;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return H.a((Object) this.f1706c, (Object) fVar.f1706c) && Arrays.equals(this.f1704a, fVar.f1704a);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        if (AbstractC0132d.f1699a.equals(aVar.f1709b)) {
            return AbstractC0132d.f1699a.equals(aVar2.f1709b) ? 0 : 1;
        }
        return aVar.f1709b.compareTo(aVar2.f1709b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1706c);
        parcel.writeTypedArray(this.f1704a, 0);
    }

    private static boolean a(ArrayList<a> arrayList, int i2, UUID uuid) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (arrayList.get(i3).f1709b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        private int f1708a;

        /* renamed from: b, reason: collision with root package name */
        private final UUID f1709b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1710c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1711d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f1712e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f1713f;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public a(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        public a(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            AbstractC0170e.a(uuid);
            this.f1709b = uuid;
            this.f1710c = str;
            AbstractC0170e.a(str2);
            this.f1711d = str2;
            this.f1712e = bArr;
            this.f1713f = z;
        }

        a(Parcel parcel) {
            this.f1709b = new UUID(parcel.readLong(), parcel.readLong());
            this.f1710c = parcel.readString();
            this.f1711d = parcel.readString();
            this.f1712e = parcel.createByteArray();
            this.f1713f = parcel.readByte() != 0;
        }

        public boolean a(UUID uuid) {
            return AbstractC0132d.f1699a.equals(this.f1709b) || uuid.equals(this.f1709b);
        }

        public boolean b(a aVar) {
            return f() && !aVar.f() && a(aVar.f1709b);
        }

        public boolean f() {
            return this.f1712e != null;
        }

        public a a(byte[] bArr) {
            return new a(this.f1709b, this.f1710c, this.f1711d, bArr, this.f1713f);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return H.a((Object) this.f1710c, (Object) aVar.f1710c) && H.a((Object) this.f1711d, (Object) aVar.f1711d) && H.a(this.f1709b, aVar.f1709b) && Arrays.equals(this.f1712e, aVar.f1712e);
        }

        public int hashCode() {
            if (this.f1708a == 0) {
                this.f1708a = (((((this.f1709b.hashCode() * 31) + (this.f1710c == null ? 0 : this.f1710c.hashCode())) * 31) + this.f1711d.hashCode()) * 31) + Arrays.hashCode(this.f1712e);
            }
            return this.f1708a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f1709b.getMostSignificantBits());
            parcel.writeLong(this.f1709b.getLeastSignificantBits());
            parcel.writeString(this.f1710c);
            parcel.writeString(this.f1711d);
            parcel.writeByteArray(this.f1712e);
            parcel.writeByte(this.f1713f ? (byte) 1 : (byte) 0);
        }
    }
}
