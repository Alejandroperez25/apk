package c.d.a.a.e.h;

import c.d.a.a.e.h.G;
import c.d.a.a.e.o;

/* renamed from: c.d.a.a.e.h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138e implements c.d.a.a.e.g {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.a.a.e.j f2145a = new c.d.a.a.e.j() { // from class: c.d.a.a.e.h.a
        @Override // c.d.a.a.e.j
        public final c.d.a.a.e.g[] a() {
            return C0138e.b();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final int f2146b = c.d.a.a.m.H.h("ID3");

    /* renamed from: c, reason: collision with root package name */
    private final long f2147c;

    /* renamed from: d, reason: collision with root package name */
    private final C0139f f2148d;

    /* renamed from: e, reason: collision with root package name */
    private final c.d.a.a.m.u f2149e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2150f;

    @Override // c.d.a.a.e.g
    public void a() {
    }

    static /* synthetic */ c.d.a.a.e.g[] b() {
        return new c.d.a.a.e.g[]{new C0138e()};
    }

    public C0138e() {
        this(0L);
    }

    public C0138e(long j) {
        this.f2147c = j;
        this.f2148d = new C0139f();
        this.f2149e = new c.d.a.a.m.u(2786);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if ((r1 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r8.b();
        r1 = r1 + 1;
     */
    @Override // c.d.a.a.e.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(c.d.a.a.e.h r8) {
        /*
            r7 = this;
            c.d.a.a.m.u r0 = new c.d.a.a.m.u
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f3567a
            r8.a(r4, r2, r1)
            r0.c(r2)
            int r4 = r0.l()
            int r5 = c.d.a.a.e.h.C0138e.f2146b
            if (r4 == r5) goto L58
            r8.b()
            r8.a(r3)
            r1 = r3
        L20:
            r4 = 0
        L21:
            byte[] r5 = r0.f3567a
            r6 = 6
            r8.a(r5, r2, r6)
            r0.c(r2)
            int r5 = r0.i()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L42
            r8.b()
            int r1 = r1 + 1
            int r4 = r1 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r4 < r5) goto L3e
            return r2
        L3e:
            r8.a(r1)
            goto L20
        L42:
            r5 = 1
            int r4 = r4 + r5
            r6 = 4
            if (r4 < r6) goto L48
            return r5
        L48:
            byte[] r5 = r0.f3567a
            int r5 = c.d.a.a.b.AbstractC0130h.a(r5)
            r6 = -1
            if (r5 != r6) goto L52
            return r2
        L52:
            int r5 = r5 + (-6)
            r8.a(r5)
            goto L21
        L58:
            r4 = 3
            r0.d(r4)
            int r4 = r0.u()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.a(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.e.h.C0138e.a(c.d.a.a.e.h):boolean");
    }

    @Override // c.d.a.a.e.g
    public void a(c.d.a.a.e.i iVar) {
        this.f2148d.a(iVar, new G.d(0, 1));
        iVar.a();
        iVar.a(new o.b(-9223372036854775807L));
    }

    @Override // c.d.a.a.e.g
    public void a(long j, long j2) {
        this.f2150f = false;
        this.f2148d.a();
    }

    @Override // c.d.a.a.e.g
    public int a(c.d.a.a.e.h hVar, c.d.a.a.e.n nVar) {
        int i2 = hVar.read(this.f2149e.f3567a, 0, 2786);
        if (i2 == -1) {
            return -1;
        }
        this.f2149e.c(0);
        this.f2149e.b(i2);
        if (!this.f2150f) {
            this.f2148d.a(this.f2147c, 4);
            this.f2150f = true;
        }
        this.f2148d.a(this.f2149e);
        return 0;
    }
}
