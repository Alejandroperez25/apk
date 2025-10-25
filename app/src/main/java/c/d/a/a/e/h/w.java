package c.d.a.a.e.h;

import c.d.a.a.e.a;

/* loaded from: classes.dex */
final class w extends c.d.a.a.e.a {
    public w(c.d.a.a.m.E e2, long j, long j2) {
        super(new a.b(), new a(e2), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class a implements a.g {

        /* renamed from: a, reason: collision with root package name */
        private final c.d.a.a.m.E f2292a;

        /* renamed from: b, reason: collision with root package name */
        private final c.d.a.a.m.u f2293b;

        private a(c.d.a.a.m.E e2) {
            this.f2292a = e2;
            this.f2293b = new c.d.a.a.m.u();
        }

        @Override // c.d.a.a.e.a.g
        public a.f a(c.d.a.a.e.h hVar, long j, a.c cVar) {
            long jC = hVar.c();
            int iMin = (int) Math.min(20000L, hVar.getLength() - jC);
            this.f2293b.a(iMin);
            hVar.a(this.f2293b.f3567a, 0, iMin);
            return a(this.f2293b, j, jC);
        }

        @Override // c.d.a.a.e.a.g
        public void a() {
            this.f2293b.a(c.d.a.a.m.H.f3504f);
        }

        private a.f a(c.d.a.a.m.u uVar, long j, long j2) {
            int iD = -1;
            long j3 = -9223372036854775807L;
            int iD2 = -1;
            while (uVar.b() >= 4) {
                if (w.b(uVar.f3567a, uVar.d()) != 442) {
                    uVar.d(1);
                } else {
                    uVar.d(4);
                    long jA = x.a(uVar);
                    if (jA != -9223372036854775807L) {
                        long jD = this.f2292a.d(jA);
                        if (jD > j) {
                            if (j3 == -9223372036854775807L) {
                                return a.f.a(jD, j2);
                            }
                            return a.f.a(j2 + iD2);
                        }
                        if (100000 + jD > j) {
                            return a.f.a(j2 + uVar.d());
                        }
                        iD2 = uVar.d();
                        j3 = jD;
                    }
                    a(uVar);
                    iD = uVar.d();
                }
            }
            if (j3 != -9223372036854775807L) {
                return a.f.b(j3, j2 + iD);
            }
            return a.f.f1752a;
        }

        private static void a(c.d.a.a.m.u uVar) {
            int iB;
            int iC = uVar.c();
            if (uVar.b() < 10) {
                uVar.c(iC);
                return;
            }
            uVar.d(9);
            int iH = uVar.h() & 7;
            if (uVar.b() < iH) {
                uVar.c(iC);
                return;
            }
            uVar.d(iH);
            if (uVar.b() >= 4) {
                if (w.b(uVar.f3567a, uVar.d()) == 443) {
                    uVar.d(4);
                    int i2 = uVar.i();
                    if (uVar.b() < i2) {
                        uVar.c(iC);
                        return;
                    }
                    uVar.d(i2);
                }
                while (uVar.b() >= 4 && (iB = w.b(uVar.f3567a, uVar.d())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                    uVar.d(4);
                    if (uVar.b() < 2) {
                        uVar.c(iC);
                        return;
                    }
                    uVar.c(Math.min(uVar.c(), uVar.d() + uVar.i()));
                }
                return;
            }
            uVar.c(iC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
