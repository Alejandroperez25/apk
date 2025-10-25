package c.d.a.a.i.b;

import c.d.a.a.m.H;
import c.d.a.a.q;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j extends d {

    /* renamed from: i, reason: collision with root package name */
    private byte[] f2566i;
    private volatile boolean j;

    protected abstract void a(byte[] bArr, int i2);

    public j(c.d.a.a.l.k kVar, c.d.a.a.l.n nVar, int i2, q qVar, int i3, Object obj, byte[] bArr) {
        super(kVar, nVar, i2, qVar, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.f2566i = bArr;
    }

    public byte[] g() {
        return this.f2566i;
    }

    @Override // c.d.a.a.l.B.d
    public final void b() {
        this.j = true;
    }

    @Override // c.d.a.a.l.B.d
    public final void a() {
        try {
            this.f2533h.a(this.f2526a);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.j) {
                a(i3);
                i2 = this.f2533h.read(this.f2566i, i3, 16384);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.j) {
                a(this.f2566i, i3);
            }
        } finally {
            H.a((c.d.a.a.l.k) this.f2533h);
        }
    }

    private void a(int i2) {
        if (this.f2566i == null) {
            this.f2566i = new byte[16384];
        } else if (this.f2566i.length < i2 + 16384) {
            this.f2566i = Arrays.copyOf(this.f2566i, this.f2566i.length + 16384);
        }
    }
}
