package c.d.a.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import c.d.a.a.m.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends c {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f2469a;

    /* synthetic */ j(Parcel parcel, i iVar) {
        this(parcel);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f2472a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2473b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2474c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2475d;

        /* renamed from: e, reason: collision with root package name */
        public final long f2476e;

        /* renamed from: f, reason: collision with root package name */
        public final List<a> f2477f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f2478g;

        /* renamed from: h, reason: collision with root package name */
        public final long f2479h;

        /* renamed from: i, reason: collision with root package name */
        public final int f2480i;
        public final int j;
        public final int k;

        private b(long j, boolean z, boolean z2, boolean z3, List<a> list, long j2, boolean z4, long j3, int i2, int i3, int i4) {
            this.f2472a = j;
            this.f2473b = z;
            this.f2474c = z2;
            this.f2475d = z3;
            this.f2477f = Collections.unmodifiableList(list);
            this.f2476e = j2;
            this.f2478g = z4;
            this.f2479h = j3;
            this.f2480i = i2;
            this.j = i3;
            this.k = i4;
        }

        private b(Parcel parcel) {
            this.f2472a = parcel.readLong();
            this.f2473b = parcel.readByte() == 1;
            this.f2474c = parcel.readByte() == 1;
            this.f2475d = parcel.readByte() == 1;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(a.b(parcel));
            }
            this.f2477f = Collections.unmodifiableList(arrayList);
            this.f2476e = parcel.readLong();
            this.f2478g = parcel.readByte() == 1;
            this.f2479h = parcel.readLong();
            this.f2480i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(u uVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i2;
            int i3;
            int iH;
            boolean z3;
            boolean z4;
            long jN;
            long jN2 = uVar.n();
            boolean z5 = (uVar.h() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                iH = 0;
                z3 = false;
            } else {
                int iH2 = uVar.h();
                boolean z6 = (iH2 & 128) != 0;
                boolean z7 = (iH2 & 64) != 0;
                boolean z8 = (iH2 & 32) != 0;
                long jN3 = z7 ? uVar.n() : -9223372036854775807L;
                if (!z7) {
                    int iH3 = uVar.h();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    for (int i4 = 0; i4 < iH3; i4++) {
                        arrayList3.add(new a(uVar.h(), uVar.n(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jH = uVar.h();
                    z4 = (128 & jH) != 0;
                    jN = ((((jH & 1) << 32) | uVar.n()) * 1000) / 90;
                } else {
                    z4 = false;
                    jN = -9223372036854775807L;
                }
                int i5 = uVar.i();
                int iH4 = uVar.h();
                iH = uVar.h();
                z3 = z7;
                j = jN3;
                j2 = jN;
                arrayList = arrayList2;
                i2 = i5;
                i3 = iH4;
                z = z6;
                z2 = z4;
            }
            return new b(jN2, z5, z, z3, arrayList, j, z2, j2, i2, i3, iH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Parcel parcel) {
            parcel.writeLong(this.f2472a);
            parcel.writeByte(this.f2473b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f2474c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f2475d ? (byte) 1 : (byte) 0);
            int size = this.f2477f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f2477f.get(i2).c(parcel);
            }
            parcel.writeLong(this.f2476e);
            parcel.writeByte(this.f2478g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f2479h);
            parcel.writeInt(this.f2480i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2470a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2471b;

        /* synthetic */ a(int i2, long j, i iVar) {
            this(i2, j);
        }

        private a(int i2, long j) {
            this.f2470a = i2;
            this.f2471b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f2470a);
            parcel.writeLong(this.f2471b);
        }
    }

    private j(List<b> list) {
        this.f2469a = Collections.unmodifiableList(list);
    }

    private j(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(b.c(parcel));
        }
        this.f2469a = Collections.unmodifiableList(arrayList);
    }

    static j a(u uVar) {
        int iH = uVar.h();
        ArrayList arrayList = new ArrayList(iH);
        for (int i2 = 0; i2 < iH; i2++) {
            arrayList.add(b.b(uVar));
        }
        return new j(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f2469a.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f2469a.get(i3).b(parcel);
        }
    }
}
