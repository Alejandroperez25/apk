package c.d.a.a.i.a;

import android.net.Uri;
import c.d.a.a.m.AbstractC0170e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2510a = new a(new long[0]);

    /* renamed from: b, reason: collision with root package name */
    public final int f2511b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2512c;

    /* renamed from: d, reason: collision with root package name */
    public final C0030a[] f2513d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2514e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2515f;

    /* renamed from: c.d.a.a.i.a.a$a, reason: collision with other inner class name */
    public static final class C0030a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2516a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri[] f2517b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f2518c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f2519d;

        public C0030a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private C0030a(int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
            AbstractC0170e.a(iArr.length == uriArr.length);
            this.f2516a = i2;
            this.f2518c = iArr;
            this.f2517b = uriArr;
            this.f2519d = jArr;
        }

        public int a() {
            return a(-1);
        }

        public int a(int i2) {
            int i3 = i2 + 1;
            while (i3 < this.f2518c.length && this.f2518c[i3] != 0 && this.f2518c[i3] != 1) {
                i3++;
            }
            return i3;
        }

        public boolean b() {
            return this.f2516a == -1 || a() < this.f2516a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0030a c0030a = (C0030a) obj;
            return this.f2516a == c0030a.f2516a && Arrays.equals(this.f2517b, c0030a.f2517b) && Arrays.equals(this.f2518c, c0030a.f2518c) && Arrays.equals(this.f2519d, c0030a.f2519d);
        }

        public int hashCode() {
            return (((((this.f2516a * 31) + Arrays.hashCode(this.f2517b)) * 31) + Arrays.hashCode(this.f2518c)) * 31) + Arrays.hashCode(this.f2519d);
        }
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.f2511b = length;
        this.f2512c = Arrays.copyOf(jArr, length);
        this.f2513d = new C0030a[length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f2513d[i2] = new C0030a();
        }
        this.f2514e = 0L;
        this.f2515f = -9223372036854775807L;
    }

    public int a(long j) {
        int length = this.f2512c.length - 1;
        while (length >= 0 && a(j, length)) {
            length--;
        }
        if (length < 0 || !this.f2513d[length].b()) {
            return -1;
        }
        return length;
    }

    public int b(long j) {
        int i2 = 0;
        while (i2 < this.f2512c.length && this.f2512c[i2] != Long.MIN_VALUE && (j >= this.f2512c[i2] || !this.f2513d[i2].b())) {
            i2++;
        }
        if (i2 < this.f2512c.length) {
            return i2;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2511b == aVar.f2511b && this.f2514e == aVar.f2514e && this.f2515f == aVar.f2515f && Arrays.equals(this.f2512c, aVar.f2512c) && Arrays.equals(this.f2513d, aVar.f2513d);
    }

    public int hashCode() {
        return (((((((this.f2511b * 31) + ((int) this.f2514e)) * 31) + ((int) this.f2515f)) * 31) + Arrays.hashCode(this.f2512c)) * 31) + Arrays.hashCode(this.f2513d);
    }

    private boolean a(long j, int i2) {
        long j2 = this.f2512c[i2];
        return j2 == Long.MIN_VALUE ? this.f2515f == -9223372036854775807L || j < this.f2515f : j < j2;
    }
}
