package c.d.a.a;

import android.util.Pair;
import c.d.a.a.M;
import c.d.a.a.i.w;
import c.d.a.a.l.InterfaceC0161d;
import c.d.a.a.m.AbstractC0170e;

/* loaded from: classes.dex */
final class w {

    /* renamed from: c, reason: collision with root package name */
    private long f3706c;

    /* renamed from: e, reason: collision with root package name */
    private int f3708e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3709f;

    /* renamed from: g, reason: collision with root package name */
    private u f3710g;

    /* renamed from: h, reason: collision with root package name */
    private u f3711h;

    /* renamed from: i, reason: collision with root package name */
    private u f3712i;
    private int j;
    private Object k;
    private long l;

    /* renamed from: a, reason: collision with root package name */
    private final M.a f3704a = new M.a();

    /* renamed from: b, reason: collision with root package name */
    private final M.b f3705b = new M.b();

    /* renamed from: d, reason: collision with root package name */
    private M f3707d = M.f1451a;

    public void a(M m) {
        this.f3707d = m;
    }

    public boolean a(int i2) {
        this.f3708e = i2;
        return i();
    }

    public boolean a(boolean z) {
        this.f3709f = z;
        return i();
    }

    public boolean a(c.d.a.a.i.v vVar) {
        return this.f3712i != null && this.f3712i.f3689a == vVar;
    }

    public void a(long j) {
        if (this.f3712i != null) {
            this.f3712i.c(j);
        }
    }

    public boolean a() {
        return this.f3712i == null || (!this.f3712i.f3695g.f3703f && this.f3712i.c() && this.f3712i.f3695g.f3701d != -9223372036854775807L && this.j < 100);
    }

    public v a(long j, y yVar) {
        if (this.f3712i == null) {
            return a(yVar);
        }
        return a(this.f3712i, j);
    }

    public c.d.a.a.i.v a(F[] fArr, c.d.a.a.k.k kVar, InterfaceC0161d interfaceC0161d, c.d.a.a.i.w wVar, v vVar) {
        u uVar = new u(fArr, this.f3712i == null ? vVar.f3699b : this.f3712i.a() + this.f3712i.f3695g.f3701d, kVar, interfaceC0161d, wVar, vVar);
        if (this.f3712i != null) {
            AbstractC0170e.b(f());
            this.f3712i.f3696h = uVar;
        }
        this.k = null;
        this.f3712i = uVar;
        this.j++;
        return uVar.f3689a;
    }

    public u b() {
        return this.f3712i;
    }

    public u c() {
        return this.f3710g;
    }

    public u d() {
        return this.f3711h;
    }

    public u e() {
        return f() ? this.f3710g : this.f3712i;
    }

    public boolean f() {
        return this.f3710g != null;
    }

    public u g() {
        AbstractC0170e.b((this.f3711h == null || this.f3711h.f3696h == null) ? false : true);
        this.f3711h = this.f3711h.f3696h;
        return this.f3711h;
    }

    public u h() {
        if (this.f3710g != null) {
            if (this.f3710g == this.f3711h) {
                this.f3711h = this.f3710g.f3696h;
            }
            this.f3710g.f();
            this.j--;
            if (this.j == 0) {
                this.f3712i = null;
                this.k = this.f3710g.f3690b;
                this.l = this.f3710g.f3695g.f3698a.f3027d;
            }
            this.f3710g = this.f3710g.f3696h;
        } else {
            this.f3710g = this.f3712i;
            this.f3711h = this.f3712i;
        }
        return this.f3710g;
    }

    public boolean a(u uVar) {
        boolean z = false;
        AbstractC0170e.b(uVar != null);
        this.f3712i = uVar;
        while (uVar.f3696h != null) {
            uVar = uVar.f3696h;
            if (uVar == this.f3711h) {
                this.f3711h = this.f3710g;
                z = true;
            }
            uVar.f();
            this.j--;
        }
        this.f3712i.f3696h = null;
        return z;
    }

    public void b(boolean z) {
        u uVarE = e();
        if (uVarE != null) {
            this.k = z ? uVarE.f3690b : null;
            this.l = uVarE.f3695g.f3698a.f3027d;
            uVarE.f();
            a(uVarE);
        } else if (!z) {
            this.k = null;
        }
        this.f3710g = null;
        this.f3712i = null;
        this.f3711h = null;
        this.j = 0;
    }

    public boolean a(w.a aVar, long j) {
        int iA = this.f3707d.a(aVar.f3024a);
        u uVar = null;
        u uVarE = e();
        while (uVarE != null) {
            if (uVar == null) {
                uVarE.f3695g = a(uVarE.f3695g);
            } else {
                if (iA == -1 || !uVarE.f3690b.equals(this.f3707d.a(iA))) {
                    return !a(uVar);
                }
                v vVarA = a(uVar, j);
                if (vVarA == null) {
                    return !a(uVar);
                }
                uVarE.f3695g = a(uVarE.f3695g);
                if (!a(uVarE, vVarA)) {
                    return !a(uVar);
                }
            }
            if (uVarE.f3695g.f3702e) {
                iA = this.f3707d.a(iA, this.f3704a, this.f3705b, this.f3708e, this.f3709f);
            }
            u uVar2 = uVarE;
            uVarE = uVarE.f3696h;
            uVar = uVar2;
        }
        return true;
    }

