package c.d.a.a.i.b;

import android.util.SparseArray;
import c.d.a.a.e.q;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.u;
import c.d.a.a.q;

/* loaded from: classes.dex */
public final class e implements c.d.a.a.e.i {

    /* renamed from: a, reason: collision with root package name */
    public final c.d.a.a.e.g f2534a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2535b;

    /* renamed from: c, reason: collision with root package name */
    private final q f2536c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f2537d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f2538e;

    /* renamed from: f, reason: collision with root package name */
    private b f2539f;

    /* renamed from: g, reason: collision with root package name */
    private long f2540g;

    /* renamed from: h, reason: collision with root package name */
    private c.d.a.a.e.o f2541h;

    /* renamed from: i, reason: collision with root package name */
    private q[] f2542i;

    public interface b {
        c.d.a.a.e.q a(int i2, int i3);
    }

    public e(c.d.a.a.e.g gVar, int i2, q qVar) {
        this.f2534a = gVar;
        this.f2535b = i2;
        this.f2536c = qVar;
    }

    public c.d.a.a.e.o b() {
        return this.f2541h;
    }

    public q[] c() {
        return this.f2542i;
    }

    public void a(b bVar, long j, long j2) {
        this.f2539f = bVar;
        this.f2540g = j2;
        if (!this.f2538e) {
            this.f2534a.a(this);
            if (j != -9223372036854775807L) {
                this.f2534a.a(0L, j);
            }
            this.f2538e = true;
            return;
        }
        c.d.a.a.e.g gVar = this.f2534a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        gVar.a(0L, j);
        for (int i2 = 0; i2 < this.f2537d.size(); i2++) {
            this.f2537d.valueAt(i2).a(bVar, j2);
        }
    }

    @Override // c.d.a.a.e.i
    public c.d.a.a.e.q a(int i2, int i3) {
        a aVar = this.f2537d.get(i2);
        if (aVar == null) {
            AbstractC0170e.b(this.f2542i == null);
            aVar = new a(i2, i3, i3 == this.f2535b ? this.f2536c : null);
            aVar.a(this.f2539f, this.f2540g);
            this.f2537d.put(i2, aVar);
        }
        return aVar;
    }

    @Override // c.d.a.a.e.i
    public void a() {
        q[] qVarArr = new q[this.f2537d.size()];
        for (int i2 = 0; i2 < this.f2537d.size(); i2++) {
            qVarArr[i2] = this.f2537d.valueAt(i2).f2547e;
        }
        this.f2542i = qVarArr;
    }

    @Override // c.d.a.a.e.i
    public void a(c.d.a.a.e.o oVar) {
        this.f2541h = oVar;
    }

    private static final class a implements c.d.a.a.e.q {

        /* renamed from: a, reason: collision with root package name */
        private final int f2543a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2544b;

        /* renamed from: c, reason: collision with root package name */
        private final q f2545c;

        /* renamed from: d, reason: collision with root package name */
        private final c.d.a.a.e.f f2546d = new c.d.a.a.e.f();

        /* renamed from: e, reason: collision with root package name */
        public q f2547e;

        /* renamed from: f, reason: collision with root package name */
        private c.d.a.a.e.q f2548f;

        /* renamed from: g, reason: collision with root package name */
        private long f2549g;

        public a(int i2, int i3, q qVar) {
            this.f2543a = i2;
            this.f2544b = i3;
            this.f2545c = qVar;
        }

        public void a(b bVar, long j) {
            if (bVar == null) {
                this.f2548f = this.f2546d;
                return;
            }
            this.f2549g = j;
            this.f2548f = bVar.a(this.f2543a, this.f2544b);
            if (this.f2547e != null) {
                this.f2548f.a(this.f2547e);
            }
        }

        @Override // c.d.a.a.e.q
        public void a(q qVar) {
            if (this.f2545c != null) {
                qVar = qVar.a(this.f2545c);
            }
            this.f2547e = qVar;
            this.f2548f.a(this.f2547e);
        }

        @Override // c.d.a.a.e.q
        public int a(c.d.a.a.e.h hVar, int i2, boolean z) {
            return this.f2548f.a(hVar, i2, z);
        }

        @Override // c.d.a.a.e.q
        public void a(u uVar, int i2) {
            this.f2548f.a(uVar, i2);
        }

        @Override // c.d.a.a.e.q
        public void a(long j, int i2, int i3, int i4, q.a aVar) {
            if (this.f2549g != -9223372036854775807L && j >= this.f2549g) {
                this.f2548f = this.f2546d;
            }
            this.f2548f.a(j, i2, i3, i4, aVar);
        }
    }
}
