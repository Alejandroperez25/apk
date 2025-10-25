package c.d.a.a.i.b;

import c.d.a.a.e.q;
import c.d.a.a.i.b.e;
import c.d.a.a.i.z;

/* loaded from: classes.dex */
public final class c implements e.b {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f2524a;

    /* renamed from: b, reason: collision with root package name */
    private final z[] f2525b;

    public c(int[] iArr, z[] zVarArr) {
        this.f2524a = iArr;
        this.f2525b = zVarArr;
    }

    @Override // c.d.a.a.i.b.e.b
    public q a(int i2, int i3) {
        for (int i4 = 0; i4 < this.f2524a.length; i4++) {
            if (i3 == this.f2524a[i4]) {
                return this.f2525b[i4];
            }
        }
        c.d.a.a.m.o.d("BaseMediaChunkOutput", "Unmatched track of type: " + i3);
        return new c.d.a.a.e.f();
    }

    public int[] a() {
        int[] iArr = new int[this.f2525b.length];
        for (int i2 = 0; i2 < this.f2525b.length; i2++) {
            if (this.f2525b[i2] != null) {
                iArr[i2] = this.f2525b[i2].c();
            }
        }
        return iArr;
    }

    public void a(long j) {
        for (z zVar : this.f2525b) {
            if (zVar != null) {
                zVar.a(j);
            }
        }
    }
}
