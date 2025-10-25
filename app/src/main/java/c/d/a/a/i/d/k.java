package c.d.a.a.i.d;

import c.d.a.a.I;
import c.d.a.a.i.A;
import c.d.a.a.i.B;
import c.d.a.a.i.E;
import c.d.a.a.i.d.a.d;
import c.d.a.a.i.d.a.i;
import c.d.a.a.i.d.o;
import c.d.a.a.i.v;
import c.d.a.a.i.x;
import c.d.a.a.l.G;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.l.z;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements v, o.a, i.b {

    /* renamed from: a, reason: collision with root package name */
    private final h f2832a;

    /* renamed from: b, reason: collision with root package name */
    private final c.d.a.a.i.d.a.i f2833b;

    /* renamed from: c, reason: collision with root package name */
    private final g f2834c;

    /* renamed from: d, reason: collision with root package name */
    private final G f2835d;

    /* renamed from: e, reason: collision with root package name */
    private final z f2836e;

    /* renamed from: f, reason: collision with root package name */
    private final x.a f2837f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0161d f2838g;
    private final c.d.a.a.i.p j;
    private final boolean k;
    private v.a l;
    private int m;
    private c.d.a.a.i.G n;
    private B q;
    private boolean r;

    /* renamed from: h, reason: collision with root package name */
    private final IdentityHashMap<A, Integer> f2839h = new IdentityHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private final q f2840i = new q();
    private o[] o = new o[0];
    private o[] p = new o[0];

    @Override // c.d.a.a.i.v
    public long a(long j, I i2) {
        return j;
    }

    public k(h hVar, c.d.a.a.i.d.a.i iVar, g gVar, G g2, z zVar, x.a aVar, InterfaceC0161d interfaceC0161d, c.d.a.a.i.p pVar, boolean z) {
        this.f2832a = hVar;
        this.f2833b = iVar;
        this.f2834c = gVar;
        this.f2835d = g2;
        this.f2836e = zVar;
        this.f2837f = aVar;
        this.f2838g = interfaceC0161d;
        this.j = pVar;
        this.k = z;
        this.q = pVar.a(new B[0]);
        aVar.a();
    }

    public void h() {
        this.f2833b.a(this);
        for (o oVar : this.o) {
            oVar.i();
        }
        this.l = null;
        this.f2837f.b();
    }

    @Override // c.d.a.a.i.v
    public void a(v.a aVar, long j) {
        this.l = aVar;
        this.f2833b.b(this);
        d(j);
    }

    @Override // c.d.a.a.i.v
    public void d() {
        for (o oVar : this.o) {
            oVar.d();
        }
    }

    @Override // c.d.a.a.i.v
    public c.d.a.a.i.G f() {
        return this.n;
    }

    @Override // c.d.a.a.i.v
    public long a(c.d.a.a.k.i[] iVarArr, boolean[] zArr, A[] aArr, boolean[] zArr2, long j) {
        A[] aArr2 = aArr;
        int[] iArr = new int[iVarArr.length];
        int[] iArr2 = new int[iVarArr.length];
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            iArr[i2] = aArr2[i2] == null ? -1 : this.f2839h.get(aArr2[i2]).intValue();
            iArr2[i2] = -1;
            if (iVarArr[i2] != null) {
                E eA = iVarArr[i2].a();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.o.length) {
                        break;
                    }
                    if (this.o[i3].f().a(eA) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f2839h.clear();
        A[] aArr3 = new A[iVarArr.length];
        A[] aArr4 = new A[iVarArr.length];
        c.d.a.a.k.i[] iVarArr2 = new c.d.a.a.k.i[iVarArr.length];
        o[] oVarArr = new o[this.o.length];
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (i5 < this.o.length) {
            for (int i6 = 0; i6 < iVarArr.length; i6++) {
                c.d.a.a.k.i iVar = null;
                aArr4[i6] = iArr[i6] == i5 ? aArr2[i6] : null;
                if (iArr2[i6] == i5) {
                    iVar = iVarArr[i6];
                }
                iVarArr2[i6] = iVar;
            }
            o oVar = this.o[i5];
            int i7 = i4;
            o[] oVarArr2 = oVarArr;
            int i8 = i5;
            c.d.a.a.k.i[] iVarArr3 = iVarArr2;
            boolean zA = oVar.a(iVarArr2, zArr, aArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= iVarArr.length) {
                    break;
                }
                if (iArr2[i9] == i8) {
                    AbstractC0170e.b(aArr4[i9] != null);
                    aArr3[i9] = aArr4[i9];
                    this.f2839h.put(aArr4[i9], Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    AbstractC0170e.b(aArr4[i9] == null);
                }
                i9++;
            }
            if (z2) {
                oVarArr2[i7] = oVar;
                int i10 = i7 + 1;
                if (i7 == 0) {
                    oVar.a(true);
                    if (!zA && this.p.length != 0) {
                        if (oVar != this.p[0]) {
                        }
                    }
                    this.f2840i.a();
                    i4 = i10;
                    z = true;
                } else {
                    oVar.a(false);
                }
                i4 = i10;
            } else {
                i4 = i7;
            }
            i5 = i8 + 1;
            oVarArr = oVarArr2;
            iVarArr2 = iVarArr3;
            aArr2 = aArr;
        }
        System.arraycopy(aArr3, 0, aArr, 0, aArr3.length);
        this.p = (o[]) Arrays.copyOf(oVarArr, i4);
        this.q = this.j.a(this.p);
        return j;
    }

    @Override // c.d.a.a.i.v
    public void a(long j, boolean z) {
        for (o oVar : this.p) {
            oVar.a(j, z);
        }
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public void c(long j) {
        this.q.c(j);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public boolean b(long j) {
        if (this.n == null) {
            for (o oVar : this.o) {
                oVar.c();
            }
            return false;
        }
        return this.q.b(j);
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long b() {
        return this.q.b();
    }

    @Override // c.d.a.a.i.v
    public long e() {
        if (this.r) {
            return -9223372036854775807L;
        }
        this.f2837f.c();
        this.r = true;
        return -9223372036854775807L;
    }

    @Override // c.d.a.a.i.v, c.d.a.a.i.B
    public long g() {
        return this.q.g();
    }

    @Override // c.d.a.a.i.v
    public long a(long j) {
        if (this.p.length > 0) {
            boolean zB = this.p[0].b(j, false);
            for (int i2 = 1; i2 < this.p.length; i2++) {
                this.p[i2].b(j, zB);
            }
            if (zB) {
                this.f2840i.a();
            }
        }
        return j;
    }

    @Override // c.d.a.a.i.d.o.a
    public void a() {
        int i2 = this.m - 1;
        this.m = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (o oVar : this.o) {
            i3 += oVar.f().f2505b;
        }
        E[] eArr = new E[i3];
        o[] oVarArr = this.o;
        int length = oVarArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            o oVar2 = oVarArr[i4];
            int i6 = oVar2.f().f2505b;
            int i7 = i5;
            int i8 = 0;
            while (i8 < i6) {
                eArr[i7] = oVar2.f().a(i8);
                i8++;
                i7++;
            }
            i4++;
            i5 = i7;
        }
        this.n = new c.d.a.a.i.G(eArr);
        this.l.a((v) this);
    }

    @Override // c.d.a.a.i.d.o.a
    public void a(d.a aVar) {
        this.f2833b.a(aVar);
    }

    @Override // c.d.a.a.i.B.a
    public void a(o oVar) {
        this.l.a((v.a) this);
    }

    @Override // c.d.a.a.i.d.a.i.b
    public void c() {
        this.l.a((v.a) this);
    }

    @Override // c.d.a.a.i.d.a.i.b
    public boolean a(d.a aVar, long j) {
        boolean zA = true;
        for (o oVar : this.o) {
            zA &= oVar.a(aVar, j);
        }
        this.l.a((v.a) this);
        return zA;
    }

    private void d(long j) {
        c.d.a.a.i.d.a.d dVarC = this.f2833b.c();
        List<d.a> list = dVarC.f2769f;
        List<d.a> list2 = dVarC.f2770g;
        int size = list.size() + 1 + list2.size();
        this.o = new o[size];
        this.m = size;
        a(dVarC, j);
        char c2 = 0;
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            d.a aVar = list.get(i2);
            d.a[] aVarArr = new d.a[1];
            aVarArr[c2] = aVar;
            o oVarA = a(1, aVarArr, (c.d.a.a.q) null, Collections.emptyList(), j);
            int i4 = i3 + 1;
            this.o[i3] = oVarA;
            c.d.a.a.q qVar = aVar.f2774b;
            if (this.k && qVar.f3679d != null) {
                oVarA.a(new c.d.a.a.i.G(new E(aVar.f2774b)), 0, c.d.a.a.i.G.f2504a);
            } else {
                oVarA.c();
            }
            i2++;
            i3 = i4;
            c2 = 0;
        }
        int i5 = 0;
        while (i5 < list2.size()) {
            d.a aVar2 = list2.get(i5);
            o oVarA2 = a(3, new d.a[]{aVar2}, (c.d.a.a.q) null, Collections.emptyList(), j);
            this.o[i3] = oVarA2;
            oVarA2.a(new c.d.a.a.i.G(new E(aVar2.f2774b)), 0, c.d.a.a.i.G.f2504a);
            i5++;
            i3++;
        }
        this.p = this.o;
    }

    private void a(c.d.a.a.i.d.a.d dVar, long j) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(dVar.f2768e);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            d.a aVar = (d.a) arrayList2.get(i2);
            c.d.a.a.q qVar = aVar.f2774b;
            if (qVar.m > 0 || H.a(qVar.f3679d, 2) != null) {
                arrayList3.add(aVar);
            } else if (H.a(qVar.f3679d, 1) != null) {
                arrayList4.add(aVar);
            }
        }
        if (arrayList3.isEmpty()) {
            if (arrayList4.size() < arrayList2.size()) {
                arrayList2.removeAll(arrayList4);
            }
            arrayList = arrayList2;
        } else {
            arrayList = arrayList3;
        }
        AbstractC0170e.a(!arrayList.isEmpty());
        d.a[] aVarArr = (d.a[]) arrayList.toArray(new d.a[0]);
        String str = aVarArr[0].f2774b.f3679d;
        o oVarA = a(0, aVarArr, dVar.f2771h, dVar.f2772i, j);
        this.o[0] = oVarA;
        if (this.k && str != null) {
            boolean z = H.a(str, 2) != null;
            boolean z2 = H.a(str, 1) != null;
            ArrayList arrayList5 = new ArrayList();
            if (z) {
                c.d.a.a.q[] qVarArr = new c.d.a.a.q[arrayList.size()];
                for (int i3 = 0; i3 < qVarArr.length; i3++) {
                    qVarArr[i3] = a(aVarArr[i3].f2774b);
                }
                arrayList5.add(new E(qVarArr));
                if (z2 && (dVar.f2771h != null || dVar.f2769f.isEmpty())) {
                    arrayList5.add(new E(a(aVarArr[0].f2774b, dVar.f2771h, false)));
                }
                List<c.d.a.a.q> list = dVar.f2772i;
                if (list != null) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        arrayList5.add(new E(list.get(i4)));
                    }
                }
            } else if (z2) {
                c.d.a.a.q[] qVarArr2 = new c.d.a.a.q[arrayList.size()];
                for (int i5 = 0; i5 < qVarArr2.length; i5++) {
                    qVarArr2[i5] = a(aVarArr[i5].f2774b, dVar.f2771h, true);
                }
                arrayList5.add(new E(qVarArr2));
            } else {
                throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
            }
            E e2 = new E(c.d.a.a.q.a("ID3", "application/id3", (String) null, -1, (c.d.a.a.d.f) null));
            arrayList5.add(e2);
            oVarA.a(new c.d.a.a.i.G((E[]) arrayList5.toArray(new E[0])), 0, new c.d.a.a.i.G(e2));
            return;
        }
        oVarA.a(true);
        oVarA.c();
    }

    private o a(int i2, d.a[] aVarArr, c.d.a.a.q qVar, List<c.d.a.a.q> list, long j) {
        return new o(i2, this, new f(this.f2832a, this.f2833b, aVarArr, this.f2834c, this.f2835d, this.f2840i, list), this.f2838g, j, qVar, this.f2836e, this.f2837f);
    }

    private static c.d.a.a.q a(c.d.a.a.q qVar) {
        String strA = H.a(qVar.f3679d, 2);
        return c.d.a.a.q.a(qVar.f3676a, qVar.f3677b, qVar.f3681f, c.d.a.a.m.r.f(strA), strA, qVar.f3678c, qVar.l, qVar.m, qVar.n, (List<byte[]>) null, qVar.y);
    }

    private static c.d.a.a.q a(c.d.a.a.q qVar, c.d.a.a.q qVar2, boolean z) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        if (qVar2 != null) {
            String str4 = qVar2.f3679d;
            int i4 = qVar2.t;
            int i5 = qVar2.y;
            String str5 = qVar2.z;
            str2 = qVar2.f3677b;
            str = str4;
            i2 = i4;
            i3 = i5;
            str3 = str5;
        } else {
            String strA = H.a(qVar.f3679d, 1);
            if (z) {
                int i6 = qVar.t;
                int i7 = qVar.y;
                str = strA;
                i2 = i6;
                str3 = qVar.f3677b;
                i3 = i7;
                str2 = qVar.f3677b;
            } else {
                str = strA;
                str2 = null;
                str3 = null;
                i2 = -1;
                i3 = 0;
            }
        }
        return c.d.a.a.q.a(qVar.f3676a, str2, qVar.f3681f, c.d.a.a.m.r.f(str), str, z ? qVar.f3678c : -1, i2, -1, (List<byte[]>) null, i3, str3);
    }
}
