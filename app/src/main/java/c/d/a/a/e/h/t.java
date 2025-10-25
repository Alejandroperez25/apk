package c.d.a.a.e.h;

import c.d.a.a.m.AbstractC0170e;
import java.util.Arrays;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private final int f2278a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2279b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2280c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2281d;

    /* renamed from: e, reason: collision with root package name */
    public int f2282e;

    public t(int i2, int i3) {
        this.f2278a = i2;
        this.f2281d = new byte[i3 + 3];
        this.f2281d[2] = 1;
    }

    public void a() {
        this.f2279b = false;
        this.f2280c = false;
    }

    public boolean b() {
        return this.f2280c;
    }

    public void a(int i2) {
        AbstractC0170e.b(!this.f2279b);
        this.f2279b = i2 == this.f2278a;
        if (this.f2279b) {
            this.f2282e = 3;
            this.f2280c = false;
        }
    }

    public void a(byte[] bArr, int i2, int i3) {
        if (this.f2279b) {
            int i4 = i3 - i2;
            if (this.f2281d.length < this.f2282e + i4) {
                this.f2281d = Arrays.copyOf(this.f2281d, (this.f2282e + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.f2281d, this.f2282e, i4);
            this.f2282e += i4;
        }
    }

    public boolean b(int i2) {
        if (!this.f2279b) {
            return false;
        }
        this.f2282e -= i2;
        this.f2279b = false;
        this.f2280c = true;
        return true;
    }
}
