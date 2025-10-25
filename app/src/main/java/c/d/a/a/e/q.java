package c.d.a.a.e;

import c.d.a.a.m.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface q {
    int a(h hVar, int i2, boolean z);

    void a(long j, int i2, int i3, int i4, a aVar);

    void a(u uVar, int i2);

    void a(c.d.a.a.q qVar);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2357a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f2358b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2359c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2360d;

        public a(int i2, byte[] bArr, int i3, int i4) {
            this.f2357a = i2;
            this.f2358b = bArr;
            this.f2359c = i3;
            this.f2360d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2357a == aVar.f2357a && this.f2359c == aVar.f2359c && this.f2360d == aVar.f2360d && Arrays.equals(this.f2358b, aVar.f2358b);
        }

        public int hashCode() {
            return (((((this.f2357a * 31) + Arrays.hashCode(this.f2358b)) * 31) + this.f2359c) * 31) + this.f2360d;
        }
    }
}
