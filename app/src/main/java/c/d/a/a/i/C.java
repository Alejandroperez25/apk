package c.d.a.a.i;

import c.d.a.a.M;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
public final class C extends M {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2493b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f2494c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2495d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2496e;

    /* renamed from: f, reason: collision with root package name */
    private final long f2497f;

    /* renamed from: g, reason: collision with root package name */
    private final long f2498g;

    /* renamed from: h, reason: collision with root package name */
    private final long f2499h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2500i;
    private final boolean j;
    private final Object k;

    @Override // c.d.a.a.M
    public int b() {
        return 1;
    }

    @Override // c.d.a.a.M
    public int c() {
        return 1;
    }

    public C(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    public C(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.f2494c = j;
        this.f2495d = j2;
        this.f2496e = j3;
        this.f2497f = j4;
        this.f2498g = j5;
        this.f2499h = j6;
        this.f2500i = z;
        this.j = z2;
        this.k = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r3
  0x0034: PHI (r3v4 long) = (r3v3 long), (r3v3 long), (r3v5 long) binds: [B:8:0x001a, B:10:0x0020, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.d.a.a.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.d.a.a.M.b a(int r21, c.d.a.a.M.b r22, boolean r23, long r24) {
        /*
            r20 = this;
            r0 = r20
            r3 = 0
            r4 = 1
            r5 = r21
            c.d.a.a.m.AbstractC0170e.a(r5, r3, r4)
            if (r23 == 0) goto Lf
            java.lang.Object r3 = r0.k
        Ld:
            r5 = r3
            goto L11
        Lf:
            r3 = 0
            goto Ld
        L11:
            long r3 = r0.f2499h
            boolean r6 = r0.j
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L34
            r9 = 0
            int r6 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r6 == 0) goto L34
            long r9 = r0.f2497f
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L2a
        L28:
            r12 = r7
            goto L35
        L2a:
            r6 = 0
            long r3 = r3 + r24
            long r1 = r0.f2497f
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L34
            goto L28
        L34:
            r12 = r3
        L35:
            long r6 = r0.f2494c
            long r8 = r0.f2495d
            boolean r10 = r0.f2500i
            boolean r11 = r0.j
            long r14 = r0.f2497f
            r16 = 0
            r17 = 0
            long r1 = r0.f2498g
            r4 = r22
            r18 = r1
            r4.a(r5, r6, r8, r10, r11, r12, r14, r16, r17, r18)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.a.i.C.a(int, c.d.a.a.M$b, boolean, long):c.d.a.a.M$b");
    }

    @Override // c.d.a.a.M
    public M.a a(int i2, M.a aVar, boolean z) {
        AbstractC0170e.a(i2, 0, 1);
        aVar.a(null, z ? f2493b : null, 0, this.f2496e, -this.f2498g);
        return aVar;
    }

    @Override // c.d.a.a.M
    public int a(Object obj) {
        return f2493b.equals(obj) ? 0 : -1;
    }

    @Override // c.d.a.a.M
    public Object a(int i2) {
        AbstractC0170e.a(i2, 0, 1);
        return f2493b;
    }
}
