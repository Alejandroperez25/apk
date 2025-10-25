package c.d.a.a.k;

import android.os.SystemClock;
import c.d.a.a.i.E;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import c.d.a.a.q;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements i {

    /* renamed from: a, reason: collision with root package name */
    protected final E f3287a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f3288b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f3289c;

    /* renamed from: d, reason: collision with root package name */
    private final q[] f3290d;

    /* renamed from: e, reason: collision with root package name */
    private final long[] f3291e;

    /* renamed from: f, reason: collision with root package name */
    private int f3292f;

    @Override // c.d.a.a.k.i
    public void a(float f2) {
    }

    @Override // c.d.a.a.k.i
    public void c() {
    }

    @Override // c.d.a.a.k.i
    public void e() {
    }

    public c(E e2, int... iArr) {
        AbstractC0170e.b(iArr.length > 0);
        AbstractC0170e.a(e2);
        this.f3287a = e2;
        this.f3288b = iArr.length;
        this.f3290d = new q[this.f3288b];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f3290d[i2] = e2.a(iArr[i2]);
        }
        Arrays.sort(this.f3290d, new a());
        this.f3289c = new int[this.f3288b];
        for (int i3 = 0; i3 < this.f3288b; i3++) {
            this.f3289c[i3] = e2.a(this.f3290d[i3]);
        }
        this.f3291e = new long[this.f3288b];
    }

    @Override // c.d.a.a.k.i
    public final E a() {
        return this.f3287a;
    }

    @Override // c.d.a.a.k.i
    public final int length() {
        return this.f3289c.length;
    }

    @Override // c.d.a.a.k.i
    public final q a(int i2) {
        return this.f3290d[i2];
    }

    @Override // c.d.a.a.k.i
    public final int b(int i2) {
        return this.f3289c[i2];
    }

    @Override // c.d.a.a.k.i
    public final int a(q qVar) {
        for (int i2 = 0; i2 < this.f3288b; i2++) {
            if (this.f3290d[i2] == qVar) {
                return i2;
            }
        }
        return -1;
    }

    @Override // c.d.a.a.k.i
    public final int c(int i2) {
        for (int i3 = 0; i3 < this.f3288b; i3++) {
            if (this.f3289c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // c.d.a.a.k.i
    public final q f() {
        return this.f3290d[b()];
    }

    @Override // c.d.a.a.k.i
    public final int d() {
        return this.f3289c[b()];
    }

    @Override // c.d.a.a.k.i
    public int a(long j, List<? extends c.d.a.a.i.b.l> list) {
        return list.size();
    }

    @Override // c.d.a.a.k.i
    public final boolean a(int i2, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i2, jElapsedRealtime);
        int i3 = 0;
        while (i3 < this.f3288b && !zB) {
            zB = (i3 == i2 || b(i3, jElapsedRealtime)) ? false : true;
            i3++;
        }
        if (!zB) {
            return false;
        }
        this.f3291e[i2] = Math.max(this.f3291e[i2], H.b(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    protected final boolean b(int i2, long j) {
        return this.f3291e[i2] > j;
    }

    public int hashCode() {
        if (this.f3292f == 0) {
            this.f3292f = (System.identityHashCode(this.f3287a) * 31) + Arrays.hashCode(this.f3289c);
        }
        return this.f3292f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3287a == cVar.f3287a && Arrays.equals(this.f3289c, cVar.f3289c);
    }

    private static final class a implements Comparator<q> {
        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(q qVar, q qVar2) {
            return qVar2.f3678c - qVar.f3678c;
        }
    }
}
