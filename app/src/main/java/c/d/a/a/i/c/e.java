package c.d.a.a.i.c;

import android.util.Pair;
import android.util.SparseIntArray;
import c.d.a.a.I;
import c.d.a.a.i.A;
import c.d.a.a.i.B;
import c.d.a.a.i.E;
import c.d.a.a.i.b.g;
import c.d.a.a.i.c.c;
import c.d.a.a.i.c.l;
import c.d.a.a.i.p;
import c.d.a.a.i.r;
import c.d.a.a.i.v;
import c.d.a.a.i.x;
import c.d.a.a.l.C;
import c.d.a.a.l.G;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.z;
import c.d.a.a.m.H;
import c.d.a.a.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class e implements v, B.a<c.d.a.a.i.b.g<c>>, g.b<c> {

    /* renamed from: a, reason: collision with root package name */
    final int f2655a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a f2656b;

    /* renamed from: c, reason: collision with root package name */
    private final G f2657c;

    /* renamed from: d, reason: collision with root package name */
    private final z f2658d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2659e;

    /* renamed from: f, reason: collision with root package name */
    private final C f2660f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0161d f2661g;

    /* renamed from: h, reason: collision with root package name */
    private final c.d.a.a.i.G f2662h;

    /* renamed from: i, reason: collision with root package name */
    private final a[] f2663i;
    private final p j;
    private final l k;
    private final x.a m;
    private v.a n;
    private B q;
    private c.d.a.a.i.c.a.b r;
    private int s;
    private List<c.d.a.a.i.c.a.e> t;
    private boolean u;
    private c.d.a.a.i.b.g<c>[] o = a(0);
    private k[] p = new k[0];
    private final IdentityHashMap<c.d.a.a.i.b.g<c>, l.c> l = new IdentityHashMap<>();

    public e(int i2, c.d.a.a.i.c.a.b bVar, int i3, c.a aVar, G g2, z zVar, x.a aVar2, long j, C c2, InterfaceC0161d interfaceC0161d, p pVar, l.b bVar2) {
        this.f2655a = i2;
        this.r = bVar;
        this.s = i3;
        this.f2656b = aVar;
        this.f2657c = g2;
        this.f2658d = zVar;
        this.m = aVar2;
        this.f2659e = j;
        this.f2660f = c2;
        this.f2661g = interfaceC0161d;
        this.j = pVar;
        this.k = new l(bVar, bVar2, interfaceC0161d);
        this.q = pVar.a(this.o);
        c.d.a.a.i.c.a.f fVarA = bVar.a(i3);
        this.t = fVarA.f2614d;
        Pair<c.d.a.a.i.G, a[]> pairA = a(fVarA.f2613c, this.t);
        this.f2662h = (c.d.a.a.i.G) pairA.first;
        this.f2663i = (a[]) pairA.second;
        aVar2.a();
    }

    public void a(c.d.a.a.i.c.a.b bVar, int i2) {
        this.r = bVar;
        this.s = i2;
        this.k.a(bVar);
        if (this.o != null) {
            for (c.d.a.a.i.b.g<c> gVar : this.o) {
                ((c) gVar.i()).a(bVar, i2);
            }
            this.n.a((v.a) this);
        }
        this.t = bVar.a(i2).f2614d;
        for (k kVar : this.p) {
            Iterator<c.d.a.a.i.c.a.e> it = this.t.iterator();
            while (true) {
                if (it.hasNext()) {
                    c.d.a.a.i.c.a.e next = it.next();
                    if (next.a().equals(kVar.b())) {
                        kVar.a(next, bVar.f2585d && i2 == bVar.a() - 1);
                    }
                }
            }
        }
    }

    public void c() {
        this.k.b();
        for (c.d.a.a.i.b.g<c> gVar : this.o) {
            gVar.a(this);
        }
        this.n = null;
        this.m.b();
    }

    @Override // c.d.a.a.i.b.g.b
    public synchronized void a(c.d.a.a.i.b.g<c> gVar) {
        l.c cVarRemove = this.l.remove(gVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    @Override // c.d.a.a.i.v
    public void a(v.a aVar, long j) {
        this.n = aVar;
        aVar.a((v) this);
    }

    @Override // c.d.a.a.i.v
    public void d() {
        this.f2660f.a();
    }

    @Override // c.d.a.a.i.v
    public c.d.a.a.i.G f() {
        return this.f2662h;
    }

    @Override // c.d.a.a.i.v
    public long a(c.d.a.a.k.i[] iVarArr, boolean[] zArr, A[] aArr, boolean[] zArr2, long j) {
        int[] iArrA = a(iVarArr);
        a(iVarArr, zArr, aArr);
        a(iVarArr, aArr, iArrA);
        a(iVarArr, aArr, zArr2, j, iArrA);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (A a2 : aArr) {
            if (a2 instanceof c.d.a.a.i.b.g) {
                arrayList.add((c.d.a.a.i.b.g) a2);
            } else if (a2 instanceof k) {
                arrayList2.add((k) a2);
            }
        }
        this.o = a(arrayList.size());
        arrayList.toArray(this.o);
        this.p = new k[arrayList2.size()];
        arrayList2.toArray(this.p);
        this.q = this.j.a(this.o);
        return j;
    }

    @Override // c.d.a.a.i.v
    public void a(long j, boolean z) {
        for (c.d.a.a.i.b.g<c> gVar : this.o) {
            gVar.a(j, z);
        }
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public void c(long j) {
        this.q.c(j);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public boolean b(long j) {
        return this.q.b(j);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long b() {
        return this.q.b();
    }

    @Override // c.d.a.a.i.v
    public long e() {
        if (this.u) {
            return -9223372036854775807L;
        }
        this.m.c();
        this.u = true;
        return -9223372036854775807L;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long g() {
        return this.q.g();
    }

    @Override // c.d.a.a.i.v
    public long a(long j) {
        for (c.d.a.a.i.b.g<c> gVar : this.o) {
            gVar.e(j);
        }
        for (k kVar : this.p) {
            kVar.a(j);
        }
        return j;
    }

    @Override // c.d.a.a.i.v
    public long a(long j, I i2) {
        for (c.d.a.a.i.b.g<c> gVar : this.o) {
            if (gVar.f2552a == 2) {
                return gVar.a(j, i2);
            }
        }
        return j;
    }

    @Override // c.d.a.a.i.B.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(c.d.a.a.i.b.g<c> gVar) {
        this.n.a((v.a) this);
    }

    private int[] a(c.d.a.a.k.i[] iVarArr) {
        int[] iArr = new int[iVarArr.length];
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            if (iVarArr[i2] != null) {
                iArr[i2] = this.f2662h.a(iVarArr[i2].a());
            } else {
                iArr[i2] = -1;
            }
        }
        return iArr;
    }

    private void a(c.d.a.a.k.i[] iVarArr, boolean[] zArr, A[] aArr) {
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            if (iVarArr[i2] == null || !zArr[i2]) {
                if (aArr[i2] instanceof c.d.a.a.i.b.g) {
                    ((c.d.a.a.i.b.g) aArr[i2]).a(this);
                } else if (aArr[i2] instanceof g.a) {
                    ((g.a) aArr[i2]).b();
                }
                aArr[i2] = null;
            }
        }
    }

    private void a(c.d.a.a.k.i[] iVarArr, A[] aArr, int[] iArr) {
        boolean z;
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            if ((aArr[i2] instanceof r) || (aArr[i2] instanceof g.a)) {
                int iA = a(i2, iArr);
                if (iA == -1) {
                    z = aArr[i2] instanceof r;
                } else {
                    z = (aArr[i2] instanceof g.a) && ((g.a) aArr[i2]).f2561a == aArr[iA];
                }
                if (!z) {
                    if (aArr[i2] instanceof g.a) {
                        ((g.a) aArr[i2]).b();
                    }
                    aArr[i2] = null;
                }
            }
        }
    }

    private void a(c.d.a.a.k.i[] iVarArr, A[] aArr, boolean[] zArr, long j, int[] iArr) {
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            if (aArr[i2] == null && iVarArr[i2] != null) {
                zArr[i2] = true;
                a aVar = this.f2663i[iArr[i2]];
                if (aVar.f2666c == 0) {
                    aArr[i2] = a(aVar, iVarArr[i2], j);
                } else if (aVar.f2666c == 2) {
                    aArr[i2] = new k(this.t.get(aVar.f2667d), iVarArr[i2].a().a(0), this.r.f2585d);
                }
            }
        }
        for (int i3 = 0; i3 < iVarArr.length; i3++) {
            if (aArr[i3] == null && iVarArr[i3] != null) {
                a aVar2 = this.f2663i[iArr[i3]];
                if (aVar2.f2666c == 1) {
                    int iA = a(i3, iArr);
                    if (iA == -1) {
                        aArr[i3] = new r();
                    } else {
                        aArr[i3] = ((c.d.a.a.i.b.g) aArr[iA]).a(j, aVar2.f2665b);
                    }
                }
            }
        }
    }

    private int a(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 == -1) {
            return -1;
        }
        int i4 = this.f2663i[i3].f2668e;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == i4 && this.f2663i[i6].f2666c == 0) {
                return i5;
            }
        }
        return -1;
    }

    private static Pair<c.d.a.a.i.G, a[]> a(List<c.d.a.a.i.c.a.a> list, List<c.d.a.a.i.c.a.e> list2) {
        int[][] iArrA = a(list);
        int length = iArrA.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        int iA = a(length, list, iArrA, zArr, zArr2) + length + list2.size();
        E[] eArr = new E[iA];
        a[] aVarArr = new a[iA];
        a(list2, eArr, aVarArr, a(list, iArrA, length, zArr, zArr2, eArr, aVarArr));
        return Pair.create(new c.d.a.a.i.G(eArr), aVarArr);
    }

    private static int[][] a(List<c.d.a.a.i.c.a.a> list) {
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(list.get(i2).f2577a, i2);
        }
        int[][] iArr = new int[size][];
        boolean[] zArr = new boolean[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (!zArr[i4]) {
                zArr[i4] = true;
                c.d.a.a.i.c.a.d dVarB = b(list.get(i4).f2581e);
                if (dVarB == null) {
                    iArr[i3] = new int[]{i4};
                    i3++;
                } else {
                    String[] strArrA = H.a(dVarB.f2604b, ",");
                    int[] iArrCopyOf = new int[strArrA.length + 1];
                    iArrCopyOf[0] = i4;
                    int i5 = 1;
                    for (String str : strArrA) {
                        int i6 = sparseIntArray.get(Integer.parseInt(str), -1);
                        if (i6 != -1) {
                            zArr[i6] = true;
                            iArrCopyOf[i5] = i6;
                            i5++;
                        }
                    }
                    if (i5 < iArrCopyOf.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                    }
                    iArr[i3] = iArrCopyOf;
                    i3++;
                }
            }
        }
        return i3 < size ? (int[][]) Arrays.copyOf(iArr, i3) : iArr;
    }

    private static int a(int i2, List<c.d.a.a.i.c.a.a> list, int[][] iArr, boolean[] zArr, boolean[] zArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (a(list, iArr[i4])) {
                zArr[i4] = true;
                i3++;
            }
            if (b(list, iArr[i4])) {
                zArr2[i4] = true;
                i3++;
            }
        }
        return i3;
    }

    private static int a(List<c.d.a.a.i.c.a.a> list, int[][] iArr, int i2, boolean[] zArr, boolean[] zArr2, E[] eArr, a[] aVarArr) {
        int i3;
        int i4;
        int i5;
        char c2 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2) {
            int[] iArr2 = iArr[i6];
            ArrayList arrayList = new ArrayList();
            for (int i8 : iArr2) {
                arrayList.addAll(list.get(i8).f2579c);
            }
            q[] qVarArr = new q[arrayList.size()];
            for (int i9 = 0; i9 < qVarArr.length; i9++) {
                qVarArr[i9] = ((c.d.a.a.i.c.a.j) arrayList.get(i9)).f2626c;
            }
            c.d.a.a.i.c.a.a aVar = list.get(iArr2[c2]);
            int i10 = i7 + 1;
            if (zArr[i6]) {
                i3 = i10 + 1;
                i4 = i10;
            } else {
                i3 = i10;
                i4 = -1;
            }
            if (zArr2[i6]) {
                i5 = i3 + 1;
            } else {
                i5 = i3;
                i3 = -1;
            }
            eArr[i7] = new E(qVarArr);
            aVarArr[i7] = a.a(aVar.f2578b, iArr2, i7, i4, i3);
            if (i4 != -1) {
                eArr[i4] = new E(q.a(aVar.f2577a + ":emsg", "application/x-emsg", (String) null, -1, (c.d.a.a.d.f) null));
                aVarArr[i4] = a.a(iArr2, i7);
            }
            if (i3 != -1) {
                eArr[i3] = new E(q.a(aVar.f2577a + ":cea608", "application/cea-608", 0, null));
                aVarArr[i3] = a.b(iArr2, i7);
            }
            i6++;
            i7 = i5;
            c2 = 0;
        }
        return i7;
    }

    private static void a(List<c.d.a.a.i.c.a.e> list, E[] eArr, a[] aVarArr, int i2) {
        int i3 = i2;
        int i4 = 0;
        while (i4 < list.size()) {
            eArr[i3] = new E(q.a(list.get(i4).a(), "application/x-emsg", (String) null, -1, (c.d.a.a.d.f) null));
            aVarArr[i3] = a.a(i4);
            i4++;
            i3++;
        }
    }

    private c.d.a.a.i.b.g<c> a(a aVar, c.d.a.a.k.i iVar, long j) {
        int i2;
        int[] iArrCopyOf = new int[2];
        q[] qVarArr = new q[2];
        boolean z = aVar.f2669f != -1;
        if (z) {
            qVarArr[0] = this.f2662h.a(aVar.f2669f).a(0);
            iArrCopyOf[0] = 4;
            i2 = 1;
        } else {
            i2 = 0;
        }
        boolean z2 = aVar.f2670g != -1;
        if (z2) {
            qVarArr[i2] = this.f2662h.a(aVar.f2670g).a(0);
            iArrCopyOf[i2] = 3;
            i2++;
        }
        if (i2 < iArrCopyOf.length) {
            qVarArr = (q[]) Arrays.copyOf(qVarArr, i2);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
        }
        q[] qVarArr2 = qVarArr;
        int[] iArr = iArrCopyOf;
        l.c cVarA = (this.r.f2585d && z) ? this.k.a() : null;
        c.d.a.a.i.b.g<c> gVar = new c.d.a.a.i.b.g<>(aVar.f2665b, iArr, qVarArr2, this.f2656b.a(this.f2660f, this.r, this.s, aVar.f2664a, iVar, aVar.f2665b, this.f2659e, z, z2, cVarA, this.f2657c), this, this.f2661g, j, this.f2658d, this.m);
        synchronized (this) {
            this.l.put(gVar, cVarA);
        }
        return gVar;
    }

    private static c.d.a.a.i.c.a.d b(List<c.d.a.a.i.c.a.d> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c.d.a.a.i.c.a.d dVar = list.get(i2);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(dVar.f2603a)) {
                return dVar;
            }
        }
        return null;
    }

    private static boolean a(List<c.d.a.a.i.c.a.a> list, int[] iArr) {
        for (int i2 : iArr) {
            List<c.d.a.a.i.c.a.j> list2 = list.get(i2).f2579c;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (!list2.get(i3).f2629f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(List<c.d.a.a.i.c.a.a> list, int[] iArr) {
        for (int i2 : iArr) {
            List<c.d.a.a.i.c.a.d> list2 = list.get(i2).f2580d;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if ("urn:scte:dash:cc:cea-608:2015".equals(list2.get(i3).f2603a)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static c.d.a.a.i.b.g<c>[] a(int i2) {
        return new c.d.a.a.i.b.g[i2];
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f2664a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2665b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2666c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2667d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2668e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2669f;

        /* renamed from: g, reason: collision with root package name */
        public final int f2670g;

        public static a a(int i2, int[] iArr, int i3, int i4, int i5) {
            return new a(i2, 0, iArr, i3, i4, i5, -1);
        }

        public static a a(int[] iArr, int i2) {
            return new a(4, 1, iArr, i2, -1, -1, -1);
        }

        public static a b(int[] iArr, int i2) {
            return new a(3, 1, iArr, i2, -1, -1, -1);
        }

        public static a a(int i2) {
            return new a(4, 2, null, -1, -1, -1, i2);
        }

        private a(int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7) {
            this.f2665b = i2;
            this.f2664a = iArr;
            this.f2666c = i3;
            this.f2668e = i4;
            this.f2669f = i5;
            this.f2670g = i6;
            this.f2667d = i7;
        }
    }
}