    public v a(v vVar) {
        long jA;
        boolean zA = a(vVar.f3698a);
        boolean zA2 = a(vVar.f3698a, zA);
        this.f3707d.a(vVar.f3698a.f3024a, this.f3704a);
        if (vVar.f3698a.a()) {
            jA = this.f3704a.c(vVar.f3698a.f3025b, vVar.f3698a.f3026c);
        } else {
            jA = vVar.f3698a.f3028e == Long.MIN_VALUE ? this.f3704a.a() : vVar.f3698a.f3028e;
        }
        return new v(vVar.f3698a, vVar.f3699b, vVar.f3700c, jA, zA, zA2);
    }

    public w.a a(Object obj, long j) {
        return a(obj, j, a(obj));
    }

    private w.a a(Object obj, long j, long j2) {
        this.f3707d.a(obj, this.f3704a);
        int iA = this.f3704a.a(j);
        if (iA == -1) {
            int iB = this.f3704a.b(j);
            return new w.a(obj, j2, iB == -1 ? Long.MIN_VALUE : this.f3704a.a(iB));
        }
        return new w.a(obj, iA, this.f3704a.b(iA), j2);
    }

    private long a(Object obj) {
        int iA;
        int i2 = this.f3707d.a(obj, this.f3704a).f1454c;
        if (this.k != null && (iA = this.f3707d.a(this.k)) != -1 && this.f3707d.a(iA, this.f3704a).f1454c == i2) {
            return this.l;
        }
        for (u uVarE = e(); uVarE != null; uVarE = uVarE.f3696h) {
            if (uVarE.f3690b.equals(obj)) {
                return uVarE.f3695g.f3698a.f3027d;
            }
        }
        for (u uVarE2 = e(); uVarE2 != null; uVarE2 = uVarE2.f3696h) {
            int iA2 = this.f3707d.a(uVarE2.f3690b);
            if (iA2 != -1 && this.f3707d.a(iA2, this.f3704a).f1454c == i2) {
                return uVarE2.f3695g.f3698a.f3027d;
            }
        }
        long j = this.f3706c;
        this.f3706c = 1 + j;
        return j;
    }

    private boolean a(u uVar, v vVar) {
        v vVar2 = uVar.f3695g;
        return vVar2.f3699b == vVar.f3699b && vVar2.f3698a.equals(vVar.f3698a);
    }

    private boolean i() {
        u uVarE = e();
        if (uVarE == null) {
            return true;
        }
        int iA = this.f3707d.a(uVarE.f3690b);
        while (true) {
            iA = this.f3707d.a(iA, this.f3704a, this.f3705b, this.f3708e, this.f3709f);
            while (uVarE.f3696h != null && !uVarE.f3695g.f3702e) {
                uVarE = uVarE.f3696h;
            }
            if (iA == -1 || uVarE.f3696h == null || this.f3707d.a(uVarE.f3696h.f3690b) != iA) {
                break;
            }
            uVarE = uVarE.f3696h;
        }
        boolean zA = a(uVarE);
        uVarE.f3695g = a(uVarE.f3695g);
        return (zA && f()) ? false : true;
    }

    private v a(y yVar) {
        return a(yVar.f3716d, yVar.f3718f, yVar.f3717e);
    }

