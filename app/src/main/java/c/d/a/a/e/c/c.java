package c.d.a.a.e.c;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.x;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1790a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f1791b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final i f1792c = new i();

    /* renamed from: d, reason: collision with root package name */
    private e f1793d;

    /* renamed from: e, reason: collision with root package name */
    private int f1794e;

    /* renamed from: f, reason: collision with root package name */
    private int f1795f;

    /* renamed from: g, reason: collision with root package name */
    private long f1796g;

    @Override // c.d.a.a.e.c.d
    public void a(e eVar) {
        this.f1793d = eVar;
    }

    @Override // c.d.a.a.e.c.d
    public void reset() {
        this.f1794e = 0;
        this.f1791b.clear();
        this.f1792c.a();
    }

    @Override // c.d.a.a.e.c.d
    public boolean a(c.d.a.a.e.h hVar) throws x {
        AbstractC0170e.b(this.f1793d != null);
        while (true) {
            if (this.f1791b.isEmpty() || hVar.c() < this.f1791b.peek().f1798b) {
                if (this.f1794e == 0) {
                    long jA = this.f1792c.a(hVar, true, false, 4);
                    if (jA == -2) {
                        jA = b(hVar);
                    }
                    if (jA == -1) {
                        return false;
                    }
                    this.f1795f = (int) jA;
                    this.f1794e = 1;
                }
                if (this.f1794e == 1) {
                    this.f1796g = this.f1792c.a(hVar, false, true, 8);
                    this.f1794e = 2;
                }
                int iB = this.f1793d.b(this.f1795f);
                switch (iB) {
                    case 0:
                        hVar.c((int) this.f1796g);
                        this.f1794e = 0;
                    case 1:
                        long jC = hVar.c();
                        this.f1791b.push(new a(this.f1795f, this.f1796g + jC));
                        this.f1793d.a(this.f1795f, jC, this.f1796g);
                        this.f1794e = 0;
                        return true;
                    case 2:
                        if (this.f1796g > 8) {
                            throw new x("Invalid integer size: " + this.f1796g);
                        }
                        this.f1793d.a(this.f1795f, a(hVar, (int) this.f1796g));
                        this.f1794e = 0;
                        return true;
                    case 3:
                        if (this.f1796g > 2147483647L) {
                            throw new x("String element size: " + this.f1796g);
                        }
                        this.f1793d.a(this.f1795f, c(hVar, (int) this.f1796g));
                        this.f1794e = 0;
                        return true;
                    case 4:
                        this.f1793d.a(this.f1795f, (int) this.f1796g, hVar);
                        this.f1794e = 0;
                        return true;
                    case 5:
                        if (this.f1796g != 4 && this.f1796g != 8) {
                            throw new x("Invalid float size: " + this.f1796g);
                        }
                        this.f1793d.a(this.f1795f, b(hVar, (int) this.f1796g));
                        this.f1794e = 0;
                        return true;
                    default:
                        throw new x("Invalid element type " + iB);
                }
            } else {
                this.f1793d.a(this.f1791b.pop().f1797a);
                return true;
            }
        }
    }

    private long b(c.d.a.a.e.h hVar) {
        hVar.b();
        while (true) {
            hVar.a(this.f1790a, 0, 4);
            int iA = i.a(this.f1790a[0]);
            if (iA != -1 && iA <= 4) {
                int iA2 = (int) i.a(this.f1790a, iA, false);
                if (this.f1793d.c(iA2)) {
                    hVar.c(iA);
                    return iA2;
                }
            }
            hVar.c(1);
        }
    }

    private long a(c.d.a.a.e.h hVar, int i2) {
        hVar.readFully(this.f1790a, 0, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j << 8) | (this.f1790a[i3] & 255);
        }
        return j;
    }

    private double b(c.d.a.a.e.h hVar, int i2) {
        long jA = a(hVar, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) jA);
        }
        return Double.longBitsToDouble(jA);
    }

    private String c(c.d.a.a.e.h hVar, int i2) {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        hVar.readFully(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1797a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1798b;

        private a(int i2, long j) {
            this.f1797a = i2;
            this.f1798b = j;
        }
    }
}
