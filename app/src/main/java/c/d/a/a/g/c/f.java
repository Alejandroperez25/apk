package c.d.a.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.E;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends c {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final long f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2459c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2461e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2462f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2463g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f2464h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2465i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    /* synthetic */ f(Parcel parcel, e eVar) {
        this(parcel);
    }

    private f(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<a> list, boolean z5, long j4, int i2, int i3, int i4) {
        this.f2457a = j;
        this.f2458b = z;
        this.f2459c = z2;
        this.f2460d = z3;
        this.f2461e = z4;
        this.f2462f = j2;
        this.f2463g = j3;
        this.f2464h = Collections.unmodifiableList(list);
        this.f2465i = z5;
        this.j = j4;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    private f(Parcel parcel) {
        this.f2457a = parcel.readLong();
        this.f2458b = parcel.readByte() == 1;
        this.f2459c = parcel.readByte() == 1;
        this.f2460d = parcel.readByte() == 1;
        this.f2461e = parcel.readByte() == 1;
        this.f2462f = parcel.readLong();
        this.f2463g = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(a.a(parcel));
        }
        this.f2464h = Collections.unmodifiableList(arrayList);
        this.f2465i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    static f a(u uVar, long j, E e2) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i2;
        int iH;
        int iH2;
        boolean z4;
        List arrayList;
        long jN;
        boolean z5;
        long jN2 = uVar.n();
        boolean z6 = (uVar.h() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i2 = 0;
            iH = 0;
            iH2 = 0;
            z4 = false;
        } else {
            int iH3 = uVar.h();
            boolean z7 = (iH3 & 128) != 0;
            boolean z8 = (iH3 & 64) != 0;
            boolean z9 = (iH3 & 32) != 0;
            boolean z10 = (iH3 & 16) != 0;
            long jA = (!z8 || z10) ? -9223372036854775807L : l.a(uVar, j);
            if (z8) {
                arrayList = listEmptyList;
            } else {
                int iH4 = uVar.h();
                arrayList = new ArrayList(iH4);
                for (int i3 = 0; i3 < iH4; i3++) {
                    int iH5 = uVar.h();
                    long jA2 = !z10 ? l.a(uVar, j) : -9223372036854775807L;
                    arrayList.add(new a(iH5, jA2, e2.d(jA2), null));
                }
            }
            if (z9) {
                long jH = uVar.h();
                z5 = (128 & jH) != 0;
                jN = ((((jH & 1) << 32) | uVar.n()) * 1000) / 90;
            } else {
                jN = -9223372036854775807L;
                z5 = false;
            }
            i2 = uVar.i();
            iH = uVar.h();
            iH2 = uVar.h();
            z = z7;
            list = arrayList;
            long j4 = jN;
            z2 = z10;
            j2 = jA;
            z3 = z5;
            j3 = j4;
            z4 = z8;
        }
        return new f(jN2, z6, z, z4, z2, j2, e2.d(j2), list, z3, j3, i2, iH, iH2);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2466a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2467b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2468c;

        /* synthetic */ a(int i2, long j, long j2, e eVar) {
            this(i2, j, j2);
        }

        private a(int i2, long j, long j2) {
            this.f2466a = i2;
            this.f2467b = j;
            this.f2468c = j2;
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f2466a);
            parcel.writeLong(this.f2467b);
            parcel.writeLong(this.f2468c);
        }

        public static a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f2457a);
        parcel.writeByte(this.f2458b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2459c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2460d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2461e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f2462f);
        parcel.writeLong(this.f2463g);
        int size = this.f2464h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f2464h.get(i3).b(parcel);
        }
        parcel.writeByte(this.f2465i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
