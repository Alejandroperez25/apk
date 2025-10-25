package c.d.a.a.m;

import c.d.a.a.m.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f3574a = new Comparator() { // from class: c.d.a.a.m.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return z.b((z.a) obj, (z.a) obj2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f3575b = new Comparator() { // from class: c.d.a.a.m.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((z.a) obj).f3585c, ((z.a) obj2).f3585c);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final int f3576c;

    /* renamed from: g, reason: collision with root package name */
    private int f3580g;

    /* renamed from: h, reason: collision with root package name */
    private int f3581h;

    /* renamed from: i, reason: collision with root package name */
    private int f3582i;

    /* renamed from: e, reason: collision with root package name */
    private final a[] f3578e = new a[5];

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<a> f3577d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private int f3579f = -1;

    static /* synthetic */ int b(a aVar, a aVar2) {
        return aVar.f3583a - aVar2.f3583a;
    }

    public z(int i2) {
        this.f3576c = i2;
    }

    public void a(int i2, float f2) {
        a aVar;
        a();
        if (this.f3582i > 0) {
            a[] aVarArr = this.f3578e;
            int i3 = this.f3582i - 1;
            this.f3582i = i3;
            aVar = aVarArr[i3];
        } else {
            aVar = new a();
        }
        int i4 = this.f3580g;
        this.f3580g = i4 + 1;
        aVar.f3583a = i4;
        aVar.f3584b = i2;
        aVar.f3585c = f2;
        this.f3577d.add(aVar);
        this.f3581h += i2;
        while (this.f3581h > this.f3576c) {
            int i5 = this.f3581h - this.f3576c;
            a aVar2 = this.f3577d.get(0);
            if (aVar2.f3584b <= i5) {
                this.f3581h -= aVar2.f3584b;
                this.f3577d.remove(0);
                if (this.f3582i < 5) {
                    a[] aVarArr2 = this.f3578e;
                    int i6 = this.f3582i;
                    this.f3582i = i6 + 1;
                    aVarArr2[i6] = aVar2;
                }
            } else {
                aVar2.f3584b -= i5;
                this.f3581h -= i5;
            }
        }
    }

    public float a(float f2) {
        b();
        float f3 = f2 * this.f3581h;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3577d.size(); i3++) {
            a aVar = this.f3577d.get(i3);
            i2 += aVar.f3584b;
            if (i2 >= f3) {
                return aVar.f3585c;
            }
        }
        if (this.f3577d.isEmpty()) {
            return Float.NaN;
        }
        return this.f3577d.get(this.f3577d.size() - 1).f3585c;
    }

    private void a() {
        if (this.f3579f != 1) {
            Collections.sort(this.f3577d, f3574a);
            this.f3579f = 1;
        }
    }

    private void b() {
        if (this.f3579f != 0) {
            Collections.sort(this.f3577d, f3575b);
            this.f3579f = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3583a;

        /* renamed from: b, reason: collision with root package name */
        public int f3584b;

        /* renamed from: c, reason: collision with root package name */
        public float f3585c;

        private a() {
        }
    }
}
