package c.d.a.a.e.f;

import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.u;
import java.util.Arrays;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final g f2025a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final u f2026b = new u(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f2027c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f2028d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2029e;

    f() {
    }

    public void a() {
        this.f2025a.a();
        this.f2026b.a();
        this.f2027c = -1;
        this.f2029e = false;
    }

    public boolean a(c.d.a.a.e.h hVar) {
        int i2;
        AbstractC0170e.b(hVar != null);
        if (this.f2029e) {
            this.f2029e = false;
            this.f2026b.a();
        }
        while (!this.f2029e) {
            if (this.f2027c < 0) {
                if (!this.f2025a.a(hVar, true)) {
                    return false;
                }
                int iA = this.f2025a.f2038i;
                if ((this.f2025a.f2032c & 1) == 1 && this.f2026b.c() == 0) {
                    iA += a(0);
                    i2 = this.f2028d + 0;
                } else {
                    i2 = 0;
                }
                hVar.c(iA);
                this.f2027c = i2;
            }
            int iA2 = a(this.f2027c);
            int i3 = this.f2027c + this.f2028d;
            if (iA2 > 0) {
                if (this.f2026b.e() < this.f2026b.c() + iA2) {
                    this.f2026b.f3567a = Arrays.copyOf(this.f2026b.f3567a, this.f2026b.c() + iA2);
                }
                hVar.readFully(this.f2026b.f3567a, this.f2026b.c(), iA2);
                this.f2026b.b(this.f2026b.c() + iA2);
                this.f2029e = this.f2025a.k[i3 + (-1)] != 255;
            }
            if (i3 == this.f2025a.f2037h) {
                i3 = -1;
            }
            this.f2027c = i3;
        }
        return true;
    }

    public g b() {
        return this.f2025a;
    }

    public u c() {
        return this.f2026b;
    }

    public void d() {
        if (this.f2026b.f3567a.length == 65025) {
            return;
        }
        this.f2026b.f3567a = Arrays.copyOf(this.f2026b.f3567a, Math.max(65025, this.f2026b.c()));
    }

    private int a(int i2) {
        int i3 = 0;
        this.f2028d = 0;
        while (this.f2028d + i2 < this.f2025a.f2037h) {
            int[] iArr = this.f2025a.k;
            int i4 = this.f2028d;
            this.f2028d = i4 + 1;
            int i5 = iArr[i4 + i2];
            i3 += i5;
            if (i5 != 255) {
                break;
            }
        }
        return i3;
    }
}
