package c.d.a.a.k;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c.d.a.a.i.E;
import c.d.a.a.i.G;
import c.d.a.a.k.a;
import c.d.a.a.k.h;
import c.d.a.a.k.i;
import c.d.a.a.l.InterfaceC0163f;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f3293d = new int[0];

    /* renamed from: e, reason: collision with root package name */
    private final i.a f3294e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<c> f3295f;

    protected static boolean a(int i2, boolean z) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    private static int b(int i2, int i3) {
        if (i2 == -1) {
            return i3 == -1 ? 0 : -1;
        }
        if (i3 == -1) {
            return 1;
        }
        return i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i2, int i3) {
        if (i2 > i3) {
            return 1;
        }
        return i3 > i2 ? -1 : 0;
    }

    public static final class c implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<Map<G, C0042d>> f3307b;

        /* renamed from: c, reason: collision with root package name */
        private final SparseBooleanArray f3308c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3309d;

        /* renamed from: e, reason: collision with root package name */
        public final String f3310e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f3311f;

        /* renamed from: g, reason: collision with root package name */
        public final int f3312g;

        /* renamed from: h, reason: collision with root package name */
        public final int f3313h;

        /* renamed from: i, reason: collision with root package name */
        public final int f3314i;
        public final int j;
        public final int k;
        public final boolean l;
        public final int m;
        public final int n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final boolean r;
        public final boolean s;
        public final boolean t;
        public final int u;

        /* renamed from: a, reason: collision with root package name */
        public static final c f3306a = new c();
        public static final Parcelable.Creator<c> CREATOR = new e();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private c() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        c(SparseArray<Map<G, C0042d>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, int i3, int i4, int i5, int i6, boolean z6, boolean z7, int i7, int i8, boolean z8, int i9) {
            this.f3307b = sparseArray;
            this.f3308c = sparseBooleanArray;
            this.f3309d = H.b(str);
            this.f3310e = H.b(str2);
            this.f3311f = z;
            this.f3312g = i2;
            this.p = z2;
            this.q = z3;
            this.r = z4;
            this.s = z5;
            this.f3313h = i3;
            this.f3314i = i4;
            this.j = i5;
            this.k = i6;
            this.l = z6;
            this.t = z7;
            this.m = i7;
            this.n = i8;
            this.o = z8;
            this.u = i9;
        }

        c(Parcel parcel) {
            this.f3307b = a(parcel);
            this.f3308c = parcel.readSparseBooleanArray();
            this.f3309d = parcel.readString();
            this.f3310e = parcel.readString();
            this.f3311f = H.a(parcel);
            this.f3312g = parcel.readInt();
            this.p = H.a(parcel);
            this.q = H.a(parcel);
            this.r = H.a(parcel);
            this.s = H.a(parcel);
            this.f3313h = parcel.readInt();
            this.f3314i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = H.a(parcel);
            this.t = H.a(parcel);
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = H.a(parcel);
            this.u = parcel.readInt();
        }

        public final boolean a(int i2) {
            return this.f3308c.get(i2);
        }

        public final boolean a(int i2, G g2) {
            Map<G, C0042d> map = this.f3307b.get(i2);
            return map != null && map.containsKey(g2);
        }

        public final C0042d b(int i2, G g2) {
            Map<G, C0042d> map = this.f3307b.get(i2);
            if (map != null) {
                return map.get(g2);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3311f == cVar.f3311f && this.f3312g == cVar.f3312g && this.p == cVar.p && this.q == cVar.q && this.r == cVar.r && this.s == cVar.s && this.f3313h == cVar.f3313h && this.f3314i == cVar.f3314i && this.j == cVar.j && this.l == cVar.l && this.t == cVar.t && this.o == cVar.o && this.m == cVar.m && this.n == cVar.n && this.k == cVar.k && this.u == cVar.u && TextUtils.equals(this.f3309d, cVar.f3309d) && TextUtils.equals(this.f3310e, cVar.f3310e) && a(this.f3308c, cVar.f3308c) && a(this.f3307b, cVar.f3307b);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((this.f3311f ? 1 : 0) * 31) + this.f3312g) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + this.f3313h) * 31) + this.f3314i) * 31) + this.j) * 31) + (this.l ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.m) * 31) + this.n) * 31) + this.k) * 31) + this.u) * 31) + (this.f3309d == null ? 0 : this.f3309d.hashCode())) * 31) + (this.f3310e != null ? this.f3310e.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            a(parcel, this.f3307b);
            parcel.writeSparseBooleanArray(this.f3308c);
            parcel.writeString(this.f3309d);
            parcel.writeString(this.f3310e);
            H.a(parcel, this.f3311f);
            parcel.writeInt(this.f3312g);
            H.a(parcel, this.p);
            H.a(parcel, this.q);
            H.a(parcel, this.r);
            H.a(parcel, this.s);
            parcel.writeInt(this.f3313h);
            parcel.writeInt(this.f3314i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            H.a(parcel, this.l);
            H.a(parcel, this.t);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            H.a(parcel, this.o);
            parcel.writeInt(this.u);
        }

        private static SparseArray<Map<G, C0042d>> a(Parcel parcel) {
            int i2 = parcel.readInt();
            SparseArray<Map<G, C0042d>> sparseArray = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                HashMap map = new HashMap(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    map.put((G) parcel.readParcelable(G.class.getClassLoader()), (C0042d) parcel.readParcelable(C0042d.class.getClassLoader()));
                }
                sparseArray.put(i4, map);
            }
            return sparseArray;
        }

        private static void a(Parcel parcel, SparseArray<Map<G, C0042d>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                Map<G, C0042d> mapValueAt = sparseArray.valueAt(i2);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<G, C0042d> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseArray<Map<G, C0042d>> sparseArray, SparseArray<Map<G, C0042d>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (iIndexOfKey < 0 || !a(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map<G, C0042d> map, Map<G, C0042d> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<G, C0042d> entry : map.entrySet()) {
                G key = entry.getKey();
                if (!map2.containsKey(key) || !H.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: c.d.a.a.k.d$d, reason: collision with other inner class name */
    public static final class C0042d implements Parcelable {
        public static final Parcelable.Creator<C0042d> CREATOR = new f();

        /* renamed from: a, reason: collision with root package name */
        public final int f3315a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f3316b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3317c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        C0042d(Parcel parcel) {
            this.f3315a = parcel.readInt();
            this.f3317c = parcel.readByte();
            this.f3316b = new int[this.f3317c];
            parcel.readIntArray(this.f3316b);
        }

        public int hashCode() {
            return (this.f3315a * 31) + Arrays.hashCode(this.f3316b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0042d c0042d = (C0042d) obj;
            return this.f3315a == c0042d.f3315a && Arrays.equals(this.f3316b, c0042d.f3316b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f3315a);
            parcel.writeInt(this.f3316b.length);
            parcel.writeIntArray(this.f3316b);
        }
    }

    public d() {
        this(new a.C0041a());
    }

    public d(i.a aVar) {
        this.f3294e = aVar;
        this.f3295f = new AtomicReference<>(c.f3306a);
    }

    @Override // c.d.a.a.k.h
    protected final Pair<c.d.a.a.G[], i[]> a(h.a aVar, int[][][] iArr, int[] iArr2) {
        c cVar = this.f3295f.get();
        int iA = aVar.a();
        i[] iVarArrA = a(aVar, iArr, iArr2, cVar);
        for (int i2 = 0; i2 < iA; i2++) {
            if (cVar.a(i2)) {
                iVarArrA[i2] = null;
            } else {
                G gB = aVar.b(i2);
                if (cVar.a(i2, gB)) {
                    C0042d c0042dB = cVar.b(i2, gB);
                    if (c0042dB == null) {
                        iVarArrA[i2] = null;
                    } else if (c0042dB.f3317c == 1) {
                        iVarArrA[i2] = new g(gB.a(c0042dB.f3315a), c0042dB.f3316b[0]);
                    } else {
                        i.a aVar2 = this.f3294e;
                        AbstractC0170e.a(aVar2);
                        iVarArrA[i2] = aVar2.a(gB.a(c0042dB.f3315a), a(), c0042dB.f3316b);
                    }
                }
            }
        }
        c.d.a.a.G[] gArr = new c.d.a.a.G[iA];
        for (int i3 = 0; i3 < iA; i3++) {
            gArr[i3] = !cVar.a(i3) && (aVar.a(i3) == 6 || iVarArrA[i3] != null) ? c.d.a.a.G.f1433a : null;
        }
        a(aVar, iArr, gArr, iVarArrA, cVar.u);
        return Pair.create(gArr, iVarArrA);
    }

    protected i[] a(h.a aVar, int[][][] iArr, int[] iArr2, c cVar) {
        int i2;
        b bVar;
        int i3;
        int i4;
        int iA = aVar.a();
        i[] iVarArr = new i[iA];
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i6 = 0; i6 < iA; i6++) {
            if (2 == aVar.a(i6)) {
                if (!z) {
                    iVarArr[i6] = a(aVar.b(i6), iArr[i6], iArr2[i6], cVar, this.f3294e);
                    z = iVarArr[i6] != null;
                }
                z2 |= aVar.b(i6).f2505b > 0;
            }
        }
        int i7 = -1;
        b bVar2 = null;
        int i8 = -1;
        int i9 = -1;
        int iIntValue = Integer.MIN_VALUE;
        while (i5 < iA) {
            int iA2 = aVar.a(i5);
            switch (iA2) {
                case 1:
                    i2 = i8;
                    bVar = bVar2;
                    i3 = i9;
                    i4 = iIntValue;
                    Pair<i, b> pairB = b(aVar.b(i5), iArr[i5], iArr2[i5], cVar, z2 ? null : this.f3294e);
                    if (pairB != null && (bVar == null || ((b) pairB.second).compareTo(bVar) > 0)) {
                        if (i2 != -1) {
                            iVarArr[i2] = null;
                        }
                        iVarArr[i5] = (i) pairB.first;
                        bVar2 = (b) pairB.second;
                        i8 = i5;
                        i9 = i3;
                        iIntValue = i4;
                        break;
                    }
                    bVar2 = bVar;
                    i8 = i2;
                    i9 = i3;
                    iIntValue = i4;
                case 3:
                    Pair<i, Integer> pairA = a(aVar.b(i5), iArr[i5], cVar);
                    if (pairA != null && ((Integer) pairA.second).intValue() > iIntValue) {
                        if (i9 != i7) {
                            iVarArr[i9] = null;
                        }
                        iVarArr[i5] = (i) pairA.first;
                        iIntValue = ((Integer) pairA.second).intValue();
                        i9 = i5;
                        break;
                    }
                    break;
                case 2:
                    i2 = i8;
                    bVar = bVar2;
                    i3 = i9;
                    i4 = iIntValue;
                    bVar2 = bVar;
                    i8 = i2;
                    i9 = i3;
                    iIntValue = i4;
                    break;
                default:
                    i2 = i8;
                    bVar = bVar2;
                    i3 = i9;
                    i4 = iIntValue;
                    iVarArr[i5] = a(iA2, aVar.b(i5), iArr[i5], cVar);
                    bVar2 = bVar;
                    i8 = i2;
                    i9 = i3;
                    iIntValue = i4;
                    break;
            }
            i5++;
            i7 = -1;
        }
        return iVarArr;
    }

    protected i a(G g2, int[][] iArr, int i2, c cVar, i.a aVar) {
        i iVarA = (cVar.q || cVar.p || aVar == null) ? null : a(g2, iArr, i2, cVar, aVar, a());
        return iVarA == null ? b(g2, iArr, cVar) : iVarA;
    }

    private static i a(G g2, int[][] iArr, int i2, c cVar, i.a aVar, InterfaceC0163f interfaceC0163f) {
        G g3 = g2;
        int i3 = cVar.s ? 24 : 16;
        boolean z = cVar.r && (i2 & i3) != 0;
        int i4 = 0;
        while (i4 < g3.f2505b) {
            E eA = g3.a(i4);
            int[] iArrA = a(eA, iArr[i4], z, i3, cVar.f3313h, cVar.f3314i, cVar.j, cVar.k, cVar.m, cVar.n, cVar.o);
            if (iArrA.length > 0) {
                AbstractC0170e.a(aVar);
                return aVar.a(eA, interfaceC0163f, iArrA);
            }
            i4++;
            g3 = g2;
        }
        return null;
    }

    private static int[] a(E e2, int[] iArr, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2) {
        String str;
        int iA;
        if (e2.f2501a < 2) {
            return f3293d;
        }
        List<Integer> listA = a(e2, i7, i8, z2);
        if (listA.size() < 2) {
            return f3293d;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i9 = 0;
            for (int i10 = 0; i10 < listA.size(); i10++) {
                String str3 = e2.a(listA.get(i10).intValue()).f3682g;
                if (hashSet.add(str3) && (iA = a(e2, iArr, i2, str3, i3, i4, i5, i6, listA)) > i9) {
                    i9 = iA;
                    str2 = str3;
                }
            }
            str = str2;
        }
        b(e2, iArr, i2, str, i3, i4, i5, i6, listA);
        return listA.size() < 2 ? f3293d : H.a(listA);
    }

    private static int a(E e2, int[] iArr, int i2, String str, int i3, int i4, int i5, int i6, List<Integer> list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int iIntValue = list.get(i8).intValue();
            if (a(e2.a(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5, i6)) {
                i7++;
            }
        }
        return i7;
    }

    private static void b(E e2, int[] iArr, int i2, String str, int i3, int i4, int i5, int i6, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!a(e2.a(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5, i6)) {
                list.remove(size);
            }
        }
    }

    private static boolean a(q qVar, String str, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (!a(i2, false) || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !H.a((Object) qVar.f3682g, (Object) str)) {
            return false;
        }
        if (qVar.l != -1 && qVar.l > i4) {
            return false;
        }
        if (qVar.m != -1 && qVar.m > i5) {
            return false;
        }
        if (qVar.n == -1.0f || qVar.n <= i6) {
            return qVar.f3678c == -1 || qVar.f3678c <= i7;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static c.d.a.a.k.i b(c.d.a.a.i.G r20, int[][] r21, c.d.a.a.k.d.c r22) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.k.d.b(c.d.a.a.i.G, int[][], c.d.a.a.k.d$c):c.d.a.a.k.i");
    }

    protected Pair<i, b> b(G g2, int[][] iArr, int i2, c cVar, i.a aVar) {
        i gVar = null;
        b bVar = null;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (i3 < g2.f2505b) {
            E eA = g2.a(i3);
            int[] iArr2 = iArr[i3];
            int i6 = i5;
            b bVar2 = bVar;
            int i7 = i4;
            for (int i8 = 0; i8 < eA.f2501a; i8++) {
                if (a(iArr2[i8], cVar.t)) {
                    b bVar3 = new b(eA.a(i8), cVar, iArr2[i8]);
                    if (bVar2 == null || bVar3.compareTo(bVar2) > 0) {
                        i7 = i3;
                        i6 = i8;
                        bVar2 = bVar3;
                    }
                }
            }
            i3++;
            i4 = i7;
            bVar = bVar2;
            i5 = i6;
        }
        if (i4 == -1) {
            return null;
        }
        E eA2 = g2.a(i4);
        if (!cVar.q && !cVar.p && aVar != null) {
            int[] iArrA = a(eA2, iArr[i4], cVar.r);
            if (iArrA.length > 0) {
                gVar = aVar.a(eA2, a(), iArrA);
            }
        }
        if (gVar == null) {
            gVar = new g(eA2, i5);
        }
        AbstractC0170e.a(bVar);
        return Pair.create(gVar, bVar);
    }

    private static int[] a(E e2, int[] iArr, boolean z) {
        int iA;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < e2.f2501a; i3++) {
            q qVarA = e2.a(i3);
            a aVar2 = new a(qVarA.t, qVarA.u, z ? null : qVarA.f3682g);
            if (hashSet.add(aVar2) && (iA = a(e2, iArr, aVar2)) > i2) {
                i2 = iA;
                aVar = aVar2;
            }
        }
        if (i2 > 1) {
            int[] iArr2 = new int[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < e2.f2501a; i5++) {
                q qVarA2 = e2.a(i5);
                int i6 = iArr[i5];
                AbstractC0170e.a(aVar);
                if (a(qVarA2, i6, aVar)) {
                    iArr2[i4] = i5;
                    i4++;
                }
            }
            return iArr2;
        }
        return f3293d;
    }

    private static int a(E e2, int[] iArr, a aVar) {
        int i2 = 0;
        for (int i3 = 0; i3 < e2.f2501a; i3++) {
            if (a(e2.a(i3), iArr[i3], aVar)) {
                i2++;
            }
        }
        return i2;
    }

    private static boolean a(q qVar, int i2, a aVar) {
        if (a(i2, false) && qVar.t == aVar.f3296a && qVar.u == aVar.f3297b) {
            return aVar.f3298c == null || TextUtils.equals(aVar.f3298c, qVar.f3682g);
        }
        return false;
    }

    protected Pair<i, Integer> a(G g2, int[][] iArr, c cVar) {
        int i2;
        int i3 = 0;
        E e2 = null;
        int i4 = 0;
        int i5 = 0;
        while (i3 < g2.f2505b) {
            E eA = g2.a(i3);
            int[] iArr2 = iArr[i3];
            int i6 = i5;
            int i7 = i4;
            E e3 = e2;
            for (int i8 = 0; i8 < eA.f2501a; i8++) {
                if (a(iArr2[i8], cVar.t)) {
                    q qVarA = eA.a(i8);
                    int i9 = qVarA.y & (~cVar.f3312g);
                    boolean z = (i9 & 1) != 0;
                    boolean z2 = (i9 & 2) != 0;
                    boolean zA = a(qVarA, cVar.f3310e);
                    if (zA || (cVar.f3311f && a(qVarA))) {
                        i2 = (z ? 8 : !z2 ? 6 : 4) + (zA ? 1 : 0);
                    } else if (z) {
                        i2 = 3;
                    } else if (z2) {
                        i2 = a(qVarA, cVar.f3309d) ? 2 : 1;
                    }
                    if (a(iArr2[i8], false)) {
                        i2 += 1000;
                    }
                    if (i2 > i6) {
                        i7 = i8;
                        e3 = eA;
                        i6 = i2;
                    }
                }
            }
            i3++;
            e2 = e3;
            i4 = i7;
            i5 = i6;
        }
        if (e2 == null) {
            return null;
        }
        return Pair.create(new g(e2, i4), Integer.valueOf(i5));
    }

    protected i a(int i2, G g2, int[][] iArr, c cVar) {
        E e2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < g2.f2505b) {
            E eA = g2.a(i3);
            int[] iArr2 = iArr[i3];
            int i6 = i5;
            int i7 = i4;
            E e3 = e2;
            for (int i8 = 0; i8 < eA.f2501a; i8++) {
                if (a(iArr2[i8], cVar.t)) {
                    int i9 = (eA.a(i8).y & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i8], false)) {
                        i9 += 1000;
                    }
                    if (i9 > i6) {
                        i7 = i8;
                        e3 = eA;
                        i6 = i9;
                    }
                }
            }
            i3++;
            e2 = e3;
            i4 = i7;
            i5 = i6;
        }
        if (e2 == null) {
            return null;
        }
        return new g(e2, i4);
    }

    private static void a(h.a aVar, int[][][] iArr, c.d.a.a.G[] gArr, i[] iVarArr, int i2) {
        boolean z;
        if (i2 == 0) {
            return;
        }
        boolean z2 = false;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < aVar.a(); i5++) {
            int iA = aVar.a(i5);
            i iVar = iVarArr[i5];
            if ((iA == 1 || iA == 2) && iVar != null && a(iArr[i5], aVar.b(i5), iVar)) {
                if (iA == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i5;
                } else {
                    if (i4 != -1) {
                        z = false;
                        break;
                    }
                    i4 = i5;
                }
            }
        }
        z = true;
        if (i3 != -1 && i4 != -1) {
            z2 = true;
        }
        if (z && z2) {
            c.d.a.a.G g2 = new c.d.a.a.G(i2);
            gArr[i3] = g2;
            gArr[i4] = g2;
        }
    }

    private static boolean a(int[][] iArr, G g2, i iVar) {
        if (iVar == null) {
            return false;
        }
        int iA = g2.a(iVar.a());
        for (int i2 = 0; i2 < iVar.length(); i2++) {
            if ((iArr[iA][iVar.b(i2)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    protected static boolean a(q qVar) {
        return TextUtils.isEmpty(qVar.z) || a(qVar, "und");
    }

    protected static boolean a(q qVar, String str) {
        return str != null && TextUtils.equals(str, H.b(qVar.z));
    }

    private static List<Integer> a(E e2, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList(e2.f2501a);
        for (int i4 = 0; i4 < e2.f2501a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < e2.f2501a; i6++) {
            q qVarA = e2.a(i6);
            if (qVarA.l > 0 && qVarA.m > 0) {
                Point pointA = a(z, i2, i3, qVarA.l, qVarA.m);
                int i7 = qVarA.l * qVarA.m;
                if (qVarA.l >= ((int) (pointA.x * 0.98f)) && qVarA.m >= ((int) (pointA.y * 0.98f)) && i7 < i5) {
                    i5 = i7;
                }
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iF = e2.a(((Integer) arrayList.get(size)).intValue()).f();
                if (iF == -1 || iF > i5) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point a(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            r3 = 1
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = c.d.a.a.m.H.a(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = c.d.a.a.m.H.a(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.k.d.a(boolean, int, int, int, int):android.graphics.Point");
    }

    protected static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final c f3299a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3300b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3301c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3302d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3303e;

        /* renamed from: f, reason: collision with root package name */
        private final int f3304f;

        /* renamed from: g, reason: collision with root package name */
        private final int f3305g;

        public b(q qVar, c cVar, int i2) {
            this.f3299a = cVar;
            this.f3300b = d.a(i2, false) ? 1 : 0;
            this.f3301c = d.a(qVar, cVar.f3309d) ? 1 : 0;
            this.f3302d = (qVar.y & 1) == 0 ? 0 : 1;
            this.f3303e = qVar.t;
            this.f3304f = qVar.u;
            this.f3305g = qVar.f3678c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (this.f3300b != bVar.f3300b) {
                return d.c(this.f3300b, bVar.f3300b);
            }
            if (this.f3301c != bVar.f3301c) {
                return d.c(this.f3301c, bVar.f3301c);
            }
            if (this.f3302d != bVar.f3302d) {
                return d.c(this.f3302d, bVar.f3302d);
            }
            if (this.f3299a.p) {
                return d.c(bVar.f3305g, this.f3305g);
            }
            int i2 = this.f3300b != 1 ? -1 : 1;
            if (this.f3303e != bVar.f3303e) {
                return i2 * d.c(this.f3303e, bVar.f3303e);
            }
            return this.f3304f != bVar.f3304f ? i2 * d.c(this.f3304f, bVar.f3304f) : i2 * d.c(this.f3305g, bVar.f3305g);
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3296a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3297b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3298c;

        public a(int i2, int i3, String str) {
            this.f3296a = i2;
            this.f3297b = i3;
            this.f3298c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3296a == aVar.f3296a && this.f3297b == aVar.f3297b && TextUtils.equals(this.f3298c, aVar.f3298c);
        }

        public int hashCode() {
            return (((this.f3296a * 31) + this.f3297b) * 31) + (this.f3298c != null ? this.f3298c.hashCode() : 0);
        }
    }
}
