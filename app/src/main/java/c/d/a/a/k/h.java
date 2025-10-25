package c.d.a.a.k;

import android.util.Pair;
import c.d.a.a.F;
import c.d.a.a.G;
import c.d.a.a.i.E;
import c.d.a.a.m.H;

/* loaded from: classes.dex */
public abstract class h extends k {

    /* renamed from: c, reason: collision with root package name */
    private a f3320c;

    protected abstract Pair<G[], i[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Deprecated
        public final int f3321a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3322b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f3323c;

        /* renamed from: d, reason: collision with root package name */
        private final c.d.a.a.i.G[] f3324d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f3325e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f3326f;

        /* renamed from: g, reason: collision with root package name */
        private final c.d.a.a.i.G f3327g;

        a(int[] iArr, c.d.a.a.i.G[] gArr, int[] iArr2, int[][][] iArr3, c.d.a.a.i.G g2) {
            this.f3323c = iArr;
            this.f3324d = gArr;
            this.f3326f = iArr3;
            this.f3325e = iArr2;
            this.f3327g = g2;
            this.f3322b = iArr.length;
            this.f3321a = this.f3322b;
        }

        public int a() {
            return this.f3322b;
        }

        public int a(int i2) {
            return this.f3323c[i2];
        }

        public c.d.a.a.i.G b(int i2) {
            return this.f3324d[i2];
        }
    }

    @Override // c.d.a.a.k.k
    public final void a(Object obj) {
        this.f3320c = (a) obj;
    }

    @Override // c.d.a.a.k.k
    public final l a(F[] fArr, c.d.a.a.i.G g2) {
        int[] iArr = new int[fArr.length + 1];
        E[][] eArr = new E[fArr.length + 1][];
        int[][][] iArr2 = new int[fArr.length + 1][][];
        for (int i2 = 0; i2 < eArr.length; i2++) {
            eArr[i2] = new E[g2.f2505b];
            iArr2[i2] = new int[g2.f2505b][];
        }
        int[] iArrA = a(fArr);
        for (int i3 = 0; i3 < g2.f2505b; i3++) {
            E eA = g2.a(i3);
            int iA = a(fArr, eA);
            int[] iArrA2 = iA == fArr.length ? new int[eA.f2501a] : a(fArr[iA], eA);
            int i4 = iArr[iA];
            eArr[iA][i4] = eA;
            iArr2[iA][i4] = iArrA2;
            iArr[iA] = iArr[iA] + 1;
        }
        c.d.a.a.i.G[] gArr = new c.d.a.a.i.G[fArr.length];
        int[] iArr3 = new int[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            int i6 = iArr[i5];
            gArr[i5] = new c.d.a.a.i.G((E[]) H.a(eArr[i5], i6));
            iArr2[i5] = (int[][]) H.a(iArr2[i5], i6);
            iArr3[i5] = fArr[i5].g();
        }
        a aVar = new a(iArr3, gArr, iArrA, iArr2, new c.d.a.a.i.G((E[]) H.a(eArr[fArr.length], iArr[fArr.length])));
        Pair<G[], i[]> pairA = a(aVar, iArr2, iArrA);
        return new l((G[]) pairA.first, (i[]) pairA.second, aVar);
    }

    private static int a(F[] fArr, E e2) {
        int length = fArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < fArr.length) {
            F f2 = fArr[i2];
            int i4 = length;
            for (int i5 = 0; i5 < e2.f2501a; i5++) {
                int iA = f2.a(e2.a(i5)) & 7;
                if (iA > i3) {
                    if (iA == 4) {
                        return i2;
                    }
                    i4 = i2;
                    i3 = iA;
                }
            }
            i2++;
            length = i4;
        }
        return length;
    }

    private static int[] a(F f2, E e2) {
        int[] iArr = new int[e2.f2501a];
        for (int i2 = 0; i2 < e2.f2501a; i2++) {
            iArr[i2] = f2.a(e2.a(i2));
        }
        return iArr;
    }

    private static int[] a(F[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = fArr[i2].o();
        }
        return iArr;
    }
}