    private v a(u uVar, long j) {
        long jLongValue;
        Object obj;
        long j2;
        long j3;
        v vVar = uVar.f3695g;
        long jA = (uVar.a() + vVar.f3701d) - j;
        long j4 = 0;
        if (vVar.f3702e) {
            int iA = this.f3707d.a(this.f3707d.a(vVar.f3698a.f3024a), this.f3704a, this.f3705b, this.f3708e, this.f3709f);
            if (iA == -1) {
                return null;
            }
            int i2 = this.f3707d.a(iA, this.f3704a, true).f1454c;
            Object obj2 = this.f3704a.f1453b;
            long j5 = vVar.f3698a.f3027d;
            if (this.f3707d.a(i2, this.f3705b).f1463f == iA) {
                Pair<Object, Long> pairA = this.f3707d.a(this.f3705b, this.f3704a, i2, -9223372036854775807L, Math.max(0L, jA));
                if (pairA == null) {
                    return null;
                }
                Object obj3 = pairA.first;
                long jLongValue2 = ((Long) pairA.second).longValue();
                if (uVar.f3696h != null && uVar.f3696h.f3690b.equals(obj3)) {
                    j3 = uVar.f3696h.f3695g.f3698a.f3027d;
                } else {
                    j3 = this.f3706c;
                    this.f3706c = 1 + j3;
                }
                j4 = jLongValue2;
                j2 = j3;
                obj = obj3;
            } else {
                obj = obj2;
                j2 = j5;
            }
            long j6 = j4;
            return a(a(obj, j6, j2), j6, j4);
        }
        w.a aVar = vVar.f3698a;
        this.f3707d.a(aVar.f3024a, this.f3704a);
        if (aVar.a()) {
            int i3 = aVar.f3025b;
            int iD = this.f3704a.d(i3);
            if (iD == -1) {
                return null;
            }
            int iA2 = this.f3704a.a(i3, aVar.f3026c);
            if (iA2 < iD) {
                if (this.f3704a.b(i3, iA2)) {
                    return a(aVar.f3024a, i3, iA2, vVar.f3700c, aVar.f3027d);
                }
                return null;
            }
            long j7 = vVar.f3700c;
            if (this.f3704a.c() == 1 && this.f3704a.a(0) == 0) {
                Pair<Object, Long> pairA2 = this.f3707d.a(this.f3705b, this.f3704a, this.f3704a.f1454c, -9223372036854775807L, Math.max(0L, jA));
                if (pairA2 == null) {
                    return null;
                }
                jLongValue = ((Long) pairA2.second).longValue();
            } else {
                jLongValue = j7;
            }
            return b(aVar.f3024a, jLongValue, aVar.f3027d);
        }
        if (vVar.f3698a.f3028e != Long.MIN_VALUE) {
            int iA3 = this.f3704a.a(vVar.f3698a.f3028e);
            if (iA3 == -1) {
                return b(aVar.f3024a, vVar.f3698a.f3028e, aVar.f3027d);
            }
            int iB = this.f3704a.b(iA3);
            if (this.f3704a.b(iA3, iB)) {
                return a(aVar.f3024a, iA3, iB, vVar.f3698a.f3028e, aVar.f3027d);
            }
            return null;
        }
        int iC = this.f3704a.c();
        if (iC == 0) {
            return null;
        }
        int i4 = iC - 1;
        if (this.f3704a.a(i4) != Long.MIN_VALUE || this.f3704a.c(i4)) {
            return null;
        }
        int iB2 = this.f3704a.b(i4);
        if (!this.f3704a.b(i4, iB2)) {
            return null;
        }
        return a(aVar.f3024a, i4, iB2, this.f3704a.a(), aVar.f3027d);
    }

    private v a(w.a aVar, long j, long j2) {
        this.f3707d.a(aVar.f3024a, this.f3704a);
        if (aVar.a()) {
            if (this.f3704a.b(aVar.f3025b, aVar.f3026c)) {
                return a(aVar.f3024a, aVar.f3025b, aVar.f3026c, j, aVar.f3027d);
            }
            return null;
        }
        return b(aVar.f3024a, j2, aVar.f3027d);
    }

    private v a(Object obj, int i2, int i3, long j, long j2) {
        w.a aVar = new w.a(obj, i2, i3, j2);
        boolean zA = a(aVar);
        boolean zA2 = a(aVar, zA);
        return new v(aVar, i3 == this.f3704a.b(i2) ? this.f3704a.d() : 0L, j, this.f3707d.a(aVar.f3024a, this.f3704a).c(aVar.f3025b, aVar.f3026c), zA, zA2);
    }

    private v b(Object obj, long j, long j2) {
        int iB = this.f3704a.b(j);
        long jA = iB == -1 ? Long.MIN_VALUE : this.f3704a.a(iB);
        w.a aVar = new w.a(obj, j2, jA);
        this.f3707d.a(aVar.f3024a, this.f3704a);
        boolean zA = a(aVar);
        return new v(aVar, j, -9223372036854775807L, jA == Long.MIN_VALUE ? this.f3704a.a() : jA, zA, a(aVar, zA));
    }

    private boolean a(w.a aVar) {
        int iC = this.f3707d.a(aVar.f3024a, this.f3704a).c();
        if (iC == 0) {
            return true;
        }
        int i2 = iC - 1;
        boolean zA = aVar.a();
        if (this.f3704a.a(i2) != Long.MIN_VALUE) {
            return !zA && aVar.f3028e == Long.MIN_VALUE;
        }
        int iD = this.f3704a.d(i2);
        if (iD == -1) {
            return false;
        }
        if (zA && aVar.f3025b == i2 && aVar.f3026c == iD + (-1)) {
            return true;
        }
        return !zA && this.f3704a.b(i2) == iD;
    }

    private boolean a(w.a aVar, boolean z) {
        int iA = this.f3707d.a(aVar.f3024a);
        return !this.f3707d.a(this.f3707d.a(iA, this.f3704a).f1454c, this.f3705b).f1462e && this.f3707d.b(iA, this.f3704a, this.f3705b, this.f3708e, this.f3709f) && z;
    }
}
