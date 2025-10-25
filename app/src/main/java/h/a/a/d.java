package h.a.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f5859a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f5860b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f5861c;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f5862a;

        /* renamed from: b, reason: collision with root package name */
        private int f5863b = 0;

        public a(int i2) {
            this.f5862a = new byte[i2];
        }

        public byte[] a() {
            return this.f5862a;
        }

        public int b() {
            return this.f5863b;
        }

        public void a(int i2) {
            this.f5863b += i2;
        }

        public void c() {
            this.f5863b = 0;
        }

        public void a(byte b2) {
            byte[] bArr = this.f5862a;
            int i2 = this.f5863b;
            this.f5863b = i2 + 1;
            bArr[i2] = b2;
        }

        public void a(byte b2, int i2) {
            int i3 = i2 + 1;
            this.f5862a[i2] = b2;
            if (i3 <= this.f5863b) {
                i3 = this.f5863b;
            }
            this.f5863b = i3;
        }
    }

    public d(int i2) {
        this(i2, 0);
    }

    public d(int i2, int i3) {
        this.f5859a = i2;
        this.f5860b = i3 + 10;
        this.f5861c = new a[this.f5860b];
        for (int i4 = 0; i4 < this.f5860b; i4++) {
            this.f5861c[i4] = new a(i2);
        }
    }

    public synchronized a a(int i2) {
        for (int i3 = 0; i3 < this.f5860b; i3++) {
            if (this.f5861c[i3].b() >= i2) {
                a aVar = this.f5861c[i3];
                this.f5861c[i3] = null;
                return aVar;
            }
        }
        if (i2 <= this.f5859a) {
            i2 = this.f5859a;
        }
        return new a(i2);
    }

    public synchronized void a(a aVar) {
        aVar.c();
        for (int i2 = 0; i2 < this.f5860b; i2++) {
            if (this.f5861c[i2].b() == 0) {
                this.f5861c[i2] = aVar;
                return;
            }
        }
        if (this.f5860b + 1 > this.f5861c.length) {
            this.f5861c = (a[]) Arrays.copyOf(this.f5861c, this.f5861c.length * 2);
        }
        a[] aVarArr = this.f5861c;
        int i3 = this.f5860b;
        this.f5860b = i3 + 1;
        aVarArr[i3] = aVar;
    }
}
