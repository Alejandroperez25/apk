package c.d.a.a.l;

import c.d.a.a.l.y;
import java.io.IOException;

/* loaded from: classes.dex */
public class v implements z {

    /* renamed from: a, reason: collision with root package name */
    private final int f3471a;

    public v() {
        this(-1);
    }

    public v(int i2) {
        this.f3471a = i2;
    }

    @Override // c.d.a.a.l.z
    public long b(int i2, long j, IOException iOException, int i3) {
        if (!(iOException instanceof y.e)) {
            return -9223372036854775807L;
        }
        int i4 = ((y.e) iOException).f3481c;
        return (i4 == 404 || i4 == 410) ? 60000L : -9223372036854775807L;
    }

    @Override // c.d.a.a.l.z
    public long a(int i2, long j, IOException iOException, int i3) {
        if (iOException instanceof c.d.a.a.x) {
            return -9223372036854775807L;
        }
        return Math.min((i3 - 1) * 1000, 5000);
    }

    @Override // c.d.a.a.l.z
    public int a(int i2) {
        if (this.f3471a == -1) {
            return i2 == 7 ? 6 : 3;
        }
        return this.f3471a;
    }
}
