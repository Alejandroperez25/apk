package c.d.a.a.e.h;

import c.d.a.a.e.a;

/* loaded from: classes.dex */
final class D extends c.d.a.a.e.a {
    public D(c.d.a.a.m.E e2, long j, long j2, int i2) {
        super(new a.b(), new a(i2, e2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }

    private static final class a implements a.g {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.m.E f2100a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.a.a.m.u f2101b = new c.d.a.a.m.u();

        /* renamed from: c, reason: collision with root package name */
        private final int f2102c;

        public a(int i2, c.d.a.a.m.E e2) {
            this.f2102c = i2;
            this.f2100a = e2;
        }

        @Override // c.d.a.a.e.a.g
        public a.f a(c.d.a.a.e.h hVar, long j, a.c cVar) {
            long jC = hVar.c();
            int iMin = (int) Math.min(112800L, hVar.getLength() - jC);
            this.f2101b.a(iMin);
            hVar.a(this.f2101b.f3567a, 0, iMin);
            return a(this.f2101b, j, jC);
        }

        private a.f a(c.d.a.a.m.u uVar, long j, long j2) {
            int iA;
            int iA2;
            int iC = uVar.c();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (uVar.b() >= 188 && (iA2 = (iA = H.a(uVar.f3567a, uVar.d(), iC)) + 188) <= iC) {
                long jA = H.a(uVar, iA, this.f2102c);
                if (jA != -9223372036854775807L) {
                    long jD = this.f2100a.d(jA);
                    if (jD > j) {
                        if (j5 == -9223372036854775807L) {
                            return a.f.a(jD, j2);
                        }
                        return a.f.a(j2 + j4);
                    }
                    if (100000 + jD > j) {
                        return a.f.a(iA + j2);
                    }
                    j4 = iA;
                    j5 = jD;
                }
                uVar.c(iA2);
                j3 = iA2;
            }
            if (j5 != -9223372036854775807L) {
                return a.f.b(j5, j2 + j3);
            }
            return a.f.f1752a;
        }

        @Override // c.d.a.a.e.a.g
        public void a() {
            this.f2101b.a(c.d.a.a.m.H.f3504f);
        }
    }
}
